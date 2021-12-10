package grid.example;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;


public class GridAction extends ActionSupport {
    private List<courseBean> courseList;
    private courseDao dao = new courseDao();

    public List<courseBean> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<courseBean> courseList) {
        this.courseList = courseList;
    }

   
    
    
    public String execute() throws Exception {
        
        try {
            
            this.courseList = dao.courseadd();
            //System.out.println(getCourseList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        return "success";
    }

    
    
      
    
}
