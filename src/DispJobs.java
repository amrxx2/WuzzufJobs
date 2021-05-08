import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;


public class DispJobs { 

    List<JobDetails> jd;


// this constructor will fill the 'jd' variable with jobs.
public DispJobs(String path) throws IOException{
BufferedReader reader;
		try {
            List<JobDetails> jobs = new ArrayList<JobDetails>();
			reader = new BufferedReader(new FileReader(
					path));
			String line = reader.readLine();
			while (line != null) {
				line = reader.readLine();

				//the following line because some records are empty
                 if(line == null) continue;

                 // the following regex code will split on commas that are not inside double quotes.
                 String[] attributes = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                 //
                jobs.add(new JobDetails(attributes[0],attributes[1],attributes[2],attributes[3],attributes[4],attributes[5],attributes[6],attributes[7]));

            
            }
             //System.out.println(jobs.size());
			this.jd = jobs;
            reader.close();

			}
         catch (IOException e) {
			e.printStackTrace();
		}

		}


        // this function will get the 'jd' variable
        public List<JobDetails> getJobs(){
            return this.jd;
        }



}
    
