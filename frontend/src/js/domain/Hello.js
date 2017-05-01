const API_URL = 'http://localhost:8080/hello';
export default class {
    constructor () {
    }

    printHello () {
        console.log("Hello.js printHello()");
        var result = $.ajax({
                type: 'GET',
                url: API_URL,
                async: false
            }).responseText;
        console.log("ok", result);
        return result;
    }
}
