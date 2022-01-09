var fun1 = function(name) {
    print('Hi there from Javascript, ' + name);
    return "greetings from javascript";
};

var fun2 = function (object) {
    print("JS Class Definition: " + Object.prototype.toString.call(object));
};


var isBlank = function(code, name, msg) {
    if (code == null || code == '') {
        if (msg == null || msg == ''){
            msg = "不能为空"
        }
       return name + msg;
    }
    return "";
}
