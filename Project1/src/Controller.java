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
  private Signal manualMode_1;
  private Signal autoMode_1;
  private int S2166 = 1;
  private int S2143 = 1;
  private int S464 = 1;
  private int S10 = 1;
  private int S16 = 1;
  private int S47 = 1;
  private int S58 = 1;
  private int S49 = 1;
  private int S472 = 1;
  private int S466 = 1;
  private int S480 = 1;
  private int S488 = 1;
  private int S499 = 1;
  private int S2164 = 1;
  private int S2163 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread2188(int [] tdone, int [] ends){
        switch(S2164){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S2163){
          case 0 : 
            if(mode.getprestatus()){//sysj\controller.sysj line: 85, column: 11
              S2163=1;
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 87, column: 9
                autoMode_1.setPresent();//sysj\controller.sysj line: 88, column: 7
                currsigs.addElement(autoMode_1);
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
              else {
                if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controller.sysj line: 90, column: 14
                  manualMode_1.setPresent();//sysj\controller.sysj line: 91, column: 7
                  currsigs.addElement(manualMode_1);
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
              }
            }
            else {
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 0){//sysj\controller.sysj line: 87, column: 9
              autoMode_1.setPresent();//sysj\controller.sysj line: 88, column: 7
              currsigs.addElement(autoMode_1);
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              if((Integer)(mode.getpreval() == null ? null : ((Integer)mode.getpreval())) == 1){//sysj\controller.sysj line: 90, column: 14
                manualMode_1.setPresent();//sysj\controller.sysj line: 91, column: 7
                currsigs.addElement(manualMode_1);
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
              else {
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2186(int [] tdone, int [] ends){
        switch(S499){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(armDestM.getprestatus()){//sysj\controller.sysj line: 78, column: 21
          armDest.setPresent();//sysj\controller.sysj line: 78, column: 31
          currsigs.addElement(armDest);
          System.out.println("Lid Loader - Lid Placed");//sysj\controller.sysj line: 78, column: 45
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread2185(int [] tdone, int [] ends){
        switch(S488){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(armSourceM.getprestatus()){//sysj\controller.sysj line: 76, column: 21
          armSource.setPresent();//sysj\controller.sysj line: 76, column: 33
          currsigs.addElement(armSource);
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread2184(int [] tdone, int [] ends){
        switch(S480){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(vacOnM.getprestatus()){//sysj\controller.sysj line: 74, column: 21
          vacOn.setPresent();//sysj\controller.sysj line: 74, column: 29
          currsigs.addElement(vacOn);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread2183(int [] tdone, int [] ends){
        switch(S472){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S466){
          case 0 : 
            S466=0;
            if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 72, column: 21
              pusherExtend.setPresent();//sysj\controller.sysj line: 72, column: 36
              currsigs.addElement(pusherExtend);
              S466=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S466=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S466=1;
            S466=0;
            if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 72, column: 21
              pusherExtend.setPresent();//sysj\controller.sysj line: 72, column: 36
              currsigs.addElement(pusherExtend);
              S466=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              S466=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2181(int [] tdone, int [] ends){
        S499=1;
    if(armDestM.getprestatus()){//sysj\controller.sysj line: 78, column: 21
      armDest.setPresent();//sysj\controller.sysj line: 78, column: 31
      currsigs.addElement(armDest);
      System.out.println("Lid Loader - Lid Placed");//sysj\controller.sysj line: 78, column: 45
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread2180(int [] tdone, int [] ends){
        S488=1;
    if(armSourceM.getprestatus()){//sysj\controller.sysj line: 76, column: 21
      armSource.setPresent();//sysj\controller.sysj line: 76, column: 33
      currsigs.addElement(armSource);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread2179(int [] tdone, int [] ends){
        S480=1;
    if(vacOnM.getprestatus()){//sysj\controller.sysj line: 74, column: 21
      vacOn.setPresent();//sysj\controller.sysj line: 74, column: 29
      currsigs.addElement(vacOn);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread2178(int [] tdone, int [] ends){
        S472=1;
    S466=0;
    if(pusherExtendM.getprestatus()){//sysj\controller.sysj line: 72, column: 21
      pusherExtend.setPresent();//sysj\controller.sysj line: 72, column: 36
      currsigs.addElement(pusherExtend);
      S466=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      S466=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread2176(int [] tdone, int [] ends){
        switch(S58){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S49){
          case 0 : 
            if(WPgripped.getprestatus()){//sysj\controller.sysj line: 48, column: 16
              System.out.println("WP gripped");//sysj\controller.sysj line: 49, column: 10
              S49=1;
              armDest.setPresent();//sysj\controller.sysj line: 51, column: 11
              currsigs.addElement(armDest);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(armAtDest.getprestatus()){//sysj\controller.sysj line: 50, column: 16
              System.out.println("Arm at dest");//sysj\controller.sysj line: 53, column: 10
              ends[4]=2;
              tdone[4]=1;
            }
            else {
              armDest.setPresent();//sysj\controller.sysj line: 51, column: 11
              currsigs.addElement(armDest);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2175(int [] tdone, int [] ends){
        switch(S47){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        vacOn.setPresent();//sysj\controller.sysj line: 44, column: 10
        currsigs.addElement(vacOn);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread2173(int [] tdone, int [] ends){
        S58=1;
    S49=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2172(int [] tdone, int [] ends){
        S47=1;
    vacOn.setPresent();//sysj\controller.sysj line: 44, column: 10
    currsigs.addElement(vacOn);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2171(int [] tdone, int [] ends){
        switch(S2143){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S464){
          case 0 : 
            if(manualMode_1.getprestatus()){//sysj\controller.sysj line: 12, column: 12
              S464=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S10){
                case 0 : 
                  if(armAtDest.getprestatus()){//sysj\controller.sysj line: 14, column: 13
                    System.out.println("Arm at dest");//sysj\controller.sysj line: 17, column: 7
                    S10=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    armDest.setPresent();//sysj\controller.sysj line: 15, column: 8
                    currsigs.addElement(armDest);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
                case 1 : 
                  if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 18, column: 13
                    System.out.println("Pusher retracted");//sysj\controller.sysj line: 19, column: 7
                    S10=2;
                    S16=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
                case 2 : 
                  switch(S16){
                    case 0 : 
                      if(!empty.getprestatus()){//sysj\controller.sysj line: 22, column: 14
                        S16=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(request.getprestatus()){//sysj\controller.sysj line: 23, column: 14
                        System.out.println("New request");//sysj\controller.sysj line: 24, column: 8
                        S16=2;
                        armDest.setPresent();//sysj\controller.sysj line: 26, column: 9
                        currsigs.addElement(armDest);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 2 : 
                      if(armAtDest.getprestatus()){//sysj\controller.sysj line: 25, column: 14
                        System.out.println("Arm at dest");//sysj\controller.sysj line: 28, column: 8
                        S16=3;
                        pusherExtend.setPresent();//sysj\controller.sysj line: 31, column: 9
                        currsigs.addElement(pusherExtend);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        armDest.setPresent();//sysj\controller.sysj line: 26, column: 9
                        currsigs.addElement(armDest);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 3 : 
                      if(pusherExtended.getprestatus()){//sysj\controller.sysj line: 30, column: 14
                        System.out.println("Pusher extended");//sysj\controller.sysj line: 33, column: 8
                        S16=4;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        pusherExtend.setPresent();//sysj\controller.sysj line: 31, column: 9
                        currsigs.addElement(pusherExtend);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 4 : 
                      if(pusherRetracted.getprestatus()){//sysj\controller.sysj line: 34, column: 14
                        System.out.println("Pusher retracted");//sysj\controller.sysj line: 35, column: 8
                        S16=5;
                        armSource.setPresent();//sysj\controller.sysj line: 38, column: 9
                        currsigs.addElement(armSource);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 5 : 
                      if(armAtSource.getprestatus()){//sysj\controller.sysj line: 37, column: 14
                        System.out.println("Arm at source");//sysj\controller.sysj line: 40, column: 8
                        S16=6;
                        thread2172(tdone,ends);
                        thread2173(tdone,ends);
                        int biggest2174 = 0;
                        if(ends[3]>=biggest2174){
                          biggest2174=ends[3];
                        }
                        if(ends[4]>=biggest2174){
                          biggest2174=ends[4];
                        }
                        if(biggest2174 == 1){
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        armSource.setPresent();//sysj\controller.sysj line: 38, column: 9
                        currsigs.addElement(armSource);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 6 : 
                      thread2175(tdone,ends);
                      thread2176(tdone,ends);
                      int biggest2177 = 0;
                      if(ends[3]>=biggest2177){
                        biggest2177=ends[3];
                      }
                      if(ends[4]>=biggest2177){
                        biggest2177=ends[4];
                      }
                      if(biggest2177 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      if(biggest2177 == 2){
                        ends[2]=2;
                        ;//sysj\controller.sysj line: 42, column: 8
                        S16=7;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      //FINXME code
                      if(biggest2177 == 0){
                        S16=7;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 7 : 
                      if(!WPgripped.getprestatus()){//sysj\controller.sysj line: 58, column: 14
                        S16=8;
                        armSource.setPresent();//sysj\controller.sysj line: 61, column: 9
                        currsigs.addElement(armSource);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 8 : 
                      if(armAtSource.getprestatus()){//sysj\controller.sysj line: 60, column: 14
                        System.out.println("Arm at source");//sysj\controller.sysj line: 63, column: 8
                        S16=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        armSource.setPresent();//sysj\controller.sysj line: 61, column: 9
                        currsigs.addElement(armSource);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                  }
                  break;
                
              }
            }
            break;
          
          case 1 : 
            S464=1;
            System.out.println("entering manual");//sysj\controller.sysj line: 70, column: 6
            S464=2;
            thread2178(tdone,ends);
            thread2179(tdone,ends);
            thread2180(tdone,ends);
            thread2181(tdone,ends);
            int biggest2182 = 0;
            if(ends[5]>=biggest2182){
              biggest2182=ends[5];
            }
            if(ends[6]>=biggest2182){
              biggest2182=ends[6];
            }
            if(ends[7]>=biggest2182){
              biggest2182=ends[7];
            }
            if(ends[8]>=biggest2182){
              biggest2182=ends[8];
            }
            if(biggest2182 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(autoMode_1.getprestatus()){//sysj\controller.sysj line: 71, column: 12
              S464=0;
              System.out.println("entering auto");//sysj\controller.sysj line: 13, column: 7
              S10=0;
              armDest.setPresent();//sysj\controller.sysj line: 15, column: 8
              currsigs.addElement(armDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              thread2183(tdone,ends);
              thread2184(tdone,ends);
              thread2185(tdone,ends);
              thread2186(tdone,ends);
              int biggest2187 = 0;
              if(ends[5]>=biggest2187){
                biggest2187=ends[5];
              }
              if(ends[6]>=biggest2187){
                biggest2187=ends[6];
              }
              if(ends[7]>=biggest2187){
                biggest2187=ends[7];
              }
              if(ends[8]>=biggest2187){
                biggest2187=ends[8];
              }
              if(biggest2187 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              //FINXME code
              if(biggest2187 == 0){
                S464=0;
                System.out.println("entering auto");//sysj\controller.sysj line: 13, column: 7
                S10=0;
                armDest.setPresent();//sysj\controller.sysj line: 15, column: 8
                currsigs.addElement(armDest);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2169(int [] tdone, int [] ends){
        S2164=1;
    S2163=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2168(int [] tdone, int [] ends){
        S2143=1;
    S464=0;
    System.out.println("entering auto");//sysj\controller.sysj line: 13, column: 7
    S10=0;
    armDest.setPresent();//sysj\controller.sysj line: 15, column: 8
    currsigs.addElement(armDest);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S2166){
        case 0 : 
          S2166=0;
          break RUN;
        
        case 1 : 
          S2166=2;
          S2166=2;
          manualMode_1.setClear();//sysj\controller.sysj line: 9, column: 4
          autoMode_1.setClear();//sysj\controller.sysj line: 9, column: 4
          thread2168(tdone,ends);
          thread2169(tdone,ends);
          int biggest2170 = 0;
          if(ends[2]>=biggest2170){
            biggest2170=ends[2];
          }
          if(ends[9]>=biggest2170){
            biggest2170=ends[9];
          }
          if(biggest2170 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          manualMode_1.setClear();//sysj\controller.sysj line: 9, column: 4
          autoMode_1.setClear();//sysj\controller.sysj line: 9, column: 4
          thread2171(tdone,ends);
          thread2188(tdone,ends);
          int biggest2189 = 0;
          if(ends[2]>=biggest2189){
            biggest2189=ends[2];
          }
          if(ends[9]>=biggest2189){
            biggest2189=ends[9];
          }
          if(biggest2189 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2189 == 0){
            S2166=0;
            active[1]=0;
            ends[1]=0;
            S2166=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    manualMode_1 = new Signal();
    autoMode_1 = new Signal();
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
      manualMode_1.setpreclear();
      autoMode_1.setpreclear();
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
      manualMode_1.setClear();
      autoMode_1.setClear();
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
