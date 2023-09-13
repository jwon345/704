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
  private int S143444 = 1;
  private int S143443 = 1;
  private int S137687 = 1;
  private int S137682 = 1;
  private int S138984 = 1;
  private int S137705 = 1;
  private int S137712 = 1;
  private int S137707 = 1;
  private int S137774 = 1;
  private int S137809 = 1;
  private int S137776 = 1;
  private int S137781 = 1;
  private int S137789 = 1;
  private int S137792 = 1;
  private int S137861 = 1;
  private int S137856 = 1;
  private int S137912 = 1;
  private int S139067 = 1;
  private int S139011 = 1;
  private int S138991 = 1;
  private int S138986 = 1;
  private int S139102 = 1;
  private int S139078 = 1;
  private int S139072 = 1;
  private int S139075 = 1;
  private int S139137 = 1;
  private int S139113 = 1;
  private int S139107 = 1;
  private int S139110 = 1;
  
  private int[] ends = new int[100];
  private int[] tdone = new int[100];
  
  public void thread202375(int [] tdone, int [] ends){
        S139110=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread202374(int [] tdone, int [] ends){
        S139107=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 694, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread202372(int [] tdone, int [] ends){
        switch(S139110){
      case 0 : 
        active[86]=0;
        ends[86]=0;
        tdone[86]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 698, column: 36
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

  public void thread202371(int [] tdone, int [] ends){
        switch(S139107){
      case 0 : 
        active[85]=0;
        ends[85]=0;
        tdone[85]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 694, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[85]=1;
        ends[85]=1;
        tdone[85]=1;
        break;
      
    }
  }

  public void thread202370(int [] tdone, int [] ends){
        switch(S139137){
      case 0 : 
        active[84]=0;
        ends[84]=0;
        tdone[84]=1;
        break;
      
      case 1 : 
        switch(S139113){
          case 0 : 
            thread202371(tdone,ends);
            thread202372(tdone,ends);
            int biggest202373 = 0;
            if(ends[85]>=biggest202373){
              biggest202373=ends[85];
            }
            if(ends[86]>=biggest202373){
              biggest202373=ends[86];
            }
            if(biggest202373 == 1){
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            if(biggest202373 == 2){
              ends[84]=2;
              ;//sysj\conveyor_controller.sysj line: 692, column: 19
              S139113=1;
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            //FINXME code
            if(biggest202373 == 0){
              S139113=1;
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            break;
          
          case 1 : 
            S139113=1;
            S139113=0;
            if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 691, column: 27
              thread202374(tdone,ends);
              thread202375(tdone,ends);
              int biggest202376 = 0;
              if(ends[85]>=biggest202376){
                biggest202376=ends[85];
              }
              if(ends[86]>=biggest202376){
                biggest202376=ends[86];
              }
              if(biggest202376 == 1){
                active[84]=1;
                ends[84]=1;
                tdone[84]=1;
              }
            }
            else {
              S139113=1;
              active[84]=1;
              ends[84]=1;
              tdone[84]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202368(int [] tdone, int [] ends){
        S139075=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread202367(int [] tdone, int [] ends){
        S139072=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 675, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread202365(int [] tdone, int [] ends){
        switch(S139075){
      case 0 : 
        active[83]=0;
        ends[83]=0;
        tdone[83]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 679, column: 37
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

  public void thread202364(int [] tdone, int [] ends){
        switch(S139072){
      case 0 : 
        active[82]=0;
        ends[82]=0;
        tdone[82]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 675, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[82]=1;
        ends[82]=1;
        tdone[82]=1;
        break;
      
    }
  }

  public void thread202363(int [] tdone, int [] ends){
        switch(S139102){
      case 0 : 
        active[81]=0;
        ends[81]=0;
        tdone[81]=1;
        break;
      
      case 1 : 
        switch(S139078){
          case 0 : 
            thread202364(tdone,ends);
            thread202365(tdone,ends);
            int biggest202366 = 0;
            if(ends[82]>=biggest202366){
              biggest202366=ends[82];
            }
            if(ends[83]>=biggest202366){
              biggest202366=ends[83];
            }
            if(biggest202366 == 1){
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            if(biggest202366 == 2){
              ends[81]=2;
              ;//sysj\conveyor_controller.sysj line: 673, column: 20
              S139078=1;
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            //FINXME code
            if(biggest202366 == 0){
              S139078=1;
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            break;
          
          case 1 : 
            S139078=1;
            S139078=0;
            if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 672, column: 39
              thread202367(tdone,ends);
              thread202368(tdone,ends);
              int biggest202369 = 0;
              if(ends[82]>=biggest202369){
                biggest202369=ends[82];
              }
              if(ends[83]>=biggest202369){
                biggest202369=ends[83];
              }
              if(biggest202369 == 1){
                active[81]=1;
                ends[81]=1;
                tdone[81]=1;
              }
            }
            else {
              S139078=1;
              active[81]=1;
              ends[81]=1;
              tdone[81]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202362(int [] tdone, int [] ends){
        switch(S139067){
      case 0 : 
        active[80]=0;
        ends[80]=0;
        tdone[80]=1;
        break;
      
      case 1 : 
        switch(S139011){
          case 0 : 
            switch(S138991){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 662, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                  S138991=1;
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
                else {
                  switch(S138986){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 662, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 662, column: 13
                        S138986=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 662, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                          ends[80]=2;
                          ;//sysj\conveyor_controller.sysj line: 662, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 663, column: 16
                            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 664, column: 14
                            currsigs.addElement(bottleAtPos4_73);
                            S139011=1;
                            active[80]=1;
                            ends[80]=1;
                            tdone[80]=1;
                          }
                          else {
                            S139011=1;
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
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 662, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                        ends[80]=2;
                        ;//sysj\conveyor_controller.sysj line: 662, column: 13
                        if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 663, column: 16
                          bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 664, column: 14
                          currsigs.addElement(bottleAtPos4_73);
                          S139011=1;
                          active[80]=1;
                          ends[80]=1;
                          tdone[80]=1;
                        }
                        else {
                          S139011=1;
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
                S138991=1;
                S138991=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 662, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                  S138991=1;
                  active[80]=1;
                  ends[80]=1;
                  tdone[80]=1;
                }
                else {
                  S138986=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 662, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 662, column: 13
                    S138986=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 662, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                      ends[80]=2;
                      ;//sysj\conveyor_controller.sysj line: 662, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 663, column: 16
                        bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 664, column: 14
                        currsigs.addElement(bottleAtPos4_73);
                        S139011=1;
                        active[80]=1;
                        ends[80]=1;
                        tdone[80]=1;
                      }
                      else {
                        S139011=1;
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
            S139011=1;
            S139011=0;
            S138991=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 662, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 662, column: 13
              S138991=1;
              active[80]=1;
              ends[80]=1;
              tdone[80]=1;
            }
            else {
              S138986=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 662, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 662, column: 13
                S138986=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 662, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 662, column: 13
                  ends[80]=2;
                  ;//sysj\conveyor_controller.sysj line: 662, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 663, column: 16
                    bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 664, column: 14
                    currsigs.addElement(bottleAtPos4_73);
                    S139011=1;
                    active[80]=1;
                    ends[80]=1;
                    tdone[80]=1;
                  }
                  else {
                    S139011=1;
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

  public void thread202359(int [] tdone, int [] ends){
        switch(S137792){
      case 0 : 
        active[79]=0;
        ends[79]=0;
        tdone[79]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 635, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 636, column: 16
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

  public void thread202358(int [] tdone, int [] ends){
        switch(S137789){
      case 0 : 
        active[78]=0;
        ends[78]=0;
        tdone[78]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 631, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[78]=1;
        ends[78]=1;
        tdone[78]=1;
        break;
      
    }
  }

  public void thread202357(int [] tdone, int [] ends){
        switch(S137781){
      case 0 : 
        active[77]=0;
        ends[77]=0;
        tdone[77]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 626, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[77]=1;
        ends[77]=1;
        tdone[77]=1;
        break;
      
    }
  }

  public void thread202355(int [] tdone, int [] ends){
        S137792=1;
    active[79]=1;
    ends[79]=1;
    tdone[79]=1;
  }

  public void thread202354(int [] tdone, int [] ends){
        S137789=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 630, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 631, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[78]=1;
    ends[78]=1;
    tdone[78]=1;
  }

  public void thread202353(int [] tdone, int [] ends){
        S137781=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 626, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread202352(int [] tdone, int [] ends){
        switch(S137809){
      case 0 : 
        active[76]=0;
        ends[76]=0;
        tdone[76]=1;
        break;
      
      case 1 : 
        switch(S137776){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 623, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 624, column: 15
              S137776=1;
              thread202353(tdone,ends);
              thread202354(tdone,ends);
              thread202355(tdone,ends);
              int biggest202356 = 0;
              if(ends[77]>=biggest202356){
                biggest202356=ends[77];
              }
              if(ends[78]>=biggest202356){
                biggest202356=ends[78];
              }
              if(ends[79]>=biggest202356){
                biggest202356=ends[79];
              }
              if(biggest202356 == 1){
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
            thread202357(tdone,ends);
            thread202358(tdone,ends);
            thread202359(tdone,ends);
            int biggest202360 = 0;
            if(ends[77]>=biggest202360){
              biggest202360=ends[77];
            }
            if(ends[78]>=biggest202360){
              biggest202360=ends[78];
            }
            if(ends[79]>=biggest202360){
              biggest202360=ends[79];
            }
            if(biggest202360 == 1){
              active[76]=1;
              ends[76]=1;
              tdone[76]=1;
            }
            if(biggest202360 == 2){
              ends[76]=2;
              tdone[76]=1;
            }
            //FINXME code
            if(biggest202360 == 0){
              S137809=0;
              active[76]=0;
              ends[76]=0;
              tdone[76]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread202351(int [] tdone, int [] ends){
        switch(S137774){
      case 0 : 
        active[75]=0;
        ends[75]=0;
        tdone[75]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 619, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
        break;
      
    }
  }

  public void thread202349(int [] tdone, int [] ends){
        S137809=1;
    S137776=0;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread202348(int [] tdone, int [] ends){
        S137774=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 619, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread202347(int [] tdone, int [] ends){
        switch(S138984){
      case 0 : 
        active[74]=0;
        ends[74]=0;
        tdone[74]=1;
        break;
      
      case 1 : 
        switch(S137705){
          case 0 : 
            if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 598, column: 19
              S137705=1;
              S137712=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 599, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 599, column: 13
                S137712=1;
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
              else {
                S137707=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 599, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 599, column: 13
                  S137707=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 599, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 599, column: 13
                    ends[74]=2;
                    ;//sysj\conveyor_controller.sysj line: 599, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 600, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 601, column: 13
                    S137705=2;
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
            switch(S137712){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 599, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 599, column: 13
                  S137712=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  switch(S137707){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 599, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 599, column: 13
                        S137707=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 599, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 599, column: 13
                          ends[74]=2;
                          ;//sysj\conveyor_controller.sysj line: 599, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 600, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 601, column: 13
                          S137705=2;
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
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 599, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 599, column: 13
                        ends[74]=2;
                        ;//sysj\conveyor_controller.sysj line: 599, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 600, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 601, column: 13
                        S137705=2;
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
                S137712=1;
                S137712=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 599, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 599, column: 13
                  S137712=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  S137707=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 599, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 599, column: 13
                    S137707=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 599, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 599, column: 13
                      ends[74]=2;
                      ;//sysj\conveyor_controller.sysj line: 599, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 600, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 601, column: 13
                      S137705=2;
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
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 602, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 606, column: 13
              S137705=3;
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
            S137705=3;
            S137705=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 612, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 613, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 610, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 615, column: 13
              S137705=5;
              thread202348(tdone,ends);
              thread202349(tdone,ends);
              int biggest202350 = 0;
              if(ends[75]>=biggest202350){
                biggest202350=ends[75];
              }
              if(ends[76]>=biggest202350){
                biggest202350=ends[76];
              }
              if(biggest202350 == 1){
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 613, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 5 : 
            thread202351(tdone,ends);
            thread202352(tdone,ends);
            int biggest202361 = 0;
            if(ends[75]>=biggest202361){
              biggest202361=ends[75];
            }
            if(ends[76]>=biggest202361){
              biggest202361=ends[76];
            }
            if(biggest202361 == 1){
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            if(biggest202361 == 2){
              ends[74]=2;
              ;//sysj\conveyor_controller.sysj line: 618, column: 13
              S137705=6;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            //FINXME code
            if(biggest202361 == 0){
              S137705=6;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 642, column: 19
              S137705=7;
              S137861=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 644, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 644, column: 13
                S137861=1;
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
              else {
                S137856=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 644, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 644, column: 13
                  S137856=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 644, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 644, column: 13
                    ends[74]=2;
                    ;//sysj\conveyor_controller.sysj line: 644, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 645, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 646, column: 13
                    S137705=8;
                    S137912=0;
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
            switch(S137861){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 644, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 644, column: 13
                  S137861=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  switch(S137856){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 644, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 644, column: 13
                        S137856=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 644, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 644, column: 13
                          ends[74]=2;
                          ;//sysj\conveyor_controller.sysj line: 644, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 645, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 646, column: 13
                          S137705=8;
                          S137912=0;
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
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 644, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 644, column: 13
                        ends[74]=2;
                        ;//sysj\conveyor_controller.sysj line: 644, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 645, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 646, column: 13
                        S137705=8;
                        S137912=0;
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
                S137861=1;
                S137861=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 644, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 644, column: 13
                  S137861=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  S137856=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 644, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 644, column: 13
                    S137856=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 644, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 644, column: 13
                      ends[74]=2;
                      ;//sysj\conveyor_controller.sysj line: 644, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 645, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 646, column: 13
                      S137705=8;
                      S137912=0;
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
            switch(S137912){
              case 0 : 
                if(!bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 647, column: 29
                  S137912=1;
                  if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 649, column: 23
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
                  }
                  else {
                    ends[74]=2;
                    ;//sysj\conveyor_controller.sysj line: 647, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 597, column: 13
                    S137705=0;
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
                if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 649, column: 23
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  ends[74]=2;
                  ;//sysj\conveyor_controller.sysj line: 647, column: 13
                  System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 597, column: 13
                  S137705=0;
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

  public void thread202344(int [] tdone, int [] ends){
        S139110=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread202343(int [] tdone, int [] ends){
        S139107=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 694, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread202342(int [] tdone, int [] ends){
        S139137=1;
    S139113=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 691, column: 27
      thread202343(tdone,ends);
      thread202344(tdone,ends);
      int biggest202345 = 0;
      if(ends[85]>=biggest202345){
        biggest202345=ends[85];
      }
      if(ends[86]>=biggest202345){
        biggest202345=ends[86];
      }
      if(biggest202345 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S139113=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread202340(int [] tdone, int [] ends){
        S139075=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread202339(int [] tdone, int [] ends){
        S139072=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 675, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread202338(int [] tdone, int [] ends){
        S139102=1;
    S139078=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 672, column: 39
      thread202339(tdone,ends);
      thread202340(tdone,ends);
      int biggest202341 = 0;
      if(ends[82]>=biggest202341){
        biggest202341=ends[82];
      }
      if(ends[83]>=biggest202341){
        biggest202341=ends[83];
      }
      if(biggest202341 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S139078=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread202337(int [] tdone, int [] ends){
        S139067=1;
    S139011=0;
    S138991=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 662, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 662, column: 13
      S138991=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S138986=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 662, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 662, column: 13
        S138986=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 662, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 662, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 662, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 663, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 664, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S139011=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S139011=1;
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

  public void thread202336(int [] tdone, int [] ends){
        S138984=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 597, column: 13
    S137705=0;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread202333(int [] tdone, int [] ends){
        S139110=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread202332(int [] tdone, int [] ends){
        S139107=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 694, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread202331(int [] tdone, int [] ends){
        S139137=1;
    S139113=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 691, column: 27
      thread202332(tdone,ends);
      thread202333(tdone,ends);
      int biggest202334 = 0;
      if(ends[85]>=biggest202334){
        biggest202334=ends[85];
      }
      if(ends[86]>=biggest202334){
        biggest202334=ends[86];
      }
      if(biggest202334 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S139113=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread202329(int [] tdone, int [] ends){
        S139075=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread202328(int [] tdone, int [] ends){
        S139072=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 675, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread202327(int [] tdone, int [] ends){
        S139102=1;
    S139078=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 672, column: 39
      thread202328(tdone,ends);
      thread202329(tdone,ends);
      int biggest202330 = 0;
      if(ends[82]>=biggest202330){
        biggest202330=ends[82];
      }
      if(ends[83]>=biggest202330){
        biggest202330=ends[83];
      }
      if(biggest202330 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S139078=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread202326(int [] tdone, int [] ends){
        S139067=1;
    S139011=0;
    S138991=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 662, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 662, column: 13
      S138991=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S138986=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 662, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 662, column: 13
        S138986=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 662, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 662, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 662, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 663, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 664, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S139011=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S139011=1;
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

  public void thread202325(int [] tdone, int [] ends){
        S138984=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 597, column: 13
    S137705=0;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread202322(int [] tdone, int [] ends){
        S139110=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread202321(int [] tdone, int [] ends){
        S139107=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 694, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread202320(int [] tdone, int [] ends){
        S139137=1;
    S139113=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 691, column: 27
      thread202321(tdone,ends);
      thread202322(tdone,ends);
      int biggest202323 = 0;
      if(ends[85]>=biggest202323){
        biggest202323=ends[85];
      }
      if(ends[86]>=biggest202323){
        biggest202323=ends[86];
      }
      if(biggest202323 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S139113=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread202318(int [] tdone, int [] ends){
        S139075=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread202317(int [] tdone, int [] ends){
        S139072=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 675, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread202316(int [] tdone, int [] ends){
        S139102=1;
    S139078=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 672, column: 39
      thread202317(tdone,ends);
      thread202318(tdone,ends);
      int biggest202319 = 0;
      if(ends[82]>=biggest202319){
        biggest202319=ends[82];
      }
      if(ends[83]>=biggest202319){
        biggest202319=ends[83];
      }
      if(biggest202319 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S139078=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread202315(int [] tdone, int [] ends){
        S139067=1;
    S139011=0;
    S138991=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 662, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 662, column: 13
      S138991=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S138986=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 662, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 662, column: 13
        S138986=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 662, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 662, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 662, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 663, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 664, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S139011=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S139011=1;
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

  public void thread202314(int [] tdone, int [] ends){
        S138984=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 597, column: 13
    S137705=0;
    active[74]=1;
    ends[74]=1;
    tdone[74]=1;
  }

  public void thread202311(int [] tdone, int [] ends){
        S139110=1;
    active[86]=1;
    ends[86]=1;
    tdone[86]=1;
  }

  public void thread202310(int [] tdone, int [] ends){
        S139107=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 694, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[85]=1;
    ends[85]=1;
    tdone[85]=1;
  }

  public void thread202309(int [] tdone, int [] ends){
        S139137=1;
    S139113=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 691, column: 27
      thread202310(tdone,ends);
      thread202311(tdone,ends);
      int biggest202312 = 0;
      if(ends[85]>=biggest202312){
        biggest202312=ends[85];
      }
      if(ends[86]>=biggest202312){
        biggest202312=ends[86];
      }
      if(biggest202312 == 1){
        active[84]=1;
        ends[84]=1;
        tdone[84]=1;
      }
    }
    else {
      S139113=1;
      active[84]=1;
      ends[84]=1;
      tdone[84]=1;
    }
  }

  public void thread202307(int [] tdone, int [] ends){
        S139075=1;
    active[83]=1;
    ends[83]=1;
    tdone[83]=1;
  }

  public void thread202306(int [] tdone, int [] ends){
        S139072=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 675, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[82]=1;
    ends[82]=1;
    tdone[82]=1;
  }

  public void thread202305(int [] tdone, int [] ends){
        S139102=1;
    S139078=0;
    if(bottleAtPos4_73.getprestatus()){//sysj\conveyor_controller.sysj line: 672, column: 39
      thread202306(tdone,ends);
      thread202307(tdone,ends);
      int biggest202308 = 0;
      if(ends[82]>=biggest202308){
        biggest202308=ends[82];
      }
      if(ends[83]>=biggest202308){
        biggest202308=ends[83];
      }
      if(biggest202308 == 1){
        active[81]=1;
        ends[81]=1;
        tdone[81]=1;
      }
    }
    else {
      S139078=1;
      active[81]=1;
      ends[81]=1;
      tdone[81]=1;
    }
  }

  public void thread202304(int [] tdone, int [] ends){
        S139067=1;
    S139011=0;
    S138991=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 662, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 662, column: 13
      S138991=1;
      active[80]=1;
      ends[80]=1;
      tdone[80]=1;
    }
    else {
      S138986=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 662, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 662, column: 13
        S138986=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 662, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 662, column: 13
          ends[80]=2;
          ;//sysj\conveyor_controller.sysj line: 662, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 663, column: 16
            bottleAtPos4_73.setPresent();//sysj\conveyor_controller.sysj line: 664, column: 14
            currsigs.addElement(bottleAtPos4_73);
            S139011=1;
            active[80]=1;
            ends[80]=1;
            tdone[80]=1;
          }
          else {
            S139011=1;
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

  public void thread202303(int [] tdone, int [] ends){
        S138984=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 597, column: 13
    S137705=0;
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
      switch(S143444){
        case 0 : 
          S143444=0;
          break RUN;
        
        case 1 : 
          S143444=2;
          S143444=2;
          bottleAtPos4_73.setClear();//sysj\conveyor_controller.sysj line: 591, column: 11
          S143443=0;
          S137687=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 592, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 592, column: 11
            S137687=1;
            active[73]=1;
            ends[73]=1;
            break RUN;
          }
          else {
            S137682=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 592, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 592, column: 11
              S137682=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 592, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 592, column: 11
                ends[73]=2;
                ;//sysj\conveyor_controller.sysj line: 592, column: 11
                S143443=1;
                thread202303(tdone,ends);
                thread202304(tdone,ends);
                thread202305(tdone,ends);
                thread202309(tdone,ends);
                int biggest202313 = 0;
                if(ends[74]>=biggest202313){
                  biggest202313=ends[74];
                }
                if(ends[80]>=biggest202313){
                  biggest202313=ends[80];
                }
                if(ends[81]>=biggest202313){
                  biggest202313=ends[81];
                }
                if(ends[84]>=biggest202313){
                  biggest202313=ends[84];
                }
                if(biggest202313 == 1){
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
          bottleAtPos4_73.setClear();//sysj\conveyor_controller.sysj line: 591, column: 11
          switch(S143443){
            case 0 : 
              switch(S137687){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 592, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 592, column: 11
                    S137687=1;
                    active[73]=1;
                    ends[73]=1;
                    break RUN;
                  }
                  else {
                    switch(S137682){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 592, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 592, column: 11
                          S137682=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 592, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 592, column: 11
                            ends[73]=2;
                            ;//sysj\conveyor_controller.sysj line: 592, column: 11
                            S143443=1;
                            thread202314(tdone,ends);
                            thread202315(tdone,ends);
                            thread202316(tdone,ends);
                            thread202320(tdone,ends);
                            int biggest202324 = 0;
                            if(ends[74]>=biggest202324){
                              biggest202324=ends[74];
                            }
                            if(ends[80]>=biggest202324){
                              biggest202324=ends[80];
                            }
                            if(ends[81]>=biggest202324){
                              biggest202324=ends[81];
                            }
                            if(ends[84]>=biggest202324){
                              biggest202324=ends[84];
                            }
                            if(biggest202324 == 1){
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
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 592, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 592, column: 11
                          ends[73]=2;
                          ;//sysj\conveyor_controller.sysj line: 592, column: 11
                          S143443=1;
                          thread202325(tdone,ends);
                          thread202326(tdone,ends);
                          thread202327(tdone,ends);
                          thread202331(tdone,ends);
                          int biggest202335 = 0;
                          if(ends[74]>=biggest202335){
                            biggest202335=ends[74];
                          }
                          if(ends[80]>=biggest202335){
                            biggest202335=ends[80];
                          }
                          if(ends[81]>=biggest202335){
                            biggest202335=ends[81];
                          }
                          if(ends[84]>=biggest202335){
                            biggest202335=ends[84];
                          }
                          if(biggest202335 == 1){
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
                  S137687=1;
                  S137687=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 592, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 592, column: 11
                    S137687=1;
                    active[73]=1;
                    ends[73]=1;
                    break RUN;
                  }
                  else {
                    S137682=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 592, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 592, column: 11
                      S137682=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 592, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 592, column: 11
                        ends[73]=2;
                        ;//sysj\conveyor_controller.sysj line: 592, column: 11
                        S143443=1;
                        thread202336(tdone,ends);
                        thread202337(tdone,ends);
                        thread202338(tdone,ends);
                        thread202342(tdone,ends);
                        int biggest202346 = 0;
                        if(ends[74]>=biggest202346){
                          biggest202346=ends[74];
                        }
                        if(ends[80]>=biggest202346){
                          biggest202346=ends[80];
                        }
                        if(ends[81]>=biggest202346){
                          biggest202346=ends[81];
                        }
                        if(ends[84]>=biggest202346){
                          biggest202346=ends[84];
                        }
                        if(biggest202346 == 1){
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
              thread202347(tdone,ends);
              thread202362(tdone,ends);
              thread202363(tdone,ends);
              thread202370(tdone,ends);
              int biggest202377 = 0;
              if(ends[74]>=biggest202377){
                biggest202377=ends[74];
              }
              if(ends[80]>=biggest202377){
                biggest202377=ends[80];
              }
              if(ends[81]>=biggest202377){
                biggest202377=ends[81];
              }
              if(ends[84]>=biggest202377){
                biggest202377=ends[84];
              }
              if(biggest202377 == 1){
                active[73]=1;
                ends[73]=1;
                break RUN;
              }
              //FINXME code
              if(biggest202377 == 0){
                S143444=0;
                active[73]=0;
                ends[73]=0;
                S143444=0;
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
