import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class CapperController extends ClockDomain{
  public CapperController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.INPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.INPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.INPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.INPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.INPUT);
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.OUTPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.OUTPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.OUTPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.OUTPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.OUTPUT);
  public Signal bottleAtPos4E = new Signal("bottleAtPos4E", Signal.OUTPUT);
  private int S397 = 1;
  private int S325 = 1;
  private int S2 = 1;
  private int S25 = 1;
  private int S60 = 1;
  private int S27 = 1;
  private int S32 = 1;
  private int S40 = 1;
  private int S43 = 1;
  private int S360 = 1;
  private int S336 = 1;
  private int S330 = 1;
  private int S333 = 1;
  private int S395 = 1;
  private int S371 = 1;
  private int S365 = 1;
  private int S368 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread436(int [] tdone, int [] ends){
        S368=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread435(int [] tdone, int [] ends){
        S365=1;
    bottleAtPos4E.setPresent();//sysj\capper_controller.sysj line: 95, column: 23
    currsigs.addElement(bottleAtPos4E);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread433(int [] tdone, int [] ends){
        switch(S368){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\capper_controller.sysj line: 99, column: 29
          ends[13]=2;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread432(int [] tdone, int [] ends){
        switch(S365){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\capper_controller.sysj line: 95, column: 23
        currsigs.addElement(bottleAtPos4E);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread431(int [] tdone, int [] ends){
        switch(S395){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S371){
          case 0 : 
            thread432(tdone,ends);
            thread433(tdone,ends);
            int biggest434 = 0;
            if(ends[12]>=biggest434){
              biggest434=ends[12];
            }
            if(ends[13]>=biggest434){
              biggest434=ends[13];
            }
            if(biggest434 == 1){
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            if(biggest434 == 2){
              ends[11]=2;
              ;//sysj\capper_controller.sysj line: 93, column: 12
              S371=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            //FINXME code
            if(biggest434 == 0){
              S371=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            S371=1;
            S371=0;
            if(bottleAtPos4.getprestatus()){//sysj\capper_controller.sysj line: 92, column: 20
              thread435(tdone,ends);
              thread436(tdone,ends);
              int biggest437 = 0;
              if(ends[12]>=biggest437){
                biggest437=ends[12];
              }
              if(ends[13]>=biggest437){
                biggest437=ends[13];
              }
              if(biggest437 == 1){
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
            }
            else {
              S371=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread429(int [] tdone, int [] ends){
        S333=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread428(int [] tdone, int [] ends){
        S330=1;
    cylClampBottleExtend.setPresent();//sysj\capper_controller.sysj line: 75, column: 24
    currsigs.addElement(cylClampBottleExtend);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread426(int [] tdone, int [] ends){
        switch(S333){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\capper_controller.sysj line: 79, column: 30
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

  public void thread425(int [] tdone, int [] ends){
        switch(S330){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\capper_controller.sysj line: 75, column: 24
        currsigs.addElement(cylClampBottleExtend);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread424(int [] tdone, int [] ends){
        switch(S360){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S336){
          case 0 : 
            thread425(tdone,ends);
            thread426(tdone,ends);
            int biggest427 = 0;
            if(ends[9]>=biggest427){
              biggest427=ends[9];
            }
            if(ends[10]>=biggest427){
              biggest427=ends[10];
            }
            if(biggest427 == 1){
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            if(biggest427 == 2){
              ends[8]=2;
              ;//sysj\capper_controller.sysj line: 73, column: 13
              S336=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            //FINXME code
            if(biggest427 == 0){
              S336=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S336=1;
            S336=0;
            if(bottleAtPos4.getprestatus()){//sysj\capper_controller.sysj line: 72, column: 21
              thread428(tdone,ends);
              thread429(tdone,ends);
              int biggest430 = 0;
              if(ends[9]>=biggest430){
                biggest430=ends[9];
              }
              if(ends[10]>=biggest430){
                biggest430=ends[10];
              }
              if(biggest430 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            else {
              S336=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread421(int [] tdone, int [] ends){
        switch(S43){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\capper_controller.sysj line: 52, column: 15
          System.out.println("Capper: Gripper fully turned.");//sysj\capper_controller.sysj line: 53, column: 9
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

  public void thread420(int [] tdone, int [] ends){
        switch(S40){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\capper_controller.sysj line: 48, column: 9
        currsigs.addElement(gripperTurnExtend);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread419(int [] tdone, int [] ends){
        switch(S32){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\capper_controller.sysj line: 43, column: 9
        currsigs.addElement(capGripperPos5Extend);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread417(int [] tdone, int [] ends){
        S43=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread416(int [] tdone, int [] ends){
        S40=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\capper_controller.sysj line: 47, column: 9
    gripperTurnExtend.setPresent();//sysj\capper_controller.sysj line: 48, column: 9
    currsigs.addElement(gripperTurnExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread415(int [] tdone, int [] ends){
        S32=1;
    capGripperPos5Extend.setPresent();//sysj\capper_controller.sysj line: 43, column: 9
    currsigs.addElement(capGripperPos5Extend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread414(int [] tdone, int [] ends){
        switch(S60){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S27){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\capper_controller.sysj line: 40, column: 14
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\capper_controller.sysj line: 41, column: 8
              S27=1;
              thread415(tdone,ends);
              thread416(tdone,ends);
              thread417(tdone,ends);
              int biggest418 = 0;
              if(ends[5]>=biggest418){
                biggest418=ends[5];
              }
              if(ends[6]>=biggest418){
                biggest418=ends[6];
              }
              if(ends[7]>=biggest418){
                biggest418=ends[7];
              }
              if(biggest418 == 1){
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
            thread419(tdone,ends);
            thread420(tdone,ends);
            thread421(tdone,ends);
            int biggest422 = 0;
            if(ends[5]>=biggest422){
              biggest422=ends[5];
            }
            if(ends[6]>=biggest422){
              biggest422=ends[6];
            }
            if(ends[7]>=biggest422){
              biggest422=ends[7];
            }
            if(biggest422 == 1){
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            if(biggest422 == 2){
              ends[4]=2;
              tdone[4]=1;
            }
            //FINXME code
            if(biggest422 == 0){
              S60=0;
              active[4]=0;
              ends[4]=0;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread413(int [] tdone, int [] ends){
        switch(S25){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\capper_controller.sysj line: 36, column: 8
        currsigs.addElement(cylPos5ZaxisExtend);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread411(int [] tdone, int [] ends){
        S60=1;
    S27=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread410(int [] tdone, int [] ends){
        S25=1;
    cylPos5ZaxisExtend.setPresent();//sysj\capper_controller.sysj line: 36, column: 8
    currsigs.addElement(cylPos5ZaxisExtend);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread409(int [] tdone, int [] ends){
        switch(S325){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S2){
          case 0 : 
            if(bottleAtPos4.getprestatus()){//sysj\capper_controller.sysj line: 15, column: 12
              System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\capper_controller.sysj line: 16, column: 6
              System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\capper_controller.sysj line: 18, column: 6
              S2=1;
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
            if(gripperZAxisLifted.getprestatus()){//sysj\capper_controller.sysj line: 19, column: 12
              System.out.println("Capper: Gripper is lifted.");//sysj\capper_controller.sysj line: 23, column: 6
              S2=2;
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
            S2=2;
            S2=3;
            System.out.println("Capper: Untwisting the gripper...");//sysj\capper_controller.sysj line: 29, column: 7
            gripperTurnRetract.setPresent();//sysj\capper_controller.sysj line: 30, column: 7
            currsigs.addElement(gripperTurnRetract);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 3 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\capper_controller.sysj line: 27, column: 12
              System.out.println("Capper: Gripper at home position...");//sysj\capper_controller.sysj line: 32, column: 6
              S2=4;
              thread410(tdone,ends);
              thread411(tdone,ends);
              int biggest412 = 0;
              if(ends[3]>=biggest412){
                biggest412=ends[3];
              }
              if(ends[4]>=biggest412){
                biggest412=ends[4];
              }
              if(biggest412 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\capper_controller.sysj line: 30, column: 7
              currsigs.addElement(gripperTurnRetract);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 4 : 
            thread413(tdone,ends);
            thread414(tdone,ends);
            int biggest423 = 0;
            if(ends[3]>=biggest423){
              biggest423=ends[3];
            }
            if(ends[4]>=biggest423){
              biggest423=ends[4];
            }
            if(biggest423 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest423 == 2){
              ends[2]=2;
              ;//sysj\capper_controller.sysj line: 35, column: 6
              S2=5;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest423 == 0){
              S2=5;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 5 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\capper_controller.sysj line: 59, column: 12
              System.out.println("CapperController: Gripper raised...");//sysj\capper_controller.sysj line: 60, column: 6
              System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\capper_controller.sysj line: 61, column: 6
              S2=6;
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
          
          case 6 : 
            if(!bottleAtPos4.getprestatus()){//sysj\capper_controller.sysj line: 62, column: 12
              System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\capper_controller.sysj line: 14, column: 6
              S2=0;
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
          
        }
        break;
      
    }
  }

  public void thread406(int [] tdone, int [] ends){
        S368=1;
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread405(int [] tdone, int [] ends){
        S365=1;
    bottleAtPos4E.setPresent();//sysj\capper_controller.sysj line: 95, column: 23
    currsigs.addElement(bottleAtPos4E);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread404(int [] tdone, int [] ends){
        S395=1;
    S371=0;
    if(bottleAtPos4.getprestatus()){//sysj\capper_controller.sysj line: 92, column: 20
      thread405(tdone,ends);
      thread406(tdone,ends);
      int biggest407 = 0;
      if(ends[12]>=biggest407){
        biggest407=ends[12];
      }
      if(ends[13]>=biggest407){
        biggest407=ends[13];
      }
      if(biggest407 == 1){
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
    }
    else {
      S371=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread402(int [] tdone, int [] ends){
        S333=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread401(int [] tdone, int [] ends){
        S330=1;
    cylClampBottleExtend.setPresent();//sysj\capper_controller.sysj line: 75, column: 24
    currsigs.addElement(cylClampBottleExtend);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread400(int [] tdone, int [] ends){
        S360=1;
    S336=0;
    if(bottleAtPos4.getprestatus()){//sysj\capper_controller.sysj line: 72, column: 21
      thread401(tdone,ends);
      thread402(tdone,ends);
      int biggest403 = 0;
      if(ends[9]>=biggest403){
        biggest403=ends[9];
      }
      if(ends[10]>=biggest403){
        biggest403=ends[10];
      }
      if(biggest403 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
    else {
      S336=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread399(int [] tdone, int [] ends){
        S325=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\capper_controller.sysj line: 14, column: 6
    S2=0;
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
      switch(S397){
        case 0 : 
          S397=0;
          break RUN;
        
        case 1 : 
          S397=2;
          S397=2;
          thread399(tdone,ends);
          thread400(tdone,ends);
          thread404(tdone,ends);
          int biggest408 = 0;
          if(ends[2]>=biggest408){
            biggest408=ends[2];
          }
          if(ends[8]>=biggest408){
            biggest408=ends[8];
          }
          if(ends[11]>=biggest408){
            biggest408=ends[11];
          }
          if(biggest408 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread409(tdone,ends);
          thread424(tdone,ends);
          thread431(tdone,ends);
          int biggest438 = 0;
          if(ends[2]>=biggest438){
            biggest438=ends[2];
          }
          if(ends[8]>=biggest438){
            biggest438=ends[8];
          }
          if(ends[11]>=biggest438){
            biggest438=ends[11];
          }
          if(biggest438 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest438 == 0){
            S397=0;
            active[1]=0;
            ends[1]=0;
            S397=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          bottleAtPos4.gethook();
          gripperZAxisLowered.gethook();
          gripperZAxisLifted.gethook();
          gripperTurnHomePos.gethook();
          gripperTurnFinalPos.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos4.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      bottleAtPos4E.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos4.getStatus() ? bottleAtPos4.setprepresent() : bottleAtPos4.setpreclear();
      bottleAtPos4.setpreval(bottleAtPos4.getValue());
      bottleAtPos4.setClear();
      dummyint = gripperZAxisLowered.getStatus() ? gripperZAxisLowered.setprepresent() : gripperZAxisLowered.setpreclear();
      gripperZAxisLowered.setpreval(gripperZAxisLowered.getValue());
      gripperZAxisLowered.setClear();
      dummyint = gripperZAxisLifted.getStatus() ? gripperZAxisLifted.setprepresent() : gripperZAxisLifted.setpreclear();
      gripperZAxisLifted.setpreval(gripperZAxisLifted.getValue());
      gripperZAxisLifted.setClear();
      dummyint = gripperTurnHomePos.getStatus() ? gripperTurnHomePos.setprepresent() : gripperTurnHomePos.setpreclear();
      gripperTurnHomePos.setpreval(gripperTurnHomePos.getValue());
      gripperTurnHomePos.setClear();
      dummyint = gripperTurnFinalPos.getStatus() ? gripperTurnFinalPos.setprepresent() : gripperTurnFinalPos.setpreclear();
      gripperTurnFinalPos.setpreval(gripperTurnFinalPos.getValue());
      gripperTurnFinalPos.setClear();
      cylPos5ZaxisExtend.sethook();
      cylPos5ZaxisExtend.setClear();
      gripperTurnRetract.sethook();
      gripperTurnRetract.setClear();
      gripperTurnExtend.sethook();
      gripperTurnExtend.setClear();
      capGripperPos5Extend.sethook();
      capGripperPos5Extend.setClear();
      cylClampBottleExtend.sethook();
      cylClampBottleExtend.setClear();
      bottleAtPos4E.sethook();
      bottleAtPos4E.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos4.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
