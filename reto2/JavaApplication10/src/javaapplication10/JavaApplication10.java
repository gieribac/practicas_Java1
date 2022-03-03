package javaapplication10;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class JavaApplication10 {
    public static void main(String[] args) {
        while (true){
            Scanner in = new Scanner(System.in);
            String cadena = in.next();
            if ("*".equals(cadena))
                break;
            int target = Integer.parseInt(cadena);            
            Double px =  hallarpipj(target).get_i();
            Double py =  hallarpipj(target).get_j();
            System.out.println(px);
            System.out.println(py);
            Integer tamlist = px;
            int listpx[] = new int[tamlist];
            int listpy[] = new int[tamlist];
            int avertices[] = new int[tamlist];
            int vertices[][] = new int[tamlist][2];
            for (int i=0;i<tamlist;i++){
                px =  hallarpipj(py).get_i();
                py =  hallarpipj(py).get_j();
                listpx[i] = px;
                listpy[i] = py;      
            }
            for (int i=0;i<tamlist-1;i++){
                avertices[i] = listpx[i+1];
            } 
            avertices[tamlist-2] = listpx[tamlist-1];
            avertices[tamlist-1] = listpy[tamlist-1]; 
            for (int i=0;i<tamlist;i++){
                vertices[i][0] = hallarpipj(avertices[i]).get_i();
                vertices[i][1] = hallarpipj(avertices[i]).get_j();
            }
            float area = Math.round(areaPoligono(vertices,tamlist)*10)/10;
            System.out.println(area); 
        }
    }
    public static Pos hallarpipj(int target){ 
        Double ip = Math.floor((-1+Math.pow((1+8*target),0.5))*0.5);
        BigDecimal bd = new BigDecimal(String.valueOf(ip));
        BigDecimal i = bd.setScale(0,RoundingMode.FLOOR);
        System.out.println("BigDecimal rounded off : "+i);
        
        BigDecimal contents = Math.floor(i*(i+1)*0.5);
        Integer j=0;
        while (contents<target){
            contents=contents+1;
            i=i-1;
            j=j+1;
        }
        Pos pos = new Pos(i, j);
        return pos; 
    }
    public static Double areaPoligono(int vertices[][],int large){
        Double area=0.00;
        Double areaT=0.00;
        for (int i=1; i<large-1;i++){
            float vecUy=vertices[i][1]-vertices[0][1];
            float vecUx=vertices[i][0]-vertices[0][0];
            float vecVy=vertices[i+1][1]-vertices[0][1];
            float vecVx=vertices[i+1][0]-vertices[0][0];
            areaT= Double.parseDouble(Double.toString(Math.round((0.5*Math.pow(Math.pow((vecUx*vecVy-vecUy*vecVx),2),0.5))*100.0)/100.0));
            area=area+areaT;
        }   
        return area;
    }
}