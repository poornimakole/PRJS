package com.psl.q1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

public class Client {
	
		private void populateDb() {
			// TODO Auto-generated method stub
			 DbConnect db=new DbConnect();
			 Connection con=db.connectionEstabish();
			 PreparedStatement pstmt=null;
			 BufferedReader br=null;
			 FileInputStream fis=null;
			 StringTokenizer st=null;
			 SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
			File f=new File("movie.txt");
			  try {
				  pstmt=con.prepareStatement("insert into movies values(?,?,?,?)");
				  fis=new FileInputStream(f);
				  br=new BufferedReader(new InputStreamReader(fis));
				  String str=null;
				     while((str=br.readLine())!=null)
				     {
				    	 
				    	 st=new StringTokenizer(str,",");
				    	 pstmt.setInt(1,Integer.parseInt(st.nextToken()));
				    	 pstmt.setString(2,st.nextToken());
				    	 pstmt.setString(3,st.nextToken().toLowerCase());
				    	 java.util.Date d1= sdf.parse(st.nextToken());
				    	 pstmt.setDate(4,new java.sql.Date(d1.getTime()));
				    	 pstmt.execute();
				     }
			       }
			  catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  finally
			  {
				  try { 
					pstmt.close();  
					con.close();
					br.close();
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  
			  }
		}
	
		private void addNewMovie() {
			// TODO Auto-generated method stub
			
			 DbConnect db=new DbConnect();
			 Connection con=db.connectionEstabish();
			 PreparedStatement pstmt=null;
			 BufferedReader br=null;
			 SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
			 
			  try {
				pstmt=con.prepareStatement("insert into movies values(?,?,?,?)");
				 br=new BufferedReader(new InputStreamReader(System.in));
				 System.out.println("Enter movie id:");
				  pstmt.setInt(1,Integer.parseInt(br.readLine()));
		    	 System.out.println("Enter movie name:");
		    	  pstmt.setString(2,br.readLine());
		    	 System.out.println("Enter movie language: ");
		    	 pstmt.setString(3, br.readLine());
		    	 System.out.println("Enter release date(dd/mm/yyyy:");
		    	 java.util.Date d1= sdf.parse(br.readLine());
		    	 pstmt.setDate(4,new java.sql.Date(d1.getTime()));
		    	 pstmt.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	 
			
		}
		
		
		private void addShow() {
			// TODO Auto-generated method stub
			DbConnect db=new DbConnect();
			 Connection con=db.connectionEstabish();
			 PreparedStatement pstmt=null;
			 BufferedReader br=null;
			 SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
			 
			  try {
				pstmt=con.prepareStatement("insert into shows values(?,?,?)");
				 br=new BufferedReader(new InputStreamReader(System.in));
				 System.out.println("Enter show id:");
				  pstmt.setInt(1,Integer.parseInt(br.readLine()));
		    	 System.out.println("Enter movie id:");
		    	  pstmt.setInt(2,Integer.parseInt(br.readLine()));
		    	 System.out.println("Enter show date:(dd/mm/yyyy) ");
		    	 java.util.Date d1= sdf.parse(br.readLine());
		    	 pstmt.setDate(3,new java.sql.Date(d1.getTime()));
		    	 pstmt.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		
		
		private void displayMoviesByShowsForToday() {
			// TODO Auto-generated method stub
			DbConnect db=new DbConnect();
			 Connection con=db.connectionEstabish();
			 try {
				Statement st=con.createStatement();
			     Date d=new Date();
			     java.sql.Date sqld=new java.sql.Date(d.getTime());
			    String query="select shows.show_id,movies.movie_name from shows inner join movies on shows.movie_id=movies.movie_id where show_date ='"+sqld+"'";
				  ResultSet rs=st.executeQuery(query);
				  if(!rs.absolute(1))
				  {
					  System.out.println("data not found.....");
				  }
				  else
					  {
					     rs.beforeFirst();
						  while(rs.next())
						    {
						    	System.out.println(rs.getInt(1)+ "  "+rs.getString(2));
						    }
					  }
				 } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		private void displayMoviesByLanguage() {
			// TODO Auto-generated method stub
			DbConnect db=new DbConnect();
			 Connection con=db.connectionEstabish();
			 BufferedReader br=null;
			 try {
				br=new BufferedReader(new InputStreamReader(System.in));
				Statement st=con.createStatement();
				 System.out.println("Enter movie language:");
				  String lang=br.readLine().toLowerCase();
				  String query="select movie_id,movie_name,release_date from movies where language = '"+lang+"'";
				  ResultSet rs=st.executeQuery(query);
				  if(!rs.absolute(1))
				  {
					  System.out.println("data not found.....");
				  }
				  else
					  {
					     rs.beforeFirst();
						  while(rs.next())
						    {
						    	System.out.println(rs.getInt(1)+ "  "+rs.getString(2)+"  "+rs.getDate(3));
						    }
					  }
				 } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
		}

		private void updateShow() {
			// TODO Auto-generated method stub
			DbConnect db=new DbConnect();
			 Connection con=db.connectionEstabish();
			 BufferedReader br=null;
			 try {
				br=new BufferedReader(new InputStreamReader(System.in));
				Statement st=con.createStatement();
				 System.out.println("Enter show id:");
				  int id=Integer.parseInt(br.readLine());
				  ResultSet rs=st.executeQuery("select show_id from shows");
				  boolean flag=false;
				    while(rs.next())
				    {
				    	if(rs.getInt(1)==id)
				    	{
				    		System.out.println("Enter show date:(dd/mm/yyyy) ");
				    		 SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
					    	 java.sql.Date d1= new java.sql.Date(sdf.parse(br.readLine()).getTime());
					    	 String query="update shows set show_date='"+d1+"' where show_id="+rs.getInt(1);
				    		st.executeUpdate(query);
				    		System.out.println("Show updated...!!!");
				    		flag=true;
				    		break;
				    	}
				    	
				    }
				   if(!flag)
			    	{
			    		System.out.println("Invalid input...!!!");
			    	}
			 } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		private void deleteShow() {
			// TODO Auto-generated method stub
			
			DbConnect db=new DbConnect();
			 Connection con=db.connectionEstabish();
			 BufferedReader br=null;
			 try {
				br=new BufferedReader(new InputStreamReader(System.in));
				Statement st=con.createStatement();
				 System.out.println("Enter show id:");
				  int id=Integer.parseInt(br.readLine());
				  ResultSet rs=st.executeQuery("select show_id from shows");
				  boolean flag=false;
				    while(rs.next())
				    {
				    	if(rs.getInt(1)==id)
				    	{
				    		String query="delete from shows where show_id="+rs.getInt(1);
				    		st.executeUpdate(query);
				    		System.out.println("Show deleted...!!");
				    		flag=true;
				    		break;
				    	}
				    }
				    if(!flag)
			    	{
			    		System.out.println("Invalid input...!!!");
			    	}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		private void bookShow() {
			// TODO Auto-generated method stub
			
			DbConnect db=new DbConnect();
			 Connection con=db.connectionEstabish();
			 BufferedReader br=null;
			 try {
				br=new BufferedReader(new InputStreamReader(System.in));
				Statement st=con.createStatement();
				  ResultSet rs=st.executeQuery("select show_id,movie_name,show_date from shows inner join movies on shows.movie_id=movies.movie_id");
				  if(!rs.absolute(1))
				  {
					  System.out.println("data not found.....");
				  }
				  else
					  {
					     rs.beforeFirst();
						  while(rs.next())
						    {
						    	System.out.println(rs.getInt(1)+ "  "+rs.getString(2)+"  "+rs.getDate(3));
						    }
						  System.out.println("Enter your name:");
						  String name=br.readLine();
						  System.out.println("Enter show id:");
						  int id=Integer.parseInt(br.readLine());
						  String query="insert into booking values('"+name+"',"+id+")";
						   st.executeUpdate(query);  
					  }

					 System.out.println("ticket is booked....");
			 } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
	public static void main(String[] args) {
		Client c=new Client();
		
		int option=0;
        BufferedReader br=null;
        do
        {
        	System.out.println("-------Menu-------");
        	System.out.println("1.Populate Db by data from text file(please opt once.)S. ");
        	System.out.println("2.Add new movies.");
            System.out.println("3.Add show.");
            System.out.println("4.delete show");
            System.out.println("5.update show");
            System.out.println("6.display movies by language.");
            System.out.println("7.display movies by shows for today. ");
            System.out.println("8.book show");
            System.out.println("9.exit.");
            System.out.println("select option:");
              br=new BufferedReader(new InputStreamReader(System.in));
             try {
				option=Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             
             switch(option)
             {
             case 1:
            	 c.populateDb();
            	 System.out.println("Data inserted successfully...");
            	 break;
             case 2:
            	 c.addNewMovie();
            	 break;
             case 3:
            	 c.addShow();
            	 break;
             case 4:
            	 c.deleteShow();
            	 break;
             case 5:
            	 c.updateShow();
            	 break;
             case 6:
            	 c.displayMoviesByLanguage();
            	 break;
             case 7:
            	 c.displayMoviesByShowsForToday();
                 break;
             case 8:
            	 c.bookShow();
            	 break;
             case 9:
            	  System.exit(0);
            	 default:
            		 System.out.println("Invalid option.....!!!");
             }
            
        }while(option!=9);
	}

	

	

	

	

	

}
