"use strict";
exports.__esModule = true;
var User = /** @class */ (function () {
    function User(name, age) {
        this.name = name;
        this.age = age;
        this.isIndian = true;
    }
    User.prototype.getName = function () {
        return this.name;
    };
    return User;
}());
exports.User = User;
