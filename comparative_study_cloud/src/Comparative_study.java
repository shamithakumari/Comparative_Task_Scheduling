
import java.util.ArrayList;
import java.util.Collections;



import FCFS.CloudSimFCFS;
import RoundRobin.CloudSimRR;
import SJF.CloudSimSJF;


public class Comparative_study {
 

	public static void main(String[] args)  {
    	double newValue;

    	
    	
//    	System.out.println("hello");
    	System.out.println("\n===========================================\n");
    	CloudSimFCFS.main(new String[0]);
    	System.out.println("\n===========================================\n");
    	CloudSimSJF.main(new String[0]);
    	System.out.println("\n===========================================\n");
    	CloudSimRR.main(new String[0]);
    	System.out.println("\n===========================================\n");
    	
     	
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
        int i;
        
        System.out.println("Sorted list of algorithms(criteria: earliest finish time):\n");
        
		for(i=0;i<results.size();i++)
        {newValue = (double) Math.round(results.get(i)*10000d)/10000d;
        results.set(i, newValue);
        }
        

        
        System.out.println(results);
        
      	System.out.println("\n===========================================\n");
      	System.out.printf("Round Robin=%.4f\n",results.get(0));
      	System.out.printf("First Come First Serve=%.4f\n",results.get(1));
      	System.out.printf("Shortest Job First=%.4f\n",results.get(2));
     	System.out.println("\n===========================================\n");
        System.out.println("Algorithm that gives the best result is(criteria: earliest finish time): Round Robin Algorithm");
        
        
    }
    }



