package com.psl.q2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class Client {

	public static void main(String[] args) {

		Customer c = null;
		List<Customer> cList = new ArrayList<Customer>();
		File f = new File("Billing.csv");

		if (f.exists()) {
			System.out.println("File Exists.......!!!");
		} else {
			System.out.println("File doesn't exists....!!!");
		}

		try (FileInputStream fis = new FileInputStream(f);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						fis));) {

			String data = null;
			data = br.readLine();
			StringTokenizer st = new StringTokenizer(data, ",");
			System.out.printf(
					"%-25s %-25s %-25s %-25s %-25s %-25s %-25s %-25s \n",
					st.nextToken(), st.nextToken(), st.nextToken(),
					st.nextToken(), st.nextToken(), st.nextToken(),
					st.nextToken(), st.nextToken());
			System.out.println("All customer details: ");
			while ((data = br.readLine()) != null) {
				c = new Customer();
				st = new StringTokenizer(data, ",");

				c.setCustomerId(Integer.parseInt(st.nextToken()));
				c.setCustomerName(st.nextToken());
				c.setIsd_call_duration(Integer.parseInt(st.nextToken()));
				c.setIsd_per_min(Double.parseDouble(st.nextToken()));
				c.setStd_call_duration(Integer.parseInt(st.nextToken()));
				c.setStd_per_min(Double.parseDouble(st.nextToken()));
				c.setLocal_call_duration(Integer.parseInt(st.nextToken()));
				c.setLocal_per_min(Double.parseDouble(st.nextToken()));

				System.out.printf(
						"%-25s %-25s %-25s %-25s %-25s %-25s %-25s %-25s \n",
						c.getCustomerId(), c.getCustomerName(),
						c.getIsd_call_duration(), c.getIsd_per_min(),
						c.getStd_call_duration(), c.getStd_per_min(),
						c.getLocal_call_duration(), c.getLocal_per_min());

				cList.add(c);

			}
			
			DecimalFormat format = new DecimalFormat("0.#");
			System.out.println("\n\n");
			System.out.printf("%-30s %s  \n", "Customer Name",
					"Amount to be paid in rupees.");

			Iterator<Customer> itr = cList.iterator();

			while (itr.hasNext()) {
				c = itr.next();
				double total_amt = ((c.getIsd_call_duration() / 60) * c
						.getIsd_per_min())
						+ ((c.getStd_call_duration() / 60) * c.getStd_per_min())
						+ ((c.getLocal_call_duration() / 60) * c.getLocal_per_min());
				
				       
				System.out.printf("%-30s %s/- only  \n",c.getCustomerName(),
						format.format(total_amt));
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
