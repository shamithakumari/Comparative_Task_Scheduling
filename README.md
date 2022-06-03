# Comparative Study of Task Scheduling Algorithm through Cloudsim

The basic idea of Task Scheduling is, arranging the incoming requests(tasks) in a particular manner so that available resources will be utilized appropriately. Cloud computing is the technology that delivers services through the internet where the users will submit their requests. Each service has a number of users and These users may generate a number of requests at a time. The system should be able to handle these requests, So we schedule these tasks in a distributed manner so that no fault occurs and requests are distributed in an efficient manner to the available resources.

In our project, we implemented three task scheduling algorithms, which are First Come First Serve(FCFS), Shortest Job First(SJF), and Round Robin(RR). We assigned the values of the VM, Cloudlet, Datacenter, and system parameters as mentioned in the research paper. By comparing the result of task scheduling, we found that the RR approach will give best results compared to the other two algorithms based on finishing time.

### CloudSim

In our project, we used the Cloudsim simulation toolkit for the simulation of task scheduling.
It is an open-source framework used for modeling and simulating a cloud computing environment. It provides pre-defined allocation policies and utilization models for managing resources and allows the implementation of user-defined algorithms as well.

### Steps to run the Project:

* Install Eclipse IDE
https://www.eclipse.org/downloads/

   (While installing select Eclipse IDE for Java developer)
* Install CloudSim3.0.3
* Download the cloudsim-3.0.3 zip file from the below link and open it in Eclipse IDE
https://github.com/Cloudslab/cloudsim/releases.
* Open the project in eclipse and add the required Jar files that are present in the Jar folder above.
* If any error occurs while executing in eclipse, left-click on project select properties, select java compiler, enable the project-specific setting, then apply and close.

CloudSim version used → **CloudSim.3.0.3**

The language used → **Java(version-11)**

Eclipse → **2022-03**