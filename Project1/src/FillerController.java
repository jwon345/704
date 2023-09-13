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
  private int S132991 = 1;
  private int S132990 = 1;
  private int S42754 = 1;
  private int S42749 = 1;
  private int S65201 = 1;
  private int S42773 = 1;
  private int S42780 = 1;
  private int S42775 = 1;
  private int S42930 = 1;
  private int S42881 = 1;
  private int S42886 = 1;
  private int S42895 = 1;
  private int S42900 = 1;
  private int S43278 = 1;
  private int S43229 = 1;
  private int S43234 = 1;
  private int S43243 = 1;
  private int S43248 = 1;
  private int S43684 = 1;
  private int S43635 = 1;
  private int S43640 = 1;
  private int S43649 = 1;
  private int S43654 = 1;
  private int S44148 = 1;
  private int S44099 = 1;
  private int S44104 = 1;
  private int S44113 = 1;
  private int S44118 = 1;
  private int S44620 = 1;
  private int S44615 = 1;
  private int S44847 = 1;
  private int S65206 = 1;
  private int S65289 = 1;
  private int S65233 = 1;
  private int S65213 = 1;
  private int S65208 = 1;
  private int S65324 = 1;
  private int S65300 = 1;
  private int S65294 = 1;
  private int S65297 = 1;
  
  private int[] ends = new int[105];
  private int[] tdone = new int[105];
  
  public void thread192292(int [] tdone, int [] ends){
        S65297=1;
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread192291(int [] tdone, int [] ends){
        S65294=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 622, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread192289(int [] tdone, int [] ends){
        switch(S65297){
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

  public void thread192288(int [] tdone, int [] ends){
        switch(S65294){
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

  public void thread192287(int [] tdone, int [] ends){
        switch(S65324){
      case 0 : 
        active[75]=0;
        ends[75]=0;
        tdone[75]=1;
        break;
      
      case 1 : 
        switch(S65300){
          case 0 : 
            thread192288(tdone,ends);
            thread192289(tdone,ends);
            int biggest192290 = 0;
            if(ends[76]>=biggest192290){
              biggest192290=ends[76];
            }
            if(ends[77]>=biggest192290){
              biggest192290=ends[77];
            }
            if(biggest192290 == 1){
              active[75]=1;
              ends[75]=1;
              tdone[75]=1;
            }
            if(biggest192290 == 2){
              ends[75]=2;
              ;//sysj\conveyor_controller.sysj line: 620, column: 18
              S65300=1;
              active[75]=1;
              ends[75]=1;
              tdone[75]=1;
            }
            //FINXME code
            if(biggest192290 == 0){
              S65300=1;
              active[75]=1;
              ends[75]=1;
              tdone[75]=1;
            }
            break;
          
          case 1 : 
            S65300=1;
            S65300=0;
            if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 619, column: 26
              thread192291(tdone,ends);
              thread192292(tdone,ends);
              int biggest192293 = 0;
              if(ends[76]>=biggest192293){
                biggest192293=ends[76];
              }
              if(ends[77]>=biggest192293){
                biggest192293=ends[77];
              }
              if(biggest192293 == 1){
                active[75]=1;
                ends[75]=1;
                tdone[75]=1;
              }
            }
            else {
              S65300=1;
              active[75]=1;
              ends[75]=1;
              tdone[75]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192286(int [] tdone, int [] ends){
        switch(S65289){
      case 0 : 
        active[74]=0;
        ends[74]=0;
        tdone[74]=1;
        break;
      
      case 1 : 
        switch(S65233){
          case 0 : 
            switch(S65213){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 604, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
                  S65213=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  switch(S65208){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 604, column: 12
                        S65208=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
                          ends[74]=2;
                          ;//sysj\conveyor_controller.sysj line: 604, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 605, column: 15
                            bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 606, column: 13
                            currsigs.addElement(bottleAtPos2_55);
                            S65233=1;
                            active[74]=1;
                            ends[74]=1;
                            tdone[74]=1;
                          }
                          else {
                            done_55.setPresent();//sysj\conveyor_controller.sysj line: 609, column: 13
                            currsigs.addElement(done_55);
                            S65233=1;
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
                          S65233=1;
                          active[74]=1;
                          ends[74]=1;
                          tdone[74]=1;
                        }
                        else {
                          done_55.setPresent();//sysj\conveyor_controller.sysj line: 609, column: 13
                          currsigs.addElement(done_55);
                          S65233=1;
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
                S65213=1;
                S65213=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 604, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
                  S65213=1;
                  active[74]=1;
                  ends[74]=1;
                  tdone[74]=1;
                }
                else {
                  S65208=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 604, column: 12
                    S65208=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
                      ends[74]=2;
                      ;//sysj\conveyor_controller.sysj line: 604, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 605, column: 15
                        bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 606, column: 13
                        currsigs.addElement(bottleAtPos2_55);
                        S65233=1;
                        active[74]=1;
                        ends[74]=1;
                        tdone[74]=1;
                      }
                      else {
                        done_55.setPresent();//sysj\conveyor_controller.sysj line: 609, column: 13
                        currsigs.addElement(done_55);
                        S65233=1;
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
            S65233=1;
            S65233=0;
            S65213=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 604, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
              S65213=1;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            else {
              S65208=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 604, column: 12
                S65208=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
                  ends[74]=2;
                  ;//sysj\conveyor_controller.sysj line: 604, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 605, column: 15
                    bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 606, column: 13
                    currsigs.addElement(bottleAtPos2_55);
                    S65233=1;
                    active[74]=1;
                    ends[74]=1;
                    tdone[74]=1;
                  }
                  else {
                    done_55.setPresent();//sysj\conveyor_controller.sysj line: 609, column: 13
                    currsigs.addElement(done_55);
                    S65233=1;
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

  public void thread192285(int [] tdone, int [] ends){
        switch(S65206){
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

  public void thread192283(int [] tdone, int [] ends){
        switch(S44118){
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

  public void thread192282(int [] tdone, int [] ends){
        switch(S44113){
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

  public void thread192280(int [] tdone, int [] ends){
        S44118=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 558, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread192279(int [] tdone, int [] ends){
        S44113=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 553, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 554, column: 32
    currsigs.addElement(valveInletOnOff);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread192277(int [] tdone, int [] ends){
        switch(S44104){
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

  public void thread192276(int [] tdone, int [] ends){
        switch(S44099){
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

  public void thread192274(int [] tdone, int [] ends){
        S44118=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 558, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread192273(int [] tdone, int [] ends){
        S44113=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 553, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 554, column: 32
    currsigs.addElement(valveInletOnOff);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread192271(int [] tdone, int [] ends){
        S44104=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 548, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192270(int [] tdone, int [] ends){
        S44099=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 543, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192268(int [] tdone, int [] ends){
        switch(S43654){
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

  public void thread192267(int [] tdone, int [] ends){
        switch(S43649){
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

  public void thread192265(int [] tdone, int [] ends){
        S43654=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 528, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread192264(int [] tdone, int [] ends){
        S43649=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 523, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 32
    currsigs.addElement(valveInletOnOff);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread192262(int [] tdone, int [] ends){
        switch(S43640){
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

  public void thread192261(int [] tdone, int [] ends){
        switch(S43635){
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

  public void thread192259(int [] tdone, int [] ends){
        S43654=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 528, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread192258(int [] tdone, int [] ends){
        S43649=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 523, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 32
    currsigs.addElement(valveInletOnOff);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread192256(int [] tdone, int [] ends){
        S44104=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 548, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192255(int [] tdone, int [] ends){
        S44099=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 543, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192253(int [] tdone, int [] ends){
        S43640=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 518, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192252(int [] tdone, int [] ends){
        S43635=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 513, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 514, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192250(int [] tdone, int [] ends){
        switch(S43248){
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

  public void thread192249(int [] tdone, int [] ends){
        switch(S43243){
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

  public void thread192247(int [] tdone, int [] ends){
        S43248=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 498, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread192246(int [] tdone, int [] ends){
        S43243=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 493, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 494, column: 32
    currsigs.addElement(valveInletOnOff);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread192244(int [] tdone, int [] ends){
        switch(S43234){
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

  public void thread192243(int [] tdone, int [] ends){
        switch(S43229){
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

  public void thread192241(int [] tdone, int [] ends){
        S43248=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 498, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread192240(int [] tdone, int [] ends){
        S43243=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 493, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 494, column: 32
    currsigs.addElement(valveInletOnOff);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread192238(int [] tdone, int [] ends){
        S44104=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 548, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192237(int [] tdone, int [] ends){
        S44099=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 543, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192235(int [] tdone, int [] ends){
        S43640=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 518, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192234(int [] tdone, int [] ends){
        S43635=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 513, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 514, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192232(int [] tdone, int [] ends){
        S43234=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 486, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192231(int [] tdone, int [] ends){
        S43229=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 481, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192229(int [] tdone, int [] ends){
        switch(S42900){
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

  public void thread192228(int [] tdone, int [] ends){
        switch(S42895){
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

  public void thread192226(int [] tdone, int [] ends){
        S42900=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread192225(int [] tdone, int [] ends){
        S42895=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInletOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread192223(int [] tdone, int [] ends){
        switch(S42886){
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

  public void thread192222(int [] tdone, int [] ends){
        switch(S42881){
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

  public void thread192220(int [] tdone, int [] ends){
        S42900=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread192219(int [] tdone, int [] ends){
        S42895=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInletOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread192217(int [] tdone, int [] ends){
        S44104=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 548, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192216(int [] tdone, int [] ends){
        S44099=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 543, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192214(int [] tdone, int [] ends){
        S43640=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 518, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192213(int [] tdone, int [] ends){
        S43635=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 513, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 514, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192211(int [] tdone, int [] ends){
        S43234=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 486, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192210(int [] tdone, int [] ends){
        S43229=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 481, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192208(int [] tdone, int [] ends){
        S42886=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 456, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192207(int [] tdone, int [] ends){
        S42881=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 451, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread192205(int [] tdone, int [] ends){
        S44104=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 548, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192204(int [] tdone, int [] ends){
        S44099=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 543, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192202(int [] tdone, int [] ends){
        S43640=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 518, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192201(int [] tdone, int [] ends){
        S43635=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 513, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 514, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192199(int [] tdone, int [] ends){
        S43234=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 486, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192198(int [] tdone, int [] ends){
        S43229=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 481, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192196(int [] tdone, int [] ends){
        S42886=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 456, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192195(int [] tdone, int [] ends){
        S42881=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 451, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread192193(int [] tdone, int [] ends){
        S44104=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 548, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192192(int [] tdone, int [] ends){
        S44099=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 543, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192190(int [] tdone, int [] ends){
        S43640=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 518, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192189(int [] tdone, int [] ends){
        S43635=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 513, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 514, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192187(int [] tdone, int [] ends){
        S43234=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 486, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192186(int [] tdone, int [] ends){
        S43229=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 481, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192184(int [] tdone, int [] ends){
        S42886=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 456, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192183(int [] tdone, int [] ends){
        S42881=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 451, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread192181(int [] tdone, int [] ends){
        S44104=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 548, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192180(int [] tdone, int [] ends){
        S44099=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 543, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192178(int [] tdone, int [] ends){
        S43640=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 518, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192177(int [] tdone, int [] ends){
        S43635=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 513, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 514, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192175(int [] tdone, int [] ends){
        S43234=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 486, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192174(int [] tdone, int [] ends){
        S43229=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 481, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192172(int [] tdone, int [] ends){
        S42886=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 456, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192171(int [] tdone, int [] ends){
        S42881=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 451, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread192169(int [] tdone, int [] ends){
        S44104=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 548, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192168(int [] tdone, int [] ends){
        S44099=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 543, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192166(int [] tdone, int [] ends){
        S43640=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 518, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192165(int [] tdone, int [] ends){
        S43635=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 513, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 514, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192163(int [] tdone, int [] ends){
        S43234=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 486, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192162(int [] tdone, int [] ends){
        S43229=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 481, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192160(int [] tdone, int [] ends){
        S42886=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 456, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192159(int [] tdone, int [] ends){
        S42881=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 451, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread192158(int [] tdone, int [] ends){
        switch(S65201){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        switch(S42773){
          case 0 : 
            if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 440, column: 26
              S42773=1;
              S42780=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 441, column: 20
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 441, column: 20
                S42780=1;
                active[56]=1;
                ends[56]=1;
                tdone[56]=1;
              }
              else {
                S42775=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 441, column: 20
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 441, column: 20
                  S42775=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 441, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 441, column: 20
                    ends[56]=2;
                    ;//sysj\conveyor_controller.sysj line: 441, column: 20
                    S42773=2;
                    __start_thread_56 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 427, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_56 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 427, column: 9
                      ends[56]=2;
                      ;//sysj\conveyor_controller.sysj line: 427, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 444, column: 20
                      S42773=3;
                      if(((filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 447, column: 24
                        S42930=0;
                        thread192159(tdone,ends);
                        thread192160(tdone,ends);
                        int biggest192161 = 0;
                        if(ends[57]>=biggest192161){
                          biggest192161=ends[57];
                        }
                        if(ends[58]>=biggest192161){
                          biggest192161=ends[58];
                        }
                        if(biggest192161 == 1){
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                      }
                      else {
                        S42773=4;
                        if(((filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 477, column: 24
                          S43278=0;
                          thread192162(tdone,ends);
                          thread192163(tdone,ends);
                          int biggest192164 = 0;
                          if(ends[61]>=biggest192164){
                            biggest192164=ends[61];
                          }
                          if(ends[62]>=biggest192164){
                            biggest192164=ends[62];
                          }
                          if(biggest192164 == 1){
                            active[56]=1;
                            ends[56]=1;
                            tdone[56]=1;
                          }
                        }
                        else {
                          S42773=5;
                          if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 509, column: 24
                            S43684=0;
                            thread192165(tdone,ends);
                            thread192166(tdone,ends);
                            int biggest192167 = 0;
                            if(ends[65]>=biggest192167){
                              biggest192167=ends[65];
                            }
                            if(ends[66]>=biggest192167){
                              biggest192167=ends[66];
                            }
                            if(biggest192167 == 1){
                              active[56]=1;
                              ends[56]=1;
                              tdone[56]=1;
                            }
                          }
                          else {
                            S42773=6;
                            if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 539, column: 24
                              S44148=0;
                              thread192168(tdone,ends);
                              thread192169(tdone,ends);
                              int biggest192170 = 0;
                              if(ends[69]>=biggest192170){
                                biggest192170=ends[69];
                              }
                              if(ends[70]>=biggest192170){
                                biggest192170=ends[70];
                              }
                              if(biggest192170 == 1){
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
                              S42773=7;
                              S44620=0;
                              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                                S44620=1;
                                active[56]=1;
                                ends[56]=1;
                                tdone[56]=1;
                              }
                              else {
                                S44615=0;
                                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                                  S44615=1;
                                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                                    ends[56]=2;
                                    ;//sysj\conveyor_controller.sysj line: 573, column: 20
                                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                                    S42773=8;
                                    S44847=0;
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
            switch(S42780){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 441, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 441, column: 20
                  S42780=1;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  switch(S42775){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 441, column: 20
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 441, column: 20
                        S42775=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 441, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 441, column: 20
                          ends[56]=2;
                          ;//sysj\conveyor_controller.sysj line: 441, column: 20
                          S42773=2;
                          __start_thread_56 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 427, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_56 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 427, column: 9
                            ends[56]=2;
                            ;//sysj\conveyor_controller.sysj line: 427, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 444, column: 20
                            S42773=3;
                            if(((filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 447, column: 24
                              S42930=0;
                              thread192171(tdone,ends);
                              thread192172(tdone,ends);
                              int biggest192173 = 0;
                              if(ends[57]>=biggest192173){
                                biggest192173=ends[57];
                              }
                              if(ends[58]>=biggest192173){
                                biggest192173=ends[58];
                              }
                              if(biggest192173 == 1){
                                active[56]=1;
                                ends[56]=1;
                                tdone[56]=1;
                              }
                            }
                            else {
                              S42773=4;
                              if(((filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 477, column: 24
                                S43278=0;
                                thread192174(tdone,ends);
                                thread192175(tdone,ends);
                                int biggest192176 = 0;
                                if(ends[61]>=biggest192176){
                                  biggest192176=ends[61];
                                }
                                if(ends[62]>=biggest192176){
                                  biggest192176=ends[62];
                                }
                                if(biggest192176 == 1){
                                  active[56]=1;
                                  ends[56]=1;
                                  tdone[56]=1;
                                }
                              }
                              else {
                                S42773=5;
                                if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 509, column: 24
                                  S43684=0;
                                  thread192177(tdone,ends);
                                  thread192178(tdone,ends);
                                  int biggest192179 = 0;
                                  if(ends[65]>=biggest192179){
                                    biggest192179=ends[65];
                                  }
                                  if(ends[66]>=biggest192179){
                                    biggest192179=ends[66];
                                  }
                                  if(biggest192179 == 1){
                                    active[56]=1;
                                    ends[56]=1;
                                    tdone[56]=1;
                                  }
                                }
                                else {
                                  S42773=6;
                                  if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 539, column: 24
                                    S44148=0;
                                    thread192180(tdone,ends);
                                    thread192181(tdone,ends);
                                    int biggest192182 = 0;
                                    if(ends[69]>=biggest192182){
                                      biggest192182=ends[69];
                                    }
                                    if(ends[70]>=biggest192182){
                                      biggest192182=ends[70];
                                    }
                                    if(biggest192182 == 1){
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
                                    S42773=7;
                                    S44620=0;
                                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                                      S44620=1;
                                      active[56]=1;
                                      ends[56]=1;
                                      tdone[56]=1;
                                    }
                                    else {
                                      S44615=0;
                                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                                        S44615=1;
                                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                                          ends[56]=2;
                                          ;//sysj\conveyor_controller.sysj line: 573, column: 20
                                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                                          S42773=8;
                                          S44847=0;
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
                        S42773=2;
                        __start_thread_56 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 427, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_56 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 427, column: 9
                          ends[56]=2;
                          ;//sysj\conveyor_controller.sysj line: 427, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 444, column: 20
                          S42773=3;
                          if(((filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 447, column: 24
                            S42930=0;
                            thread192183(tdone,ends);
                            thread192184(tdone,ends);
                            int biggest192185 = 0;
                            if(ends[57]>=biggest192185){
                              biggest192185=ends[57];
                            }
                            if(ends[58]>=biggest192185){
                              biggest192185=ends[58];
                            }
                            if(biggest192185 == 1){
                              active[56]=1;
                              ends[56]=1;
                              tdone[56]=1;
                            }
                          }
                          else {
                            S42773=4;
                            if(((filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 477, column: 24
                              S43278=0;
                              thread192186(tdone,ends);
                              thread192187(tdone,ends);
                              int biggest192188 = 0;
                              if(ends[61]>=biggest192188){
                                biggest192188=ends[61];
                              }
                              if(ends[62]>=biggest192188){
                                biggest192188=ends[62];
                              }
                              if(biggest192188 == 1){
                                active[56]=1;
                                ends[56]=1;
                                tdone[56]=1;
                              }
                            }
                            else {
                              S42773=5;
                              if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 509, column: 24
                                S43684=0;
                                thread192189(tdone,ends);
                                thread192190(tdone,ends);
                                int biggest192191 = 0;
                                if(ends[65]>=biggest192191){
                                  biggest192191=ends[65];
                                }
                                if(ends[66]>=biggest192191){
                                  biggest192191=ends[66];
                                }
                                if(biggest192191 == 1){
                                  active[56]=1;
                                  ends[56]=1;
                                  tdone[56]=1;
                                }
                              }
                              else {
                                S42773=6;
                                if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 539, column: 24
                                  S44148=0;
                                  thread192192(tdone,ends);
                                  thread192193(tdone,ends);
                                  int biggest192194 = 0;
                                  if(ends[69]>=biggest192194){
                                    biggest192194=ends[69];
                                  }
                                  if(ends[70]>=biggest192194){
                                    biggest192194=ends[70];
                                  }
                                  if(biggest192194 == 1){
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
                                  S42773=7;
                                  S44620=0;
                                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                                    S44620=1;
                                    active[56]=1;
                                    ends[56]=1;
                                    tdone[56]=1;
                                  }
                                  else {
                                    S44615=0;
                                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                                      S44615=1;
                                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                                        ends[56]=2;
                                        ;//sysj\conveyor_controller.sysj line: 573, column: 20
                                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                                        S42773=8;
                                        S44847=0;
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
                S42780=1;
                S42780=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 441, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 441, column: 20
                  S42780=1;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  S42775=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 441, column: 20
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 441, column: 20
                    S42775=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 441, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 441, column: 20
                      ends[56]=2;
                      ;//sysj\conveyor_controller.sysj line: 441, column: 20
                      S42773=2;
                      __start_thread_56 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 427, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_56 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 427, column: 9
                        ends[56]=2;
                        ;//sysj\conveyor_controller.sysj line: 427, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 444, column: 20
                        S42773=3;
                        if(((filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 447, column: 24
                          S42930=0;
                          thread192195(tdone,ends);
                          thread192196(tdone,ends);
                          int biggest192197 = 0;
                          if(ends[57]>=biggest192197){
                            biggest192197=ends[57];
                          }
                          if(ends[58]>=biggest192197){
                            biggest192197=ends[58];
                          }
                          if(biggest192197 == 1){
                            active[56]=1;
                            ends[56]=1;
                            tdone[56]=1;
                          }
                        }
                        else {
                          S42773=4;
                          if(((filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 477, column: 24
                            S43278=0;
                            thread192198(tdone,ends);
                            thread192199(tdone,ends);
                            int biggest192200 = 0;
                            if(ends[61]>=biggest192200){
                              biggest192200=ends[61];
                            }
                            if(ends[62]>=biggest192200){
                              biggest192200=ends[62];
                            }
                            if(biggest192200 == 1){
                              active[56]=1;
                              ends[56]=1;
                              tdone[56]=1;
                            }
                          }
                          else {
                            S42773=5;
                            if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 509, column: 24
                              S43684=0;
                              thread192201(tdone,ends);
                              thread192202(tdone,ends);
                              int biggest192203 = 0;
                              if(ends[65]>=biggest192203){
                                biggest192203=ends[65];
                              }
                              if(ends[66]>=biggest192203){
                                biggest192203=ends[66];
                              }
                              if(biggest192203 == 1){
                                active[56]=1;
                                ends[56]=1;
                                tdone[56]=1;
                              }
                            }
                            else {
                              S42773=6;
                              if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 539, column: 24
                                S44148=0;
                                thread192204(tdone,ends);
                                thread192205(tdone,ends);
                                int biggest192206 = 0;
                                if(ends[69]>=biggest192206){
                                  biggest192206=ends[69];
                                }
                                if(ends[70]>=biggest192206){
                                  biggest192206=ends[70];
                                }
                                if(biggest192206 == 1){
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
                                S42773=7;
                                S44620=0;
                                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                                  S44620=1;
                                  active[56]=1;
                                  ends[56]=1;
                                  tdone[56]=1;
                                }
                                else {
                                  S44615=0;
                                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                                    S44615=1;
                                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                                      ends[56]=2;
                                      ;//sysj\conveyor_controller.sysj line: 573, column: 20
                                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                                      S42773=8;
                                      S44847=0;
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
              S42773=3;
              if(((filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 447, column: 24
                S42930=0;
                thread192207(tdone,ends);
                thread192208(tdone,ends);
                int biggest192209 = 0;
                if(ends[57]>=biggest192209){
                  biggest192209=ends[57];
                }
                if(ends[58]>=biggest192209){
                  biggest192209=ends[58];
                }
                if(biggest192209 == 1){
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
              }
              else {
                S42773=4;
                if(((filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 477, column: 24
                  S43278=0;
                  thread192210(tdone,ends);
                  thread192211(tdone,ends);
                  int biggest192212 = 0;
                  if(ends[61]>=biggest192212){
                    biggest192212=ends[61];
                  }
                  if(ends[62]>=biggest192212){
                    biggest192212=ends[62];
                  }
                  if(biggest192212 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  S42773=5;
                  if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 509, column: 24
                    S43684=0;
                    thread192213(tdone,ends);
                    thread192214(tdone,ends);
                    int biggest192215 = 0;
                    if(ends[65]>=biggest192215){
                      biggest192215=ends[65];
                    }
                    if(ends[66]>=biggest192215){
                      biggest192215=ends[66];
                    }
                    if(biggest192215 == 1){
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                  else {
                    S42773=6;
                    if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 539, column: 24
                      S44148=0;
                      thread192216(tdone,ends);
                      thread192217(tdone,ends);
                      int biggest192218 = 0;
                      if(ends[69]>=biggest192218){
                        biggest192218=ends[69];
                      }
                      if(ends[70]>=biggest192218){
                        biggest192218=ends[70];
                      }
                      if(biggest192218 == 1){
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
                      S42773=7;
                      S44620=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                        S44620=1;
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                      else {
                        S44615=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                          S44615=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                            ends[56]=2;
                            ;//sysj\conveyor_controller.sysj line: 573, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                            S42773=8;
                            S44847=0;
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
            switch(S42930){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 449, column: 30
                  S42930=1;
                  thread192219(tdone,ends);
                  thread192220(tdone,ends);
                  int biggest192221 = 0;
                  if(ends[59]>=biggest192221){
                    biggest192221=ends[59];
                  }
                  if(ends[60]>=biggest192221){
                    biggest192221=ends[60];
                  }
                  if(biggest192221 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  thread192222(tdone,ends);
                  thread192223(tdone,ends);
                  int biggest192224 = 0;
                  if(ends[57]>=biggest192224){
                    biggest192224=ends[57];
                  }
                  if(ends[58]>=biggest192224){
                    biggest192224=ends[58];
                  }
                  if(biggest192224 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192224 == 0){
                    S42930=1;
                    thread192225(tdone,ends);
                    thread192226(tdone,ends);
                    int biggest192227 = 0;
                    if(ends[59]>=biggest192227){
                      biggest192227=ends[59];
                    }
                    if(ends[60]>=biggest192227){
                      biggest192227=ends[60];
                    }
                    if(biggest192227 == 1){
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
                  S42930=2;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  thread192228(tdone,ends);
                  thread192229(tdone,ends);
                  int biggest192230 = 0;
                  if(ends[59]>=biggest192230){
                    biggest192230=ends[59];
                  }
                  if(ends[60]>=biggest192230){
                    biggest192230=ends[60];
                  }
                  if(biggest192230 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192230 == 0){
                    System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 470, column: 24
                    current_thread_56 += (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 471, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 472, column: 24
                    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 473, column: 24
                    currsigs.addElement(current_fill_55);
                    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 473, column: 24
                    S42930=2;
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                break;
              
              case 2 : 
                S42930=2;
                S42773=4;
                if(((filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 477, column: 24
                  S43278=0;
                  thread192231(tdone,ends);
                  thread192232(tdone,ends);
                  int biggest192233 = 0;
                  if(ends[61]>=biggest192233){
                    biggest192233=ends[61];
                  }
                  if(ends[62]>=biggest192233){
                    biggest192233=ends[62];
                  }
                  if(biggest192233 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  S42773=5;
                  if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 509, column: 24
                    S43684=0;
                    thread192234(tdone,ends);
                    thread192235(tdone,ends);
                    int biggest192236 = 0;
                    if(ends[65]>=biggest192236){
                      biggest192236=ends[65];
                    }
                    if(ends[66]>=biggest192236){
                      biggest192236=ends[66];
                    }
                    if(biggest192236 == 1){
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                  else {
                    S42773=6;
                    if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 539, column: 24
                      S44148=0;
                      thread192237(tdone,ends);
                      thread192238(tdone,ends);
                      int biggest192239 = 0;
                      if(ends[69]>=biggest192239){
                        biggest192239=ends[69];
                      }
                      if(ends[70]>=biggest192239){
                        biggest192239=ends[70];
                      }
                      if(biggest192239 == 1){
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
                      S42773=7;
                      S44620=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                        S44620=1;
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                      else {
                        S44615=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                          S44615=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                            ends[56]=2;
                            ;//sysj\conveyor_controller.sysj line: 573, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                            S42773=8;
                            S44847=0;
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
            switch(S43278){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 479, column: 30
                  S43278=1;
                  thread192240(tdone,ends);
                  thread192241(tdone,ends);
                  int biggest192242 = 0;
                  if(ends[63]>=biggest192242){
                    biggest192242=ends[63];
                  }
                  if(ends[64]>=biggest192242){
                    biggest192242=ends[64];
                  }
                  if(biggest192242 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  thread192243(tdone,ends);
                  thread192244(tdone,ends);
                  int biggest192245 = 0;
                  if(ends[61]>=biggest192245){
                    biggest192245=ends[61];
                  }
                  if(ends[62]>=biggest192245){
                    biggest192245=ends[62];
                  }
                  if(biggest192245 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192245 == 0){
                    S43278=1;
                    thread192246(tdone,ends);
                    thread192247(tdone,ends);
                    int biggest192248 = 0;
                    if(ends[63]>=biggest192248){
                      biggest192248=ends[63];
                    }
                    if(ends[64]>=biggest192248){
                      biggest192248=ends[64];
                    }
                    if(biggest192248 == 1){
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
                  S43278=2;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  thread192249(tdone,ends);
                  thread192250(tdone,ends);
                  int biggest192251 = 0;
                  if(ends[63]>=biggest192251){
                    biggest192251=ends[63];
                  }
                  if(ends[64]>=biggest192251){
                    biggest192251=ends[64];
                  }
                  if(biggest192251 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192251 == 0){
                    System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 502, column: 24
                    current_thread_56 += (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 503, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 504, column: 24
                    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 505, column: 24
                    currsigs.addElement(current_fill_55);
                    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 505, column: 24
                    S43278=2;
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                break;
              
              case 2 : 
                S43278=2;
                S42773=5;
                if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 509, column: 24
                  S43684=0;
                  thread192252(tdone,ends);
                  thread192253(tdone,ends);
                  int biggest192254 = 0;
                  if(ends[65]>=biggest192254){
                    biggest192254=ends[65];
                  }
                  if(ends[66]>=biggest192254){
                    biggest192254=ends[66];
                  }
                  if(biggest192254 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  S42773=6;
                  if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 539, column: 24
                    S44148=0;
                    thread192255(tdone,ends);
                    thread192256(tdone,ends);
                    int biggest192257 = 0;
                    if(ends[69]>=biggest192257){
                      biggest192257=ends[69];
                    }
                    if(ends[70]>=biggest192257){
                      biggest192257=ends[70];
                    }
                    if(biggest192257 == 1){
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
                    S42773=7;
                    S44620=0;
                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                      S44620=1;
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                    else {
                      S44615=0;
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                        S44615=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                          ends[56]=2;
                          ;//sysj\conveyor_controller.sysj line: 573, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                          S42773=8;
                          S44847=0;
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
            switch(S43684){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 511, column: 30
                  S43684=1;
                  thread192258(tdone,ends);
                  thread192259(tdone,ends);
                  int biggest192260 = 0;
                  if(ends[67]>=biggest192260){
                    biggest192260=ends[67];
                  }
                  if(ends[68]>=biggest192260){
                    biggest192260=ends[68];
                  }
                  if(biggest192260 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  thread192261(tdone,ends);
                  thread192262(tdone,ends);
                  int biggest192263 = 0;
                  if(ends[65]>=biggest192263){
                    biggest192263=ends[65];
                  }
                  if(ends[66]>=biggest192263){
                    biggest192263=ends[66];
                  }
                  if(biggest192263 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192263 == 0){
                    S43684=1;
                    thread192264(tdone,ends);
                    thread192265(tdone,ends);
                    int biggest192266 = 0;
                    if(ends[67]>=biggest192266){
                      biggest192266=ends[67];
                    }
                    if(ends[68]>=biggest192266){
                      biggest192266=ends[68];
                    }
                    if(biggest192266 == 1){
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
                  S43684=2;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  thread192267(tdone,ends);
                  thread192268(tdone,ends);
                  int biggest192269 = 0;
                  if(ends[67]>=biggest192269){
                    biggest192269=ends[67];
                  }
                  if(ends[68]>=biggest192269){
                    biggest192269=ends[68];
                  }
                  if(biggest192269 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192269 == 0){
                    System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 532, column: 24
                    current_thread_56 += (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 533, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 534, column: 24
                    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 535, column: 24
                    currsigs.addElement(current_fill_55);
                    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 535, column: 24
                    S43684=2;
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                break;
              
              case 2 : 
                S43684=2;
                S42773=6;
                if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 539, column: 24
                  S44148=0;
                  thread192270(tdone,ends);
                  thread192271(tdone,ends);
                  int biggest192272 = 0;
                  if(ends[69]>=biggest192272){
                    biggest192272=ends[69];
                  }
                  if(ends[70]>=biggest192272){
                    biggest192272=ends[70];
                  }
                  if(biggest192272 == 1){
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
                  S42773=7;
                  S44620=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                    S44620=1;
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  else {
                    S44615=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                      S44615=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                        ends[56]=2;
                        ;//sysj\conveyor_controller.sysj line: 573, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                        S42773=8;
                        S44847=0;
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
            switch(S44148){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 541, column: 30
                  S44148=1;
                  thread192273(tdone,ends);
                  thread192274(tdone,ends);
                  int biggest192275 = 0;
                  if(ends[71]>=biggest192275){
                    biggest192275=ends[71];
                  }
                  if(ends[72]>=biggest192275){
                    biggest192275=ends[72];
                  }
                  if(biggest192275 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  thread192276(tdone,ends);
                  thread192277(tdone,ends);
                  int biggest192278 = 0;
                  if(ends[69]>=biggest192278){
                    biggest192278=ends[69];
                  }
                  if(ends[70]>=biggest192278){
                    biggest192278=ends[70];
                  }
                  if(biggest192278 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192278 == 0){
                    S44148=1;
                    thread192279(tdone,ends);
                    thread192280(tdone,ends);
                    int biggest192281 = 0;
                    if(ends[71]>=biggest192281){
                      biggest192281=ends[71];
                    }
                    if(ends[72]>=biggest192281){
                      biggest192281=ends[72];
                    }
                    if(biggest192281 == 1){
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
                  S44148=2;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  thread192282(tdone,ends);
                  thread192283(tdone,ends);
                  int biggest192284 = 0;
                  if(ends[71]>=biggest192284){
                    biggest192284=ends[71];
                  }
                  if(ends[72]>=biggest192284){
                    biggest192284=ends[72];
                  }
                  if(biggest192284 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192284 == 0){
                    System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 562, column: 24
                    current_thread_56 += (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 563, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 564, column: 24
                    S44148=2;
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                break;
              
              case 2 : 
                S44148=2;
                current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 570, column: 20
                current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 571, column: 20
                currsigs.addElement(current_fill_55);
                current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 571, column: 20
                S42773=7;
                S44620=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                  S44620=1;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  S44615=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                    S44615=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                      ends[56]=2;
                      ;//sysj\conveyor_controller.sysj line: 573, column: 20
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                      S42773=8;
                      S44847=0;
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
            switch(S44620){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                  S44620=1;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  switch(S44615){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                        S44615=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                          ends[56]=2;
                          ;//sysj\conveyor_controller.sysj line: 573, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                          S42773=8;
                          S44847=0;
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
                        S42773=8;
                        S44847=0;
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
                S44620=1;
                S44620=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 573, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                  S44620=1;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  S44615=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 573, column: 20
                    S44615=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 573, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 573, column: 20
                      ends[56]=2;
                      ;//sysj\conveyor_controller.sysj line: 573, column: 20
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 574, column: 20
                      S42773=8;
                      S44847=0;
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
            switch(S44847){
              case 0 : 
                if(!bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 577, column: 30
                  S44847=1;
                  if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 579, column: 36
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  else {
                    ends[56]=2;
                    ;//sysj\conveyor_controller.sysj line: 576, column: 20
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 439, column: 20
                    S42773=0;
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
                  S42773=0;
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

  public void thread192155(int [] tdone, int [] ends){
        S65297=1;
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread192154(int [] tdone, int [] ends){
        S65294=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 622, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread192153(int [] tdone, int [] ends){
        S65324=1;
    S65300=0;
    if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 619, column: 26
      thread192154(tdone,ends);
      thread192155(tdone,ends);
      int biggest192156 = 0;
      if(ends[76]>=biggest192156){
        biggest192156=ends[76];
      }
      if(ends[77]>=biggest192156){
        biggest192156=ends[77];
      }
      if(biggest192156 == 1){
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
      }
    }
    else {
      S65300=1;
      active[75]=1;
      ends[75]=1;
      tdone[75]=1;
    }
  }

  public void thread192152(int [] tdone, int [] ends){
        S65289=1;
    S65233=0;
    S65213=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 604, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
      S65213=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
    else {
      S65208=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 604, column: 12
        S65208=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
          ends[74]=2;
          ;//sysj\conveyor_controller.sysj line: 604, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 605, column: 15
            bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 606, column: 13
            currsigs.addElement(bottleAtPos2_55);
            S65233=1;
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
          }
          else {
            done_55.setPresent();//sysj\conveyor_controller.sysj line: 609, column: 13
            currsigs.addElement(done_55);
            S65233=1;
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

  public void thread192151(int [] tdone, int [] ends){
        S65206=1;
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

  public void thread192150(int [] tdone, int [] ends){
        S65201=1;
    current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 428, column: 16
    total_thread_56 = 100;//sysj\conveyor_controller.sysj line: 429, column: 16
    total_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 430, column: 16
    currsigs.addElement(total_fill_55);
    total_fill_55.setValue(total_thread_56);//sysj\conveyor_controller.sysj line: 430, column: 16
    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 431, column: 16
    currsigs.addElement(current_fill_55);
    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 431, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 439, column: 20
    S42773=0;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread192147(int [] tdone, int [] ends){
        S65297=1;
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread192146(int [] tdone, int [] ends){
        S65294=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 622, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread192145(int [] tdone, int [] ends){
        S65324=1;
    S65300=0;
    if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 619, column: 26
      thread192146(tdone,ends);
      thread192147(tdone,ends);
      int biggest192148 = 0;
      if(ends[76]>=biggest192148){
        biggest192148=ends[76];
      }
      if(ends[77]>=biggest192148){
        biggest192148=ends[77];
      }
      if(biggest192148 == 1){
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
      }
    }
    else {
      S65300=1;
      active[75]=1;
      ends[75]=1;
      tdone[75]=1;
    }
  }

  public void thread192144(int [] tdone, int [] ends){
        S65289=1;
    S65233=0;
    S65213=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 604, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
      S65213=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
    else {
      S65208=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 604, column: 12
        S65208=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
          ends[74]=2;
          ;//sysj\conveyor_controller.sysj line: 604, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 605, column: 15
            bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 606, column: 13
            currsigs.addElement(bottleAtPos2_55);
            S65233=1;
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
          }
          else {
            done_55.setPresent();//sysj\conveyor_controller.sysj line: 609, column: 13
            currsigs.addElement(done_55);
            S65233=1;
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

  public void thread192143(int [] tdone, int [] ends){
        S65206=1;
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

  public void thread192142(int [] tdone, int [] ends){
        S65201=1;
    current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 428, column: 16
    total_thread_56 = 100;//sysj\conveyor_controller.sysj line: 429, column: 16
    total_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 430, column: 16
    currsigs.addElement(total_fill_55);
    total_fill_55.setValue(total_thread_56);//sysj\conveyor_controller.sysj line: 430, column: 16
    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 431, column: 16
    currsigs.addElement(current_fill_55);
    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 431, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 439, column: 20
    S42773=0;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread192139(int [] tdone, int [] ends){
        S65297=1;
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread192138(int [] tdone, int [] ends){
        S65294=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 622, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread192137(int [] tdone, int [] ends){
        S65324=1;
    S65300=0;
    if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 619, column: 26
      thread192138(tdone,ends);
      thread192139(tdone,ends);
      int biggest192140 = 0;
      if(ends[76]>=biggest192140){
        biggest192140=ends[76];
      }
      if(ends[77]>=biggest192140){
        biggest192140=ends[77];
      }
      if(biggest192140 == 1){
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
      }
    }
    else {
      S65300=1;
      active[75]=1;
      ends[75]=1;
      tdone[75]=1;
    }
  }

  public void thread192136(int [] tdone, int [] ends){
        S65289=1;
    S65233=0;
    S65213=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 604, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
      S65213=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
    else {
      S65208=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 604, column: 12
        S65208=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
          ends[74]=2;
          ;//sysj\conveyor_controller.sysj line: 604, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 605, column: 15
            bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 606, column: 13
            currsigs.addElement(bottleAtPos2_55);
            S65233=1;
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
          }
          else {
            done_55.setPresent();//sysj\conveyor_controller.sysj line: 609, column: 13
            currsigs.addElement(done_55);
            S65233=1;
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

  public void thread192135(int [] tdone, int [] ends){
        S65206=1;
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

  public void thread192134(int [] tdone, int [] ends){
        S65201=1;
    current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 428, column: 16
    total_thread_56 = 100;//sysj\conveyor_controller.sysj line: 429, column: 16
    total_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 430, column: 16
    currsigs.addElement(total_fill_55);
    total_fill_55.setValue(total_thread_56);//sysj\conveyor_controller.sysj line: 430, column: 16
    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 431, column: 16
    currsigs.addElement(current_fill_55);
    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 431, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 439, column: 20
    S42773=0;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread192131(int [] tdone, int [] ends){
        S65297=1;
    active[77]=1;
    ends[77]=1;
    tdone[77]=1;
  }

  public void thread192130(int [] tdone, int [] ends){
        S65294=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 622, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread192129(int [] tdone, int [] ends){
        S65324=1;
    S65300=0;
    if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 619, column: 26
      thread192130(tdone,ends);
      thread192131(tdone,ends);
      int biggest192132 = 0;
      if(ends[76]>=biggest192132){
        biggest192132=ends[76];
      }
      if(ends[77]>=biggest192132){
        biggest192132=ends[77];
      }
      if(biggest192132 == 1){
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
      }
    }
    else {
      S65300=1;
      active[75]=1;
      ends[75]=1;
      tdone[75]=1;
    }
  }

  public void thread192128(int [] tdone, int [] ends){
        S65289=1;
    S65233=0;
    S65213=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 604, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
      S65213=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
    else {
      S65208=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 604, column: 12
        S65208=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 604, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 604, column: 12
          ends[74]=2;
          ;//sysj\conveyor_controller.sysj line: 604, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 605, column: 15
            bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 606, column: 13
            currsigs.addElement(bottleAtPos2_55);
            S65233=1;
            active[74]=1;
            ends[74]=1;
            tdone[74]=1;
          }
          else {
            done_55.setPresent();//sysj\conveyor_controller.sysj line: 609, column: 13
            currsigs.addElement(done_55);
            S65233=1;
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

  public void thread192127(int [] tdone, int [] ends){
        S65206=1;
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

  public void thread192126(int [] tdone, int [] ends){
        S65201=1;
    current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 428, column: 16
    total_thread_56 = 100;//sysj\conveyor_controller.sysj line: 429, column: 16
    total_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 430, column: 16
    currsigs.addElement(total_fill_55);
    total_fill_55.setValue(total_thread_56);//sysj\conveyor_controller.sysj line: 430, column: 16
    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 431, column: 16
    currsigs.addElement(current_fill_55);
    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 431, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 439, column: 20
    S42773=0;
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
      switch(S132991){
        case 0 : 
          S132991=0;
          break RUN;
        
        case 1 : 
          S132991=2;
          S132991=2;
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
          S132990=0;
          S42754=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 425, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 425, column: 9
            S42754=1;
            active[55]=1;
            ends[55]=1;
            break RUN;
          }
          else {
            S42749=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 425, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 425, column: 9
              S42749=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 425, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 425, column: 9
                ends[55]=2;
                ;//sysj\conveyor_controller.sysj line: 425, column: 9
                S132990=1;
                thread192126(tdone,ends);
                thread192127(tdone,ends);
                thread192128(tdone,ends);
                thread192129(tdone,ends);
                int biggest192133 = 0;
                if(ends[56]>=biggest192133){
                  biggest192133=ends[56];
                }
                if(ends[73]>=biggest192133){
                  biggest192133=ends[73];
                }
                if(ends[74]>=biggest192133){
                  biggest192133=ends[74];
                }
                if(ends[75]>=biggest192133){
                  biggest192133=ends[75];
                }
                if(biggest192133 == 1){
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
          switch(S132990){
            case 0 : 
              switch(S42754){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 425, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 425, column: 9
                    S42754=1;
                    active[55]=1;
                    ends[55]=1;
                    break RUN;
                  }
                  else {
                    switch(S42749){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 425, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 425, column: 9
                          S42749=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 425, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 425, column: 9
                            ends[55]=2;
                            ;//sysj\conveyor_controller.sysj line: 425, column: 9
                            S132990=1;
                            thread192134(tdone,ends);
                            thread192135(tdone,ends);
                            thread192136(tdone,ends);
                            thread192137(tdone,ends);
                            int biggest192141 = 0;
                            if(ends[56]>=biggest192141){
                              biggest192141=ends[56];
                            }
                            if(ends[73]>=biggest192141){
                              biggest192141=ends[73];
                            }
                            if(ends[74]>=biggest192141){
                              biggest192141=ends[74];
                            }
                            if(ends[75]>=biggest192141){
                              biggest192141=ends[75];
                            }
                            if(biggest192141 == 1){
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
                          S132990=1;
                          thread192142(tdone,ends);
                          thread192143(tdone,ends);
                          thread192144(tdone,ends);
                          thread192145(tdone,ends);
                          int biggest192149 = 0;
                          if(ends[56]>=biggest192149){
                            biggest192149=ends[56];
                          }
                          if(ends[73]>=biggest192149){
                            biggest192149=ends[73];
                          }
                          if(ends[74]>=biggest192149){
                            biggest192149=ends[74];
                          }
                          if(ends[75]>=biggest192149){
                            biggest192149=ends[75];
                          }
                          if(biggest192149 == 1){
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
                  S42754=1;
                  S42754=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 425, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 425, column: 9
                    S42754=1;
                    active[55]=1;
                    ends[55]=1;
                    break RUN;
                  }
                  else {
                    S42749=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 425, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 425, column: 9
                      S42749=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 425, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 425, column: 9
                        ends[55]=2;
                        ;//sysj\conveyor_controller.sysj line: 425, column: 9
                        S132990=1;
                        thread192150(tdone,ends);
                        thread192151(tdone,ends);
                        thread192152(tdone,ends);
                        thread192153(tdone,ends);
                        int biggest192157 = 0;
                        if(ends[56]>=biggest192157){
                          biggest192157=ends[56];
                        }
                        if(ends[73]>=biggest192157){
                          biggest192157=ends[73];
                        }
                        if(ends[74]>=biggest192157){
                          biggest192157=ends[74];
                        }
                        if(ends[75]>=biggest192157){
                          biggest192157=ends[75];
                        }
                        if(biggest192157 == 1){
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
              thread192158(tdone,ends);
              thread192285(tdone,ends);
              thread192286(tdone,ends);
              thread192287(tdone,ends);
              int biggest192294 = 0;
              if(ends[56]>=biggest192294){
                biggest192294=ends[56];
              }
              if(ends[73]>=biggest192294){
                biggest192294=ends[73];
              }
              if(ends[74]>=biggest192294){
                biggest192294=ends[74];
              }
              if(ends[75]>=biggest192294){
                biggest192294=ends[75];
              }
              if(biggest192294 == 1){
                active[55]=1;
                ends[55]=1;
                break RUN;
              }
              //FINXME code
              if(biggest192294 == 0){
                S132991=0;
                active[55]=0;
                ends[55]=0;
                S132991=0;
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
