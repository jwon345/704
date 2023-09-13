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
  public input_Channel simCapper_in = new input_Channel();
  public output_Channel capperReady_o = new output_Channel();
  private Signal bottleAtPos4_79;
  private Signal done_79;
  private int S139027 = 1;
  private int S139026 = 1;
  private int S133270 = 1;
  private int S133265 = 1;
  private int S134567 = 1;
  private int S133288 = 1;
  private int S133295 = 1;
  private int S133290 = 1;
  private int S133357 = 1;
  private int S133392 = 1;
  private int S133359 = 1;
  private int S133364 = 1;
  private int S133372 = 1;
  private int S133375 = 1;
  private int S133444 = 1;
  private int S133439 = 1;
  private int S133495 = 1;
  private int S134650 = 1;
  private int S134594 = 1;
  private int S134574 = 1;
  private int S134569 = 1;
  private int S134685 = 1;
  private int S134661 = 1;
  private int S134655 = 1;
  private int S134658 = 1;
  private int S134720 = 1;
  private int S134696 = 1;
  private int S134690 = 1;
  private int S134693 = 1;
  
  private int[] ends = new int[106];
  private int[] tdone = new int[106];
  
  public void thread192655(int [] tdone, int [] ends){
        S134693=1;
    active[92]=1;
    ends[92]=1;
    tdone[92]=1;
  }

  public void thread192654(int [] tdone, int [] ends){
        S134690=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 769, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread192652(int [] tdone, int [] ends){
        switch(S134693){
      case 0 : 
        active[92]=0;
        ends[92]=0;
        tdone[92]=1;
        break;
      
      case 1 : 
        if(done_79.getprestatus()){//sysj\conveyor_controller.sysj line: 773, column: 36
          ends[92]=2;
          tdone[92]=1;
        }
        else {
          active[92]=1;
          ends[92]=1;
          tdone[92]=1;
        }
        break;
      
    }
  }

  public void thread192651(int [] tdone, int [] ends){
        switch(S134690){
      case 0 : 
        active[91]=0;
        ends[91]=0;
        tdone[91]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 769, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[91]=1;
        ends[91]=1;
        tdone[91]=1;
        break;
      
    }
  }

  public void thread192650(int [] tdone, int [] ends){
        switch(S134720){
      case 0 : 
        active[90]=0;
        ends[90]=0;
        tdone[90]=1;
        break;
      
      case 1 : 
        switch(S134696){
          case 0 : 
            thread192651(tdone,ends);
            thread192652(tdone,ends);
            int biggest192653 = 0;
            if(ends[91]>=biggest192653){
              biggest192653=ends[91];
            }
            if(ends[92]>=biggest192653){
              biggest192653=ends[92];
            }
            if(biggest192653 == 1){
              active[90]=1;
              ends[90]=1;
              tdone[90]=1;
            }
            if(biggest192653 == 2){
              ends[90]=2;
              ;//sysj\conveyor_controller.sysj line: 767, column: 19
              S134696=1;
              active[90]=1;
              ends[90]=1;
              tdone[90]=1;
            }
            //FINXME code
            if(biggest192653 == 0){
              S134696=1;
              active[90]=1;
              ends[90]=1;
              tdone[90]=1;
            }
            break;
          
          case 1 : 
            S134696=1;
            S134696=0;
            if(bottleAtPos4_79.getprestatus()){//sysj\conveyor_controller.sysj line: 766, column: 27
              thread192654(tdone,ends);
              thread192655(tdone,ends);
              int biggest192656 = 0;
              if(ends[91]>=biggest192656){
                biggest192656=ends[91];
              }
              if(ends[92]>=biggest192656){
                biggest192656=ends[92];
              }
              if(biggest192656 == 1){
                active[90]=1;
                ends[90]=1;
                tdone[90]=1;
              }
            }
            else {
              S134696=1;
              active[90]=1;
              ends[90]=1;
              tdone[90]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192648(int [] tdone, int [] ends){
        S134658=1;
    active[89]=1;
    ends[89]=1;
    tdone[89]=1;
  }

  public void thread192647(int [] tdone, int [] ends){
        S134655=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 750, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[88]=1;
    ends[88]=1;
    tdone[88]=1;
  }

  public void thread192645(int [] tdone, int [] ends){
        switch(S134658){
      case 0 : 
        active[89]=0;
        ends[89]=0;
        tdone[89]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 754, column: 37
          ends[89]=2;
          tdone[89]=1;
        }
        else {
          active[89]=1;
          ends[89]=1;
          tdone[89]=1;
        }
        break;
      
    }
  }

  public void thread192644(int [] tdone, int [] ends){
        switch(S134655){
      case 0 : 
        active[88]=0;
        ends[88]=0;
        tdone[88]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 750, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[88]=1;
        ends[88]=1;
        tdone[88]=1;
        break;
      
    }
  }

  public void thread192643(int [] tdone, int [] ends){
        switch(S134685){
      case 0 : 
        active[87]=0;
        ends[87]=0;
        tdone[87]=1;
        break;
      
      case 1 : 
        switch(S134661){
          case 0 : 
            thread192644(tdone,ends);
            thread192645(tdone,ends);
            int biggest192646 = 0;
            if(ends[88]>=biggest192646){
              biggest192646=ends[88];
            }
            if(ends[89]>=biggest192646){
              biggest192646=ends[89];
            }
            if(biggest192646 == 1){
              active[87]=1;
              ends[87]=1;
              tdone[87]=1;
            }
            if(biggest192646 == 2){
              ends[87]=2;
              ;//sysj\conveyor_controller.sysj line: 748, column: 20
              S134661=1;
              active[87]=1;
              ends[87]=1;
              tdone[87]=1;
            }
            //FINXME code
            if(biggest192646 == 0){
              S134661=1;
              active[87]=1;
              ends[87]=1;
              tdone[87]=1;
            }
            break;
          
          case 1 : 
            S134661=1;
            S134661=0;
            if(bottleAtPos4_79.getprestatus()){//sysj\conveyor_controller.sysj line: 747, column: 39
              thread192647(tdone,ends);
              thread192648(tdone,ends);
              int biggest192649 = 0;
              if(ends[88]>=biggest192649){
                biggest192649=ends[88];
              }
              if(ends[89]>=biggest192649){
                biggest192649=ends[89];
              }
              if(biggest192649 == 1){
                active[87]=1;
                ends[87]=1;
                tdone[87]=1;
              }
            }
            else {
              S134661=1;
              active[87]=1;
              ends[87]=1;
              tdone[87]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192642(int [] tdone, int [] ends){
        switch(S134650){
      case 0 : 
        active[86]=0;
        ends[86]=0;
        tdone[86]=1;
        break;
      
      case 1 : 
        switch(S134594){
          case 0 : 
            switch(S134574){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 734, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 734, column: 13
                  S134574=1;
                  active[86]=1;
                  ends[86]=1;
                  tdone[86]=1;
                }
                else {
                  switch(S134569){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 734, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 734, column: 13
                        S134569=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 734, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 734, column: 13
                          ends[86]=2;
                          ;//sysj\conveyor_controller.sysj line: 734, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 735, column: 16
                            bottleAtPos4_79.setPresent();//sysj\conveyor_controller.sysj line: 736, column: 14
                            currsigs.addElement(bottleAtPos4_79);
                            S134594=1;
                            active[86]=1;
                            ends[86]=1;
                            tdone[86]=1;
                          }
                          else {
                            done_79.setPresent();//sysj\conveyor_controller.sysj line: 739, column: 14
                            currsigs.addElement(done_79);
                            S134594=1;
                            active[86]=1;
                            ends[86]=1;
                            tdone[86]=1;
                          }
                        }
                        else {
                          active[86]=1;
                          ends[86]=1;
                          tdone[86]=1;
                        }
                      }
                      else {
                        active[86]=1;
                        ends[86]=1;
                        tdone[86]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 734, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 734, column: 13
                        ends[86]=2;
                        ;//sysj\conveyor_controller.sysj line: 734, column: 13
                        if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 735, column: 16
                          bottleAtPos4_79.setPresent();//sysj\conveyor_controller.sysj line: 736, column: 14
                          currsigs.addElement(bottleAtPos4_79);
                          S134594=1;
                          active[86]=1;
                          ends[86]=1;
                          tdone[86]=1;
                        }
                        else {
                          done_79.setPresent();//sysj\conveyor_controller.sysj line: 739, column: 14
                          currsigs.addElement(done_79);
                          S134594=1;
                          active[86]=1;
                          ends[86]=1;
                          tdone[86]=1;
                        }
                      }
                      else {
                        active[86]=1;
                        ends[86]=1;
                        tdone[86]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S134574=1;
                S134574=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 734, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 734, column: 13
                  S134574=1;
                  active[86]=1;
                  ends[86]=1;
                  tdone[86]=1;
                }
                else {
                  S134569=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 734, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 734, column: 13
                    S134569=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 734, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 734, column: 13
                      ends[86]=2;
                      ;//sysj\conveyor_controller.sysj line: 734, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 735, column: 16
                        bottleAtPos4_79.setPresent();//sysj\conveyor_controller.sysj line: 736, column: 14
                        currsigs.addElement(bottleAtPos4_79);
                        S134594=1;
                        active[86]=1;
                        ends[86]=1;
                        tdone[86]=1;
                      }
                      else {
                        done_79.setPresent();//sysj\conveyor_controller.sysj line: 739, column: 14
                        currsigs.addElement(done_79);
                        S134594=1;
                        active[86]=1;
                        ends[86]=1;
                        tdone[86]=1;
                      }
                    }
                    else {
                      active[86]=1;
                      ends[86]=1;
                      tdone[86]=1;
                    }
                  }
                  else {
                    active[86]=1;
                    ends[86]=1;
                    tdone[86]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S134594=1;
            S134594=0;
            S134574=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 734, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 734, column: 13
              S134574=1;
              active[86]=1;
              ends[86]=1;
              tdone[86]=1;
            }
            else {
              S134569=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 734, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 734, column: 13
                S134569=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 734, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 734, column: 13
                  ends[86]=2;
                  ;//sysj\conveyor_controller.sysj line: 734, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 735, column: 16
                    bottleAtPos4_79.setPresent();//sysj\conveyor_controller.sysj line: 736, column: 14
                    currsigs.addElement(bottleAtPos4_79);
                    S134594=1;
                    active[86]=1;
                    ends[86]=1;
                    tdone[86]=1;
                  }
                  else {
                    done_79.setPresent();//sysj\conveyor_controller.sysj line: 739, column: 14
                    currsigs.addElement(done_79);
                    S134594=1;
                    active[86]=1;
                    ends[86]=1;
                    tdone[86]=1;
                  }
                }
                else {
                  active[86]=1;
                  ends[86]=1;
                  tdone[86]=1;
                }
              }
              else {
                active[86]=1;
                ends[86]=1;
                tdone[86]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192639(int [] tdone, int [] ends){
        switch(S133375){
      case 0 : 
        active[85]=0;
        ends[85]=0;
        tdone[85]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 704, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 705, column: 16
          ends[85]=2;
          tdone[85]=1;
        }
        else {
          active[85]=1;
          ends[85]=1;
          tdone[85]=1;
        }
        break;
      
    }
  }

  public void thread192638(int [] tdone, int [] ends){
        switch(S133372){
      case 0 : 
        active[84]=0;
        ends[84]=0;
        tdone[84]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 700, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
        break;
      
    }
  }

  public void thread192637(int [] tdone, int [] ends){
        switch(S133364){
      case 0 : 
        active[83]=0;
        ends[83]=0;
        tdone[83]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 695, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[83]=1;
        ends[83]=1;
        tdone[83]=1;
        break;
      
    }
  }

  public void thread192635(int [] tdone, int [] ends){
        S133375=1;
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread192634(int [] tdone, int [] ends){
        S133372=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 699, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 700, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[84]=1;
    ends[84]=1;
    tdone[84]=1;
  }

  public void thread192633(int [] tdone, int [] ends){
        S133364=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 695, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread192632(int [] tdone, int [] ends){
        switch(S133392){
      case 0 : 
        active[82]=0;
        ends[82]=0;
        tdone[82]=1;
        break;
      
      case 1 : 
        switch(S133359){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 692, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 693, column: 15
              S133359=1;
              thread192633(tdone,ends);
              thread192634(tdone,ends);
              thread192635(tdone,ends);
              int biggest192636 = 0;
              if(ends[83]>=biggest192636){
                biggest192636=ends[83];
              }
              if(ends[84]>=biggest192636){
                biggest192636=ends[84];
              }
              if(ends[85]>=biggest192636){
                biggest192636=ends[85];
              }
              if(biggest192636 == 1){
                active[82]=1;
                ends[82]=1;
                tdone[82]=1;
              }
            }
            else {
              active[82]=1;
              ends[82]=1;
              tdone[82]=1;
            }
            break;
          
          case 1 : 
            thread192637(tdone,ends);
            thread192638(tdone,ends);
            thread192639(tdone,ends);
            int biggest192640 = 0;
            if(ends[83]>=biggest192640){
              biggest192640=ends[83];
            }
            if(ends[84]>=biggest192640){
              biggest192640=ends[84];
            }
            if(ends[85]>=biggest192640){
              biggest192640=ends[85];
            }
            if(biggest192640 == 1){
              active[82]=1;
              ends[82]=1;
              tdone[82]=1;
            }
            if(biggest192640 == 2){
              ends[82]=2;
              tdone[82]=1;
            }
            //FINXME code
            if(biggest192640 == 0){
              S133392=0;
              active[82]=0;
              ends[82]=0;
              tdone[82]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192631(int [] tdone, int [] ends){
        switch(S133357){
      case 0 : 
        active[81]=0;
        ends[81]=0;
        tdone[81]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 688, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
        break;
      
    }
  }

  public void thread192629(int [] tdone, int [] ends){
        S133392=1;
    S133359=0;
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread192628(int [] tdone, int [] ends){
        S133357=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 688, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[81]=1;
    ends[81]=1;
    tdone[81]=1;
  }

  public void thread192627(int [] tdone, int [] ends){
        switch(S134567){
      case 0 : 
        active[80]=0;
        ends[80]=0;
        tdone[80]=1;
        break;
      
      case 1 : 
        switch(S133288){
          case 0 : 
            if(bottleAtPos4_79.getprestatus()){//sysj\conveyor_controller.sysj line: 667, column: 19
              S133288=1;
              S133295=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 668, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 668, column: 13
                S133295=1;
                active[80]=1;
                ends[80]=1;
                tdone[80]=1;
              }
              else {
                S133290=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 668, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 668, column: 13
                  S133290=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 668, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 668, column: 13
                    ends[80]=2;
                    ;//sysj\conveyor_controller.sysj line: 668, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 669, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 670, column: 13
                    S133288=2;
                    active[80]=1;
                    ends[80]=1;
                    tdone[80]=1;
                  }
                  else {
                    active[80]=1;
                    ends[80]=1;
                    tdone[80]=1;
                  }
                }
                else {
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
              }
            }
            else {
              active[80]=1;
              ends[80]=1;
              tdone[80]=1;
            }
            break;
          
          case 1 : 
            switch(S133295){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 668, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 668, column: 13
                  S133295=1;
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
                else {
                  switch(S133290){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 668, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 668, column: 13
                        S133290=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 668, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 668, column: 13
                          ends[80]=2;
                          ;//sysj\conveyor_controller.sysj line: 668, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 669, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 670, column: 13
                          S133288=2;
                          active[80]=1;
                          ends[80]=1;
                          tdone[80]=1;
                        }
                        else {
                          active[80]=1;
                          ends[80]=1;
                          tdone[80]=1;
                        }
                      }
                      else {
                        active[80]=1;
                        ends[80]=1;
                        tdone[80]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 668, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 668, column: 13
                        ends[80]=2;
                        ;//sysj\conveyor_controller.sysj line: 668, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 669, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 670, column: 13
                        S133288=2;
                        active[80]=1;
                        ends[80]=1;
                        tdone[80]=1;
                      }
                      else {
                        active[80]=1;
                        ends[80]=1;
                        tdone[80]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S133295=1;
                S133295=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 668, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 668, column: 13
                  S133295=1;
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
                else {
                  S133290=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 668, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 668, column: 13
                    S133290=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 668, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 668, column: 13
                      ends[80]=2;
                      ;//sysj\conveyor_controller.sysj line: 668, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 669, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 670, column: 13
                      S133288=2;
                      active[80]=1;
                      ends[80]=1;
                      tdone[80]=1;
                    }
                    else {
                      active[80]=1;
                      ends[80]=1;
                      tdone[80]=1;
                    }
                  }
                  else {
                    active[80]=1;
                    ends[80]=1;
                    tdone[80]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 671, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 675, column: 13
              S133288=3;
              active[80]=1;
              ends[80]=1;
              tdone[80]=1;
            }
            else {
              active[80]=1;
              ends[80]=1;
              tdone[80]=1;
            }
            break;
          
          case 3 : 
            S133288=3;
            S133288=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 681, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 682, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 679, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 684, column: 13
              S133288=5;
              thread192628(tdone,ends);
              thread192629(tdone,ends);
              int biggest192630 = 0;
              if(ends[81]>=biggest192630){
                biggest192630=ends[81];
              }
              if(ends[82]>=biggest192630){
                biggest192630=ends[82];
              }
              if(biggest192630 == 1){
                active[80]=1;
                ends[80]=1;
                tdone[80]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 682, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[80]=1;
              ends[80]=1;
              tdone[80]=1;
            }
            break;
          
          case 5 : 
            thread192631(tdone,ends);
            thread192632(tdone,ends);
            int biggest192641 = 0;
            if(ends[81]>=biggest192641){
              biggest192641=ends[81];
            }
            if(ends[82]>=biggest192641){
              biggest192641=ends[82];
            }
            if(biggest192641 == 1){
              active[80]=1;
              ends[80]=1;
              tdone[80]=1;
            }
            if(biggest192641 == 2){
              ends[80]=2;
              ;//sysj\conveyor_controller.sysj line: 687, column: 13
              S133288=6;
              active[80]=1;
              ends[80]=1;
              tdone[80]=1;
            }
            //FINXME code
            if(biggest192641 == 0){
              S133288=6;
              active[80]=1;
              ends[80]=1;
              tdone[80]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 711, column: 19
              S133288=7;
              S133444=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 713, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 713, column: 13
                S133444=1;
                active[80]=1;
                ends[80]=1;
                tdone[80]=1;
              }
              else {
                S133439=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 713, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 713, column: 13
                  S133439=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 713, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 713, column: 13
                    ends[80]=2;
                    ;//sysj\conveyor_controller.sysj line: 713, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 714, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 715, column: 13
                    S133288=8;
                    S133495=0;
                    active[80]=1;
                    ends[80]=1;
                    tdone[80]=1;
                  }
                  else {
                    active[80]=1;
                    ends[80]=1;
                    tdone[80]=1;
                  }
                }
                else {
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
              }
            }
            else {
              active[80]=1;
              ends[80]=1;
              tdone[80]=1;
            }
            break;
          
          case 7 : 
            switch(S133444){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 713, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 713, column: 13
                  S133444=1;
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
                else {
                  switch(S133439){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 713, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 713, column: 13
                        S133439=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 713, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 713, column: 13
                          ends[80]=2;
                          ;//sysj\conveyor_controller.sysj line: 713, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 714, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 715, column: 13
                          S133288=8;
                          S133495=0;
                          active[80]=1;
                          ends[80]=1;
                          tdone[80]=1;
                        }
                        else {
                          active[80]=1;
                          ends[80]=1;
                          tdone[80]=1;
                        }
                      }
                      else {
                        active[80]=1;
                        ends[80]=1;
                        tdone[80]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 713, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 713, column: 13
                        ends[80]=2;
                        ;//sysj\conveyor_controller.sysj line: 713, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 714, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 715, column: 13
                        S133288=8;
                        S133495=0;
                        active[80]=1;
                        ends[80]=1;
                        tdone[80]=1;
                      }
                      else {
                        active[80]=1;
                        ends[80]=1;
                        tdone[80]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S133444=1;
                S133444=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 713, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 713, column: 13
                  S133444=1;
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
                else {
                  S133439=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 713, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 713, column: 13
                    S133439=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 713, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 713, column: 13
                      ends[80]=2;
                      ;//sysj\conveyor_controller.sysj line: 713, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 714, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 715, column: 13
                      S133288=8;
                      S133495=0;
                      active[80]=1;
                      ends[80]=1;
                      tdone[80]=1;
                    }
                    else {
                      active[80]=1;
                      ends[80]=1;
                      tdone[80]=1;
                    }
                  }
                  else {
                    active[80]=1;
                    ends[80]=1;
                    tdone[80]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S133495){
              case 0 : 
                if(!bottleAtPos4_79.getprestatus()){//sysj\conveyor_controller.sysj line: 716, column: 29
                  S133495=1;
                  if(bottleAtPos4_79.getprestatus()){//sysj\conveyor_controller.sysj line: 718, column: 23
                    active[80]=1;
                    ends[80]=1;
                    tdone[80]=1;
                  }
                  else {
                    ends[80]=2;
                    ;//sysj\conveyor_controller.sysj line: 716, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 666, column: 13
                    S133288=0;
                    active[80]=1;
                    ends[80]=1;
                    tdone[80]=1;
                  }
                }
                else {
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos4_79.getprestatus()){//sysj\conveyor_controller.sysj line: 718, column: 23
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
                else {
                  ends[80]=2;
                  ;//sysj\conveyor_controller.sysj line: 716, column: 13
                  System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 666, column: 13
                  S133288=0;
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192624(int [] tdone, int [] ends){
        S134693=1;
    active[92]=1;
    ends[92]=1;
    tdone[92]=1;
  }

  public void thread192623(int [] tdone, int [] ends){
        S134690=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 769, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread192622(int [] tdone, int [] ends){
        S134720=1;
    S134696=0;
    if(bottleAtPos4_79.getprestatus()){//sysj\conveyor_controller.sysj line: 766, column: 27
      thread192623(tdone,ends);
      thread192624(tdone,ends);
      int biggest192625 = 0;
      if(ends[91]>=biggest192625){
        biggest192625=ends[91];
      }
      if(ends[92]>=biggest192625){
        biggest192625=ends[92];
      }
      if(biggest192625 == 1){
        active[90]=1;
        ends[90]=1;
        tdone[90]=1;
      }
    }
    else {
      S134696=1;
      active[90]=1;
      ends[90]=1;
      tdone[90]=1;
    }
  }

  public void thread192620(int [] tdone, int [] ends){
        S134658=1;
    active[89]=1;
    ends[89]=1;
    tdone[89]=1;
  }

  public void thread192619(int [] tdone, int [] ends){
        S134655=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 750, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[88]=1;
    ends[88]=1;
    tdone[88]=1;
  }

  public void thread192618(int [] tdone, int [] ends){
        S134685=1;
    S134661=0;
    if(bottleAtPos4_79.getprestatus()){//sysj\conveyor_controller.sysj line: 747, column: 39
      thread192619(tdone,ends);
      thread192620(tdone,ends);
      int biggest192621 = 0;
      if(ends[88]>=biggest192621){
        biggest192621=ends[88];
      }
      if(ends[89]>=biggest192621){
        biggest192621=ends[89];
      }
      if(biggest192621 == 1){
        active[87]=1;
        ends[87]=1;
        tdone[87]=1;
      }
    }
    else {
      S134661=1;
      active[87]=1;
      ends[87]=1;
      tdone[87]=1;
    }
  }

  public void thread192617(int [] tdone, int [] ends){
        S134650=1;
    S134594=0;
    S134574=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 734, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 734, column: 13
      S134574=1;
      active[86]=1;
      ends[86]=1;
      tdone[86]=1;
    }
    else {
      S134569=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 734, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 734, column: 13
        S134569=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 734, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 734, column: 13
          ends[86]=2;
          ;//sysj\conveyor_controller.sysj line: 734, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 735, column: 16
            bottleAtPos4_79.setPresent();//sysj\conveyor_controller.sysj line: 736, column: 14
            currsigs.addElement(bottleAtPos4_79);
            S134594=1;
            active[86]=1;
            ends[86]=1;
            tdone[86]=1;
          }
          else {
            done_79.setPresent();//sysj\conveyor_controller.sysj line: 739, column: 14
            currsigs.addElement(done_79);
            S134594=1;
            active[86]=1;
            ends[86]=1;
            tdone[86]=1;
          }
        }
        else {
          active[86]=1;
          ends[86]=1;
          tdone[86]=1;
        }
      }
      else {
        active[86]=1;
        ends[86]=1;
        tdone[86]=1;
      }
    }
  }

  public void thread192616(int [] tdone, int [] ends){
        S134567=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 666, column: 13
    S133288=0;
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread192613(int [] tdone, int [] ends){
        S134693=1;
    active[92]=1;
    ends[92]=1;
    tdone[92]=1;
  }

  public void thread192612(int [] tdone, int [] ends){
        S134690=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 769, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread192611(int [] tdone, int [] ends){
        S134720=1;
    S134696=0;
    if(bottleAtPos4_79.getprestatus()){//sysj\conveyor_controller.sysj line: 766, column: 27
      thread192612(tdone,ends);
      thread192613(tdone,ends);
      int biggest192614 = 0;
      if(ends[91]>=biggest192614){
        biggest192614=ends[91];
      }
      if(ends[92]>=biggest192614){
        biggest192614=ends[92];
      }
      if(biggest192614 == 1){
        active[90]=1;
        ends[90]=1;
        tdone[90]=1;
      }
    }
    else {
      S134696=1;
      active[90]=1;
      ends[90]=1;
      tdone[90]=1;
    }
  }

  public void thread192609(int [] tdone, int [] ends){
        S134658=1;
    active[89]=1;
    ends[89]=1;
    tdone[89]=1;
  }

  public void thread192608(int [] tdone, int [] ends){
        S134655=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 750, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[88]=1;
    ends[88]=1;
    tdone[88]=1;
  }

  public void thread192607(int [] tdone, int [] ends){
        S134685=1;
    S134661=0;
    if(bottleAtPos4_79.getprestatus()){//sysj\conveyor_controller.sysj line: 747, column: 39
      thread192608(tdone,ends);
      thread192609(tdone,ends);
      int biggest192610 = 0;
      if(ends[88]>=biggest192610){
        biggest192610=ends[88];
      }
      if(ends[89]>=biggest192610){
        biggest192610=ends[89];
      }
      if(biggest192610 == 1){
        active[87]=1;
        ends[87]=1;
        tdone[87]=1;
      }
    }
    else {
      S134661=1;
      active[87]=1;
      ends[87]=1;
      tdone[87]=1;
    }
  }

  public void thread192606(int [] tdone, int [] ends){
        S134650=1;
    S134594=0;
    S134574=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 734, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 734, column: 13
      S134574=1;
      active[86]=1;
      ends[86]=1;
      tdone[86]=1;
    }
    else {
      S134569=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 734, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 734, column: 13
        S134569=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 734, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 734, column: 13
          ends[86]=2;
          ;//sysj\conveyor_controller.sysj line: 734, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 735, column: 16
            bottleAtPos4_79.setPresent();//sysj\conveyor_controller.sysj line: 736, column: 14
            currsigs.addElement(bottleAtPos4_79);
            S134594=1;
            active[86]=1;
            ends[86]=1;
            tdone[86]=1;
          }
          else {
            done_79.setPresent();//sysj\conveyor_controller.sysj line: 739, column: 14
            currsigs.addElement(done_79);
            S134594=1;
            active[86]=1;
            ends[86]=1;
            tdone[86]=1;
          }
        }
        else {
          active[86]=1;
          ends[86]=1;
          tdone[86]=1;
        }
      }
      else {
        active[86]=1;
        ends[86]=1;
        tdone[86]=1;
      }
    }
  }

  public void thread192605(int [] tdone, int [] ends){
        S134567=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 666, column: 13
    S133288=0;
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread192602(int [] tdone, int [] ends){
        S134693=1;
    active[92]=1;
    ends[92]=1;
    tdone[92]=1;
  }

  public void thread192601(int [] tdone, int [] ends){
        S134690=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 769, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread192600(int [] tdone, int [] ends){
        S134720=1;
    S134696=0;
    if(bottleAtPos4_79.getprestatus()){//sysj\conveyor_controller.sysj line: 766, column: 27
      thread192601(tdone,ends);
      thread192602(tdone,ends);
      int biggest192603 = 0;
      if(ends[91]>=biggest192603){
        biggest192603=ends[91];
      }
      if(ends[92]>=biggest192603){
        biggest192603=ends[92];
      }
      if(biggest192603 == 1){
        active[90]=1;
        ends[90]=1;
        tdone[90]=1;
      }
    }
    else {
      S134696=1;
      active[90]=1;
      ends[90]=1;
      tdone[90]=1;
    }
  }

  public void thread192598(int [] tdone, int [] ends){
        S134658=1;
    active[89]=1;
    ends[89]=1;
    tdone[89]=1;
  }

  public void thread192597(int [] tdone, int [] ends){
        S134655=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 750, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[88]=1;
    ends[88]=1;
    tdone[88]=1;
  }

  public void thread192596(int [] tdone, int [] ends){
        S134685=1;
    S134661=0;
    if(bottleAtPos4_79.getprestatus()){//sysj\conveyor_controller.sysj line: 747, column: 39
      thread192597(tdone,ends);
      thread192598(tdone,ends);
      int biggest192599 = 0;
      if(ends[88]>=biggest192599){
        biggest192599=ends[88];
      }
      if(ends[89]>=biggest192599){
        biggest192599=ends[89];
      }
      if(biggest192599 == 1){
        active[87]=1;
        ends[87]=1;
        tdone[87]=1;
      }
    }
    else {
      S134661=1;
      active[87]=1;
      ends[87]=1;
      tdone[87]=1;
    }
  }

  public void thread192595(int [] tdone, int [] ends){
        S134650=1;
    S134594=0;
    S134574=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 734, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 734, column: 13
      S134574=1;
      active[86]=1;
      ends[86]=1;
      tdone[86]=1;
    }
    else {
      S134569=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 734, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 734, column: 13
        S134569=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 734, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 734, column: 13
          ends[86]=2;
          ;//sysj\conveyor_controller.sysj line: 734, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 735, column: 16
            bottleAtPos4_79.setPresent();//sysj\conveyor_controller.sysj line: 736, column: 14
            currsigs.addElement(bottleAtPos4_79);
            S134594=1;
            active[86]=1;
            ends[86]=1;
            tdone[86]=1;
          }
          else {
            done_79.setPresent();//sysj\conveyor_controller.sysj line: 739, column: 14
            currsigs.addElement(done_79);
            S134594=1;
            active[86]=1;
            ends[86]=1;
            tdone[86]=1;
          }
        }
        else {
          active[86]=1;
          ends[86]=1;
          tdone[86]=1;
        }
      }
      else {
        active[86]=1;
        ends[86]=1;
        tdone[86]=1;
      }
    }
  }

  public void thread192594(int [] tdone, int [] ends){
        S134567=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 666, column: 13
    S133288=0;
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void thread192591(int [] tdone, int [] ends){
        S134693=1;
    active[92]=1;
    ends[92]=1;
    tdone[92]=1;
  }

  public void thread192590(int [] tdone, int [] ends){
        S134690=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 769, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[91]=1;
    ends[91]=1;
    tdone[91]=1;
  }

  public void thread192589(int [] tdone, int [] ends){
        S134720=1;
    S134696=0;
    if(bottleAtPos4_79.getprestatus()){//sysj\conveyor_controller.sysj line: 766, column: 27
      thread192590(tdone,ends);
      thread192591(tdone,ends);
      int biggest192592 = 0;
      if(ends[91]>=biggest192592){
        biggest192592=ends[91];
      }
      if(ends[92]>=biggest192592){
        biggest192592=ends[92];
      }
      if(biggest192592 == 1){
        active[90]=1;
        ends[90]=1;
        tdone[90]=1;
      }
    }
    else {
      S134696=1;
      active[90]=1;
      ends[90]=1;
      tdone[90]=1;
    }
  }

  public void thread192587(int [] tdone, int [] ends){
        S134658=1;
    active[89]=1;
    ends[89]=1;
    tdone[89]=1;
  }

  public void thread192586(int [] tdone, int [] ends){
        S134655=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 750, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[88]=1;
    ends[88]=1;
    tdone[88]=1;
  }

  public void thread192585(int [] tdone, int [] ends){
        S134685=1;
    S134661=0;
    if(bottleAtPos4_79.getprestatus()){//sysj\conveyor_controller.sysj line: 747, column: 39
      thread192586(tdone,ends);
      thread192587(tdone,ends);
      int biggest192588 = 0;
      if(ends[88]>=biggest192588){
        biggest192588=ends[88];
      }
      if(ends[89]>=biggest192588){
        biggest192588=ends[89];
      }
      if(biggest192588 == 1){
        active[87]=1;
        ends[87]=1;
        tdone[87]=1;
      }
    }
    else {
      S134661=1;
      active[87]=1;
      ends[87]=1;
      tdone[87]=1;
    }
  }

  public void thread192584(int [] tdone, int [] ends){
        S134650=1;
    S134594=0;
    S134574=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 734, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 734, column: 13
      S134574=1;
      active[86]=1;
      ends[86]=1;
      tdone[86]=1;
    }
    else {
      S134569=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 734, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 734, column: 13
        S134569=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 734, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 734, column: 13
          ends[86]=2;
          ;//sysj\conveyor_controller.sysj line: 734, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 735, column: 16
            bottleAtPos4_79.setPresent();//sysj\conveyor_controller.sysj line: 736, column: 14
            currsigs.addElement(bottleAtPos4_79);
            S134594=1;
            active[86]=1;
            ends[86]=1;
            tdone[86]=1;
          }
          else {
            done_79.setPresent();//sysj\conveyor_controller.sysj line: 739, column: 14
            currsigs.addElement(done_79);
            S134594=1;
            active[86]=1;
            ends[86]=1;
            tdone[86]=1;
          }
        }
        else {
          active[86]=1;
          ends[86]=1;
          tdone[86]=1;
        }
      }
      else {
        active[86]=1;
        ends[86]=1;
        tdone[86]=1;
      }
    }
  }

  public void thread192583(int [] tdone, int [] ends){
        S134567=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 666, column: 13
    S133288=0;
    active[80]=1;
    ends[80]=1;
    tdone[80]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S139027){
        case 0 : 
          S139027=0;
          break RUN;
        
        case 1 : 
          S139027=2;
          S139027=2;
          bottleAtPos4_79.setClear();//sysj\conveyor_controller.sysj line: 660, column: 11
          done_79.setClear();//sysj\conveyor_controller.sysj line: 660, column: 11
          S139026=0;
          S133270=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 661, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 661, column: 11
            S133270=1;
            active[79]=1;
            ends[79]=1;
            break RUN;
          }
          else {
            S133265=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 661, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 661, column: 11
              S133265=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 661, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 661, column: 11
                ends[79]=2;
                ;//sysj\conveyor_controller.sysj line: 661, column: 11
                S139026=1;
                thread192583(tdone,ends);
                thread192584(tdone,ends);
                thread192585(tdone,ends);
                thread192589(tdone,ends);
                int biggest192593 = 0;
                if(ends[80]>=biggest192593){
                  biggest192593=ends[80];
                }
                if(ends[86]>=biggest192593){
                  biggest192593=ends[86];
                }
                if(ends[87]>=biggest192593){
                  biggest192593=ends[87];
                }
                if(ends[90]>=biggest192593){
                  biggest192593=ends[90];
                }
                if(biggest192593 == 1){
                  active[79]=1;
                  ends[79]=1;
                  break RUN;
                }
              }
              else {
                active[79]=1;
                ends[79]=1;
                break RUN;
              }
            }
            else {
              active[79]=1;
              ends[79]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos4_79.setClear();//sysj\conveyor_controller.sysj line: 660, column: 11
          done_79.setClear();//sysj\conveyor_controller.sysj line: 660, column: 11
          switch(S139026){
            case 0 : 
              switch(S133270){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 661, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 661, column: 11
                    S133270=1;
                    active[79]=1;
                    ends[79]=1;
                    break RUN;
                  }
                  else {
                    switch(S133265){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 661, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 661, column: 11
                          S133265=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 661, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 661, column: 11
                            ends[79]=2;
                            ;//sysj\conveyor_controller.sysj line: 661, column: 11
                            S139026=1;
                            thread192594(tdone,ends);
                            thread192595(tdone,ends);
                            thread192596(tdone,ends);
                            thread192600(tdone,ends);
                            int biggest192604 = 0;
                            if(ends[80]>=biggest192604){
                              biggest192604=ends[80];
                            }
                            if(ends[86]>=biggest192604){
                              biggest192604=ends[86];
                            }
                            if(ends[87]>=biggest192604){
                              biggest192604=ends[87];
                            }
                            if(ends[90]>=biggest192604){
                              biggest192604=ends[90];
                            }
                            if(biggest192604 == 1){
                              active[79]=1;
                              ends[79]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[79]=1;
                            ends[79]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[79]=1;
                          ends[79]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 661, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 661, column: 11
                          ends[79]=2;
                          ;//sysj\conveyor_controller.sysj line: 661, column: 11
                          S139026=1;
                          thread192605(tdone,ends);
                          thread192606(tdone,ends);
                          thread192607(tdone,ends);
                          thread192611(tdone,ends);
                          int biggest192615 = 0;
                          if(ends[80]>=biggest192615){
                            biggest192615=ends[80];
                          }
                          if(ends[86]>=biggest192615){
                            biggest192615=ends[86];
                          }
                          if(ends[87]>=biggest192615){
                            biggest192615=ends[87];
                          }
                          if(ends[90]>=biggest192615){
                            biggest192615=ends[90];
                          }
                          if(biggest192615 == 1){
                            active[79]=1;
                            ends[79]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[79]=1;
                          ends[79]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S133270=1;
                  S133270=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 661, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 661, column: 11
                    S133270=1;
                    active[79]=1;
                    ends[79]=1;
                    break RUN;
                  }
                  else {
                    S133265=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 661, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 661, column: 11
                      S133265=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 661, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 661, column: 11
                        ends[79]=2;
                        ;//sysj\conveyor_controller.sysj line: 661, column: 11
                        S139026=1;
                        thread192616(tdone,ends);
                        thread192617(tdone,ends);
                        thread192618(tdone,ends);
                        thread192622(tdone,ends);
                        int biggest192626 = 0;
                        if(ends[80]>=biggest192626){
                          biggest192626=ends[80];
                        }
                        if(ends[86]>=biggest192626){
                          biggest192626=ends[86];
                        }
                        if(ends[87]>=biggest192626){
                          biggest192626=ends[87];
                        }
                        if(ends[90]>=biggest192626){
                          biggest192626=ends[90];
                        }
                        if(biggest192626 == 1){
                          active[79]=1;
                          ends[79]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[79]=1;
                        ends[79]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[79]=1;
                      ends[79]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread192627(tdone,ends);
              thread192642(tdone,ends);
              thread192643(tdone,ends);
              thread192650(tdone,ends);
              int biggest192657 = 0;
              if(ends[80]>=biggest192657){
                biggest192657=ends[80];
              }
              if(ends[86]>=biggest192657){
                biggest192657=ends[86];
              }
              if(ends[87]>=biggest192657){
                biggest192657=ends[87];
              }
              if(ends[90]>=biggest192657){
                biggest192657=ends[90];
              }
              if(biggest192657 == 1){
                active[79]=1;
                ends[79]=1;
                break RUN;
              }
              //FINXME code
              if(biggest192657 == 0){
                S139027=0;
                active[79]=0;
                ends[79]=0;
                S139027=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos4_79 = new Signal();
    done_79 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[79] != 0){
      int index = 79;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[79]!=0 || suspended[79]!=0 || active[79]!=1);
      else{
        if(!df){
          simCapper_in.gethook();
          capperReady_o.gethook();
          gripperZAxisLowered.gethook();
          gripperZAxisLifted.gethook();
          gripperTurnHomePos.gethook();
          gripperTurnFinalPos.gethook();
          df = true;
        }
        runClockDomain();
      }
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
      bottleAtPos4_79.setpreclear();
      done_79.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
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
      bottleAtPos4_79.setClear();
      done_79.setClear();
      simCapper_in.sethook();
      capperReady_o.sethook();
      if(paused[79]!=0 || suspended[79]!=0 || active[79]!=1);
      else{
        simCapper_in.gethook();
        capperReady_o.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[79] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
