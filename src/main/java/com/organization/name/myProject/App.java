package com.organization.name.myProject;
import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;
public class App 
{
   
    	public static boolean double_search(ArrayList<Integer> array1,ArrayList<Integer> array2,int e,int f) {
    		System.out.println("inside double search");
    		int c1=0,c2=0;
    		if (array1 == null) return false;
    		if (array2 == null) return false;
    		for (int elt : array1) {
    		if (elt == 2*e) 
    			c1 = e;
    		}
    		for (int elt2 : array2) {
        		if (elt2 == 2*f) 
        			c2 = f;
        		}
    		if(c1 + c2 ==0)
    			return false;
    		return true;
    		}

    
public static void main(String[] args) {
port(getHerokuAssignedPort());
get("/", (req, res) -> "Hello, World");
post("/compute", (req, res) -> {
//System.out.println(req.queryParams("input1"));
//System.out.println(req.queryParams("input2"));
String input1 = req.queryParams("input1");
java.util.Scanner sc1 = new java.util.Scanner(input1);
sc1.useDelimiter("[;\r\n]+");
java.util.ArrayList<Integer> inputList = new java.util.ArrayList<>();
while (sc1.hasNext())
{
int value = Integer.parseInt(sc1.next().replaceAll("\\s",""));
inputList.add(value);
}
System.out.println(inputList);
String input2 = req.queryParams("input2");
java.util.Scanner sc2 = new java.util.Scanner(input2);
sc1.useDelimiter("[;\r\n]+");
java.util.ArrayList<Integer> inputList2 = new java.util.ArrayList<>();
while (sc2.hasNext())
{
int value2 = Integer.parseInt(sc2.next().replaceAll("\\s",""));
inputList2.add(value2);
}

System.out.println(inputList2);

String input3 = req.queryParams("input3").replaceAll("\\s","");
int input3AsInt = Integer.parseInt(input3);

String input4 = req.queryParams("input4").replaceAll("\\s","");
int input4AsInt = Integer.parseInt(input4);

boolean result = App.double_search(inputList,inputList2, input3AsInt,input4AsInt);
Map map = new HashMap();
map.put("result", result);
return new ModelAndView(map, "compute.mustache");
}, new MustacheTemplateEngine());
get("/compute",
(rq, rs) -> {
Map map = new HashMap();
map.put("result", "not computed yet!");
return new ModelAndView(map, "compute.mustache");
},
new MustacheTemplateEngine());
}
static int getHerokuAssignedPort() {
ProcessBuilder processBuilder = new ProcessBuilder();
if (processBuilder.environment().get("PORT") != null) {
return Integer.parseInt(processBuilder.environment().get("PORT"));
}
return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
}
}
