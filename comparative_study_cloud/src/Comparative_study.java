
import java.util.ArrayList;
import java.util.Collections;

import org.cloudbus.cloudsim.Log;

import FCFS.CloudSimFCFS;
import RoundRobin.CloudSimRR;
import SJF.CloudSimSJF;
//
//
//import java.util.SortedMap;
//import java.util.TreeMap;
//import java.util.concurrent.TimeUnit;

public class Comparative_study {
    public static void main(String[] args)  {
    	
//        SortedMap<Double, String> map = new TreeMap<>();
//        
//         double FCFSS_finishtime=CloudSimFCFS.FCFS_FinishTime;
//        System.out.println("Sorted list of algorithms (criteria: earliest finish time)");
//        for(double i: map.keySet()){
//            System.out.printf("%s: %.2f%n", map.get(i), i);
//        
//        System.out.println("===========================================");
    	
    	
//    	System.out.println("hello");
    	System.out.println("\n===========================================\n");
    	CloudSimFCFS.main(new String[0]);
    	System.out.println("\n===========================================\n");
    	CloudSimSJF.main(new String[0]);
    	System.out.println("\n===========================================\n");
    	CloudSimRR.main(new String[0]);
    	System.out.println("\n===========================================\n");
    	
//     	System.out.println("finish time="+ CloudSimFCFS.FCFS_FinishTime);
     	
     	double fcfsFinishTime = CloudSimFCFS.FCFS_FinishTime;
     	double sjfFinishTime = CloudSimSJF.SJF_FinishTime;
     	double roundRobinFinishTime = CloudSimRR.RR_FinishTime;
     	
     	
     	//System.out.println(fcfsFinishTime);
     	//System.out.println(sjfFinishTime);
      	//System.out.println(roundRobinFinishTime);
      	
        ArrayList<Double> results = new ArrayList<Double>();
        results.add(fcfsFinishTime);
        results.add(sjfFinishTime);
        results.add(roundRobinFinishTime);
        
        Collections.sort(results);
        
        System.out.println("Sorted list of algorithms(criteria: earliest finish time):\n");
        System.out.println(results);
        
        
        
    }
    }



