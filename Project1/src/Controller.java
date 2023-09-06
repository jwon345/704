import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class Controller extends ClockDomain{
  public Controller(String name){super(name);}
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
  private int S1852 = 1;
  private int S890 = 1;
  private int S650 = 1;
  private int S415 = 1;
  private int S446 = 1;
  private int S457 = 1;
  private int S456 = 1;
  private int S649 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread1868(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread1867(int [] tdone, int [] ends){
        active[6]=0;
    ends[6]=0;
    tdone[6]=1;
  }

  public void thread1866(int [] tdone, int [] ends){
        active[5]=0;
    ends[5]=0;
    tdone[5]=1;
  }

  public void thread1865(int [] tdone, int [] ends){
        active[4]=0;
    ends[4]=0;
    tdone[4]=1;
  }

  public void thread1863(int [] tdone, int [] ends){
        switch(S457){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S456){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\controller.sysj line: 37, column: 14
              S456=1;
              armDest.setPresent();//sysj\controller.sysj line: 40, column: 9
              currsigs.addElement(armDest);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(armAtDest.getprestatus()){//sysj\controller.sysj line: 38, column: 14
              ends[3]=2;
              tdone[3]=1;
            }
            else {
              armDest.setPresent();//sysj\controller.sysj line: 40, column: 9
              currsigs.addElement(armDest);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1862(int [] tdone, int [] ends){
        switch(S446){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\controller.sysj line: 33, column: 9
        currsigs.addElement(vacOn);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread1860(int [] tdone, int [] ends){
        S457=1;
    S456=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1859(int [] tdone, int [] ends){
        S446=1;
    vacOn.setPresent();//sysj\controller.sysj line: 33, column: 9
    currsigs.addElement(vacOn);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread1857(int [] tdone, int [] ends){
        if(vacOnM.getprestatus()){//sysj\controller.sysj line: 59, column: 17
      vacOn.setPresent();//sysj\controller.sysj line: 59, column: 27
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

  public void thread1856(int [] tdone, int [] ends){
        if(armSourceM.getprestatus()){//sysj\controller.sysj line: 58, column: 17
      armSource.setPresent();//sysj\controller.sysj line: 58, column: 31
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

  public void thread1855(int [] tdone, int [] ends){
        if(armDestM.getprestatus()){//sysj\controller.sysj line: 57, column: 17
      armDest.setPresent();//sysj\controller.sysj line: 57, column: 29
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

  public void thread1854(int [] tdone, int [] ends){
        if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 56, column: 17
      pusherExtend.setPresent();//sysj\controller.sysj line: 56, column: 34
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
      switch(S1852){
        case 0 : 
          S1852=0;
          break RUN;
        
        case 1 : 
          S1852=2;
          S1852=2;
          S890=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S890){
            case 0 : 
              if(mode.getprestatus()){//sysj\controller.sysj line: 10, column: 11
                S890=1;
                if((mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 11, column: 9
                  S650=0;
                  S415=0;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S650=1;
                  S649=0;
                  thread1854(tdone,ends);
                  thread1855(tdone,ends);
                  thread1856(tdone,ends);
                  thread1857(tdone,ends);
                  int biggest1858 = 0;
                  if(ends[4]>=biggest1858){
                    biggest1858=ends[4];
                  }
                  if(ends[5]>=biggest1858){
                    biggest1858=ends[5];
                  }
                  if(ends[6]>=biggest1858){
                    biggest1858=ends[6];
                  }
                  if(ends[7]>=biggest1858){
                    biggest1858=ends[7];
                  }
                  //FINXME code
                  if(biggest1858 == 0){
                    S649=1;
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
              switch(S650){
                case 0 : 
                  switch(S415){
                    case 0 : 
                      if(!empty.getprestatus()){//sysj\controller.sysj line: 13, column: 13
                        S415=1;
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
                      if(request.getprestatus()){//sysj\controller.sysj line: 14, column: 13
                        S415=2;
                        armDest.setPresent();//sysj\controller.sysj line: 17, column: 8
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
                    
                    case 2 : 
                      if(armAtDest.getprestatus()){//sysj\controller.sysj line: 15, column: 13
                        S415=3;
                        pusherExtend.setPresent();//sysj\controller.sysj line: 22, column: 8
                        currsigs.addElement(pusherExtend);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        armDest.setPresent();//sysj\controller.sysj line: 17, column: 8
                        currsigs.addElement(armDest);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 3 : 
                      if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 19, column: 13
                        S415=4;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        pusherExtend.setPresent();//sysj\controller.sysj line: 22, column: 8
                        currsigs.addElement(pusherExtend);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 4 : 
                      if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 25, column: 13
                        S415=5;
                        armSource.setPresent();//sysj\controller.sysj line: 29, column: 8
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
                      if(armAtSource.getprestatus()){//sysj\controller.sysj line: 27, column: 13
                        S415=6;
                        thread1859(tdone,ends);
                        thread1860(tdone,ends);
                        int biggest1861 = 0;
                        if(ends[2]>=biggest1861){
                          biggest1861=ends[2];
                        }
                        if(ends[3]>=biggest1861){
                          biggest1861=ends[3];
                        }
                        if(biggest1861 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        armSource.setPresent();//sysj\controller.sysj line: 29, column: 8
                        currsigs.addElement(armSource);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 6 : 
                      thread1862(tdone,ends);
                      thread1863(tdone,ends);
                      int biggest1864 = 0;
                      if(ends[2]>=biggest1864){
                        biggest1864=ends[2];
                      }
                      if(ends[3]>=biggest1864){
                        biggest1864=ends[3];
                      }
                      if(biggest1864 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      if(biggest1864 == 2){
                        ends[1]=2;
                        ;//sysj\controller.sysj line: 31, column: 7
                        S415=7;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest1864 == 0){
                        S415=7;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 7 : 
                      if(!WPgripped.getprestatus()){//sysj\controller.sysj line: 45, column: 14
                        S415=8;
                        armSource.setPresent();//sysj\controller.sysj line: 48, column: 9
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
                    
                    case 8 : 
                      if(armAtSource.getprestatus()){//sysj\controller.sysj line: 46, column: 14
                        S415=0;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        armSource.setPresent();//sysj\controller.sysj line: 48, column: 9
                        currsigs.addElement(armSource);
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                  }
                  break;
                
                case 1 : 
                  switch(S649){
                    case 0 : 
                      thread1865(tdone,ends);
                      thread1866(tdone,ends);
                      thread1867(tdone,ends);
                      thread1868(tdone,ends);
                      int biggest1869 = 0;
                      if(ends[4]>=biggest1869){
                        biggest1869=ends[4];
                      }
                      if(ends[5]>=biggest1869){
                        biggest1869=ends[5];
                      }
                      if(ends[6]>=biggest1869){
                        biggest1869=ends[6];
                      }
                      if(ends[7]>=biggest1869){
                        biggest1869=ends[7];
                      }
                      //FINXME code
                      if(biggest1869 == 0){
                        S649=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      S649=1;
                      S890=0;
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
