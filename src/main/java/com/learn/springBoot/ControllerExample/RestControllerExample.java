package com.learn.springBoot.ControllerExample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;

@RestController    // @controller + @ResponseBody
@RequestMapping(value = "/rest")
public class RestControllerExample {

    @InitBinder  // edit proprty for incoming request param
    protected void initBinder(DataBinder binder){
        binder.registerCustomEditor(String.class, "firstName", new FirstNamePropertyEditot());
    }

    @GetMapping (path = "/getUser")  // for using get mapping
    public String getUserName(@RequestParam(value = "firstName") String firstName,
                              @RequestParam(value = "lastName", required = false) String lastName){
        return  "fetching "+ firstName +" in rest controller " + lastName;
    }

    @PostMapping (value = "/updateUser")  // for using get mapping
    public String updateUsername(@RequestBody User user){
        return  "update "+user.getUsername()+" and  email"+user.getEmail() +" in rest controller";
    }

    @GetMapping (path = "/getUserByPath/{firstName}")  // for using get mapping
    public String getUserNameByPath(@PathVariable(value = "firstName" ) String firstName){
        return  "fetching pathVarialble "+ firstName +" in rest controller " ;
    }


    @GetMapping (path = "/getUserByResponseEntity/{firstName}")  // for using get mapping
    public ResponseEntity<String> getUserByResponseEntity(@PathVariable(value = "firstName" ) String firstName){
        return  ResponseEntity.status(HttpStatus.OK).body( "fetching pathVarialble "+ firstName +" in rest controller " );
    }

}
