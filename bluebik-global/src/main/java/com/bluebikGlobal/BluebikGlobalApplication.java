package com.bluebikGlobal;

import java.util.Set;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class BluebikGlobalApplication {
	
	private Set<Integer> lotteryIds;

    public BluebikGlobalApplication() {
        this.lotteryIds = new HashSet<>();
    }
    
    public void pushLotteryIds(Set<Integer> newIds) {
        lotteryIds.addAll(newIds);
    }

    public boolean checkLotteryId(Integer id) {
    	
        return this.lotteryIds.contains(id);
        
    }

    public boolean checkLotteryIds(@PathVariable Integer id) {
    	
        return checkLotteryId(id);
        
    }
    
    public void clearLotteryIds() {
        lotteryIds.clear();
    }

	public static void main(String[] args) {
		
		SpringApplication.run(BluebikGlobalApplication.class, args);
		
	}

}













