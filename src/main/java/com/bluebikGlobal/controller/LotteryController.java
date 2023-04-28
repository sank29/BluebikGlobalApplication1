package com.bluebikGlobal.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bluebikGlobal.BluebikGlobalApplication;

@RestController
public class LotteryController {
	
	
	@Autowired
    private BluebikGlobalApplication bluebikGlobalApplication;

    @PostMapping("/pushLotteryIds")
    public String pushLotteryIds(@RequestBody Set<Integer> newIds) {
    	
    	bluebikGlobalApplication.pushLotteryIds(newIds);
    	
        return "New lottery IDs added successfully";
        
    }

    

    @PostMapping("/checkLotteryId/{id}")
    public String checkLotteryId(@PathVariable Integer id) {
    	
        boolean isWinner = bluebikGlobalApplication.checkLotteryId(id);
        
        if (isWinner) {
        	
            return "Congratulations, you won!";
            
        } else {
        	
            return "Sorry, you did not win";
            
        }
        
    }
    
    @PostMapping("/clearLotteryIds")
    public String clearLotteryIds() {
    	
    	bluebikGlobalApplication.clearLotteryIds();
    	
        return "Lottery IDs cleared successfully";
        
    }
	

}
