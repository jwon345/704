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
  private int S1912 = 1;
  private int S1769 = 1;
  private int S1461 = 1;
  private int S1464 = 1;
  private int S1463 = 1;
  private int S1510 = 1;
  private int S1509 = 1;
  private int S1471 = 1;
  private int S1466 = 1;
  private int S1875 = 1;
  private int S1795 = 1;
  private int S1778 = 1;
  private int S1781 = 1;
  private int S1910 = 1;
  private int S1886 = 1;
  private int S1880 = 1;
  private int S1883 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread1940(int [] tdone, int [] ends){
        S1883=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread1939(int [] tdone, int [] ends){
        S1880=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 22
    currsigs.addElement(bottleDeployedE);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1937(int [] tdone, int [] ends){
        switch(S1883){
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

  public void thread1936(int [] tdone, int [] ends){
        switch(S1880){
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

  public void thread1935(int [] tdone, int [] ends){
        switch(S1910){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S1886){
          case 0 : 
            thread1936(tdone,ends);
            thread1937(tdone,ends);
            int biggest1938 = 0;
            if(ends[9]>=biggest1938){
              biggest1938=ends[9];
            }
            if(ends[10]>=biggest1938){
              biggest1938=ends[10];
            }
            if(biggest1938 == 1){
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            if(biggest1938 == 2){
              ends[8]=2;
              ;//sysj\conveyor_controller.sysj line: 56, column: 11
              S1886=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            //FINXME code
            if(biggest1938 == 0){
              S1886=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S1886=1;
            S1886=0;
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 55, column: 19
              thread1939(tdone,ends);
              thread1940(tdone,ends);
              int biggest1941 = 0;
              if(ends[9]>=biggest1941){
                biggest1941=ends[9];
              }
              if(ends[10]>=biggest1941){
                biggest1941=ends[10];
              }
              if(biggest1941 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            else {
              S1886=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1933(int [] tdone, int [] ends){
        switch(S1781){
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

  public void thread1932(int [] tdone, int [] ends){
        switch(S1778){
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

  public void thread1930(int [] tdone, int [] ends){
        S1781=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread1929(int [] tdone, int [] ends){
        S1778=1;
    System.out.println("Conveyer On");//sysj\conveyor_controller.sysj line: 37, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 38, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread1928(int [] tdone, int [] ends){
        switch(S1875){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S1795){
          case 0 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 34, column: 19
              S1795=1;
              thread1929(tdone,ends);
              thread1930(tdone,ends);
              int biggest1931 = 0;
              if(ends[6]>=biggest1931){
                biggest1931=ends[6];
              }
              if(ends[7]>=biggest1931){
                biggest1931=ends[7];
              }
              if(biggest1931 == 1){
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
            thread1932(tdone,ends);
            thread1933(tdone,ends);
            int biggest1934 = 0;
            if(ends[6]>=biggest1934){
              biggest1934=ends[6];
            }
            if(ends[7]>=biggest1934){
              biggest1934=ends[7];
            }
            if(biggest1934 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest1934 == 2){
              ends[5]=2;
              ;//sysj\conveyor_controller.sysj line: 35, column: 13
              S1795=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest1934 == 0){
              S1795=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1926(int [] tdone, int [] ends){
        switch(S1510){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1509){
          case 0 : 
            S1509=0;
            S1509=1;
            S1471=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 23, column: 21
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
              S1471=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S1466=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                convReady_o.setVal(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                S1466=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                  ends[4]=2;
                  ;//sysj\conveyor_controller.sysj line: 23, column: 21
                  S1510=0;
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
            switch(S1471){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 23, column: 21
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                  S1471=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S1466){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                        convReady_o.setVal(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                        S1466=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                          ends[4]=2;
                          ;//sysj\conveyor_controller.sysj line: 23, column: 21
                          S1510=0;
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
                        S1510=0;
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
                S1471=1;
                S1471=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 23, column: 21
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                  S1471=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S1466=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                    convReady_o.setVal(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                    S1466=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 21
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 21
                      ends[4]=2;
                      ;//sysj\conveyor_controller.sysj line: 23, column: 21
                      S1510=0;
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

  public void thread1925(int [] tdone, int [] ends){
        switch(S1464){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1463){
          case 0 : 
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 16, column: 27
              S1463=1;
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
            S1463=1;
            convReady_o.setPreempted();//sysj\conveyor_controller.sysj line: 18, column: 21
            ends[3]=2;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1923(int [] tdone, int [] ends){
        S1510=1;
    S1509=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1922(int [] tdone, int [] ends){
        S1464=1;
    S1463=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread1921(int [] tdone, int [] ends){
        switch(S1769){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1461){
          case 0 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 12, column: 19
              S1461=1;
              thread1922(tdone,ends);
              thread1923(tdone,ends);
              int biggest1924 = 0;
              if(ends[3]>=biggest1924){
                biggest1924=ends[3];
              }
              if(ends[4]>=biggest1924){
                biggest1924=ends[4];
              }
              if(biggest1924 == 1){
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
            thread1925(tdone,ends);
            thread1926(tdone,ends);
            int biggest1927 = 0;
            if(ends[3]>=biggest1927){
              biggest1927=ends[3];
            }
            if(ends[4]>=biggest1927){
              biggest1927=ends[4];
            }
            if(biggest1927 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest1927 == 2){
              ends[2]=2;
              ;//sysj\conveyor_controller.sysj line: 14, column: 13
              S1461=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest1927 == 0){
              S1461=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            S1461=2;
            System.out.println("Conveyor Ready");//sysj\conveyor_controller.sysj line: 27, column: 13
            S1461=3;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 3 : 
            S1461=3;
            System.out.println("Waiting for bottle to be delopyed and conveyor to be cleared...");//sysj\conveyor_controller.sysj line: 11, column: 10
            S1461=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1918(int [] tdone, int [] ends){
        S1883=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread1917(int [] tdone, int [] ends){
        S1880=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 22
    currsigs.addElement(bottleDeployedE);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread1916(int [] tdone, int [] ends){
        S1910=1;
    S1886=0;
    if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 55, column: 19
      thread1917(tdone,ends);
      thread1918(tdone,ends);
      int biggest1919 = 0;
      if(ends[9]>=biggest1919){
        biggest1919=ends[9];
      }
      if(ends[10]>=biggest1919){
        biggest1919=ends[10];
      }
      if(biggest1919 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
    else {
      S1886=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1915(int [] tdone, int [] ends){
        S1875=1;
    S1795=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread1914(int [] tdone, int [] ends){
        S1769=1;
    System.out.println("Waiting for bottle to be delopyed and conveyor to be cleared...");//sysj\conveyor_controller.sysj line: 11, column: 10
    S1461=0;
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
      switch(S1912){
        case 0 : 
          S1912=0;
          break RUN;
        
        case 1 : 
          S1912=2;
          S1912=2;
          thread1914(tdone,ends);
          thread1915(tdone,ends);
          thread1916(tdone,ends);
          int biggest1920 = 0;
          if(ends[2]>=biggest1920){
            biggest1920=ends[2];
          }
          if(ends[5]>=biggest1920){
            biggest1920=ends[5];
          }
          if(ends[8]>=biggest1920){
            biggest1920=ends[8];
          }
          if(biggest1920 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread1921(tdone,ends);
          thread1928(tdone,ends);
          thread1935(tdone,ends);
          int biggest1942 = 0;
          if(ends[2]>=biggest1942){
            biggest1942=ends[2];
          }
          if(ends[5]>=biggest1942){
            biggest1942=ends[5];
          }
          if(ends[8]>=biggest1942){
            biggest1942=ends[8];
          }
          if(biggest1942 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1942 == 0){
            S1912=0;
            active[1]=0;
            ends[1]=0;
            S1912=0;
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
