package src.test3;

import java.util.UUID;

public class LUN{
    private String id;
    private int size=0;
    private boolean export=false; 
    
    public LUN(){
        this.id = UUID.randomUUID().toString().replaceAll("-", "");
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setId(String LUNid){
         id=LUNid;
    }
        
    public int getSize(){
        return this.size;
    }
    
    public void setSize(int LUNsize){
         size=LUNsize;
    }
    
    public boolean getExport(){
        return this.export;
    }
    
    public void setExport(boolean LUNexport){
         export=LUNexport;
    }
   
}