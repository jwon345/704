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
  private int S154244 = 1;
  private int S154243 = 1;
  private int S148487 = 1;
  private int S148482 = 1;
  private int S149784 = 1;
  private int S148505 = 1;
  private int S148512 = 1;
  private int S148507 = 1;
  private int S148574 = 1;
  private int S148609 = 1;
  private int S148576 = 1;
  private int S148581 = 1;
  private int S148589 = 1;
  private int S148592 = 1;
  private int S148661 = 1;
  private int S148656 = 1;
  private int S148712 = 1;
  private int S149867 = 1;
  private int S149811 = 1;
  private int S149791 = 1;
  private int S149786 = 1;
  private int S149902 = 1;
  private int S149878 = 1;
  private int S149872 = 1;
  private int S149875 = 1;
  private int S149937 = 1;
  private int S149913 = 1;
  private int S149907 = 1;
  private int S149910 = 1;
  
  private int[] ends = new int[100];
  private int[] tdone = new int[100];
  
  public void thread213180(int [] tdone, int [] ends){
        S149910=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread213179(int [] tdone, int [] ends){
        S149907=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 709, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread213177(int [] tdone, int [] ends){
        switch(S149910){
      case 0 : 
        active[86]=0;
        ends[86]=0;
        tdone[86]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 713, column: 36
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

  public void thread213176(int [] tdone, int [] ends){
        switch(S149907){
      case 0 : 
        active[85]=0;
        ends[85]=0;
        tdone[85]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 709, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[85]=1;
        ends[85]=1;
        tdone[85]=1;
        break;
      
    }
  }

  public void thread213175(int [] tdone, int [] ends){
        switch(S149937){
      case 0 : 
        active[84]=0;
        ends[84]=0;
        tdone[84]=1;
        break;
      
      case 1 : 
        switch(S149913){
          case 0 : 
            thread213176(tdone,ends);
            thread213177(tdone,ends);
            int biggest213178 = 0;
            if(ends[85]>=biggest213178){
              biggest213178=ends[85];
            }
            if(ends[86]>=biggest213178){
              biggest213178=ends[86];
            }
            if(biggest213178 == 1){
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            if(biggest213178 == 2){
              ends[84]=2;
              ;//sysj\conveyor_controller.sysj line: 707, column: 19
              S149913=1;
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            //FINXME code
            if(biggest213178 == 0){
              S149913=1;
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            break;
          
          case 1 : 
            S149913=1;
            S149913=0;
            if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 706, column: 27
              thread213179(tdone,ends);
              thread213180(tdone,ends);
              int biggest213181 = 0;
              if(ends[85]>=biggest213181){
                biggest213181=ends[85];
              }
              if(ends[86]>=biggest213181){
                biggest213181=ends[86];
              }
              if(biggest213181 == 1){
                active[84]=1;
                ends[84]=1;
                tdone[84]=1;
              }
            }
            else {
              S149913=1;
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread213173(int [] tdone, int [] ends){
        S149875=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread213172(int [] tdone, int [] ends){
        S149872=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 690, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread213170(int [] tdone, int [] ends){
        switch(S149875){
      case 0 : 
        active[83]=0;
        ends[83]=0;
        tdone[83]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 694, column: 37
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

  public void thread213169(int [] tdone, int [] ends){
        switch(S149872){
      case 0 : 
        active[82]=0;
        ends[82]=0;
        tdone[82]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 690, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[82]=1;
        ends[82]=1;
        tdone[82]=1;
        break;
      
    }
  }

  public void thread213168(int [] tdone, int [] ends){
        switch(S149902){
      case 0 : 
        active[81]=0;
        ends[81]=0;
        tdone[81]=1;
        break;
      
      case 1 : 
        switch(S149878){
          case 0 : 
            thread213169(tdone,ends);
            thread213170(tdone,ends);
            int biggest213171 = 0;
            if(ends[82]>=biggest213171){
              biggest213171=ends[82];
            }
            if(ends[83]>=biggest213171){
              biggest213171=ends[83];
            }
            if(biggest213171 == 1){
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            if(biggest213171 == 2){
              ends[81]=2;
              ;//sysj\conveyor_controller.sysj line: 688, column: 20
              S149878=1;
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            //FINXME code
            if(biggest213171 == 0){
              S149878=1;
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            break;
          
          case 1 : 
            S149878=1;
            S149878=0;
            if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 687, column: 39
              thread213172(tdone,ends);
              thread213173(tdone,ends);
              int biggest213174 = 0;
              if(ends[82]>=biggest213174){
                biggest213174=ends[82];
              }
              if(ends[83]>=biggest213174){
                biggest213174=ends[83];
              }
              if(biggest213174 == 1){
                active[81]=1;
                ends[81]=1;
                tdone[81]=1;
              }
            }
            else {
              S149878=1;
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread213167(int [] tdone, int [] ends){
        switch(S149867){
      case 0 : 
        active[80]=0;
        ends[80]=0;
        tdone[80]=1;
        break;
      
      case 1 : 
        switch(S149811){
          case 0 : 
            switch(S149791){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 677, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 677, column: 13
                  S149791=1;
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
                else {
                  switch(S149786){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 677, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 677, column: 13
                        S149786=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 677, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 677, column: 13
                          ends[80]=2;
                          ;//sysj\conveyor_controller.sysj line: 677, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 678, column: 16
                            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 679, column: 14
                            currsigs.addElement(bottleAtPos4_73);
                            S149811=1;
                            active[80]=1;
                            ends[80]=1;
                            tdone[80]=1;
                          }
                          else {
                            S149811=1;
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
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 677, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 677, column: 13
                        ends[80]=2;
                        ;//sysj\conveyor_controller.sysj line: 677, column: 13
                        if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 678, column: 16
                          bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 679, column: 14
                          currsigs.addElement(bottleAtPos4_73);
                          S149811=1;
                          active[80]=1;
                          ends[80]=1;
                          tdone[80]=1;
                        }
                        else {
                          S149811=1;
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
                S149791=1;
                S149791=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 677, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 677, column: 13
                  S149791=1;
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
                else {
                  S149786=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 677, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 677, column: 13
                    S149786=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 677, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 677, column: 13
                      ends[80]=2;
                      ;//sysj\conveyor_controller.sysj line: 677, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 678, column: 16
                        bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 679, column: 14
                        currsigs.addElement(bottleAtPos4_73);
                        S149811=1;
                        active[80]=1;
                        ends[80]=1;
                        tdone[80]=1;
                      }
                      else {
                        S149811=1;
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
            S149811=1;
            S149811=0;
            S149791=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 677, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 677, column: 13
              S149791=1;
              active[80]=1;
              ends[80]=1;
              tdone[80]=1;
            }
            else {
              S149786=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 677, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 677, column: 13
                S149786=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 677, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 677, column: 13
                  ends[80]=2;
                  ;//sysj\conveyor_controller.sysj line: 677, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 678, column: 16
                    bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 679, column: 14
                    currsigs.addElement(bottleAtPos4_73);
                    S149811=1;
                    active[80]=1;
                    ends[80]=1;
                    tdone[80]=1;
                  }
                  else {
                    S149811=1;
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

  public void thread213164(int [] tdone, int [] ends){
        switch(S148592){
      case 0 : 
        active[79]=0;
        ends[79]=0;
        tdone[79]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 650, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 651, column: 16
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

  public void thread213163(int [] tdone, int [] ends){
        switch(S148589){
      case 0 : 
        active[78]=0;
        ends[78]=0;
        tdone[78]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 646, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[78]=1;
        ends[78]=1;
        tdone[78]=1;
        break;
      
    }
  }

  public void thread213162(int [] tdone, int [] ends){
        switch(S148581){
      case 0 : 
        active[77]=0;
        ends[77]=0;
        tdone[77]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 641, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[77]=1;
        ends[77]=1;
        tdone[77]=1;
        break;
      
    }
  }

  public void thread213160(int [] tdone, int [] ends){
        S148592=1;
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread213159(int [] tdone, int [] ends){
        S148589=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 645, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 646, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void thread213158(int [] tdone, int [] ends){
        S148581=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 641, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread213157(int [] tdone, int [] ends){
        switch(S148609){
      case 0 : 
        active[76]=0;
        ends[76]=0;
        tdone[76]=1;
        break;
      
      case 1 : 
        switch(S148576){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 638, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 639, column: 15
              S148576=1;
              thread213158(tdone,ends);
              thread213159(tdone,ends);
              thread213160(tdone,ends);
              int biggest213161 = 0;
              if(ends[77]>=biggest213161){
                biggest213161=ends[77];
              }
              if(ends[78]>=biggest213161){
                biggest213161=ends[78];
              }
              if(ends[79]>=biggest213161){
                biggest213161=ends[79];
              }
              if(biggest213161 == 1){
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
            thread213162(tdone,ends);
            thread213163(tdone,ends);
            thread213164(tdone,ends);
            int biggest213165 = 0;
            if(ends[77]>=biggest213165){
              biggest213165=ends[77];
            }
            if(ends[78]>=biggest213165){
              biggest213165=ends[78];
            }
            if(ends[79]>=biggest213165){
              biggest213165=ends[79];
            }
            if(biggest213165 == 1){
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            if(biggest213165 == 2){
              ends[76]=2;
              tdone[76]=1;
            }
            //FINXME code
            if(biggest213165 == 0){
              S148609=0;
              active[76]=0;
              ends[76]=0;
              tdone[76]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread213156(int [] tdone, int [] ends){
        switch(S148574){
      case 0 : 
        active[75]=0;
        ends[75]=0;
        tdone[75]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 634, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
        break;
      
    }
  }

  public void thread213154(int [] tdone, int [] ends){
        S148609=1;
    S148576=0;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread213153(int [] tdone, int [] ends){
        S148574=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 634, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread213152(int [] tdone, int [] ends){
        switch(S149784){
      case 0 : 
        active[74]=0;
        ends[74]=0;
        tdone[74]=1;
        break;
      
      case 1 : 
        switch(S148505){
          case 0 : 
            if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 613, column: 19
              S148505=1;
              S148512=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 614, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 614, column: 13
                S148512=1;
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
              else {
                S148507=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 614, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 614, column: 13
                  S148507=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 614, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 614, column: 13
                    ends[74]=2;
                    ;//sysj\conveyor_controller.sysj line: 614, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 615, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 616, column: 13
                    S148505=2;
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
            switch(S148512){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 614, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 614, column: 13
                  S148512=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  switch(S148507){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 614, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 614, column: 13
                        S148507=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 614, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 614, column: 13
                          ends[74]=2;
                          ;//sysj\conveyor_controller.sysj line: 614, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 615, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 616, column: 13
                          S148505=2;
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
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 614, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 614, column: 13
                        ends[74]=2;
                        ;//sysj\conveyor_controller.sysj line: 614, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 615, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 616, column: 13
                        S148505=2;
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
                S148512=1;
                S148512=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 614, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 614, column: 13
                  S148512=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  S148507=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 614, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 614, column: 13
                    S148507=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 614, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 614, column: 13
                      ends[74]=2;
                      ;//sysj\conveyor_controller.sysj line: 614, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 615, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 616, column: 13
                      S148505=2;
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
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 617, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 621, column: 13
              S148505=3;
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
            S148505=3;
            S148505=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 627, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 628, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 625, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 630, column: 13
              S148505=5;
              thread213153(tdone,ends);
              thread213154(tdone,ends);
              int biggest213155 = 0;
              if(ends[75]>=biggest213155){
                biggest213155=ends[75];
              }
              if(ends[76]>=biggest213155){
                biggest213155=ends[76];
              }
              if(biggest213155 == 1){
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 628, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 5 : 
            thread213156(tdone,ends);
            thread213157(tdone,ends);
            int biggest213166 = 0;
            if(ends[75]>=biggest213166){
              biggest213166=ends[75];
            }
            if(ends[76]>=biggest213166){
              biggest213166=ends[76];
            }
            if(biggest213166 == 1){
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            if(biggest213166 == 2){
              ends[74]=2;
              ;//sysj\conveyor_controller.sysj line: 633, column: 13
              S148505=6;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            //FINXME code
            if(biggest213166 == 0){
              S148505=6;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 657, column: 19
              S148505=7;
              S148661=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 659, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 659, column: 13
                S148661=1;
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
              else {
                S148656=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 659, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 659, column: 13
                  S148656=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 659, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 659, column: 13
                    ends[74]=2;
                    ;//sysj\conveyor_controller.sysj line: 659, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 660, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 661, column: 13
                    S148505=8;
                    S148712=0;
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
            switch(S148661){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 659, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 659, column: 13
                  S148661=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  switch(S148656){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 659, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 659, column: 13
                        S148656=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 659, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 659, column: 13
                          ends[74]=2;
                          ;//sysj\conveyor_controller.sysj line: 659, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 660, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 661, column: 13
                          S148505=8;
                          S148712=0;
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
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 659, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 659, column: 13
                        ends[74]=2;
                        ;//sysj\conveyor_controller.sysj line: 659, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 660, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 661, column: 13
                        S148505=8;
                        S148712=0;
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
                S148661=1;
                S148661=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 659, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 659, column: 13
                  S148661=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  S148656=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 659, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 659, column: 13
                    S148656=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 659, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 659, column: 13
                      ends[74]=2;
                      ;//sysj\conveyor_controller.sysj line: 659, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 660, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 661, column: 13
                      S148505=8;
                      S148712=0;
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
            switch(S148712){
              case 0 : 
                if(!bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 662, column: 29
                  S148712=1;
                  if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 664, column: 23
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
                  }
                  else {
                    ends[74]=2;
                    ;//sysj\conveyor_controller.sysj line: 662, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 612, column: 13
                    S148505=0;
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
                if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 664, column: 23
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  ends[74]=2;
                  ;//sysj\conveyor_controller.sysj line: 662, column: 13
                  System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 612, column: 13
                  S148505=0;
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

  public void thread213149(int [] tdone, int [] ends){
        S149910=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread213148(int [] tdone, int [] ends){
        S149907=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 709, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread213147(int [] tdone, int [] ends){
        S149937=1;
    S149913=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 706, column: 27
      thread213148(tdone,ends);
      thread213149(tdone,ends);
      int biggest213150 = 0;
      if(ends[85]>=biggest213150){
        biggest213150=ends[85];
      }
      if(ends[86]>=biggest213150){
        biggest213150=ends[86];
      }
      if(biggest213150 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S149913=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread213145(int [] tdone, int [] ends){
        S149875=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread213144(int [] tdone, int [] ends){
        S149872=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 690, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread213143(int [] tdone, int [] ends){
        S149902=1;
    S149878=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 687, column: 39
      thread213144(tdone,ends);
      thread213145(tdone,ends);
      int biggest213146 = 0;
      if(ends[82]>=biggest213146){
        biggest213146=ends[82];
      }
      if(ends[83]>=biggest213146){
        biggest213146=ends[83];
      }
      if(biggest213146 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S149878=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread213142(int [] tdone, int [] ends){
        S149867=1;
    S149811=0;
    S149791=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 677, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 677, column: 13
      S149791=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S149786=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 677, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 677, column: 13
        S149786=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 677, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 677, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 677, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 678, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 679, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S149811=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S149811=1;
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

  public void thread213141(int [] tdone, int [] ends){
        S149784=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 612, column: 13
    S148505=0;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread213138(int [] tdone, int [] ends){
        S149910=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread213137(int [] tdone, int [] ends){
        S149907=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 709, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread213136(int [] tdone, int [] ends){
        S149937=1;
    S149913=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 706, column: 27
      thread213137(tdone,ends);
      thread213138(tdone,ends);
      int biggest213139 = 0;
      if(ends[85]>=biggest213139){
        biggest213139=ends[85];
      }
      if(ends[86]>=biggest213139){
        biggest213139=ends[86];
      }
      if(biggest213139 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S149913=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread213134(int [] tdone, int [] ends){
        S149875=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread213133(int [] tdone, int [] ends){
        S149872=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 690, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread213132(int [] tdone, int [] ends){
        S149902=1;
    S149878=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 687, column: 39
      thread213133(tdone,ends);
      thread213134(tdone,ends);
      int biggest213135 = 0;
      if(ends[82]>=biggest213135){
        biggest213135=ends[82];
      }
      if(ends[83]>=biggest213135){
        biggest213135=ends[83];
      }
      if(biggest213135 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S149878=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread213131(int [] tdone, int [] ends){
        S149867=1;
    S149811=0;
    S149791=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 677, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 677, column: 13
      S149791=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S149786=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 677, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 677, column: 13
        S149786=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 677, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 677, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 677, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 678, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 679, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S149811=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S149811=1;
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

  public void thread213130(int [] tdone, int [] ends){
        S149784=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 612, column: 13
    S148505=0;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread213127(int [] tdone, int [] ends){
        S149910=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread213126(int [] tdone, int [] ends){
        S149907=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 709, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread213125(int [] tdone, int [] ends){
        S149937=1;
    S149913=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 706, column: 27
      thread213126(tdone,ends);
      thread213127(tdone,ends);
      int biggest213128 = 0;
      if(ends[85]>=biggest213128){
        biggest213128=ends[85];
      }
      if(ends[86]>=biggest213128){
        biggest213128=ends[86];
      }
      if(biggest213128 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S149913=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread213123(int [] tdone, int [] ends){
        S149875=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread213122(int [] tdone, int [] ends){
        S149872=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 690, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread213121(int [] tdone, int [] ends){
        S149902=1;
    S149878=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 687, column: 39
      thread213122(tdone,ends);
      thread213123(tdone,ends);
      int biggest213124 = 0;
      if(ends[82]>=biggest213124){
        biggest213124=ends[82];
      }
      if(ends[83]>=biggest213124){
        biggest213124=ends[83];
      }
      if(biggest213124 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S149878=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread213120(int [] tdone, int [] ends){
        S149867=1;
    S149811=0;
    S149791=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 677, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 677, column: 13
      S149791=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S149786=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 677, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 677, column: 13
        S149786=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 677, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 677, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 677, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 678, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 679, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S149811=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S149811=1;
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

  public void thread213119(int [] tdone, int [] ends){
        S149784=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 612, column: 13
    S148505=0;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread213116(int [] tdone, int [] ends){
        S149910=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread213115(int [] tdone, int [] ends){
        S149907=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 709, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread213114(int [] tdone, int [] ends){
        S149937=1;
    S149913=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 706, column: 27
      thread213115(tdone,ends);
      thread213116(tdone,ends);
      int biggest213117 = 0;
      if(ends[85]>=biggest213117){
        biggest213117=ends[85];
      }
      if(ends[86]>=biggest213117){
        biggest213117=ends[86];
      }
      if(biggest213117 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S149913=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread213112(int [] tdone, int [] ends){
        S149875=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread213111(int [] tdone, int [] ends){
        S149872=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 690, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread213110(int [] tdone, int [] ends){
        S149902=1;
    S149878=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 687, column: 39
      thread213111(tdone,ends);
      thread213112(tdone,ends);
      int biggest213113 = 0;
      if(ends[82]>=biggest213113){
        biggest213113=ends[82];
      }
      if(ends[83]>=biggest213113){
        biggest213113=ends[83];
      }
      if(biggest213113 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S149878=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread213109(int [] tdone, int [] ends){
        S149867=1;
    S149811=0;
    S149791=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 677, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 677, column: 13
      S149791=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S149786=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 677, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 677, column: 13
        S149786=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 677, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 677, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 677, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 678, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 679, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S149811=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S149811=1;
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

  public void thread213108(int [] tdone, int [] ends){
        S149784=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 612, column: 13
    S148505=0;
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
      switch(S154244){
        case 0 : 
          S154244=0;
          break RUN;
        
        case 1 : 
          S154244=2;
          S154244=2;
          bottleAtPos4_73.setClear();//sysj\conveyor_controller.sysj line: 606, column: 11
          S154243=0;
          S148487=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 607, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 607, column: 11
            S148487=1;
            active[73]=1;
            ends[73]=1;
            break RUN;
          }
          else {
            S148482=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 607, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 607, column: 11
              S148482=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 607, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 607, column: 11
                ends[73]=2;
                ;//sysj\conveyor_controller.sysj line: 607, column: 11
                S154243=1;
                thread213108(tdone,ends);
                thread213109(tdone,ends);
                thread213110(tdone,ends);
                thread213114(tdone,ends);
                int biggest213118 = 0;
                if(ends[74]>=biggest213118){
                  biggest213118=ends[74];
                }
                if(ends[80]>=biggest213118){
                  biggest213118=ends[80];
                }
                if(ends[81]>=biggest213118){
                  biggest213118=ends[81];
                }
                if(ends[84]>=biggest213118){
                  biggest213118=ends[84];
                }
                if(biggest213118 == 1){
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
          bottleAtPos4_73.setClear();//sysj\conveyor_controller.sysj line: 606, column: 11
          switch(S154243){
            case 0 : 
              switch(S148487){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 607, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 607, column: 11
                    S148487=1;
                    active[73]=1;
                    ends[73]=1;
                    break RUN;
                  }
                  else {
                    switch(S148482){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 607, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 607, column: 11
                          S148482=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 607, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 607, column: 11
                            ends[73]=2;
                            ;//sysj\conveyor_controller.sysj line: 607, column: 11
                            S154243=1;
                            thread213119(tdone,ends);
                            thread213120(tdone,ends);
                            thread213121(tdone,ends);
                            thread213125(tdone,ends);
                            int biggest213129 = 0;
                            if(ends[74]>=biggest213129){
                              biggest213129=ends[74];
                            }
                            if(ends[80]>=biggest213129){
                              biggest213129=ends[80];
                            }
                            if(ends[81]>=biggest213129){
                              biggest213129=ends[81];
                            }
                            if(ends[84]>=biggest213129){
                              biggest213129=ends[84];
                            }
                            if(biggest213129 == 1){
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
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 607, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 607, column: 11
                          ends[73]=2;
                          ;//sysj\conveyor_controller.sysj line: 607, column: 11
                          S154243=1;
                          thread213130(tdone,ends);
                          thread213131(tdone,ends);
                          thread213132(tdone,ends);
                          thread213136(tdone,ends);
                          int biggest213140 = 0;
                          if(ends[74]>=biggest213140){
                            biggest213140=ends[74];
                          }
                          if(ends[80]>=biggest213140){
                            biggest213140=ends[80];
                          }
                          if(ends[81]>=biggest213140){
                            biggest213140=ends[81];
                          }
                          if(ends[84]>=biggest213140){
                            biggest213140=ends[84];
                          }
                          if(biggest213140 == 1){
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
                  S148487=1;
                  S148487=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 607, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 607, column: 11
                    S148487=1;
                    active[73]=1;
                    ends[73]=1;
                    break RUN;
                  }
                  else {
                    S148482=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 607, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 607, column: 11
                      S148482=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 607, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 607, column: 11
                        ends[73]=2;
                        ;//sysj\conveyor_controller.sysj line: 607, column: 11
                        S154243=1;
                        thread213141(tdone,ends);
                        thread213142(tdone,ends);
                        thread213143(tdone,ends);
                        thread213147(tdone,ends);
                        int biggest213151 = 0;
                        if(ends[74]>=biggest213151){
                          biggest213151=ends[74];
                        }
                        if(ends[80]>=biggest213151){
                          biggest213151=ends[80];
                        }
                        if(ends[81]>=biggest213151){
                          biggest213151=ends[81];
                        }
                        if(ends[84]>=biggest213151){
                          biggest213151=ends[84];
                        }
                        if(biggest213151 == 1){
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
              thread213152(tdone,ends);
              thread213167(tdone,ends);
              thread213168(tdone,ends);
              thread213175(tdone,ends);
              int biggest213182 = 0;
              if(ends[74]>=biggest213182){
                biggest213182=ends[74];
              }
              if(ends[80]>=biggest213182){
                biggest213182=ends[80];
              }
              if(ends[81]>=biggest213182){
                biggest213182=ends[81];
              }
              if(ends[84]>=biggest213182){
                biggest213182=ends[84];
              }
              if(biggest213182 == 1){
                active[73]=1;
                ends[73]=1;
                break RUN;
              }
              //FINXME code
              if(biggest213182 == 0){
                S154244=0;
                active[73]=0;
                ends[73]=0;
                S154244=0;
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
