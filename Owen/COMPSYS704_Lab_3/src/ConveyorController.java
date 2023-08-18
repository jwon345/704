import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ConveyorController extends ClockDomain{
  public ConveyorController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.INPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.INPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.INPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.INPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.INPUT);
  public Signal empty = new Signal("empty", Signal.INPUT);
  public Signal request = new Signal("request", Signal.INPUT);
  public Signal mode = new Signal("mode", Signal.INPUT);
  public Signal pusherExtendM = new Signal("pusherExtendM", Signal.INPUT);
  public Signal vacOnM = new Signal("vacOnM", Signal.INPUT);
  public Signal armSourceM = new Signal("armSourceM", Signal.INPUT);
  public Signal armDestM = new Signal("armDestM", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  private int S705 = 1;
  private int S175 = 1;
  private int S87 = 1;
  private int S10 = 1;
  private int S43 = 1;
  private int S48 = 1;
  private int S86 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread721(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread720(int [] tdone, int [] ends){
        active[6]=0;
    ends[6]=0;
    tdone[6]=1;
  }

  public void thread719(int [] tdone, int [] ends){
        active[5]=0;
    ends[5]=0;
    tdone[5]=1;
  }

  public void thread718(int [] tdone, int [] ends){
        active[4]=0;
    ends[4]=0;
    tdone[4]=1;
  }

  public void thread716(int [] tdone, int [] ends){
        switch(S48){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        armDest.setPresent();//sysj\controller.sysj line: 37, column: 7
        currsigs.addElement(armDest);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread715(int [] tdone, int [] ends){
        switch(S43){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\controller.sysj line: 35, column: 7
        currsigs.addElement(vacOn);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread713(int [] tdone, int [] ends){
        S48=1;
    armDest.setPresent();//sysj\controller.sysj line: 37, column: 7
    currsigs.addElement(armDest);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread712(int [] tdone, int [] ends){
        S43=1;
    vacOn.setPresent();//sysj\controller.sysj line: 35, column: 7
    currsigs.addElement(vacOn);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread710(int [] tdone, int [] ends){
        if(vacOnM.getprestatus()){//sysj\controller.sysj line: 49, column: 15
      vacOn.setPresent();//sysj\controller.sysj line: 49, column: 25
      currsigs.addElement(vacOn);
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
    else {
      active[7]=0;
      ends[7]=0;
      tdone[7]=1;
    }
  }

  public void thread709(int [] tdone, int [] ends){
        if(armSourceM.getprestatus()){//sysj\controller.sysj line: 48, column: 15
      armSource.setPresent();//sysj\controller.sysj line: 48, column: 29
      currsigs.addElement(armSource);
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
  }

  public void thread708(int [] tdone, int [] ends){
        if(armDestM.getprestatus()){//sysj\controller.sysj line: 47, column: 15
      armDest.setPresent();//sysj\controller.sysj line: 47, column: 27
      currsigs.addElement(armDest);
      active[5]=0;
      ends[5]=0;
      tdone[5]=1;
    }
    else {
      active[5]=0;
      ends[5]=0;
      tdone[5]=1;
    }
  }

  public void thread707(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 46, column: 15
      pusherExtend.setPresent();//sysj\controller.sysj line: 46, column: 32
      currsigs.addElement(pusherExtend);
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
    else {
      active[4]=0;
      ends[4]=0;
      tdone[4]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S705){
        case 0 : 
          S705=0;
          break RUN;
        
        case 1 : 
          S705=2;
          S705=2;
          S175=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S175){
            case 0 : 
              if(mode.getprestatus()){//sysj\controller.sysj line: 11, column: 9
                S175=1;
                if((mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 12, column: 7
                  S87=0;
                  S10=0;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S87=1;
                  S86=0;
                  thread707(tdone,ends);
                  thread708(tdone,ends);
                  thread709(tdone,ends);
                  thread710(tdone,ends);
                  int biggest711 = 0;
                  if(ends[4]>=biggest711){
                    biggest711=ends[4];
                  }
                  if(ends[5]>=biggest711){
                    biggest711=ends[5];
                  }
                  if(ends[6]>=biggest711){
                    biggest711=ends[6];
                  }
                  if(ends[7]>=biggest711){
                    biggest711=ends[7];
                  }
                  //FINXME code
                  if(biggest711 == 0){
                    S86=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              switch(S87){
                case 0 : 
                  switch(S10){
                    case 0 : 
                      if(request.getprestatus()){//sysj\controller.sysj line: 13, column: 10
                        S10=1;
                        armDest.setPresent();//sysj\controller.sysj line: 15, column: 5
                        currsigs.addElement(armDest);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      if(armAtDest.getprestatus()){//sysj\controller.sysj line: 14, column: 11
                        S10=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        armDest.setPresent();//sysj\controller.sysj line: 15, column: 5
                        currsigs.addElement(armDest);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 2 : 
                      if(!empty.getprestatus()){//sysj\controller.sysj line: 18, column: 10
                        S10=3;
                        pusherExtend.setPresent();//sysj\controller.sysj line: 21, column: 5
                        currsigs.addElement(pusherExtend);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 3 : 
                      if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 20, column: 11
                        S10=4;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        pusherExtend.setPresent();//sysj\controller.sysj line: 21, column: 5
                        currsigs.addElement(pusherExtend);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 4 : 
                      if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 24, column: 10
                        S10=5;
                        armSource.setPresent();//sysj\controller.sysj line: 27, column: 5
                        currsigs.addElement(armSource);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 5 : 
                      if(armAtSource.getprestatus()){//sysj\controller.sysj line: 26, column: 11
                        S10=6;
                        vacOn.setPresent();//sysj\controller.sysj line: 31, column: 5
                        currsigs.addElement(vacOn);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        armSource.setPresent();//sysj\controller.sysj line: 27, column: 5
                        currsigs.addElement(armSource);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 6 : 
                      if(WPgripped.getprestatus()){//sysj\controller.sysj line: 30, column: 11
                        S10=7;
                        thread712(tdone,ends);
                        thread713(tdone,ends);
                        int biggest714 = 0;
                        if(ends[2]>=biggest714){
                          biggest714=ends[2];
                        }
                        if(ends[3]>=biggest714){
                          biggest714=ends[3];
                        }
                        if(biggest714 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        vacOn.setPresent();//sysj\controller.sysj line: 31, column: 5
                        currsigs.addElement(vacOn);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 7 : 
                      if(armAtDest.getprestatus()){//sysj\controller.sysj line: 34, column: 11
                        S10=8;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        thread715(tdone,ends);
                        thread716(tdone,ends);
                        int biggest717 = 0;
                        if(ends[2]>=biggest717){
                          biggest717=ends[2];
                        }
                        if(ends[3]>=biggest717){
                          biggest717=ends[3];
                        }
                        if(biggest717 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest717 == 0){
                          ;//sysj\controller.sysj line: 37, column: 25
                          S10=8;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    
                    case 8 : 
                      if(!WPgripped.getprestatus()){//sysj\controller.sysj line: 40, column: 10
                        S10=9;
                        armSource.setPresent();//sysj\controller.sysj line: 43, column: 5
                        currsigs.addElement(armSource);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 9 : 
                      if(armAtSource.getprestatus()){//sysj\controller.sysj line: 42, column: 11
                        S175=0;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        armSource.setPresent();//sysj\controller.sysj line: 43, column: 5
                        currsigs.addElement(armSource);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                  }
                  break;
                
                case 1 : 
                  switch(S86){
                    case 0 : 
                      thread718(tdone,ends);
                      thread719(tdone,ends);
                      thread720(tdone,ends);
                      thread721(tdone,ends);
                      int biggest722 = 0;
                      if(ends[4]>=biggest722){
                        biggest722=ends[4];
                      }
                      if(ends[5]>=biggest722){
                        biggest722=ends[5];
                      }
                      if(ends[6]>=biggest722){
                        biggest722=ends[6];
                      }
                      if(ends[7]>=biggest722){
                        biggest722=ends[7];
                      }
                      //FINXME code
                      if(biggest722 == 0){
                        S86=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      S86=1;
                      S175=0;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    
                  }
                  break;
                
              }
              break;
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          pusherRetracted.gethook();
          pusherExtended.gethook();
          WPgripped.gethook();
          armAtSource.gethook();
          armAtDest.gethook();
          empty.gethook();
          request.gethook();
          mode.gethook();
          pusherExtendM.gethook();
          vacOnM.gethook();
          armSourceM.gethook();
          armDestM.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      request.setpreclear();
      mode.setpreclear();
      pusherExtendM.setpreclear();
      vacOnM.setpreclear();
      armSourceM.setpreclear();
      armDestM.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherRetracted.getStatus() ? pusherRetracted.setprepresent() : pusherRetracted.setpreclear();
      pusherRetracted.setpreval(pusherRetracted.getValue());
      pusherRetracted.setClear();
      dummyint = pusherExtended.getStatus() ? pusherExtended.setprepresent() : pusherExtended.setpreclear();
      pusherExtended.setpreval(pusherExtended.getValue());
      pusherExtended.setClear();
      dummyint = WPgripped.getStatus() ? WPgripped.setprepresent() : WPgripped.setpreclear();
      WPgripped.setpreval(WPgripped.getValue());
      WPgripped.setClear();
      dummyint = armAtSource.getStatus() ? armAtSource.setprepresent() : armAtSource.setpreclear();
      armAtSource.setpreval(armAtSource.getValue());
      armAtSource.setClear();
      dummyint = armAtDest.getStatus() ? armAtDest.setprepresent() : armAtDest.setpreclear();
      armAtDest.setpreval(armAtDest.getValue());
      armAtDest.setClear();
      dummyint = empty.getStatus() ? empty.setprepresent() : empty.setpreclear();
      empty.setpreval(empty.getValue());
      empty.setClear();
      dummyint = request.getStatus() ? request.setprepresent() : request.setpreclear();
      request.setpreval(request.getValue());
      request.setClear();
      dummyint = mode.getStatus() ? mode.setprepresent() : mode.setpreclear();
      mode.setpreval(mode.getValue());
      mode.setClear();
      dummyint = pusherExtendM.getStatus() ? pusherExtendM.setprepresent() : pusherExtendM.setpreclear();
      pusherExtendM.setpreval(pusherExtendM.getValue());
      pusherExtendM.setClear();
      dummyint = vacOnM.getStatus() ? vacOnM.setprepresent() : vacOnM.setpreclear();
      vacOnM.setpreval(vacOnM.getValue());
      vacOnM.setClear();
      dummyint = armSourceM.getStatus() ? armSourceM.setprepresent() : armSourceM.setpreclear();
      armSourceM.setpreval(armSourceM.getValue());
      armSourceM.setClear();
      dummyint = armDestM.getStatus() ? armDestM.setprepresent() : armDestM.setpreclear();
      armDestM.setpreval(armDestM.getValue());
      armDestM.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        empty.gethook();
        request.gethook();
        mode.gethook();
        pusherExtendM.gethook();
        vacOnM.gethook();
        armSourceM.gethook();
        armDestM.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
