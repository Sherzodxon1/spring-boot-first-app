package uz.com.springbootfirstapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import uz.com.springbootfirstapp.model.req.TestRequest;
import uz.com.springbootfirstapp.model.res.TestResponse;

@RestController
//@Controller
@RequestMapping("/api/test")
public class TestController {

//    @RequestMapping(value = "/test", method = RequestMethod.GET)  // 1-usul
    @GetMapping("/get")  // 2-usul
    public String getTest(@RequestParam("firstname") String fname,
                          @RequestParam("lastname") String lname) {
        return "Request -> " + fname + ":" + lname;
    }

//    @RequestMapping(value = "/test", method = RequestMethod.POST)  // 1-usul
    @PostMapping("/post")  // 2-usul
//    @ResponseBody
    public TestResponse postTest(@RequestBody TestRequest request) {
        TestResponse response = new TestResponse();
        response.setName(request.getName());
        response.setAge(request.getAge());
        response.setPhone(request.getPhone());
        response.setEmail(request.getEmail());
        return response;
    }

    @PutMapping("/put")  // 2-usul
    public String putTest() {
        return "Request -> Empty";
    }

}
