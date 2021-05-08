import java.util.*;

public class JobDataServices {
    List<JobDetails> jd;
    
    public JobDataServices(List<JobDetails> jd){
        this.jd = jd;
    }


    // to filter, we'll create a hashmap of attributes as keys and popularity as value and then we'll print its contents
    public void FilterJobsByTitle(){
        //frequency of job title
        HashMap<String, Integer> hm = new HashMap<>();
        for(JobDetails j: this.jd){
            if(hm.containsKey(j.Title)){
                hm.put(j.Title , hm.get(j.Title) + 1);
            }
            else{
                hm.put(j.Title,1);
            }
        }

        for (Map.Entry mapElement : hm.entrySet()) {
            String key = (String)mapElement.getKey();
  
            // Add some bonus marks
            // to all the students and print it
            int value = (int)mapElement.getValue();
  
            System.out.println(key + " : " + value);
        }



    }

    public void FilterJobsByCountry(){
        //frequency of job title
        HashMap<String, Integer> hm = new HashMap<>();
        for(JobDetails j: this.jd){
            if(hm.containsKey(j.Country)){
                hm.put(j.Country , hm.get(j.Country) + 1);
            }
            else{
                hm.put(j.Country,1);
            }
        }

        for (Map.Entry mapElement : hm.entrySet()) {
            String key = (String)mapElement.getKey();
  
            // Add some bonus marks
            // to all the students and print it
            int value = (int)mapElement.getValue();
  
            System.out.println(key + " : " + value);
        }

    }

    public void FilterJobsByYearsOfExp(){
         //frequency of job title
        HashMap<String, Integer> hm = new HashMap<>();
        for(JobDetails j: this.jd){
            if(hm.containsKey(j.YearsExp)){
                hm.put(j.YearsExp , hm.get(j.YearsExp) + 1);
            }
            else{
                hm.put(j.YearsExp,1);
            }
        }

        hm = sortMap(hm);

        for (Map.Entry mapElement : hm.entrySet()) {
            String key = (String)mapElement.getKey();
  
            // Add some bonus marks
            // to all the students and print it
            int value = (int)mapElement.getValue();
  
            System.out.println(key + " : " + value);
        }
    }

    //***************************************************************
   public  HashMap<String, Integer> sortMap(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    

   

   
}