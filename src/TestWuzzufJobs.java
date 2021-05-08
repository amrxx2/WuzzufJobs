import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class TestWuzzufJobs 
{
    JobDataServices jds;
    List<JobDetails> jd;

    public TestWuzzufJobs (String path) throws IOException
    {
        DispJobs test = new DispJobs(path);
        this.jd = test.getJobs();  // a list of job details.
        this.jds = new JobDataServices(this.jd);  // feed that list into job data service object.
    }

    public void test(){
        this.jds.FilterJobsByTitle();
        this.jds.FilterJobsByCountry();
        this.jds.FilterJobsByYearsOfExp();
    } 


}