import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class FillerController extends ClockDomain{
  public FillerController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.INPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.INPUT);
  public Signal fileReadSignal = new Signal("fileReadSignal", Signal.INPUT);
  public Signal ordered = new Signal("ordered", Signal.INPUT);
  public Signal orderFill_1 = new Signal("orderFill_1", Signal.INPUT);
  public Signal orderFill_2 = new Signal("orderFill_2", Signal.INPUT);
  public Signal orderFill_3 = new Signal("orderFill_3", Signal.INPUT);
  public Signal orderFill_4 = new Signal("orderFill_4", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public Signal bottleAtPos2E = new Signal("bottleAtPos2E", Signal.OUTPUT);
  public Signal order_finished = new Signal("order_finished", Signal.OUTPUT);
  public input_Channel simFiller_in = new input_Channel();
  public output_Channel fillerReady_o = new output_Channel();
  private Signal filler1_55;
  private Signal filler2_55;
  private Signal filler3_55;
  private Signal filler4_55;
  private Signal done_55;
  private Signal filler1_amount_55;
  private Signal filler2_amount_55;
  private Signal filler3_amount_55;
  private Signal filler4_amount_55;
  private Signal current_fill_55;
  private Signal total_fill_55;
  private Signal bottleAtPos2_55;
  private int current_thread_56;//sysj\conveyor_controller.sysj line: 428, column: 16
  private int total_thread_56;//sysj\conveyor_controller.sysj line: 429, column: 16
  private long __start_thread_56;//sysj\conveyor_controller.sysj line: 427, column: 9
  private int S132871 = 1;
  private int S132870 = 1;
  private int S42634 = 1;
  private int S42629 = 1;
  private int S65081 = 1;
  private int S42653 = 1;
  private int S42660 = 1;
  private int S42655 = 1;
  private int S42810 = 1;
  private int S42761 = 1;
  private int S42766 = 1;
  private int S42775 = 1;
  private int S42780 = 1;
  private int S43158 = 1;
  private int S43109 = 1;
  private int S43114 = 1;
  private int S43123 = 1;
  private int S43128 = 1;
  private int S43564 = 1;
  private int S43515 = 1;
  private int S43520 = 1;
  private int S43529 = 1;
  private int S43534 = 1;
  private int S44028 = 1;
  private int S43979 = 1;
  private int S43984 = 1;
  private int S43993 = 1;
  private int S43998 = 1;
  private int S44500 = 1;
  private int S44495 = 1;
  private int S44727 = 1;
  private int S65086 = 1;
  private int S65169 = 1;
  private int S65113 = 1;
  private int S65093 = 1;
  private int S65088 = 1;
  private int S65204 = 1;
  private int S65180 = 1;
  private int S65174 = 1;
  private int S65177 = 1;
  
  private int[] ends = new int[105];
  private int[] tdone = new int[105];
  
  public void thread192172(int [] tdone, int [] ends){
        S65177=1;
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread192171(int [] tdone, int [] ends){
        S65174=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 622, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread192169(int [] tdone, int [] ends){
        switch(S65177){
      case 0 : 
        active[77]=0;
        ends[77]=0;
        tdone[77]=1;
        break;
      
      case 1 : 
        if(done_55.getprestatus()){//sysj\conveyor_controller.sysj line: 626, column: 35
          ends[77]=2;
          tdone[77]=1;
        }
        else {
          active[77]=1;
          ends[77]=1;
          tdone[77]=1;
        }
        break;
      
    }
  }

  public void thread192168(int [] tdone, int [] ends){
        switch(S65174){
      case 0 : 
        active[76]=0;
        ends[76]=0;
        tdone[76]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 622, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[76]=1;
        ends[76]=1;
        tdone[76]=1;
        break;
      
    }
  }

  public void thread192167(int [] tdone, int [] ends){
        switch(S65204){
      case 0 : 
        active[75]=0;
        ends[75]=0;
        tdone[75]=1;
        break;
      
      case 1 : 
        switch(S65180){
          case 0 : 
            thread192168(tdone,ends);
            thread192169(tdone,ends);
            int biggest192170 = 0;
            if(ends[76]>=biggest192170){
              biggest192170=ends[76];
            }
            if(ends[77]>=biggest192170){
              biggest192170=ends[77];
            }
            if(biggest192170 == 1){
              active[75]=1;
              ends[75]=1;
              tdone[75]=1;
            }
            if(biggest192170 == 2){
              ends[75]=2;
              ;//sysj\conveyor_controller.sysj line: 620, column: 18
              S65180=1;
              active[75]=1;
              ends[75]=1;
              tdone[75]=1;
            }
            //FINXME code
            if(biggest192170 == 0){
              S65180=1;
              active[75]=1;
              ends[75]=1;
              tdone[75]=1;
            }
            break;
          
          case 1 : 
            S65180=1;
            S65180=0;
            if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 619, column: 26
              thread192171(tdone,ends);
              thread192172(tdone,ends);
              int biggest192173 = 0;
              if(ends[76]>=biggest192173){
                biggest192173=ends[76];
              }
              if(ends[77]>=biggest192173){
                biggest192173=ends[77];
              }
              if(biggest192173 == 1){
                active[75]=1;
                ends[75]=1;
                tdone[75]=1;
              }
            }
            else {
              S65180=1;
              active[75]=1;
              ends[75]=1;
              tdone[75]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192166(int [] tdone, int [] ends){
        switch(S65169){
      case 0 : 
        active[74]=0;
        ends[74]=0;
        tdone[74]=1;
        break;
      
      case 1 : 
        switch(S65113){
          case 0 : 
            switch(S65093){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 604, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
                  S65093=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  switch(S65088){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 604, column: 12
                        S65088=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
                          ends[74]=2;
                          ;//sysj\conveyor_controller.sysj line: 604, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 605, column: 15
                            bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 606, column: 13
                            currsigs.addElement(bottleAtPos2_55);
                            S65113=1;
                            active[74]=1;
                            ends[74]=1;
                            tdone[74]=1;
                          }
                          else {
                            done_55.setPresent();//sysj\conveyor_controller.sysj line: 609, column: 13
                            currsigs.addElement(done_55);
                            S65113=1;
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
                      else {
                        active[74]=1;
                        ends[74]=1;
                        tdone[74]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
                        ends[74]=2;
                        ;//sysj\conveyor_controller.sysj line: 604, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 605, column: 15
                          bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 606, column: 13
                          currsigs.addElement(bottleAtPos2_55);
                          S65113=1;
                          active[74]=1;
                          ends[74]=1;
                          tdone[74]=1;
                        }
                        else {
                          done_55.setPresent();//sysj\conveyor_controller.sysj line: 609, column: 13
                          currsigs.addElement(done_55);
                          S65113=1;
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
                    
                  }
                }
                break;
              
              case 1 : 
                S65093=1;
                S65093=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 604, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
                  S65093=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  S65088=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 604, column: 12
                    S65088=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
                      ends[74]=2;
                      ;//sysj\conveyor_controller.sysj line: 604, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 605, column: 15
                        bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 606, column: 13
                        currsigs.addElement(bottleAtPos2_55);
                        S65113=1;
                        active[74]=1;
                        ends[74]=1;
                        tdone[74]=1;
                      }
                      else {
                        done_55.setPresent();//sysj\conveyor_controller.sysj line: 609, column: 13
                        currsigs.addElement(done_55);
                        S65113=1;
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
                  else {
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S65113=1;
            S65113=0;
            S65093=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 604, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
              S65093=1;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            else {
              S65088=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 604, column: 12
                S65088=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
                  ends[74]=2;
                  ;//sysj\conveyor_controller.sysj line: 604, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 605, column: 15
                    bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 606, column: 13
                    currsigs.addElement(bottleAtPos2_55);
                    S65113=1;
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
                  }
                  else {
                    done_55.setPresent();//sysj\conveyor_controller.sysj line: 609, column: 13
                    currsigs.addElement(done_55);
                    S65113=1;
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
              else {
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192165(int [] tdone, int [] ends){
        switch(S65086){
      case 0 : 
        active[73]=0;
        ends[73]=0;
        tdone[73]=1;
        break;
      
      case 1 : 
        filler1_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 591, column: 11
        currsigs.addElement(filler1_amount_55);
        filler1_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 591, column: 11
        filler2_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 592, column: 8
        currsigs.addElement(filler2_amount_55);
        filler2_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 592, column: 8
        filler3_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 593, column: 8
        currsigs.addElement(filler3_amount_55);
        filler3_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 593, column: 8
        filler4_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 594, column: 8
        currsigs.addElement(filler4_amount_55);
        filler4_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 594, column: 8
        active[73]=1;
        ends[73]=1;
        tdone[73]=1;
        break;
      
    }
  }

  public void thread192163(int [] tdone, int [] ends){
        switch(S43998){
      case 0 : 
        active[72]=0;
        ends[72]=0;
        tdone[72]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 558, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[72]=1;
        ends[72]=1;
        tdone[72]=1;
        break;
      
    }
  }

  public void thread192162(int [] tdone, int [] ends){
        switch(S43993){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 554, column: 32
        currsigs.addElement(valveInletOnOff);
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
        break;
      
    }
  }

  public void thread192160(int [] tdone, int [] ends){
        S43998=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 558, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread192159(int [] tdone, int [] ends){
        S43993=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 553, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 554, column: 32
    currsigs.addElement(valveInletOnOff);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread192157(int [] tdone, int [] ends){
        switch(S43984){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 548, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
        break;
      
    }
  }

  public void thread192156(int [] tdone, int [] ends){
        switch(S43979){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
        break;
      
    }
  }

  public void thread192154(int [] tdone, int [] ends){
        S43998=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 558, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread192153(int [] tdone, int [] ends){
        S43993=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 553, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 554, column: 32
    currsigs.addElement(valveInletOnOff);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread192151(int [] tdone, int [] ends){
        S43984=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 548, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192150(int [] tdone, int [] ends){
        S43979=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 543, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192148(int [] tdone, int [] ends){
        switch(S43534){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 528, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[68]=1;
        ends[68]=1;
        tdone[68]=1;
        break;
      
    }
  }

  public void thread192147(int [] tdone, int [] ends){
        switch(S43529){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 32
        currsigs.addElement(valveInletOnOff);
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
        break;
      
    }
  }

  public void thread192145(int [] tdone, int [] ends){
        S43534=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 528, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread192144(int [] tdone, int [] ends){
        S43529=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 523, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 32
    currsigs.addElement(valveInletOnOff);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread192142(int [] tdone, int [] ends){
        switch(S43520){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 518, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
        break;
      
    }
  }

  public void thread192141(int [] tdone, int [] ends){
        switch(S43515){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 514, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
        break;
      
    }
  }

  public void thread192139(int [] tdone, int [] ends){
        S43534=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 528, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread192138(int [] tdone, int [] ends){
        S43529=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 523, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 32
    currsigs.addElement(valveInletOnOff);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread192136(int [] tdone, int [] ends){
        S43984=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 548, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192135(int [] tdone, int [] ends){
        S43979=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 543, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192133(int [] tdone, int [] ends){
        S43520=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 518, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192132(int [] tdone, int [] ends){
        S43515=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 513, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 514, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192130(int [] tdone, int [] ends){
        switch(S43128){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 498, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[64]=1;
        ends[64]=1;
        tdone[64]=1;
        break;
      
    }
  }

  public void thread192129(int [] tdone, int [] ends){
        switch(S43123){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 494, column: 32
        currsigs.addElement(valveInletOnOff);
        active[63]=1;
        ends[63]=1;
        tdone[63]=1;
        break;
      
    }
  }

  public void thread192127(int [] tdone, int [] ends){
        S43128=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 498, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread192126(int [] tdone, int [] ends){
        S43123=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 493, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 494, column: 32
    currsigs.addElement(valveInletOnOff);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread192124(int [] tdone, int [] ends){
        switch(S43114){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 486, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[62]=1;
        ends[62]=1;
        tdone[62]=1;
        break;
      
    }
  }

  public void thread192123(int [] tdone, int [] ends){
        switch(S43109){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[61]=1;
        ends[61]=1;
        tdone[61]=1;
        break;
      
    }
  }

  public void thread192121(int [] tdone, int [] ends){
        S43128=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 498, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread192120(int [] tdone, int [] ends){
        S43123=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 493, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 494, column: 32
    currsigs.addElement(valveInletOnOff);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread192118(int [] tdone, int [] ends){
        S43984=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 548, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192117(int [] tdone, int [] ends){
        S43979=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 543, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192115(int [] tdone, int [] ends){
        S43520=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 518, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192114(int [] tdone, int [] ends){
        S43515=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 513, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 514, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192112(int [] tdone, int [] ends){
        S43114=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 486, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192111(int [] tdone, int [] ends){
        S43109=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 481, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192109(int [] tdone, int [] ends){
        switch(S42780){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
        break;
      
    }
  }

  public void thread192108(int [] tdone, int [] ends){
        switch(S42775){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
        currsigs.addElement(valveInletOnOff);
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
        break;
      
    }
  }

  public void thread192106(int [] tdone, int [] ends){
        S42780=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread192105(int [] tdone, int [] ends){
        S42775=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInletOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread192103(int [] tdone, int [] ends){
        switch(S42766){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 456, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
        break;
      
    }
  }

  public void thread192102(int [] tdone, int [] ends){
        switch(S42761){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
        break;
      
    }
  }

  public void thread192100(int [] tdone, int [] ends){
        S42780=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread192099(int [] tdone, int [] ends){
        S42775=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInletOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread192097(int [] tdone, int [] ends){
        S43984=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 548, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192096(int [] tdone, int [] ends){
        S43979=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 543, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192094(int [] tdone, int [] ends){
        S43520=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 518, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192093(int [] tdone, int [] ends){
        S43515=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 513, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 514, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192091(int [] tdone, int [] ends){
        S43114=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 486, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192090(int [] tdone, int [] ends){
        S43109=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 481, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192088(int [] tdone, int [] ends){
        S42766=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 456, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192087(int [] tdone, int [] ends){
        S42761=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 451, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread192085(int [] tdone, int [] ends){
        S43984=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 548, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192084(int [] tdone, int [] ends){
        S43979=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 543, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192082(int [] tdone, int [] ends){
        S43520=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 518, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192081(int [] tdone, int [] ends){
        S43515=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 513, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 514, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192079(int [] tdone, int [] ends){
        S43114=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 486, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192078(int [] tdone, int [] ends){
        S43109=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 481, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192076(int [] tdone, int [] ends){
        S42766=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 456, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192075(int [] tdone, int [] ends){
        S42761=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 451, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread192073(int [] tdone, int [] ends){
        S43984=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 548, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192072(int [] tdone, int [] ends){
        S43979=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 543, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192070(int [] tdone, int [] ends){
        S43520=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 518, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192069(int [] tdone, int [] ends){
        S43515=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 513, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 514, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192067(int [] tdone, int [] ends){
        S43114=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 486, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192066(int [] tdone, int [] ends){
        S43109=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 481, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192064(int [] tdone, int [] ends){
        S42766=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 456, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192063(int [] tdone, int [] ends){
        S42761=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 451, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread192061(int [] tdone, int [] ends){
        S43984=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 548, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192060(int [] tdone, int [] ends){
        S43979=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 543, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192058(int [] tdone, int [] ends){
        S43520=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 518, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192057(int [] tdone, int [] ends){
        S43515=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 513, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 514, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192055(int [] tdone, int [] ends){
        S43114=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 486, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192054(int [] tdone, int [] ends){
        S43109=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 481, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192052(int [] tdone, int [] ends){
        S42766=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 456, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192051(int [] tdone, int [] ends){
        S42761=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 451, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread192049(int [] tdone, int [] ends){
        S43984=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 548, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192048(int [] tdone, int [] ends){
        S43979=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 543, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192046(int [] tdone, int [] ends){
        S43520=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 518, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192045(int [] tdone, int [] ends){
        S43515=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 513, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 514, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192043(int [] tdone, int [] ends){
        S43114=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 486, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192042(int [] tdone, int [] ends){
        S43109=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 481, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192040(int [] tdone, int [] ends){
        S42766=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 456, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192039(int [] tdone, int [] ends){
        S42761=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 451, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread192038(int [] tdone, int [] ends){
        switch(S65081){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        switch(S42653){
          case 0 : 
            if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 440, column: 26
              S42653=1;
              S42660=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 441, column: 20
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 441, column: 20
                S42660=1;
                active[56]=1;
                ends[56]=1;
                tdone[56]=1;
              }
              else {
                S42655=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 441, column: 20
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 441, column: 20
                  S42655=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 441, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 441, column: 20
                    ends[56]=2;
                    ;//sysj\conveyor_controller.sysj line: 441, column: 20
                    S42653=2;
                    __start_thread_56 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 427, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_56 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 427, column: 9
                      ends[56]=2;
                      ;//sysj\conveyor_controller.sysj line: 427, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 444, column: 20
                      S42653=3;
                      if(((filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 447, column: 24
                        S42810=0;
                        thread192039(tdone,ends);
                        thread192040(tdone,ends);
                        int biggest192041 = 0;
                        if(ends[57]>=biggest192041){
                          biggest192041=ends[57];
                        }
                        if(ends[58]>=biggest192041){
                          biggest192041=ends[58];
                        }
                        if(biggest192041 == 1){
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                      }
                      else {
                        S42653=4;
                        if(((filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 477, column: 24
                          S43158=0;
                          thread192042(tdone,ends);
                          thread192043(tdone,ends);
                          int biggest192044 = 0;
                          if(ends[61]>=biggest192044){
                            biggest192044=ends[61];
                          }
                          if(ends[62]>=biggest192044){
                            biggest192044=ends[62];
                          }
                          if(biggest192044 == 1){
                            active[56]=1;
                            ends[56]=1;
                            tdone[56]=1;
                          }
                        }
                        else {
                          S42653=5;
                          if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 509, column: 24
                            S43564=0;
                            thread192045(tdone,ends);
                            thread192046(tdone,ends);
                            int biggest192047 = 0;
                            if(ends[65]>=biggest192047){
                              biggest192047=ends[65];
                            }
                            if(ends[66]>=biggest192047){
                              biggest192047=ends[66];
                            }
                            if(biggest192047 == 1){
                              active[56]=1;
                              ends[56]=1;
                              tdone[56]=1;
                            }
                          }
                          else {
                            S42653=6;
                            if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 539, column: 24
                              S44028=0;
                              thread192048(tdone,ends);
                              thread192049(tdone,ends);
                              int biggest192050 = 0;
                              if(ends[69]>=biggest192050){
                                biggest192050=ends[69];
                              }
                              if(ends[70]>=biggest192050){
                                biggest192050=ends[70];
                              }
                              if(biggest192050 == 1){
                                active[56]=1;
                                ends[56]=1;
                                tdone[56]=1;
                              }
                            }
                            else {
                              current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 570, column: 20
                              current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 20
                              currsigs.addElement(current_fill_55);
                              current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 571, column: 20
                              S42653=7;
                              S44500=0;
                              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                                S44500=1;
                                active[56]=1;
                                ends[56]=1;
                                tdone[56]=1;
                              }
                              else {
                                S44495=0;
                                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                                  S44495=1;
                                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                                    ends[56]=2;
                                    ;//sysj\conveyor_controller.sysj line: 573, column: 20
                                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                                    S42653=8;
                                    S44727=0;
                                    active[56]=1;
                                    ends[56]=1;
                                    tdone[56]=1;
                                  }
                                  else {
                                    active[56]=1;
                                    ends[56]=1;
                                    tdone[56]=1;
                                  }
                                }
                                else {
                                  active[56]=1;
                                  ends[56]=1;
                                  tdone[56]=1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    else {
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                  else {
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
              }
            }
            else {
              active[56]=1;
              ends[56]=1;
              tdone[56]=1;
            }
            break;
          
          case 1 : 
            switch(S42660){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 441, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 441, column: 20
                  S42660=1;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  switch(S42655){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 441, column: 20
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 441, column: 20
                        S42655=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 441, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 441, column: 20
                          ends[56]=2;
                          ;//sysj\conveyor_controller.sysj line: 441, column: 20
                          S42653=2;
                          __start_thread_56 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 427, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_56 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 427, column: 9
                            ends[56]=2;
                            ;//sysj\conveyor_controller.sysj line: 427, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 444, column: 20
                            S42653=3;
                            if(((filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 447, column: 24
                              S42810=0;
                              thread192051(tdone,ends);
                              thread192052(tdone,ends);
                              int biggest192053 = 0;
                              if(ends[57]>=biggest192053){
                                biggest192053=ends[57];
                              }
                              if(ends[58]>=biggest192053){
                                biggest192053=ends[58];
                              }
                              if(biggest192053 == 1){
                                active[56]=1;
                                ends[56]=1;
                                tdone[56]=1;
                              }
                            }
                            else {
                              S42653=4;
                              if(((filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 477, column: 24
                                S43158=0;
                                thread192054(tdone,ends);
                                thread192055(tdone,ends);
                                int biggest192056 = 0;
                                if(ends[61]>=biggest192056){
                                  biggest192056=ends[61];
                                }
                                if(ends[62]>=biggest192056){
                                  biggest192056=ends[62];
                                }
                                if(biggest192056 == 1){
                                  active[56]=1;
                                  ends[56]=1;
                                  tdone[56]=1;
                                }
                              }
                              else {
                                S42653=5;
                                if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 509, column: 24
                                  S43564=0;
                                  thread192057(tdone,ends);
                                  thread192058(tdone,ends);
                                  int biggest192059 = 0;
                                  if(ends[65]>=biggest192059){
                                    biggest192059=ends[65];
                                  }
                                  if(ends[66]>=biggest192059){
                                    biggest192059=ends[66];
                                  }
                                  if(biggest192059 == 1){
                                    active[56]=1;
                                    ends[56]=1;
                                    tdone[56]=1;
                                  }
                                }
                                else {
                                  S42653=6;
                                  if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 539, column: 24
                                    S44028=0;
                                    thread192060(tdone,ends);
                                    thread192061(tdone,ends);
                                    int biggest192062 = 0;
                                    if(ends[69]>=biggest192062){
                                      biggest192062=ends[69];
                                    }
                                    if(ends[70]>=biggest192062){
                                      biggest192062=ends[70];
                                    }
                                    if(biggest192062 == 1){
                                      active[56]=1;
                                      ends[56]=1;
                                      tdone[56]=1;
                                    }
                                  }
                                  else {
                                    current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 570, column: 20
                                    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 20
                                    currsigs.addElement(current_fill_55);
                                    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 571, column: 20
                                    S42653=7;
                                    S44500=0;
                                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                                      S44500=1;
                                      active[56]=1;
                                      ends[56]=1;
                                      tdone[56]=1;
                                    }
                                    else {
                                      S44495=0;
                                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                                        S44495=1;
                                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                                          ends[56]=2;
                                          ;//sysj\conveyor_controller.sysj line: 573, column: 20
                                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                                          S42653=8;
                                          S44727=0;
                                          active[56]=1;
                                          ends[56]=1;
                                          tdone[56]=1;
                                        }
                                        else {
                                          active[56]=1;
                                          ends[56]=1;
                                          tdone[56]=1;
                                        }
                                      }
                                      else {
                                        active[56]=1;
                                        ends[56]=1;
                                        tdone[56]=1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          else {
                            active[56]=1;
                            ends[56]=1;
                            tdone[56]=1;
                          }
                        }
                        else {
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                      }
                      else {
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 441, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 441, column: 20
                        ends[56]=2;
                        ;//sysj\conveyor_controller.sysj line: 441, column: 20
                        S42653=2;
                        __start_thread_56 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 427, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_56 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 427, column: 9
                          ends[56]=2;
                          ;//sysj\conveyor_controller.sysj line: 427, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 444, column: 20
                          S42653=3;
                          if(((filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 447, column: 24
                            S42810=0;
                            thread192063(tdone,ends);
                            thread192064(tdone,ends);
                            int biggest192065 = 0;
                            if(ends[57]>=biggest192065){
                              biggest192065=ends[57];
                            }
                            if(ends[58]>=biggest192065){
                              biggest192065=ends[58];
                            }
                            if(biggest192065 == 1){
                              active[56]=1;
                              ends[56]=1;
                              tdone[56]=1;
                            }
                          }
                          else {
                            S42653=4;
                            if(((filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 477, column: 24
                              S43158=0;
                              thread192066(tdone,ends);
                              thread192067(tdone,ends);
                              int biggest192068 = 0;
                              if(ends[61]>=biggest192068){
                                biggest192068=ends[61];
                              }
                              if(ends[62]>=biggest192068){
                                biggest192068=ends[62];
                              }
                              if(biggest192068 == 1){
                                active[56]=1;
                                ends[56]=1;
                                tdone[56]=1;
                              }
                            }
                            else {
                              S42653=5;
                              if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 509, column: 24
                                S43564=0;
                                thread192069(tdone,ends);
                                thread192070(tdone,ends);
                                int biggest192071 = 0;
                                if(ends[65]>=biggest192071){
                                  biggest192071=ends[65];
                                }
                                if(ends[66]>=biggest192071){
                                  biggest192071=ends[66];
                                }
                                if(biggest192071 == 1){
                                  active[56]=1;
                                  ends[56]=1;
                                  tdone[56]=1;
                                }
                              }
                              else {
                                S42653=6;
                                if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 539, column: 24
                                  S44028=0;
                                  thread192072(tdone,ends);
                                  thread192073(tdone,ends);
                                  int biggest192074 = 0;
                                  if(ends[69]>=biggest192074){
                                    biggest192074=ends[69];
                                  }
                                  if(ends[70]>=biggest192074){
                                    biggest192074=ends[70];
                                  }
                                  if(biggest192074 == 1){
                                    active[56]=1;
                                    ends[56]=1;
                                    tdone[56]=1;
                                  }
                                }
                                else {
                                  current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 570, column: 20
                                  current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 20
                                  currsigs.addElement(current_fill_55);
                                  current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 571, column: 20
                                  S42653=7;
                                  S44500=0;
                                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                                    S44500=1;
                                    active[56]=1;
                                    ends[56]=1;
                                    tdone[56]=1;
                                  }
                                  else {
                                    S44495=0;
                                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                                      S44495=1;
                                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                                        ends[56]=2;
                                        ;//sysj\conveyor_controller.sysj line: 573, column: 20
                                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                                        S42653=8;
                                        S44727=0;
                                        active[56]=1;
                                        ends[56]=1;
                                        tdone[56]=1;
                                      }
                                      else {
                                        active[56]=1;
                                        ends[56]=1;
                                        tdone[56]=1;
                                      }
                                    }
                                    else {
                                      active[56]=1;
                                      ends[56]=1;
                                      tdone[56]=1;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        else {
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                      }
                      else {
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S42660=1;
                S42660=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 441, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 441, column: 20
                  S42660=1;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  S42655=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 441, column: 20
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 441, column: 20
                    S42655=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 441, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 441, column: 20
                      ends[56]=2;
                      ;//sysj\conveyor_controller.sysj line: 441, column: 20
                      S42653=2;
                      __start_thread_56 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 427, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_56 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 427, column: 9
                        ends[56]=2;
                        ;//sysj\conveyor_controller.sysj line: 427, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 444, column: 20
                        S42653=3;
                        if(((filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 447, column: 24
                          S42810=0;
                          thread192075(tdone,ends);
                          thread192076(tdone,ends);
                          int biggest192077 = 0;
                          if(ends[57]>=biggest192077){
                            biggest192077=ends[57];
                          }
                          if(ends[58]>=biggest192077){
                            biggest192077=ends[58];
                          }
                          if(biggest192077 == 1){
                            active[56]=1;
                            ends[56]=1;
                            tdone[56]=1;
                          }
                        }
                        else {
                          S42653=4;
                          if(((filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 477, column: 24
                            S43158=0;
                            thread192078(tdone,ends);
                            thread192079(tdone,ends);
                            int biggest192080 = 0;
                            if(ends[61]>=biggest192080){
                              biggest192080=ends[61];
                            }
                            if(ends[62]>=biggest192080){
                              biggest192080=ends[62];
                            }
                            if(biggest192080 == 1){
                              active[56]=1;
                              ends[56]=1;
                              tdone[56]=1;
                            }
                          }
                          else {
                            S42653=5;
                            if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 509, column: 24
                              S43564=0;
                              thread192081(tdone,ends);
                              thread192082(tdone,ends);
                              int biggest192083 = 0;
                              if(ends[65]>=biggest192083){
                                biggest192083=ends[65];
                              }
                              if(ends[66]>=biggest192083){
                                biggest192083=ends[66];
                              }
                              if(biggest192083 == 1){
                                active[56]=1;
                                ends[56]=1;
                                tdone[56]=1;
                              }
                            }
                            else {
                              S42653=6;
                              if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 539, column: 24
                                S44028=0;
                                thread192084(tdone,ends);
                                thread192085(tdone,ends);
                                int biggest192086 = 0;
                                if(ends[69]>=biggest192086){
                                  biggest192086=ends[69];
                                }
                                if(ends[70]>=biggest192086){
                                  biggest192086=ends[70];
                                }
                                if(biggest192086 == 1){
                                  active[56]=1;
                                  ends[56]=1;
                                  tdone[56]=1;
                                }
                              }
                              else {
                                current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 570, column: 20
                                current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 20
                                currsigs.addElement(current_fill_55);
                                current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 571, column: 20
                                S42653=7;
                                S44500=0;
                                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                                  S44500=1;
                                  active[56]=1;
                                  ends[56]=1;
                                  tdone[56]=1;
                                }
                                else {
                                  S44495=0;
                                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                                    S44495=1;
                                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                                      ends[56]=2;
                                      ;//sysj\conveyor_controller.sysj line: 573, column: 20
                                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                                      S42653=8;
                                      S44727=0;
                                      active[56]=1;
                                      ends[56]=1;
                                      tdone[56]=1;
                                    }
                                    else {
                                      active[56]=1;
                                      ends[56]=1;
                                      tdone[56]=1;
                                    }
                                  }
                                  else {
                                    active[56]=1;
                                    ends[56]=1;
                                    tdone[56]=1;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      else {
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                    }
                    else {
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                  else {
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_56 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 427, column: 9
              ends[56]=2;
              ;//sysj\conveyor_controller.sysj line: 427, column: 9
              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 444, column: 20
              S42653=3;
              if(((filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 447, column: 24
                S42810=0;
                thread192087(tdone,ends);
                thread192088(tdone,ends);
                int biggest192089 = 0;
                if(ends[57]>=biggest192089){
                  biggest192089=ends[57];
                }
                if(ends[58]>=biggest192089){
                  biggest192089=ends[58];
                }
                if(biggest192089 == 1){
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
              }
              else {
                S42653=4;
                if(((filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 477, column: 24
                  S43158=0;
                  thread192090(tdone,ends);
                  thread192091(tdone,ends);
                  int biggest192092 = 0;
                  if(ends[61]>=biggest192092){
                    biggest192092=ends[61];
                  }
                  if(ends[62]>=biggest192092){
                    biggest192092=ends[62];
                  }
                  if(biggest192092 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  S42653=5;
                  if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 509, column: 24
                    S43564=0;
                    thread192093(tdone,ends);
                    thread192094(tdone,ends);
                    int biggest192095 = 0;
                    if(ends[65]>=biggest192095){
                      biggest192095=ends[65];
                    }
                    if(ends[66]>=biggest192095){
                      biggest192095=ends[66];
                    }
                    if(biggest192095 == 1){
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                  else {
                    S42653=6;
                    if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 539, column: 24
                      S44028=0;
                      thread192096(tdone,ends);
                      thread192097(tdone,ends);
                      int biggest192098 = 0;
                      if(ends[69]>=biggest192098){
                        biggest192098=ends[69];
                      }
                      if(ends[70]>=biggest192098){
                        biggest192098=ends[70];
                      }
                      if(biggest192098 == 1){
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                    }
                    else {
                      current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 570, column: 20
                      current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 20
                      currsigs.addElement(current_fill_55);
                      current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 571, column: 20
                      S42653=7;
                      S44500=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                        S44500=1;
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                      else {
                        S44495=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                          S44495=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                            ends[56]=2;
                            ;//sysj\conveyor_controller.sysj line: 573, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                            S42653=8;
                            S44727=0;
                            active[56]=1;
                            ends[56]=1;
                            tdone[56]=1;
                          }
                          else {
                            active[56]=1;
                            ends[56]=1;
                            tdone[56]=1;
                          }
                        }
                        else {
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                      }
                    }
                  }
                }
              }
            }
            else {
              active[56]=1;
              ends[56]=1;
              tdone[56]=1;
            }
            break;
          
          case 3 : 
            switch(S42810){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 449, column: 30
                  S42810=1;
                  thread192099(tdone,ends);
                  thread192100(tdone,ends);
                  int biggest192101 = 0;
                  if(ends[59]>=biggest192101){
                    biggest192101=ends[59];
                  }
                  if(ends[60]>=biggest192101){
                    biggest192101=ends[60];
                  }
                  if(biggest192101 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  thread192102(tdone,ends);
                  thread192103(tdone,ends);
                  int biggest192104 = 0;
                  if(ends[57]>=biggest192104){
                    biggest192104=ends[57];
                  }
                  if(ends[58]>=biggest192104){
                    biggest192104=ends[58];
                  }
                  if(biggest192104 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192104 == 0){
                    S42810=1;
                    thread192105(tdone,ends);
                    thread192106(tdone,ends);
                    int biggest192107 = 0;
                    if(ends[59]>=biggest192107){
                      biggest192107=ends[59];
                    }
                    if(ends[60]>=biggest192107){
                      biggest192107=ends[60];
                    }
                    if(biggest192107 == 1){
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 459, column: 30
                  System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 470, column: 24
                  current_thread_56 += (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 471, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 472, column: 24
                  current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 473, column: 24
                  currsigs.addElement(current_fill_55);
                  current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 473, column: 24
                  S42810=2;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  thread192108(tdone,ends);
                  thread192109(tdone,ends);
                  int biggest192110 = 0;
                  if(ends[59]>=biggest192110){
                    biggest192110=ends[59];
                  }
                  if(ends[60]>=biggest192110){
                    biggest192110=ends[60];
                  }
                  if(biggest192110 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192110 == 0){
                    System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 470, column: 24
                    current_thread_56 += (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 471, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 472, column: 24
                    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 473, column: 24
                    currsigs.addElement(current_fill_55);
                    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 473, column: 24
                    S42810=2;
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                break;
              
              case 2 : 
                S42810=2;
                S42653=4;
                if(((filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 477, column: 24
                  S43158=0;
                  thread192111(tdone,ends);
                  thread192112(tdone,ends);
                  int biggest192113 = 0;
                  if(ends[61]>=biggest192113){
                    biggest192113=ends[61];
                  }
                  if(ends[62]>=biggest192113){
                    biggest192113=ends[62];
                  }
                  if(biggest192113 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  S42653=5;
                  if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 509, column: 24
                    S43564=0;
                    thread192114(tdone,ends);
                    thread192115(tdone,ends);
                    int biggest192116 = 0;
                    if(ends[65]>=biggest192116){
                      biggest192116=ends[65];
                    }
                    if(ends[66]>=biggest192116){
                      biggest192116=ends[66];
                    }
                    if(biggest192116 == 1){
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                  else {
                    S42653=6;
                    if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 539, column: 24
                      S44028=0;
                      thread192117(tdone,ends);
                      thread192118(tdone,ends);
                      int biggest192119 = 0;
                      if(ends[69]>=biggest192119){
                        biggest192119=ends[69];
                      }
                      if(ends[70]>=biggest192119){
                        biggest192119=ends[70];
                      }
                      if(biggest192119 == 1){
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                    }
                    else {
                      current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 570, column: 20
                      current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 20
                      currsigs.addElement(current_fill_55);
                      current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 571, column: 20
                      S42653=7;
                      S44500=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                        S44500=1;
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                      else {
                        S44495=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                          S44495=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                            ends[56]=2;
                            ;//sysj\conveyor_controller.sysj line: 573, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                            S42653=8;
                            S44727=0;
                            active[56]=1;
                            ends[56]=1;
                            tdone[56]=1;
                          }
                          else {
                            active[56]=1;
                            ends[56]=1;
                            tdone[56]=1;
                          }
                        }
                        else {
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 4 : 
            switch(S43158){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 479, column: 30
                  S43158=1;
                  thread192120(tdone,ends);
                  thread192121(tdone,ends);
                  int biggest192122 = 0;
                  if(ends[63]>=biggest192122){
                    biggest192122=ends[63];
                  }
                  if(ends[64]>=biggest192122){
                    biggest192122=ends[64];
                  }
                  if(biggest192122 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  thread192123(tdone,ends);
                  thread192124(tdone,ends);
                  int biggest192125 = 0;
                  if(ends[61]>=biggest192125){
                    biggest192125=ends[61];
                  }
                  if(ends[62]>=biggest192125){
                    biggest192125=ends[62];
                  }
                  if(biggest192125 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192125 == 0){
                    S43158=1;
                    thread192126(tdone,ends);
                    thread192127(tdone,ends);
                    int biggest192128 = 0;
                    if(ends[63]>=biggest192128){
                      biggest192128=ends[63];
                    }
                    if(ends[64]>=biggest192128){
                      biggest192128=ends[64];
                    }
                    if(biggest192128 == 1){
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 491, column: 30
                  System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 502, column: 24
                  current_thread_56 += (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 503, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 504, column: 24
                  current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 505, column: 24
                  currsigs.addElement(current_fill_55);
                  current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 505, column: 24
                  S43158=2;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  thread192129(tdone,ends);
                  thread192130(tdone,ends);
                  int biggest192131 = 0;
                  if(ends[63]>=biggest192131){
                    biggest192131=ends[63];
                  }
                  if(ends[64]>=biggest192131){
                    biggest192131=ends[64];
                  }
                  if(biggest192131 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192131 == 0){
                    System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 502, column: 24
                    current_thread_56 += (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 503, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 504, column: 24
                    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 505, column: 24
                    currsigs.addElement(current_fill_55);
                    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 505, column: 24
                    S43158=2;
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                break;
              
              case 2 : 
                S43158=2;
                S42653=5;
                if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 509, column: 24
                  S43564=0;
                  thread192132(tdone,ends);
                  thread192133(tdone,ends);
                  int biggest192134 = 0;
                  if(ends[65]>=biggest192134){
                    biggest192134=ends[65];
                  }
                  if(ends[66]>=biggest192134){
                    biggest192134=ends[66];
                  }
                  if(biggest192134 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  S42653=6;
                  if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 539, column: 24
                    S44028=0;
                    thread192135(tdone,ends);
                    thread192136(tdone,ends);
                    int biggest192137 = 0;
                    if(ends[69]>=biggest192137){
                      biggest192137=ends[69];
                    }
                    if(ends[70]>=biggest192137){
                      biggest192137=ends[70];
                    }
                    if(biggest192137 == 1){
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                  else {
                    current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 570, column: 20
                    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 20
                    currsigs.addElement(current_fill_55);
                    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 571, column: 20
                    S42653=7;
                    S44500=0;
                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                      S44500=1;
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                    else {
                      S44495=0;
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                        S44495=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                          ends[56]=2;
                          ;//sysj\conveyor_controller.sysj line: 573, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                          S42653=8;
                          S44727=0;
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                        else {
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                      }
                      else {
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 5 : 
            switch(S43564){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 511, column: 30
                  S43564=1;
                  thread192138(tdone,ends);
                  thread192139(tdone,ends);
                  int biggest192140 = 0;
                  if(ends[67]>=biggest192140){
                    biggest192140=ends[67];
                  }
                  if(ends[68]>=biggest192140){
                    biggest192140=ends[68];
                  }
                  if(biggest192140 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  thread192141(tdone,ends);
                  thread192142(tdone,ends);
                  int biggest192143 = 0;
                  if(ends[65]>=biggest192143){
                    biggest192143=ends[65];
                  }
                  if(ends[66]>=biggest192143){
                    biggest192143=ends[66];
                  }
                  if(biggest192143 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192143 == 0){
                    S43564=1;
                    thread192144(tdone,ends);
                    thread192145(tdone,ends);
                    int biggest192146 = 0;
                    if(ends[67]>=biggest192146){
                      biggest192146=ends[67];
                    }
                    if(ends[68]>=biggest192146){
                      biggest192146=ends[68];
                    }
                    if(biggest192146 == 1){
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 521, column: 30
                  System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 532, column: 24
                  current_thread_56 += (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 533, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 534, column: 24
                  current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 535, column: 24
                  currsigs.addElement(current_fill_55);
                  current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 535, column: 24
                  S43564=2;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  thread192147(tdone,ends);
                  thread192148(tdone,ends);
                  int biggest192149 = 0;
                  if(ends[67]>=biggest192149){
                    biggest192149=ends[67];
                  }
                  if(ends[68]>=biggest192149){
                    biggest192149=ends[68];
                  }
                  if(biggest192149 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192149 == 0){
                    System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 532, column: 24
                    current_thread_56 += (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 533, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 534, column: 24
                    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 535, column: 24
                    currsigs.addElement(current_fill_55);
                    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 535, column: 24
                    S43564=2;
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                break;
              
              case 2 : 
                S43564=2;
                S42653=6;
                if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 539, column: 24
                  S44028=0;
                  thread192150(tdone,ends);
                  thread192151(tdone,ends);
                  int biggest192152 = 0;
                  if(ends[69]>=biggest192152){
                    biggest192152=ends[69];
                  }
                  if(ends[70]>=biggest192152){
                    biggest192152=ends[70];
                  }
                  if(biggest192152 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 570, column: 20
                  current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 20
                  currsigs.addElement(current_fill_55);
                  current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 571, column: 20
                  S42653=7;
                  S44500=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                    S44500=1;
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  else {
                    S44495=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                      S44495=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                        ends[56]=2;
                        ;//sysj\conveyor_controller.sysj line: 573, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                        S42653=8;
                        S44727=0;
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                      else {
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                    }
                    else {
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 6 : 
            switch(S44028){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 541, column: 30
                  S44028=1;
                  thread192153(tdone,ends);
                  thread192154(tdone,ends);
                  int biggest192155 = 0;
                  if(ends[71]>=biggest192155){
                    biggest192155=ends[71];
                  }
                  if(ends[72]>=biggest192155){
                    biggest192155=ends[72];
                  }
                  if(biggest192155 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  thread192156(tdone,ends);
                  thread192157(tdone,ends);
                  int biggest192158 = 0;
                  if(ends[69]>=biggest192158){
                    biggest192158=ends[69];
                  }
                  if(ends[70]>=biggest192158){
                    biggest192158=ends[70];
                  }
                  if(biggest192158 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192158 == 0){
                    S44028=1;
                    thread192159(tdone,ends);
                    thread192160(tdone,ends);
                    int biggest192161 = 0;
                    if(ends[71]>=biggest192161){
                      biggest192161=ends[71];
                    }
                    if(ends[72]>=biggest192161){
                      biggest192161=ends[72];
                    }
                    if(biggest192161 == 1){
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 551, column: 30
                  System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 562, column: 24
                  current_thread_56 += (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 563, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 564, column: 24
                  S44028=2;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  thread192162(tdone,ends);
                  thread192163(tdone,ends);
                  int biggest192164 = 0;
                  if(ends[71]>=biggest192164){
                    biggest192164=ends[71];
                  }
                  if(ends[72]>=biggest192164){
                    biggest192164=ends[72];
                  }
                  if(biggest192164 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192164 == 0){
                    System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 562, column: 24
                    current_thread_56 += (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 563, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 564, column: 24
                    S44028=2;
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                break;
              
              case 2 : 
                S44028=2;
                current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 570, column: 20
                current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 20
                currsigs.addElement(current_fill_55);
                current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 571, column: 20
                S42653=7;
                S44500=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                  S44500=1;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  S44495=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                    S44495=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                      ends[56]=2;
                      ;//sysj\conveyor_controller.sysj line: 573, column: 20
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                      S42653=8;
                      S44727=0;
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                    else {
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                  else {
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 7 : 
            switch(S44500){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                  S44500=1;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  switch(S44495){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                        S44495=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                          ends[56]=2;
                          ;//sysj\conveyor_controller.sysj line: 573, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                          S42653=8;
                          S44727=0;
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                        else {
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                      }
                      else {
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                        ends[56]=2;
                        ;//sysj\conveyor_controller.sysj line: 573, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                        S42653=8;
                        S44727=0;
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                      else {
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S44500=1;
                S44500=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                  S44500=1;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  S44495=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                    S44495=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                      ends[56]=2;
                      ;//sysj\conveyor_controller.sysj line: 573, column: 20
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                      S42653=8;
                      S44727=0;
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                    else {
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                  else {
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S44727){
              case 0 : 
                if(!bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 577, column: 30
                  S44727=1;
                  if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 579, column: 36
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  else {
                    ends[56]=2;
                    ;//sysj\conveyor_controller.sysj line: 576, column: 20
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 439, column: 20
                    S42653=0;
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 579, column: 36
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  ends[56]=2;
                  ;//sysj\conveyor_controller.sysj line: 576, column: 20
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 439, column: 20
                  S42653=0;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192035(int [] tdone, int [] ends){
        S65177=1;
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread192034(int [] tdone, int [] ends){
        S65174=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 622, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread192033(int [] tdone, int [] ends){
        S65204=1;
    S65180=0;
    if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 619, column: 26
      thread192034(tdone,ends);
      thread192035(tdone,ends);
      int biggest192036 = 0;
      if(ends[76]>=biggest192036){
        biggest192036=ends[76];
      }
      if(ends[77]>=biggest192036){
        biggest192036=ends[77];
      }
      if(biggest192036 == 1){
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
      }
    }
    else {
      S65180=1;
      active[75]=1;
      ends[75]=1;
      tdone[75]=1;
    }
  }

  public void thread192032(int [] tdone, int [] ends){
        S65169=1;
    S65113=0;
    S65093=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 604, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
      S65093=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
    else {
      S65088=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 604, column: 12
        S65088=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
          ends[74]=2;
          ;//sysj\conveyor_controller.sysj line: 604, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 605, column: 15
            bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 606, column: 13
            currsigs.addElement(bottleAtPos2_55);
            S65113=1;
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
          }
          else {
            done_55.setPresent();//sysj\conveyor_controller.sysj line: 609, column: 13
            currsigs.addElement(done_55);
            S65113=1;
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
      else {
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
  }

  public void thread192031(int [] tdone, int [] ends){
        S65086=1;
    filler1_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 591, column: 11
    currsigs.addElement(filler1_amount_55);
    filler1_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 591, column: 11
    filler2_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 592, column: 8
    currsigs.addElement(filler2_amount_55);
    filler2_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 592, column: 8
    filler3_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 593, column: 8
    currsigs.addElement(filler3_amount_55);
    filler3_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 593, column: 8
    filler4_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 594, column: 8
    currsigs.addElement(filler4_amount_55);
    filler4_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 594, column: 8
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread192030(int [] tdone, int [] ends){
        S65081=1;
    current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 428, column: 16
    total_thread_56 = 100;//sysj\conveyor_controller.sysj line: 429, column: 16
    total_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 430, column: 16
    currsigs.addElement(total_fill_55);
    total_fill_55.setValue(total_thread_56);//sysj\conveyor_controller.sysj line: 430, column: 16
    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 431, column: 16
    currsigs.addElement(current_fill_55);
    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 431, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 439, column: 20
    S42653=0;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread192027(int [] tdone, int [] ends){
        S65177=1;
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread192026(int [] tdone, int [] ends){
        S65174=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 622, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread192025(int [] tdone, int [] ends){
        S65204=1;
    S65180=0;
    if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 619, column: 26
      thread192026(tdone,ends);
      thread192027(tdone,ends);
      int biggest192028 = 0;
      if(ends[76]>=biggest192028){
        biggest192028=ends[76];
      }
      if(ends[77]>=biggest192028){
        biggest192028=ends[77];
      }
      if(biggest192028 == 1){
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
      }
    }
    else {
      S65180=1;
      active[75]=1;
      ends[75]=1;
      tdone[75]=1;
    }
  }

  public void thread192024(int [] tdone, int [] ends){
        S65169=1;
    S65113=0;
    S65093=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 604, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
      S65093=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
    else {
      S65088=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 604, column: 12
        S65088=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
          ends[74]=2;
          ;//sysj\conveyor_controller.sysj line: 604, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 605, column: 15
            bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 606, column: 13
            currsigs.addElement(bottleAtPos2_55);
            S65113=1;
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
          }
          else {
            done_55.setPresent();//sysj\conveyor_controller.sysj line: 609, column: 13
            currsigs.addElement(done_55);
            S65113=1;
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
      else {
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
  }

  public void thread192023(int [] tdone, int [] ends){
        S65086=1;
    filler1_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 591, column: 11
    currsigs.addElement(filler1_amount_55);
    filler1_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 591, column: 11
    filler2_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 592, column: 8
    currsigs.addElement(filler2_amount_55);
    filler2_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 592, column: 8
    filler3_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 593, column: 8
    currsigs.addElement(filler3_amount_55);
    filler3_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 593, column: 8
    filler4_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 594, column: 8
    currsigs.addElement(filler4_amount_55);
    filler4_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 594, column: 8
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread192022(int [] tdone, int [] ends){
        S65081=1;
    current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 428, column: 16
    total_thread_56 = 100;//sysj\conveyor_controller.sysj line: 429, column: 16
    total_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 430, column: 16
    currsigs.addElement(total_fill_55);
    total_fill_55.setValue(total_thread_56);//sysj\conveyor_controller.sysj line: 430, column: 16
    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 431, column: 16
    currsigs.addElement(current_fill_55);
    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 431, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 439, column: 20
    S42653=0;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread192019(int [] tdone, int [] ends){
        S65177=1;
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread192018(int [] tdone, int [] ends){
        S65174=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 622, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread192017(int [] tdone, int [] ends){
        S65204=1;
    S65180=0;
    if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 619, column: 26
      thread192018(tdone,ends);
      thread192019(tdone,ends);
      int biggest192020 = 0;
      if(ends[76]>=biggest192020){
        biggest192020=ends[76];
      }
      if(ends[77]>=biggest192020){
        biggest192020=ends[77];
      }
      if(biggest192020 == 1){
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
      }
    }
    else {
      S65180=1;
      active[75]=1;
      ends[75]=1;
      tdone[75]=1;
    }
  }

  public void thread192016(int [] tdone, int [] ends){
        S65169=1;
    S65113=0;
    S65093=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 604, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
      S65093=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
    else {
      S65088=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 604, column: 12
        S65088=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
          ends[74]=2;
          ;//sysj\conveyor_controller.sysj line: 604, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 605, column: 15
            bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 606, column: 13
            currsigs.addElement(bottleAtPos2_55);
            S65113=1;
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
          }
          else {
            done_55.setPresent();//sysj\conveyor_controller.sysj line: 609, column: 13
            currsigs.addElement(done_55);
            S65113=1;
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
      else {
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
  }

  public void thread192015(int [] tdone, int [] ends){
        S65086=1;
    filler1_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 591, column: 11
    currsigs.addElement(filler1_amount_55);
    filler1_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 591, column: 11
    filler2_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 592, column: 8
    currsigs.addElement(filler2_amount_55);
    filler2_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 592, column: 8
    filler3_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 593, column: 8
    currsigs.addElement(filler3_amount_55);
    filler3_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 593, column: 8
    filler4_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 594, column: 8
    currsigs.addElement(filler4_amount_55);
    filler4_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 594, column: 8
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread192014(int [] tdone, int [] ends){
        S65081=1;
    current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 428, column: 16
    total_thread_56 = 100;//sysj\conveyor_controller.sysj line: 429, column: 16
    total_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 430, column: 16
    currsigs.addElement(total_fill_55);
    total_fill_55.setValue(total_thread_56);//sysj\conveyor_controller.sysj line: 430, column: 16
    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 431, column: 16
    currsigs.addElement(current_fill_55);
    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 431, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 439, column: 20
    S42653=0;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread192011(int [] tdone, int [] ends){
        S65177=1;
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread192010(int [] tdone, int [] ends){
        S65174=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 622, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread192009(int [] tdone, int [] ends){
        S65204=1;
    S65180=0;
    if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 619, column: 26
      thread192010(tdone,ends);
      thread192011(tdone,ends);
      int biggest192012 = 0;
      if(ends[76]>=biggest192012){
        biggest192012=ends[76];
      }
      if(ends[77]>=biggest192012){
        biggest192012=ends[77];
      }
      if(biggest192012 == 1){
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
      }
    }
    else {
      S65180=1;
      active[75]=1;
      ends[75]=1;
      tdone[75]=1;
    }
  }

  public void thread192008(int [] tdone, int [] ends){
        S65169=1;
    S65113=0;
    S65093=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 604, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
      S65093=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
    else {
      S65088=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 604, column: 12
        S65088=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
          ends[74]=2;
          ;//sysj\conveyor_controller.sysj line: 604, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 605, column: 15
            bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 606, column: 13
            currsigs.addElement(bottleAtPos2_55);
            S65113=1;
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
          }
          else {
            done_55.setPresent();//sysj\conveyor_controller.sysj line: 609, column: 13
            currsigs.addElement(done_55);
            S65113=1;
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
      else {
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
  }

  public void thread192007(int [] tdone, int [] ends){
        S65086=1;
    filler1_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 591, column: 11
    currsigs.addElement(filler1_amount_55);
    filler1_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 591, column: 11
    filler2_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 592, column: 8
    currsigs.addElement(filler2_amount_55);
    filler2_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 592, column: 8
    filler3_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 593, column: 8
    currsigs.addElement(filler3_amount_55);
    filler3_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 593, column: 8
    filler4_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 594, column: 8
    currsigs.addElement(filler4_amount_55);
    filler4_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 594, column: 8
    active[73]=1;
    ends[73]=1;
    tdone[73]=1;
  }

  public void thread192006(int [] tdone, int [] ends){
        S65081=1;
    current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 428, column: 16
    total_thread_56 = 100;//sysj\conveyor_controller.sysj line: 429, column: 16
    total_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 430, column: 16
    currsigs.addElement(total_fill_55);
    total_fill_55.setValue(total_thread_56);//sysj\conveyor_controller.sysj line: 430, column: 16
    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 431, column: 16
    currsigs.addElement(current_fill_55);
    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 431, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 439, column: 20
    S42653=0;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S132871){
        case 0 : 
          S132871=0;
          break RUN;
        
        case 1 : 
          S132871=2;
          S132871=2;
          filler1_55.setClear();//sysj\conveyor_controller.sysj line: 418, column: 9
          filler2_55.setClear();//sysj\conveyor_controller.sysj line: 418, column: 9
          filler3_55.setClear();//sysj\conveyor_controller.sysj line: 418, column: 9
          filler4_55.setClear();//sysj\conveyor_controller.sysj line: 418, column: 9
          done_55.setClear();//sysj\conveyor_controller.sysj line: 418, column: 9
          filler1_amount_55.setClear();//sysj\conveyor_controller.sysj line: 420, column: 9
          filler2_amount_55.setClear();//sysj\conveyor_controller.sysj line: 420, column: 9
          filler3_amount_55.setClear();//sysj\conveyor_controller.sysj line: 420, column: 9
          filler4_amount_55.setClear();//sysj\conveyor_controller.sysj line: 420, column: 9
          current_fill_55.setClear();//sysj\conveyor_controller.sysj line: 421, column: 9
          total_fill_55.setClear();//sysj\conveyor_controller.sysj line: 421, column: 9
          bottleAtPos2_55.setClear();//sysj\conveyor_controller.sysj line: 423, column: 9
          S132870=0;
          S42634=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 425, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 425, column: 9
            S42634=1;
            active[55]=1;
            ends[55]=1;
            break RUN;
          }
          else {
            S42629=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 425, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 425, column: 9
              S42629=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 425, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 425, column: 9
                ends[55]=2;
                ;//sysj\conveyor_controller.sysj line: 425, column: 9
                S132870=1;
                thread192006(tdone,ends);
                thread192007(tdone,ends);
                thread192008(tdone,ends);
                thread192009(tdone,ends);
                int biggest192013 = 0;
                if(ends[56]>=biggest192013){
                  biggest192013=ends[56];
                }
                if(ends[73]>=biggest192013){
                  biggest192013=ends[73];
                }
                if(ends[74]>=biggest192013){
                  biggest192013=ends[74];
                }
                if(ends[75]>=biggest192013){
                  biggest192013=ends[75];
                }
                if(biggest192013 == 1){
                  active[55]=1;
                  ends[55]=1;
                  break RUN;
                }
              }
              else {
                active[55]=1;
                ends[55]=1;
                break RUN;
              }
            }
            else {
              active[55]=1;
              ends[55]=1;
              break RUN;
            }
          }
        
        case 2 : 
          filler1_55.setClear();//sysj\conveyor_controller.sysj line: 418, column: 9
          filler2_55.setClear();//sysj\conveyor_controller.sysj line: 418, column: 9
          filler3_55.setClear();//sysj\conveyor_controller.sysj line: 418, column: 9
          filler4_55.setClear();//sysj\conveyor_controller.sysj line: 418, column: 9
          done_55.setClear();//sysj\conveyor_controller.sysj line: 418, column: 9
          filler1_amount_55.setClear();//sysj\conveyor_controller.sysj line: 420, column: 9
          filler2_amount_55.setClear();//sysj\conveyor_controller.sysj line: 420, column: 9
          filler3_amount_55.setClear();//sysj\conveyor_controller.sysj line: 420, column: 9
          filler4_amount_55.setClear();//sysj\conveyor_controller.sysj line: 420, column: 9
          current_fill_55.setClear();//sysj\conveyor_controller.sysj line: 421, column: 9
          total_fill_55.setClear();//sysj\conveyor_controller.sysj line: 421, column: 9
          bottleAtPos2_55.setClear();//sysj\conveyor_controller.sysj line: 423, column: 9
          switch(S132870){
            case 0 : 
              switch(S42634){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 425, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 425, column: 9
                    S42634=1;
                    active[55]=1;
                    ends[55]=1;
                    break RUN;
                  }
                  else {
                    switch(S42629){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 425, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 425, column: 9
                          S42629=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 425, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 425, column: 9
                            ends[55]=2;
                            ;//sysj\conveyor_controller.sysj line: 425, column: 9
                            S132870=1;
                            thread192014(tdone,ends);
                            thread192015(tdone,ends);
                            thread192016(tdone,ends);
                            thread192017(tdone,ends);
                            int biggest192021 = 0;
                            if(ends[56]>=biggest192021){
                              biggest192021=ends[56];
                            }
                            if(ends[73]>=biggest192021){
                              biggest192021=ends[73];
                            }
                            if(ends[74]>=biggest192021){
                              biggest192021=ends[74];
                            }
                            if(ends[75]>=biggest192021){
                              biggest192021=ends[75];
                            }
                            if(biggest192021 == 1){
                              active[55]=1;
                              ends[55]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[55]=1;
                            ends[55]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[55]=1;
                          ends[55]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 425, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 425, column: 9
                          ends[55]=2;
                          ;//sysj\conveyor_controller.sysj line: 425, column: 9
                          S132870=1;
                          thread192022(tdone,ends);
                          thread192023(tdone,ends);
                          thread192024(tdone,ends);
                          thread192025(tdone,ends);
                          int biggest192029 = 0;
                          if(ends[56]>=biggest192029){
                            biggest192029=ends[56];
                          }
                          if(ends[73]>=biggest192029){
                            biggest192029=ends[73];
                          }
                          if(ends[74]>=biggest192029){
                            biggest192029=ends[74];
                          }
                          if(ends[75]>=biggest192029){
                            biggest192029=ends[75];
                          }
                          if(biggest192029 == 1){
                            active[55]=1;
                            ends[55]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[55]=1;
                          ends[55]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S42634=1;
                  S42634=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 425, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 425, column: 9
                    S42634=1;
                    active[55]=1;
                    ends[55]=1;
                    break RUN;
                  }
                  else {
                    S42629=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 425, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 425, column: 9
                      S42629=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 425, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 425, column: 9
                        ends[55]=2;
                        ;//sysj\conveyor_controller.sysj line: 425, column: 9
                        S132870=1;
                        thread192030(tdone,ends);
                        thread192031(tdone,ends);
                        thread192032(tdone,ends);
                        thread192033(tdone,ends);
                        int biggest192037 = 0;
                        if(ends[56]>=biggest192037){
                          biggest192037=ends[56];
                        }
                        if(ends[73]>=biggest192037){
                          biggest192037=ends[73];
                        }
                        if(ends[74]>=biggest192037){
                          biggest192037=ends[74];
                        }
                        if(ends[75]>=biggest192037){
                          biggest192037=ends[75];
                        }
                        if(biggest192037 == 1){
                          active[55]=1;
                          ends[55]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[55]=1;
                        ends[55]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[55]=1;
                      ends[55]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread192038(tdone,ends);
              thread192165(tdone,ends);
              thread192166(tdone,ends);
              thread192167(tdone,ends);
              int biggest192174 = 0;
              if(ends[56]>=biggest192174){
                biggest192174=ends[56];
              }
              if(ends[73]>=biggest192174){
                biggest192174=ends[73];
              }
              if(ends[74]>=biggest192174){
                biggest192174=ends[74];
              }
              if(ends[75]>=biggest192174){
                biggest192174=ends[75];
              }
              if(biggest192174 == 1){
                active[55]=1;
                ends[55]=1;
                break RUN;
              }
              //FINXME code
              if(biggest192174 == 0){
                S132871=0;
                active[55]=0;
                ends[55]=0;
                S132871=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    filler1_55 = new Signal();
    filler2_55 = new Signal();
    filler3_55 = new Signal();
    filler4_55 = new Signal();
    done_55 = new Signal();
    filler1_amount_55 = new Signal();
    filler2_amount_55 = new Signal();
    filler3_amount_55 = new Signal();
    filler4_amount_55 = new Signal();
    current_fill_55 = new Signal();
    total_fill_55 = new Signal();
    bottleAtPos2_55 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[55] != 0){
      int index = 55;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[55]!=0 || suspended[55]!=0 || active[55]!=1);
      else{
        if(!df){
          simFiller_in.gethook();
          fillerReady_o.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          fileReadSignal.gethook();
          ordered.gethook();
          orderFill_1.gethook();
          orderFill_2.gethook();
          orderFill_3.gethook();
          orderFill_4.gethook();
          df = true;
        }
        runClockDomain();
      }
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      fileReadSignal.setpreclear();
      ordered.setpreclear();
      orderFill_1.setpreclear();
      orderFill_2.setpreclear();
      orderFill_3.setpreclear();
      orderFill_4.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      bottleAtPos2E.setpreclear();
      order_finished.setpreclear();
      filler1_55.setpreclear();
      filler2_55.setpreclear();
      filler3_55.setpreclear();
      filler4_55.setpreclear();
      done_55.setpreclear();
      filler1_amount_55.setpreclear();
      filler2_amount_55.setpreclear();
      filler3_amount_55.setpreclear();
      filler4_amount_55.setpreclear();
      current_fill_55.setpreclear();
      total_fill_55.setpreclear();
      bottleAtPos2_55.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = dosUnitEvac.getStatus() ? dosUnitEvac.setprepresent() : dosUnitEvac.setpreclear();
      dosUnitEvac.setpreval(dosUnitEvac.getValue());
      dosUnitEvac.setClear();
      dummyint = dosUnitFilled.getStatus() ? dosUnitFilled.setprepresent() : dosUnitFilled.setpreclear();
      dosUnitFilled.setpreval(dosUnitFilled.getValue());
      dosUnitFilled.setClear();
      dummyint = fileReadSignal.getStatus() ? fileReadSignal.setprepresent() : fileReadSignal.setpreclear();
      fileReadSignal.setpreval(fileReadSignal.getValue());
      fileReadSignal.setClear();
      dummyint = ordered.getStatus() ? ordered.setprepresent() : ordered.setpreclear();
      ordered.setpreval(ordered.getValue());
      ordered.setClear();
      dummyint = orderFill_1.getStatus() ? orderFill_1.setprepresent() : orderFill_1.setpreclear();
      orderFill_1.setpreval(orderFill_1.getValue());
      orderFill_1.setClear();
      dummyint = orderFill_2.getStatus() ? orderFill_2.setprepresent() : orderFill_2.setpreclear();
      orderFill_2.setpreval(orderFill_2.getValue());
      orderFill_2.setClear();
      dummyint = orderFill_3.getStatus() ? orderFill_3.setprepresent() : orderFill_3.setpreclear();
      orderFill_3.setpreval(orderFill_3.getValue());
      orderFill_3.setClear();
      dummyint = orderFill_4.getStatus() ? orderFill_4.setprepresent() : orderFill_4.setpreclear();
      orderFill_4.setpreval(orderFill_4.getValue());
      orderFill_4.setClear();
      valveInjectorOnOff.sethook();
      valveInjectorOnOff.setClear();
      valveInletOnOff.sethook();
      valveInletOnOff.setClear();
      dosUnitValveRetract.sethook();
      dosUnitValveRetract.setClear();
      dosUnitValveExtend.sethook();
      dosUnitValveExtend.setClear();
      bottleAtPos2E.sethook();
      bottleAtPos2E.setClear();
      order_finished.sethook();
      order_finished.setClear();
      filler1_55.setClear();
      filler2_55.setClear();
      filler3_55.setClear();
      filler4_55.setClear();
      done_55.setClear();
      filler1_amount_55.setClear();
      filler2_amount_55.setClear();
      filler3_amount_55.setClear();
      filler4_amount_55.setClear();
      current_fill_55.setClear();
      total_fill_55.setClear();
      bottleAtPos2_55.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[55]!=0 || suspended[55]!=0 || active[55]!=1);
      else{
        simFiller_in.gethook();
        fillerReady_o.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
        fileReadSignal.gethook();
        ordered.gethook();
        orderFill_1.gethook();
        orderFill_2.gethook();
        orderFill_3.gethook();
        orderFill_4.gethook();
      }
      runFinisher();
      if(active[55] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
