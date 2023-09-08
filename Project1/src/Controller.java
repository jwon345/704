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
  private int S2197 = 1;
  private int S1235 = 1;
  private int S995 = 1;
  private int S760 = 1;
  private int S791 = 1;
  private int S802 = 1;
  private int S801 = 1;
  private int S994 = 1;
  
  private int[] ends = new int[8];
  private int[] tdone = new int[8];
  
  public void thread2213(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread2212(int [] tdone, int [] ends){
        active[6]=0;
    ends[6]=0;
    tdone[6]=1;
  }

  public void thread2211(int [] tdone, int [] ends){
        active[5]=0;
    ends[5]=0;
    tdone[5]=1;
  }

  public void thread2210(int [] tdone, int [] ends){
        active[4]=0;
    ends[4]=0;
    tdone[4]=1;
  }

  public void thread2208(int [] tdone, int [] ends){
        switch(S802){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S801){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\controller.sysj line: 37, column: 14
              S801=1;
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

  public void thread2207(int [] tdone, int [] ends){
        switch(S791){
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

  public void thread2205(int [] tdone, int [] ends){
        S802=1;
    S801=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2204(int [] tdone, int [] ends){
        S791=1;
    vacOn.setPresent();//sysj\controller.sysj line: 33, column: 9
    currsigs.addElement(vacOn);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread2202(int [] tdone, int [] ends){
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

  public void thread2201(int [] tdone, int [] ends){
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

  public void thread2200(int [] tdone, int [] ends){
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

  public void thread2199(int [] tdone, int [] ends){
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
      switch(S2197){
        case 0 : 
          S2197=0;
          break RUN;
        
        case 1 : 
          S2197=2;
          S2197=2;
          S1235=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S1235){
            case 0 : 
              if(mode.getprestatus()){//sysj\controller.sysj line: 10, column: 11
                S1235=1;
                if((mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 11, column: 9
                  S995=0;
                  S760=0;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S995=1;
                  S994=0;
                  thread2199(tdone,ends);
                  thread2200(tdone,ends);
                  thread2201(tdone,ends);
                  thread2202(tdone,ends);
                  int biggest2203 = 0;
                  if(ends[4]>=biggest2203){
                    biggest2203=ends[4];
                  }
                  if(ends[5]>=biggest2203){
                    biggest2203=ends[5];
                  }
                  if(ends[6]>=biggest2203){
                    biggest2203=ends[6];
                  }
                  if(ends[7]>=biggest2203){
                    biggest2203=ends[7];
                  }
                  //FINXME code
                  if(biggest2203 == 0){
                    S994=1;
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
              switch(S995){
                case 0 : 
                  switch(S760){
                    case 0 : 
                      if(!empty.getprestatus()){//sysj\controller.sysj line: 13, column: 13
                        S760=1;
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
                        S760=2;
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
                        S760=3;
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
                        S760=4;
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
                        S760=5;
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
                        S760=6;
                        thread2204(tdone,ends);
                        thread2205(tdone,ends);
                        int biggest2206 = 0;
                        if(ends[2]>=biggest2206){
                          biggest2206=ends[2];
                        }
                        if(ends[3]>=biggest2206){
                          biggest2206=ends[3];
                        }
                        if(biggest2206 == 1){
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
                      thread2207(tdone,ends);
                      thread2208(tdone,ends);
                      int biggest2209 = 0;
                      if(ends[2]>=biggest2209){
                        biggest2209=ends[2];
                      }
                      if(ends[3]>=biggest2209){
                        biggest2209=ends[3];
                      }
                      if(biggest2209 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      if(biggest2209 == 2){
                        ends[1]=2;
                        ;//sysj\controller.sysj line: 31, column: 7
                        S760=7;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest2209 == 0){
                        S760=7;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 7 : 
                      if(!WPgripped.getprestatus()){//sysj\controller.sysj line: 45, column: 14
                        S760=8;
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
                        S760=0;
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
                  switch(S994){
                    case 0 : 
                      thread2210(tdone,ends);
                      thread2211(tdone,ends);
                      thread2212(tdone,ends);
                      thread2213(tdone,ends);
                      int biggest2214 = 0;
                      if(ends[4]>=biggest2214){
                        biggest2214=ends[4];
                      }
                      if(ends[5]>=biggest2214){
                        biggest2214=ends[5];
                      }
                      if(ends[6]>=biggest2214){
                        biggest2214=ends[6];
                      }
                      if(ends[7]>=biggest2214){
                        biggest2214=ends[7];
                      }
                      //FINXME code
                      if(biggest2214 == 0){
                        S994=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      S994=1;
                      S1235=0;
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
