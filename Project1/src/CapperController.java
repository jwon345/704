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
  private Signal bottleAtPos4_73;
  private int S154084 = 1;
  private int S154083 = 1;
  private int S148327 = 1;
  private int S148322 = 1;
  private int S149624 = 1;
  private int S148345 = 1;
  private int S148352 = 1;
  private int S148347 = 1;
  private int S148414 = 1;
  private int S148449 = 1;
  private int S148416 = 1;
  private int S148421 = 1;
  private int S148429 = 1;
  private int S148432 = 1;
  private int S148501 = 1;
  private int S148496 = 1;
  private int S148552 = 1;
  private int S149707 = 1;
  private int S149651 = 1;
  private int S149631 = 1;
  private int S149626 = 1;
  private int S149742 = 1;
  private int S149718 = 1;
  private int S149712 = 1;
  private int S149715 = 1;
  private int S149777 = 1;
  private int S149753 = 1;
  private int S149747 = 1;
  private int S149750 = 1;
  
  private int[] ends = new int[100];
  private int[] tdone = new int[100];
  
  public void thread213020(int [] tdone, int [] ends){
        S149750=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread213019(int [] tdone, int [] ends){
        S149747=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 692, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread213017(int [] tdone, int [] ends){
        switch(S149750){
      case 0 : 
        active[86]=0;
        ends[86]=0;
        tdone[86]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 696, column: 36
          ends[86]=2;
          tdone[86]=1;
        }
        else {
          active[86]=1;
          ends[86]=1;
          tdone[86]=1;
        }
        break;
      
    }
  }

  public void thread213016(int [] tdone, int [] ends){
        switch(S149747){
      case 0 : 
        active[85]=0;
        ends[85]=0;
        tdone[85]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 692, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[85]=1;
        ends[85]=1;
        tdone[85]=1;
        break;
      
    }
  }

  public void thread213015(int [] tdone, int [] ends){
        switch(S149777){
      case 0 : 
        active[84]=0;
        ends[84]=0;
        tdone[84]=1;
        break;
      
      case 1 : 
        switch(S149753){
          case 0 : 
            thread213016(tdone,ends);
            thread213017(tdone,ends);
            int biggest213018 = 0;
            if(ends[85]>=biggest213018){
              biggest213018=ends[85];
            }
            if(ends[86]>=biggest213018){
              biggest213018=ends[86];
            }
            if(biggest213018 == 1){
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            if(biggest213018 == 2){
              ends[84]=2;
              ;//sysj\conveyor_controller.sysj line: 690, column: 19
              S149753=1;
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            //FINXME code
            if(biggest213018 == 0){
              S149753=1;
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            break;
          
          case 1 : 
            S149753=1;
            S149753=0;
            if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 689, column: 27
              thread213019(tdone,ends);
              thread213020(tdone,ends);
              int biggest213021 = 0;
              if(ends[85]>=biggest213021){
                biggest213021=ends[85];
              }
              if(ends[86]>=biggest213021){
                biggest213021=ends[86];
              }
              if(biggest213021 == 1){
                active[84]=1;
                ends[84]=1;
                tdone[84]=1;
              }
            }
            else {
              S149753=1;
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread213013(int [] tdone, int [] ends){
        S149715=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread213012(int [] tdone, int [] ends){
        S149712=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 673, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread213010(int [] tdone, int [] ends){
        switch(S149715){
      case 0 : 
        active[83]=0;
        ends[83]=0;
        tdone[83]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 677, column: 37
          ends[83]=2;
          tdone[83]=1;
        }
        else {
          active[83]=1;
          ends[83]=1;
          tdone[83]=1;
        }
        break;
      
    }
  }

  public void thread213009(int [] tdone, int [] ends){
        switch(S149712){
      case 0 : 
        active[82]=0;
        ends[82]=0;
        tdone[82]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 673, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[82]=1;
        ends[82]=1;
        tdone[82]=1;
        break;
      
    }
  }

  public void thread213008(int [] tdone, int [] ends){
        switch(S149742){
      case 0 : 
        active[81]=0;
        ends[81]=0;
        tdone[81]=1;
        break;
      
      case 1 : 
        switch(S149718){
          case 0 : 
            thread213009(tdone,ends);
            thread213010(tdone,ends);
            int biggest213011 = 0;
            if(ends[82]>=biggest213011){
              biggest213011=ends[82];
            }
            if(ends[83]>=biggest213011){
              biggest213011=ends[83];
            }
            if(biggest213011 == 1){
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            if(biggest213011 == 2){
              ends[81]=2;
              ;//sysj\conveyor_controller.sysj line: 671, column: 20
              S149718=1;
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            //FINXME code
            if(biggest213011 == 0){
              S149718=1;
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            break;
          
          case 1 : 
            S149718=1;
            S149718=0;
            if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 670, column: 39
              thread213012(tdone,ends);
              thread213013(tdone,ends);
              int biggest213014 = 0;
              if(ends[82]>=biggest213014){
                biggest213014=ends[82];
              }
              if(ends[83]>=biggest213014){
                biggest213014=ends[83];
              }
              if(biggest213014 == 1){
                active[81]=1;
                ends[81]=1;
                tdone[81]=1;
              }
            }
            else {
              S149718=1;
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread213007(int [] tdone, int [] ends){
        switch(S149707){
      case 0 : 
        active[80]=0;
        ends[80]=0;
        tdone[80]=1;
        break;
      
      case 1 : 
        switch(S149651){
          case 0 : 
            switch(S149631){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 660, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 660, column: 13
                  S149631=1;
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
                else {
                  switch(S149626){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 660, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 660, column: 13
                        S149626=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 660, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 660, column: 13
                          ends[80]=2;
                          ;//sysj\conveyor_controller.sysj line: 660, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 661, column: 16
                            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 662, column: 14
                            currsigs.addElement(bottleAtPos4_73);
                            S149651=1;
                            active[80]=1;
                            ends[80]=1;
                            tdone[80]=1;
                          }
                          else {
                            S149651=1;
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
                      else {
                        active[80]=1;
                        ends[80]=1;
                        tdone[80]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 660, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 660, column: 13
                        ends[80]=2;
                        ;//sysj\conveyor_controller.sysj line: 660, column: 13
                        if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 661, column: 16
                          bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 662, column: 14
                          currsigs.addElement(bottleAtPos4_73);
                          S149651=1;
                          active[80]=1;
                          ends[80]=1;
                          tdone[80]=1;
                        }
                        else {
                          S149651=1;
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
                    
                  }
                }
                break;
              
              case 1 : 
                S149631=1;
                S149631=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 660, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 660, column: 13
                  S149631=1;
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
                else {
                  S149626=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 660, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 660, column: 13
                    S149626=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 660, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 660, column: 13
                      ends[80]=2;
                      ;//sysj\conveyor_controller.sysj line: 660, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 661, column: 16
                        bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 662, column: 14
                        currsigs.addElement(bottleAtPos4_73);
                        S149651=1;
                        active[80]=1;
                        ends[80]=1;
                        tdone[80]=1;
                      }
                      else {
                        S149651=1;
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
                  else {
                    active[80]=1;
                    ends[80]=1;
                    tdone[80]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S149651=1;
            S149651=0;
            S149631=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 660, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 660, column: 13
              S149631=1;
              active[80]=1;
              ends[80]=1;
              tdone[80]=1;
            }
            else {
              S149626=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 660, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 660, column: 13
                S149626=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 660, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 660, column: 13
                  ends[80]=2;
                  ;//sysj\conveyor_controller.sysj line: 660, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 661, column: 16
                    bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 662, column: 14
                    currsigs.addElement(bottleAtPos4_73);
                    S149651=1;
                    active[80]=1;
                    ends[80]=1;
                    tdone[80]=1;
                  }
                  else {
                    S149651=1;
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
              else {
                active[80]=1;
                ends[80]=1;
                tdone[80]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread213004(int [] tdone, int [] ends){
        switch(S148432){
      case 0 : 
        active[79]=0;
        ends[79]=0;
        tdone[79]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 633, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 634, column: 16
          ends[79]=2;
          tdone[79]=1;
        }
        else {
          active[79]=1;
          ends[79]=1;
          tdone[79]=1;
        }
        break;
      
    }
  }

  public void thread213003(int [] tdone, int [] ends){
        switch(S148429){
      case 0 : 
        active[78]=0;
        ends[78]=0;
        tdone[78]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 629, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[78]=1;
        ends[78]=1;
        tdone[78]=1;
        break;
      
    }
  }

  public void thread213002(int [] tdone, int [] ends){
        switch(S148421){
      case 0 : 
        active[77]=0;
        ends[77]=0;
        tdone[77]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 624, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[77]=1;
        ends[77]=1;
        tdone[77]=1;
        break;
      
    }
  }

  public void thread213000(int [] tdone, int [] ends){
        S148432=1;
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread212999(int [] tdone, int [] ends){
        S148429=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 628, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 629, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void thread212998(int [] tdone, int [] ends){
        S148421=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 624, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread212997(int [] tdone, int [] ends){
        switch(S148449){
      case 0 : 
        active[76]=0;
        ends[76]=0;
        tdone[76]=1;
        break;
      
      case 1 : 
        switch(S148416){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 621, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 622, column: 15
              S148416=1;
              thread212998(tdone,ends);
              thread212999(tdone,ends);
              thread213000(tdone,ends);
              int biggest213001 = 0;
              if(ends[77]>=biggest213001){
                biggest213001=ends[77];
              }
              if(ends[78]>=biggest213001){
                biggest213001=ends[78];
              }
              if(ends[79]>=biggest213001){
                biggest213001=ends[79];
              }
              if(biggest213001 == 1){
                active[76]=1;
                ends[76]=1;
                tdone[76]=1;
              }
            }
            else {
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            break;
          
          case 1 : 
            thread213002(tdone,ends);
            thread213003(tdone,ends);
            thread213004(tdone,ends);
            int biggest213005 = 0;
            if(ends[77]>=biggest213005){
              biggest213005=ends[77];
            }
            if(ends[78]>=biggest213005){
              biggest213005=ends[78];
            }
            if(ends[79]>=biggest213005){
              biggest213005=ends[79];
            }
            if(biggest213005 == 1){
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            if(biggest213005 == 2){
              ends[76]=2;
              tdone[76]=1;
            }
            //FINXME code
            if(biggest213005 == 0){
              S148449=0;
              active[76]=0;
              ends[76]=0;
              tdone[76]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212996(int [] tdone, int [] ends){
        switch(S148414){
      case 0 : 
        active[75]=0;
        ends[75]=0;
        tdone[75]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 617, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
        break;
      
    }
  }

  public void thread212994(int [] tdone, int [] ends){
        S148449=1;
    S148416=0;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread212993(int [] tdone, int [] ends){
        S148414=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 617, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread212992(int [] tdone, int [] ends){
        switch(S149624){
      case 0 : 
        active[74]=0;
        ends[74]=0;
        tdone[74]=1;
        break;
      
      case 1 : 
        switch(S148345){
          case 0 : 
            if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 596, column: 19
              S148345=1;
              S148352=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 597, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 597, column: 13
                S148352=1;
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
              else {
                S148347=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 597, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 597, column: 13
                  S148347=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 597, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 597, column: 13
                    ends[74]=2;
                    ;//sysj\conveyor_controller.sysj line: 597, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 598, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 599, column: 13
                    S148345=2;
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
                  }
                  else {
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
                  }
                }
                else {
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
              }
            }
            else {
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 1 : 
            switch(S148352){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 597, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 597, column: 13
                  S148352=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  switch(S148347){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 597, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 597, column: 13
                        S148347=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 597, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 597, column: 13
                          ends[74]=2;
                          ;//sysj\conveyor_controller.sysj line: 597, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 598, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 599, column: 13
                          S148345=2;
                          active[74]=1;
                          ends[74]=1;
                          tdone[74]=1;
                        }
                        else {
                          active[74]=1;
                          ends[74]=1;
                          tdone[74]=1;
                        }
                      }
                      else {
                        active[74]=1;
                        ends[74]=1;
                        tdone[74]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 597, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 597, column: 13
                        ends[74]=2;
                        ;//sysj\conveyor_controller.sysj line: 597, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 598, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 599, column: 13
                        S148345=2;
                        active[74]=1;
                        ends[74]=1;
                        tdone[74]=1;
                      }
                      else {
                        active[74]=1;
                        ends[74]=1;
                        tdone[74]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S148352=1;
                S148352=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 597, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 597, column: 13
                  S148352=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  S148347=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 597, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 597, column: 13
                    S148347=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 597, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 597, column: 13
                      ends[74]=2;
                      ;//sysj\conveyor_controller.sysj line: 597, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 598, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 599, column: 13
                      S148345=2;
                      active[74]=1;
                      ends[74]=1;
                      tdone[74]=1;
                    }
                    else {
                      active[74]=1;
                      ends[74]=1;
                      tdone[74]=1;
                    }
                  }
                  else {
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 600, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 604, column: 13
              S148345=3;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            else {
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 3 : 
            S148345=3;
            S148345=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 610, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 611, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 608, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 613, column: 13
              S148345=5;
              thread212993(tdone,ends);
              thread212994(tdone,ends);
              int biggest212995 = 0;
              if(ends[75]>=biggest212995){
                biggest212995=ends[75];
              }
              if(ends[76]>=biggest212995){
                biggest212995=ends[76];
              }
              if(biggest212995 == 1){
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 611, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 5 : 
            thread212996(tdone,ends);
            thread212997(tdone,ends);
            int biggest213006 = 0;
            if(ends[75]>=biggest213006){
              biggest213006=ends[75];
            }
            if(ends[76]>=biggest213006){
              biggest213006=ends[76];
            }
            if(biggest213006 == 1){
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            if(biggest213006 == 2){
              ends[74]=2;
              ;//sysj\conveyor_controller.sysj line: 616, column: 13
              S148345=6;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            //FINXME code
            if(biggest213006 == 0){
              S148345=6;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 640, column: 19
              S148345=7;
              S148501=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 642, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 642, column: 13
                S148501=1;
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
              else {
                S148496=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 642, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 642, column: 13
                  S148496=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 642, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 642, column: 13
                    ends[74]=2;
                    ;//sysj\conveyor_controller.sysj line: 642, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 643, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 644, column: 13
                    S148345=8;
                    S148552=0;
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
                  }
                  else {
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
                  }
                }
                else {
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
              }
            }
            else {
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 7 : 
            switch(S148501){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 642, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 642, column: 13
                  S148501=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  switch(S148496){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 642, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 642, column: 13
                        S148496=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 642, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 642, column: 13
                          ends[74]=2;
                          ;//sysj\conveyor_controller.sysj line: 642, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 643, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 644, column: 13
                          S148345=8;
                          S148552=0;
                          active[74]=1;
                          ends[74]=1;
                          tdone[74]=1;
                        }
                        else {
                          active[74]=1;
                          ends[74]=1;
                          tdone[74]=1;
                        }
                      }
                      else {
                        active[74]=1;
                        ends[74]=1;
                        tdone[74]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 642, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 642, column: 13
                        ends[74]=2;
                        ;//sysj\conveyor_controller.sysj line: 642, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 643, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 644, column: 13
                        S148345=8;
                        S148552=0;
                        active[74]=1;
                        ends[74]=1;
                        tdone[74]=1;
                      }
                      else {
                        active[74]=1;
                        ends[74]=1;
                        tdone[74]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S148501=1;
                S148501=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 642, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 642, column: 13
                  S148501=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  S148496=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 642, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 642, column: 13
                    S148496=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 642, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 642, column: 13
                      ends[74]=2;
                      ;//sysj\conveyor_controller.sysj line: 642, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 643, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 644, column: 13
                      S148345=8;
                      S148552=0;
                      active[74]=1;
                      ends[74]=1;
                      tdone[74]=1;
                    }
                    else {
                      active[74]=1;
                      ends[74]=1;
                      tdone[74]=1;
                    }
                  }
                  else {
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S148552){
              case 0 : 
                if(!bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 645, column: 29
                  S148552=1;
                  if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 647, column: 23
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
                  }
                  else {
                    ends[74]=2;
                    ;//sysj\conveyor_controller.sysj line: 645, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 595, column: 13
                    S148345=0;
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
                  }
                }
                else {
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 647, column: 23
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  ends[74]=2;
                  ;//sysj\conveyor_controller.sysj line: 645, column: 13
                  System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 595, column: 13
                  S148345=0;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212989(int [] tdone, int [] ends){
        S149750=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread212988(int [] tdone, int [] ends){
        S149747=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 692, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread212987(int [] tdone, int [] ends){
        S149777=1;
    S149753=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 689, column: 27
      thread212988(tdone,ends);
      thread212989(tdone,ends);
      int biggest212990 = 0;
      if(ends[85]>=biggest212990){
        biggest212990=ends[85];
      }
      if(ends[86]>=biggest212990){
        biggest212990=ends[86];
      }
      if(biggest212990 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S149753=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread212985(int [] tdone, int [] ends){
        S149715=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread212984(int [] tdone, int [] ends){
        S149712=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 673, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread212983(int [] tdone, int [] ends){
        S149742=1;
    S149718=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 670, column: 39
      thread212984(tdone,ends);
      thread212985(tdone,ends);
      int biggest212986 = 0;
      if(ends[82]>=biggest212986){
        biggest212986=ends[82];
      }
      if(ends[83]>=biggest212986){
        biggest212986=ends[83];
      }
      if(biggest212986 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S149718=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread212982(int [] tdone, int [] ends){
        S149707=1;
    S149651=0;
    S149631=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 660, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 660, column: 13
      S149631=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S149626=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 660, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 660, column: 13
        S149626=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 660, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 660, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 660, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 661, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 662, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S149651=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S149651=1;
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
      else {
        active[80]=1;
        ends[80]=1;
        tdone[80]=1;
      }
    }
  }

  public void thread212981(int [] tdone, int [] ends){
        S149624=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 595, column: 13
    S148345=0;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread212978(int [] tdone, int [] ends){
        S149750=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread212977(int [] tdone, int [] ends){
        S149747=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 692, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread212976(int [] tdone, int [] ends){
        S149777=1;
    S149753=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 689, column: 27
      thread212977(tdone,ends);
      thread212978(tdone,ends);
      int biggest212979 = 0;
      if(ends[85]>=biggest212979){
        biggest212979=ends[85];
      }
      if(ends[86]>=biggest212979){
        biggest212979=ends[86];
      }
      if(biggest212979 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S149753=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread212974(int [] tdone, int [] ends){
        S149715=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread212973(int [] tdone, int [] ends){
        S149712=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 673, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread212972(int [] tdone, int [] ends){
        S149742=1;
    S149718=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 670, column: 39
      thread212973(tdone,ends);
      thread212974(tdone,ends);
      int biggest212975 = 0;
      if(ends[82]>=biggest212975){
        biggest212975=ends[82];
      }
      if(ends[83]>=biggest212975){
        biggest212975=ends[83];
      }
      if(biggest212975 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S149718=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread212971(int [] tdone, int [] ends){
        S149707=1;
    S149651=0;
    S149631=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 660, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 660, column: 13
      S149631=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S149626=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 660, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 660, column: 13
        S149626=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 660, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 660, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 660, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 661, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 662, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S149651=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S149651=1;
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
      else {
        active[80]=1;
        ends[80]=1;
        tdone[80]=1;
      }
    }
  }

  public void thread212970(int [] tdone, int [] ends){
        S149624=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 595, column: 13
    S148345=0;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread212967(int [] tdone, int [] ends){
        S149750=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread212966(int [] tdone, int [] ends){
        S149747=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 692, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread212965(int [] tdone, int [] ends){
        S149777=1;
    S149753=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 689, column: 27
      thread212966(tdone,ends);
      thread212967(tdone,ends);
      int biggest212968 = 0;
      if(ends[85]>=biggest212968){
        biggest212968=ends[85];
      }
      if(ends[86]>=biggest212968){
        biggest212968=ends[86];
      }
      if(biggest212968 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S149753=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread212963(int [] tdone, int [] ends){
        S149715=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread212962(int [] tdone, int [] ends){
        S149712=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 673, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread212961(int [] tdone, int [] ends){
        S149742=1;
    S149718=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 670, column: 39
      thread212962(tdone,ends);
      thread212963(tdone,ends);
      int biggest212964 = 0;
      if(ends[82]>=biggest212964){
        biggest212964=ends[82];
      }
      if(ends[83]>=biggest212964){
        biggest212964=ends[83];
      }
      if(biggest212964 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S149718=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread212960(int [] tdone, int [] ends){
        S149707=1;
    S149651=0;
    S149631=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 660, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 660, column: 13
      S149631=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S149626=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 660, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 660, column: 13
        S149626=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 660, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 660, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 660, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 661, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 662, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S149651=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S149651=1;
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
      else {
        active[80]=1;
        ends[80]=1;
        tdone[80]=1;
      }
    }
  }

  public void thread212959(int [] tdone, int [] ends){
        S149624=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 595, column: 13
    S148345=0;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread212956(int [] tdone, int [] ends){
        S149750=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread212955(int [] tdone, int [] ends){
        S149747=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 692, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread212954(int [] tdone, int [] ends){
        S149777=1;
    S149753=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 689, column: 27
      thread212955(tdone,ends);
      thread212956(tdone,ends);
      int biggest212957 = 0;
      if(ends[85]>=biggest212957){
        biggest212957=ends[85];
      }
      if(ends[86]>=biggest212957){
        biggest212957=ends[86];
      }
      if(biggest212957 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S149753=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread212952(int [] tdone, int [] ends){
        S149715=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread212951(int [] tdone, int [] ends){
        S149712=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 673, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread212950(int [] tdone, int [] ends){
        S149742=1;
    S149718=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 670, column: 39
      thread212951(tdone,ends);
      thread212952(tdone,ends);
      int biggest212953 = 0;
      if(ends[82]>=biggest212953){
        biggest212953=ends[82];
      }
      if(ends[83]>=biggest212953){
        biggest212953=ends[83];
      }
      if(biggest212953 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S149718=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread212949(int [] tdone, int [] ends){
        S149707=1;
    S149651=0;
    S149631=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 660, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 660, column: 13
      S149631=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S149626=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 660, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 660, column: 13
        S149626=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 660, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 660, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 660, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 661, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 662, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S149651=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S149651=1;
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
      else {
        active[80]=1;
        ends[80]=1;
        tdone[80]=1;
      }
    }
  }

  public void thread212948(int [] tdone, int [] ends){
        S149624=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 595, column: 13
    S148345=0;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S154084){
        case 0 : 
          S154084=0;
          break RUN;
        
        case 1 : 
          S154084=2;
          S154084=2;
          bottleAtPos4_73.setClear();//sysj\conveyor_controller.sysj line: 589, column: 11
          S154083=0;
          S148327=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 590, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 590, column: 11
            S148327=1;
            active[73]=1;
            ends[73]=1;
            break RUN;
          }
          else {
            S148322=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 590, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 590, column: 11
              S148322=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 590, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 590, column: 11
                ends[73]=2;
                ;//sysj\conveyor_controller.sysj line: 590, column: 11
                S154083=1;
                thread212948(tdone,ends);
                thread212949(tdone,ends);
                thread212950(tdone,ends);
                thread212954(tdone,ends);
                int biggest212958 = 0;
                if(ends[74]>=biggest212958){
                  biggest212958=ends[74];
                }
                if(ends[80]>=biggest212958){
                  biggest212958=ends[80];
                }
                if(ends[81]>=biggest212958){
                  biggest212958=ends[81];
                }
                if(ends[84]>=biggest212958){
                  biggest212958=ends[84];
                }
                if(biggest212958 == 1){
                  active[73]=1;
                  ends[73]=1;
                  break RUN;
                }
              }
              else {
                active[73]=1;
                ends[73]=1;
                break RUN;
              }
            }
            else {
              active[73]=1;
              ends[73]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos4_73.setClear();//sysj\conveyor_controller.sysj line: 589, column: 11
          switch(S154083){
            case 0 : 
              switch(S148327){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 590, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 590, column: 11
                    S148327=1;
                    active[73]=1;
                    ends[73]=1;
                    break RUN;
                  }
                  else {
                    switch(S148322){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 590, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 590, column: 11
                          S148322=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 590, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 590, column: 11
                            ends[73]=2;
                            ;//sysj\conveyor_controller.sysj line: 590, column: 11
                            S154083=1;
                            thread212959(tdone,ends);
                            thread212960(tdone,ends);
                            thread212961(tdone,ends);
                            thread212965(tdone,ends);
                            int biggest212969 = 0;
                            if(ends[74]>=biggest212969){
                              biggest212969=ends[74];
                            }
                            if(ends[80]>=biggest212969){
                              biggest212969=ends[80];
                            }
                            if(ends[81]>=biggest212969){
                              biggest212969=ends[81];
                            }
                            if(ends[84]>=biggest212969){
                              biggest212969=ends[84];
                            }
                            if(biggest212969 == 1){
                              active[73]=1;
                              ends[73]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[73]=1;
                            ends[73]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[73]=1;
                          ends[73]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 590, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 590, column: 11
                          ends[73]=2;
                          ;//sysj\conveyor_controller.sysj line: 590, column: 11
                          S154083=1;
                          thread212970(tdone,ends);
                          thread212971(tdone,ends);
                          thread212972(tdone,ends);
                          thread212976(tdone,ends);
                          int biggest212980 = 0;
                          if(ends[74]>=biggest212980){
                            biggest212980=ends[74];
                          }
                          if(ends[80]>=biggest212980){
                            biggest212980=ends[80];
                          }
                          if(ends[81]>=biggest212980){
                            biggest212980=ends[81];
                          }
                          if(ends[84]>=biggest212980){
                            biggest212980=ends[84];
                          }
                          if(biggest212980 == 1){
                            active[73]=1;
                            ends[73]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[73]=1;
                          ends[73]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S148327=1;
                  S148327=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 590, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 590, column: 11
                    S148327=1;
                    active[73]=1;
                    ends[73]=1;
                    break RUN;
                  }
                  else {
                    S148322=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 590, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 590, column: 11
                      S148322=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 590, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 590, column: 11
                        ends[73]=2;
                        ;//sysj\conveyor_controller.sysj line: 590, column: 11
                        S154083=1;
                        thread212981(tdone,ends);
                        thread212982(tdone,ends);
                        thread212983(tdone,ends);
                        thread212987(tdone,ends);
                        int biggest212991 = 0;
                        if(ends[74]>=biggest212991){
                          biggest212991=ends[74];
                        }
                        if(ends[80]>=biggest212991){
                          biggest212991=ends[80];
                        }
                        if(ends[81]>=biggest212991){
                          biggest212991=ends[81];
                        }
                        if(ends[84]>=biggest212991){
                          biggest212991=ends[84];
                        }
                        if(biggest212991 == 1){
                          active[73]=1;
                          ends[73]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[73]=1;
                        ends[73]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[73]=1;
                      ends[73]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread212992(tdone,ends);
              thread213007(tdone,ends);
              thread213008(tdone,ends);
              thread213015(tdone,ends);
              int biggest213022 = 0;
              if(ends[74]>=biggest213022){
                biggest213022=ends[74];
              }
              if(ends[80]>=biggest213022){
                biggest213022=ends[80];
              }
              if(ends[81]>=biggest213022){
                biggest213022=ends[81];
              }
              if(ends[84]>=biggest213022){
                biggest213022=ends[84];
              }
              if(biggest213022 == 1){
                active[73]=1;
                ends[73]=1;
                break RUN;
              }
              //FINXME code
              if(biggest213022 == 0){
                S154084=0;
                active[73]=0;
                ends[73]=0;
                S154084=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos4_73 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[73] != 0){
      int index = 73;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[73]!=0 || suspended[73]!=0 || active[73]!=1);
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
      bottleAtPos4_73.setpreclear();
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
      bottleAtPos4_73.setClear();
      simCapper_in.sethook();
      capperReady_o.sethook();
      if(paused[73]!=0 || suspended[73]!=0 || active[73]!=1);
      else{
        simCapper_in.gethook();
        capperReady_o.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[73] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
