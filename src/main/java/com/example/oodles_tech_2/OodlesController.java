package com.example.oodles_tech_2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.soap.Detail;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OodlesController {

    @Autowired
     OodlesServiceImpl oodlesService;


    @GetMapping("/getDetails")
    public List<OodlesData> details(){
        return oodlesService.getDetails();
    }

    @GetMapping("/getDetailsById/{id}")
   // @RequestMapping(path="/getDetailsById/{id}",method=RequestMethod.GET)
    public Optional<OodlesData> getDetailsById(@PathVariable(value="id")Long id){
        return oodlesService.findById(id);
    }

    @PostMapping("/addDetails")
    public OodlesData addDetails(@RequestBody OodlesData details){
        return oodlesService.save(details);

    }



    @PutMapping("/updateDetails/{id}")
    public OodlesData updateDetails(@PathVariable(value = "id") Long id, @RequestBody OodlesData oodlesInputData){
        Optional<OodlesData> details= oodlesService.findById(id);
        OodlesData details_new=details.get();
        details_new.setName(oodlesInputData.getName());
        details_new.setGender(oodlesInputData.getGender());
        details_new.setMobileNumber(oodlesInputData.getMobileNumber());

        return oodlesService.save(details_new);
    }




    @DeleteMapping("/deleteDetails/{id}")
    public void deleteDetails(@PathVariable(value = "id") Long id){
        Optional<OodlesData> oodlesData=oodlesService.findById(id);
        OodlesData oodlesData_new=oodlesData.get();
        oodlesService.delete(oodlesData_new);
    }






}
