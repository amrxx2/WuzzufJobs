import java.io.*;
import java.util.Scanner;

import java.util.*;


public class JobDetails{
    
    public String Title;
    public String Company;
    public String Location;
    public String Type;
    public String Level;
    public String YearsExp;
    public String Country;
    public String Skills;

    public JobDetails(String Title,String Company,String Location,String Type,String Level,String YearsExp,String Country,String Skills ){
        this.Title = Title;
        this.Company = Company;
        this.Location = Location;
        this.Type = Type;
        this.Level = Level;
        this.YearsExp = YearsExp;
        this.Country = Country;
        this.Skills = Skills;
    }
}