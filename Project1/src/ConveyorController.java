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
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.INPUT);
  public Signal bottleDeployed = new Signal("bottleDeployed", Signal.INPUT);
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.OUTPUT);
  public Signal bottleDeployedE = new Signal("bottleDeployedE", Signal.OUTPUT);
  public output_Channel convReady_o = new output_Channel();
  private int S2323 = 1;
  private int S2180 = 1;
  private int S1872 = 1;
  private int S1875 = 1;
  private int S1874 = 1;
  private int S1921 = 1;
  private int S1920 = 1;
  private int S1882 = 1;
  private int S1877 = 1;
  private int S2286 = 1;
  private int S2206 = 1;
  private int S2189 = 1;
  private int S2192 = 1;
  private int S2321 = 1;
  private int S2297 = 1;
  private int S2291 = 1;
  private int S2294 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread2351(int [] tdone, int [] ends){
        S2294=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2350(int [] tdone, int [] ends){
        S2291=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 22
    currsigs.addElement(bottleDeployedE);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2348(int [] tdone, int [] ends){
        switch(S2294){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 62, column: 28
          ends[10]=2;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread2347(int [] tdone, int [] ends){
        switch(S2291){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 22
        currsigs.addElement(bottleDeployedE);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread2346(int [] tdone, int [] ends){
        switch(S2321){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S2297){
          case 0 : 
            thread2347(tdone,ends);
            thread2348(tdone,ends);
            int biggest2349 = 0;
            if(ends[9]>=biggest2349){
              biggest2349=ends[9];
            }
            if(ends[10]>=biggest2349){
              biggest2349=ends[10];
            }
            if(biggest2349 == 1){
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            if(biggest2349 == 2){
              ends[8]=2;
              ;//sysj\conveyor_controller.sysj line: 56, column: 11
              S2297=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            //FINXME code
            if(biggest2349 == 0){
              S2297=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S2297=1;
            S2297=0;
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 55, column: 19
              thread2350(tdone,ends);
              thread2351(tdone,ends);
              int biggest2352 = 0;
              if(ends[9]>=biggest2352){
                biggest2352=ends[9];
              }
              if(ends[10]>=biggest2352){
                biggest2352=ends[10];
              }
              if(biggest2352 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            else {
              S2297=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2344(int [] tdone, int [] ends){
        switch(S2192){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus() || bottleLeftPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 42, column: 27
          System.out.println("Bottle Reached Pos1");//sysj\conveyor_controller.sysj line: 43, column: 21
          ends[7]=2;
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

  public void thread2343(int [] tdone, int [] ends){
        switch(S2189){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 21
        currsigs.addElement(motConveyorOnOff);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread2341(int [] tdone, int [] ends){
        S2192=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread2340(int [] tdone, int [] ends){
        S2189=1;
    System.out.println("Conveyer On");//sysj\conveyor_controller.sysj line: 37, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread2339(int [] tdone, int [] ends){
        switch(S2286){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2206){
          case 0 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 34, column: 19
              S2206=1;
              thread2340(tdone,ends);
              thread2341(tdone,ends);
              int biggest2342 = 0;
              if(ends[6]>=biggest2342){
                biggest2342=ends[6];
              }
              if(ends[7]>=biggest2342){
                biggest2342=ends[7];
              }
              if(biggest2342 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            thread2343(tdone,ends);
            thread2344(tdone,ends);
            int biggest2345 = 0;
            if(ends[6]>=biggest2345){
              biggest2345=ends[6];
            }
            if(ends[7]>=biggest2345){
              biggest2345=ends[7];
            }
            if(biggest2345 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest2345 == 2){
              ends[5]=2;
              ;//sysj\conveyor_controller.sysj line: 35, column: 13
              S2206=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest2345 == 0){
              S2206=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2337(int [] tdone, int [] ends){
        switch(S1921){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1920){
          case 0 : 
            S1920=0;
            S1920=1;
            S1882=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 23, column: 21
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
              S1882=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S1877=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                convReady_o.setVal(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                S1877=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                  ends[4]=2;
                  ;//sysj\conveyor_controller.sysj line: 23, column: 21
                  S1921=0;
                  active[4]=0;
                  ends[4]=0;
                  tdone[4]=1;
                }
                else {
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
              }
              else {
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            break;
          
          case 1 : 
            switch(S1882){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 23, column: 21
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                  S1882=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S1877){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                        convReady_o.setVal(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                        S1877=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                          ends[4]=2;
                          ;//sysj\conveyor_controller.sysj line: 23, column: 21
                          S1921=0;
                          active[4]=0;
                          ends[4]=0;
                          tdone[4]=1;
                        }
                        else {
                          active[4]=1;
                          ends[4]=1;
                          tdone[4]=1;
                        }
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                        ends[4]=2;
                        ;//sysj\conveyor_controller.sysj line: 23, column: 21
                        S1921=0;
                        active[4]=0;
                        ends[4]=0;
                        tdone[4]=1;
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S1882=1;
                S1882=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 23, column: 21
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                  S1882=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S1877=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                    convReady_o.setVal(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                    S1877=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                      ends[4]=2;
                      ;//sysj\conveyor_controller.sysj line: 23, column: 21
                      S1921=0;
                      active[4]=0;
                      ends[4]=0;
                      tdone[4]=1;
                    }
                    else {
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                  else {
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread2336(int [] tdone, int [] ends){
        switch(S1875){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1874){
          case 0 : 
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 16, column: 27
              S1874=1;
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
            S1874=1;
            convReady_o.setPreempted();//sysj\conveyor_controller.sysj line: 18, column: 21
            ends[3]=2;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2334(int [] tdone, int [] ends){
        S1921=1;
    S1920=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread2333(int [] tdone, int [] ends){
        S1875=1;
    S1874=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread2332(int [] tdone, int [] ends){
        switch(S2180){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1872){
          case 0 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 12, column: 19
              S1872=1;
              thread2333(tdone,ends);
              thread2334(tdone,ends);
              int biggest2335 = 0;
              if(ends[3]>=biggest2335){
                biggest2335=ends[3];
              }
              if(ends[4]>=biggest2335){
                biggest2335=ends[4];
              }
              if(biggest2335 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            thread2336(tdone,ends);
            thread2337(tdone,ends);
            int biggest2338 = 0;
            if(ends[3]>=biggest2338){
              biggest2338=ends[3];
            }
            if(ends[4]>=biggest2338){
              biggest2338=ends[4];
            }
            if(biggest2338 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest2338 == 2){
              ends[2]=2;
              ;//sysj\conveyor_controller.sysj line: 14, column: 13
              S1872=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest2338 == 0){
              S1872=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            S1872=2;
            System.out.println("Conveyor Ready");//sysj\conveyor_controller.sysj line: 27, column: 13
            S1872=3;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 3 : 
            S1872=3;
            System.out.println("Waiting for bottle to be delopyed and conveyor to be cleared...");//sysj\conveyor_controller.sysj line: 11, column: 10
            S1872=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread2329(int [] tdone, int [] ends){
        S2294=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread2328(int [] tdone, int [] ends){
        S2291=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 22
    currsigs.addElement(bottleDeployedE);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread2327(int [] tdone, int [] ends){
        S2321=1;
    S2297=0;
    if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 55, column: 19
      thread2328(tdone,ends);
      thread2329(tdone,ends);
      int biggest2330 = 0;
      if(ends[9]>=biggest2330){
        biggest2330=ends[9];
      }
      if(ends[10]>=biggest2330){
        biggest2330=ends[10];
      }
      if(biggest2330 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
    else {
      S2297=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread2326(int [] tdone, int [] ends){
        S2286=1;
    S2206=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread2325(int [] tdone, int [] ends){
        S2180=1;
    System.out.println("Waiting for bottle to be delopyed and conveyor to be cleared...");//sysj\conveyor_controller.sysj line: 11, column: 10
    S1872=0;
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
      switch(S2323){
        case 0 : 
          S2323=0;
          break RUN;
        
        case 1 : 
          S2323=2;
          S2323=2;
          thread2325(tdone,ends);
          thread2326(tdone,ends);
          thread2327(tdone,ends);
          int biggest2331 = 0;
          if(ends[2]>=biggest2331){
            biggest2331=ends[2];
          }
          if(ends[5]>=biggest2331){
            biggest2331=ends[5];
          }
          if(ends[8]>=biggest2331){
            biggest2331=ends[8];
          }
          if(biggest2331 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread2332(tdone,ends);
          thread2339(tdone,ends);
          thread2346(tdone,ends);
          int biggest2353 = 0;
          if(ends[2]>=biggest2353){
            biggest2353=ends[2];
          }
          if(ends[5]>=biggest2353){
            biggest2353=ends[5];
          }
          if(ends[8]>=biggest2353){
            biggest2353=ends[8];
          }
          if(biggest2353 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest2353 == 0){
            S2323=0;
            active[1]=0;
            ends[1]=0;
            S2323=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          convReady_o.gethook();
          bottleAtPos1.gethook();
          bottleLeftPos5.gethook();
          bottleDeployed.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      bottleDeployed.setpreclear();
      motConveyorOnOff.setpreclear();
      bottleDeployedE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = bottleLeftPos5.getStatus() ? bottleLeftPos5.setprepresent() : bottleLeftPos5.setpreclear();
      bottleLeftPos5.setpreval(bottleLeftPos5.getValue());
      bottleLeftPos5.setClear();
      dummyint = bottleDeployed.getStatus() ? bottleDeployed.setprepresent() : bottleDeployed.setpreclear();
      bottleDeployed.setpreval(bottleDeployed.getValue());
      bottleDeployed.setClear();
      motConveyorOnOff.sethook();
      motConveyorOnOff.setClear();
      bottleDeployedE.sethook();
      bottleDeployedE.setClear();
      convReady_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        convReady_o.gethook();
        bottleAtPos1.gethook();
        bottleLeftPos5.gethook();
        bottleDeployed.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
