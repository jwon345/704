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
  private Signal filler1_51;
  private Signal filler2_51;
  private Signal filler3_51;
  private Signal filler4_51;
  private Signal filler1_amount_51;
  private Signal filler2_amount_51;
  private Signal filler3_amount_51;
  private Signal filler4_amount_51;
  private Signal current_fill_51;
  private Signal total_fill_51;
  private Signal bottleAtPos2_51;
  private int current_thread_52;//sysj\conveyor_controller.sysj line: 383, column: 16
  private int total_thread_52;//sysj\conveyor_controller.sysj line: 384, column: 16
  private long __start_thread_52;//sysj\conveyor_controller.sysj line: 382, column: 9
  private int S148479 = 1;
  private int S148478 = 1;
  private int S38262 = 1;
  private int S38257 = 1;
  private int S65709 = 1;
  private int S38282 = 1;
  private int S38292 = 1;
  private int S38287 = 1;
  private int S38442 = 1;
  private int S38393 = 1;
  private int S38398 = 1;
  private int S38407 = 1;
  private int S38412 = 1;
  private int S38790 = 1;
  private int S38741 = 1;
  private int S38746 = 1;
  private int S38755 = 1;
  private int S38760 = 1;
  private int S39254 = 1;
  private int S39205 = 1;
  private int S39210 = 1;
  private int S39219 = 1;
  private int S39224 = 1;
  private int S39834 = 1;
  private int S39785 = 1;
  private int S39790 = 1;
  private int S39799 = 1;
  private int S39804 = 1;
  private int S40480 = 1;
  private int S40475 = 1;
  private int S40795 = 1;
  private int S65792 = 1;
  private int S65736 = 1;
  private int S65716 = 1;
  private int S65711 = 1;
  private int S65827 = 1;
  private int S65803 = 1;
  private int S65797 = 1;
  private int S65800 = 1;
  
  private int[] ends = new int[100];
  private int[] tdone = new int[100];
  
  public void thread213105(int [] tdone, int [] ends){
        S65800=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread213104(int [] tdone, int [] ends){
        S65797=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 569, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread213102(int [] tdone, int [] ends){
        switch(S65800){
      case 0 : 
        active[72]=0;
        ends[72]=0;
        tdone[72]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 573, column: 35
          ends[72]=2;
          tdone[72]=1;
        }
        else {
          active[72]=1;
          ends[72]=1;
          tdone[72]=1;
        }
        break;
      
    }
  }

  public void thread213101(int [] tdone, int [] ends){
        switch(S65797){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 569, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
        break;
      
    }
  }

  public void thread213100(int [] tdone, int [] ends){
        switch(S65827){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        switch(S65803){
          case 0 : 
            thread213101(tdone,ends);
            thread213102(tdone,ends);
            int biggest213103 = 0;
            if(ends[71]>=biggest213103){
              biggest213103=ends[71];
            }
            if(ends[72]>=biggest213103){
              biggest213103=ends[72];
            }
            if(biggest213103 == 1){
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            if(biggest213103 == 2){
              ends[70]=2;
              ;//sysj\conveyor_controller.sysj line: 567, column: 18
              S65803=1;
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            //FINXME code
            if(biggest213103 == 0){
              S65803=1;
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            break;
          
          case 1 : 
            S65803=1;
            S65803=0;
            if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 566, column: 26
              thread213104(tdone,ends);
              thread213105(tdone,ends);
              int biggest213106 = 0;
              if(ends[71]>=biggest213106){
                biggest213106=ends[71];
              }
              if(ends[72]>=biggest213106){
                biggest213106=ends[72];
              }
              if(biggest213106 == 1){
                active[70]=1;
                ends[70]=1;
                tdone[70]=1;
              }
            }
            else {
              S65803=1;
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread213099(int [] tdone, int [] ends){
        switch(S65792){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        switch(S65736){
          case 0 : 
            switch(S65716){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 555, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 555, column: 12
                  S65716=1;
                  active[69]=1;
                  ends[69]=1;
                  tdone[69]=1;
                }
                else {
                  switch(S65711){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 555, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 555, column: 12
                        S65711=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 555, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 555, column: 12
                          ends[69]=2;
                          ;//sysj\conveyor_controller.sysj line: 555, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 556, column: 15
                            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 557, column: 13
                            currsigs.addElement(bottleAtPos2_51);
                            S65736=1;
                            active[69]=1;
                            ends[69]=1;
                            tdone[69]=1;
                          }
                          else {
                            S65736=1;
                            active[69]=1;
                            ends[69]=1;
                            tdone[69]=1;
                          }
                        }
                        else {
                          active[69]=1;
                          ends[69]=1;
                          tdone[69]=1;
                        }
                      }
                      else {
                        active[69]=1;
                        ends[69]=1;
                        tdone[69]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 555, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 555, column: 12
                        ends[69]=2;
                        ;//sysj\conveyor_controller.sysj line: 555, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 556, column: 15
                          bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 557, column: 13
                          currsigs.addElement(bottleAtPos2_51);
                          S65736=1;
                          active[69]=1;
                          ends[69]=1;
                          tdone[69]=1;
                        }
                        else {
                          S65736=1;
                          active[69]=1;
                          ends[69]=1;
                          tdone[69]=1;
                        }
                      }
                      else {
                        active[69]=1;
                        ends[69]=1;
                        tdone[69]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S65716=1;
                S65716=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 555, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 555, column: 12
                  S65716=1;
                  active[69]=1;
                  ends[69]=1;
                  tdone[69]=1;
                }
                else {
                  S65711=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 555, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 555, column: 12
                    S65711=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 555, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 555, column: 12
                      ends[69]=2;
                      ;//sysj\conveyor_controller.sysj line: 555, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 556, column: 15
                        bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 557, column: 13
                        currsigs.addElement(bottleAtPos2_51);
                        S65736=1;
                        active[69]=1;
                        ends[69]=1;
                        tdone[69]=1;
                      }
                      else {
                        S65736=1;
                        active[69]=1;
                        ends[69]=1;
                        tdone[69]=1;
                      }
                    }
                    else {
                      active[69]=1;
                      ends[69]=1;
                      tdone[69]=1;
                    }
                  }
                  else {
                    active[69]=1;
                    ends[69]=1;
                    tdone[69]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S65736=1;
            S65736=0;
            S65716=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 555, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 555, column: 12
              S65716=1;
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            else {
              S65711=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 555, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 555, column: 12
                S65711=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 555, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 555, column: 12
                  ends[69]=2;
                  ;//sysj\conveyor_controller.sysj line: 555, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 556, column: 15
                    bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 557, column: 13
                    currsigs.addElement(bottleAtPos2_51);
                    S65736=1;
                    active[69]=1;
                    ends[69]=1;
                    tdone[69]=1;
                  }
                  else {
                    S65736=1;
                    active[69]=1;
                    ends[69]=1;
                    tdone[69]=1;
                  }
                }
                else {
                  active[69]=1;
                  ends[69]=1;
                  tdone[69]=1;
                }
              }
              else {
                active[69]=1;
                ends[69]=1;
                tdone[69]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread213097(int [] tdone, int [] ends){
        switch(S39804){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 521, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[68]=1;
        ends[68]=1;
        tdone[68]=1;
        break;
      
    }
  }

  public void thread213096(int [] tdone, int [] ends){
        switch(S39799){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 517, column: 32
        currsigs.addElement(valveInletOnOff);
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
        break;
      
    }
  }

  public void thread213094(int [] tdone, int [] ends){
        S39804=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 521, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread213093(int [] tdone, int [] ends){
        S39799=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 516, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 517, column: 32
    currsigs.addElement(valveInletOnOff);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread213091(int [] tdone, int [] ends){
        switch(S39790){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 511, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
        break;
      
    }
  }

  public void thread213090(int [] tdone, int [] ends){
        switch(S39785){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 507, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
        break;
      
    }
  }

  public void thread213088(int [] tdone, int [] ends){
        S39804=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 521, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread213087(int [] tdone, int [] ends){
        S39799=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 516, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 517, column: 32
    currsigs.addElement(valveInletOnOff);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread213085(int [] tdone, int [] ends){
        S39790=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 511, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread213084(int [] tdone, int [] ends){
        S39785=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 506, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 507, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread213082(int [] tdone, int [] ends){
        switch(S39224){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 492, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[64]=1;
        ends[64]=1;
        tdone[64]=1;
        break;
      
    }
  }

  public void thread213081(int [] tdone, int [] ends){
        switch(S39219){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 488, column: 32
        currsigs.addElement(valveInletOnOff);
        active[63]=1;
        ends[63]=1;
        tdone[63]=1;
        break;
      
    }
  }

  public void thread213079(int [] tdone, int [] ends){
        S39790=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 511, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread213078(int [] tdone, int [] ends){
        S39785=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 506, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 507, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread213076(int [] tdone, int [] ends){
        S39224=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 492, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread213075(int [] tdone, int [] ends){
        S39219=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 487, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 488, column: 32
    currsigs.addElement(valveInletOnOff);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread213073(int [] tdone, int [] ends){
        switch(S39210){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[62]=1;
        ends[62]=1;
        tdone[62]=1;
        break;
      
    }
  }

  public void thread213072(int [] tdone, int [] ends){
        switch(S39205){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 478, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[61]=1;
        ends[61]=1;
        tdone[61]=1;
        break;
      
    }
  }

  public void thread213070(int [] tdone, int [] ends){
        S39224=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 492, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread213069(int [] tdone, int [] ends){
        S39219=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 487, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 488, column: 32
    currsigs.addElement(valveInletOnOff);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread213067(int [] tdone, int [] ends){
        S39790=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 511, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread213066(int [] tdone, int [] ends){
        S39785=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 506, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 507, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread213064(int [] tdone, int [] ends){
        S39210=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread213063(int [] tdone, int [] ends){
        S39205=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 477, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 478, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread213061(int [] tdone, int [] ends){
        switch(S38760){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
        break;
      
    }
  }

  public void thread213060(int [] tdone, int [] ends){
        switch(S38755){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 458, column: 32
        currsigs.addElement(valveInletOnOff);
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
        break;
      
    }
  }

  public void thread213058(int [] tdone, int [] ends){
        S39790=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 511, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread213057(int [] tdone, int [] ends){
        S39785=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 506, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 507, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread213055(int [] tdone, int [] ends){
        S39210=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread213054(int [] tdone, int [] ends){
        S39205=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 477, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 478, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread213052(int [] tdone, int [] ends){
        S38760=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread213051(int [] tdone, int [] ends){
        S38755=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 457, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 458, column: 32
    currsigs.addElement(valveInletOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread213049(int [] tdone, int [] ends){
        switch(S38746){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
        break;
      
    }
  }

  public void thread213048(int [] tdone, int [] ends){
        switch(S38741){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
        break;
      
    }
  }

  public void thread213046(int [] tdone, int [] ends){
        S38760=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread213045(int [] tdone, int [] ends){
        S38755=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 457, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 458, column: 32
    currsigs.addElement(valveInletOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread213043(int [] tdone, int [] ends){
        S39790=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 511, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread213042(int [] tdone, int [] ends){
        S39785=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 506, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 507, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread213040(int [] tdone, int [] ends){
        S39210=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread213039(int [] tdone, int [] ends){
        S39205=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 477, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 478, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread213037(int [] tdone, int [] ends){
        S38746=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread213036(int [] tdone, int [] ends){
        S38741=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 447, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread213034(int [] tdone, int [] ends){
        switch(S38412){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
        break;
      
    }
  }

  public void thread213033(int [] tdone, int [] ends){
        switch(S38407){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 428, column: 32
        currsigs.addElement(valveInletOnOff);
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
        break;
      
    }
  }

  public void thread213031(int [] tdone, int [] ends){
        S39790=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 511, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread213030(int [] tdone, int [] ends){
        S39785=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 506, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 507, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread213028(int [] tdone, int [] ends){
        S39210=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread213027(int [] tdone, int [] ends){
        S39205=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 477, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 478, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread213025(int [] tdone, int [] ends){
        S38746=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread213024(int [] tdone, int [] ends){
        S38741=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 447, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread213022(int [] tdone, int [] ends){
        S38412=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread213021(int [] tdone, int [] ends){
        S38407=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 427, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 428, column: 32
    currsigs.addElement(valveInletOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread213019(int [] tdone, int [] ends){
        switch(S38398){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 422, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
        break;
      
    }
  }

  public void thread213018(int [] tdone, int [] ends){
        switch(S38393){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 418, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
        break;
      
    }
  }

  public void thread213016(int [] tdone, int [] ends){
        S38412=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread213015(int [] tdone, int [] ends){
        S38407=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 427, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 428, column: 32
    currsigs.addElement(valveInletOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread213013(int [] tdone, int [] ends){
        S39790=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 511, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread213012(int [] tdone, int [] ends){
        S39785=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 506, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 507, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread213010(int [] tdone, int [] ends){
        S39210=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread213009(int [] tdone, int [] ends){
        S39205=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 477, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 478, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread213007(int [] tdone, int [] ends){
        S38746=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread213006(int [] tdone, int [] ends){
        S38741=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 447, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread213004(int [] tdone, int [] ends){
        S38398=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 422, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread213003(int [] tdone, int [] ends){
        S38393=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 417, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 418, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread213001(int [] tdone, int [] ends){
        S39790=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 511, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread213000(int [] tdone, int [] ends){
        S39785=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 506, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 507, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread212998(int [] tdone, int [] ends){
        S39210=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread212997(int [] tdone, int [] ends){
        S39205=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 477, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 478, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread212995(int [] tdone, int [] ends){
        S38746=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread212994(int [] tdone, int [] ends){
        S38741=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 447, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread212992(int [] tdone, int [] ends){
        S38398=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 422, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread212991(int [] tdone, int [] ends){
        S38393=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 417, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 418, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread212989(int [] tdone, int [] ends){
        S39790=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 511, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread212988(int [] tdone, int [] ends){
        S39785=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 506, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 507, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread212986(int [] tdone, int [] ends){
        S39210=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread212985(int [] tdone, int [] ends){
        S39205=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 477, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 478, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread212983(int [] tdone, int [] ends){
        S38746=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread212982(int [] tdone, int [] ends){
        S38741=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 447, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread212980(int [] tdone, int [] ends){
        S38398=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 422, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread212979(int [] tdone, int [] ends){
        S38393=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 417, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 418, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread212977(int [] tdone, int [] ends){
        S39790=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 511, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread212976(int [] tdone, int [] ends){
        S39785=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 506, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 507, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread212974(int [] tdone, int [] ends){
        S39210=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread212973(int [] tdone, int [] ends){
        S39205=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 477, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 478, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread212971(int [] tdone, int [] ends){
        S38746=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread212970(int [] tdone, int [] ends){
        S38741=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 447, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread212968(int [] tdone, int [] ends){
        S38398=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 422, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread212967(int [] tdone, int [] ends){
        S38393=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 417, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 418, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread212965(int [] tdone, int [] ends){
        S39790=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 511, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread212964(int [] tdone, int [] ends){
        S39785=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 506, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 507, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread212962(int [] tdone, int [] ends){
        S39210=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread212961(int [] tdone, int [] ends){
        S39205=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 477, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 478, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread212959(int [] tdone, int [] ends){
        S38746=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 452, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread212958(int [] tdone, int [] ends){
        S38741=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 447, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 448, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread212956(int [] tdone, int [] ends){
        S38398=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 422, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread212955(int [] tdone, int [] ends){
        S38393=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 417, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 418, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread212954(int [] tdone, int [] ends){
        switch(S65709){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        switch(S38282){
          case 0 : 
            if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 406, column: 26
              S38282=1;
              S38292=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 407, column: 20
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 407, column: 20
                S38292=1;
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
              else {
                S38287=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 407, column: 20
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 407, column: 20
                  S38287=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 407, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 407, column: 20
                    ends[52]=2;
                    ;//sysj\conveyor_controller.sysj line: 407, column: 20
                    S38282=2;
                    __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 382, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 382, column: 9
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 382, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 410, column: 20
                      S38282=3;
                      if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 413, column: 24
                        S38442=0;
                        thread212955(tdone,ends);
                        thread212956(tdone,ends);
                        int biggest212957 = 0;
                        if(ends[53]>=biggest212957){
                          biggest212957=ends[53];
                        }
                        if(ends[54]>=biggest212957){
                          biggest212957=ends[54];
                        }
                        if(biggest212957 == 1){
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        S38282=4;
                        if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 443, column: 24
                          S38790=0;
                          thread212958(tdone,ends);
                          thread212959(tdone,ends);
                          int biggest212960 = 0;
                          if(ends[57]>=biggest212960){
                            biggest212960=ends[57];
                          }
                          if(ends[58]>=biggest212960){
                            biggest212960=ends[58];
                          }
                          if(biggest212960 == 1){
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          S38282=5;
                          if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 473, column: 24
                            S39254=0;
                            thread212961(tdone,ends);
                            thread212962(tdone,ends);
                            int biggest212963 = 0;
                            if(ends[61]>=biggest212963){
                              biggest212963=ends[61];
                            }
                            if(ends[62]>=biggest212963){
                              biggest212963=ends[62];
                            }
                            if(biggest212963 == 1){
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            S38282=6;
                            if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 502, column: 24
                              S39834=0;
                              thread212964(tdone,ends);
                              thread212965(tdone,ends);
                              int biggest212966 = 0;
                              if(ends[65]>=biggest212966){
                                biggest212966=ends[65];
                              }
                              if(ends[66]>=biggest212966){
                                biggest212966=ends[66];
                              }
                              if(biggest212966 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              order_finished.setPresent();//sysj\conveyor_controller.sysj line: 532, column: 20
                              currsigs.addElement(order_finished);
                              S38282=7;
                              S40480=0;
                              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 534, column: 20
                                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                                S40480=1;
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                              else {
                                S40475=0;
                                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 534, column: 20
                                  S40475=1;
                                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                                    ends[52]=2;
                                    ;//sysj\conveyor_controller.sysj line: 534, column: 20
                                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 535, column: 20
                                    S38282=8;
                                    S40795=0;
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                  else {
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                }
                                else {
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
              }
            }
            else {
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 1 : 
            switch(S38292){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 407, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 407, column: 20
                  S38292=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  switch(S38287){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 407, column: 20
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 407, column: 20
                        S38287=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 407, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 407, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 407, column: 20
                          S38282=2;
                          __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 382, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 382, column: 9
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 382, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 410, column: 20
                            S38282=3;
                            if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 413, column: 24
                              S38442=0;
                              thread212967(tdone,ends);
                              thread212968(tdone,ends);
                              int biggest212969 = 0;
                              if(ends[53]>=biggest212969){
                                biggest212969=ends[53];
                              }
                              if(ends[54]>=biggest212969){
                                biggest212969=ends[54];
                              }
                              if(biggest212969 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              S38282=4;
                              if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 443, column: 24
                                S38790=0;
                                thread212970(tdone,ends);
                                thread212971(tdone,ends);
                                int biggest212972 = 0;
                                if(ends[57]>=biggest212972){
                                  biggest212972=ends[57];
                                }
                                if(ends[58]>=biggest212972){
                                  biggest212972=ends[58];
                                }
                                if(biggest212972 == 1){
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                              else {
                                S38282=5;
                                if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 473, column: 24
                                  S39254=0;
                                  thread212973(tdone,ends);
                                  thread212974(tdone,ends);
                                  int biggest212975 = 0;
                                  if(ends[61]>=biggest212975){
                                    biggest212975=ends[61];
                                  }
                                  if(ends[62]>=biggest212975){
                                    biggest212975=ends[62];
                                  }
                                  if(biggest212975 == 1){
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                }
                                else {
                                  S38282=6;
                                  if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 502, column: 24
                                    S39834=0;
                                    thread212976(tdone,ends);
                                    thread212977(tdone,ends);
                                    int biggest212978 = 0;
                                    if(ends[65]>=biggest212978){
                                      biggest212978=ends[65];
                                    }
                                    if(ends[66]>=biggest212978){
                                      biggest212978=ends[66];
                                    }
                                    if(biggest212978 == 1){
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                  }
                                  else {
                                    order_finished.setPresent();//sysj\conveyor_controller.sysj line: 532, column: 20
                                    currsigs.addElement(order_finished);
                                    S38282=7;
                                    S40480=0;
                                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 534, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                                      S40480=1;
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                    else {
                                      S40475=0;
                                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 534, column: 20
                                        S40475=1;
                                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                                          ends[52]=2;
                                          ;//sysj\conveyor_controller.sysj line: 534, column: 20
                                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 535, column: 20
                                          S38282=8;
                                          S40795=0;
                                          active[52]=1;
                                          ends[52]=1;
                                          tdone[52]=1;
                                        }
                                        else {
                                          active[52]=1;
                                          ends[52]=1;
                                          tdone[52]=1;
                                        }
                                      }
                                      else {
                                        active[52]=1;
                                        ends[52]=1;
                                        tdone[52]=1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 407, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 407, column: 20
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 407, column: 20
                        S38282=2;
                        __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 382, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 382, column: 9
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 382, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 410, column: 20
                          S38282=3;
                          if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 413, column: 24
                            S38442=0;
                            thread212979(tdone,ends);
                            thread212980(tdone,ends);
                            int biggest212981 = 0;
                            if(ends[53]>=biggest212981){
                              biggest212981=ends[53];
                            }
                            if(ends[54]>=biggest212981){
                              biggest212981=ends[54];
                            }
                            if(biggest212981 == 1){
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            S38282=4;
                            if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 443, column: 24
                              S38790=0;
                              thread212982(tdone,ends);
                              thread212983(tdone,ends);
                              int biggest212984 = 0;
                              if(ends[57]>=biggest212984){
                                biggest212984=ends[57];
                              }
                              if(ends[58]>=biggest212984){
                                biggest212984=ends[58];
                              }
                              if(biggest212984 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              S38282=5;
                              if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 473, column: 24
                                S39254=0;
                                thread212985(tdone,ends);
                                thread212986(tdone,ends);
                                int biggest212987 = 0;
                                if(ends[61]>=biggest212987){
                                  biggest212987=ends[61];
                                }
                                if(ends[62]>=biggest212987){
                                  biggest212987=ends[62];
                                }
                                if(biggest212987 == 1){
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                              else {
                                S38282=6;
                                if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 502, column: 24
                                  S39834=0;
                                  thread212988(tdone,ends);
                                  thread212989(tdone,ends);
                                  int biggest212990 = 0;
                                  if(ends[65]>=biggest212990){
                                    biggest212990=ends[65];
                                  }
                                  if(ends[66]>=biggest212990){
                                    biggest212990=ends[66];
                                  }
                                  if(biggest212990 == 1){
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                }
                                else {
                                  order_finished.setPresent();//sysj\conveyor_controller.sysj line: 532, column: 20
                                  currsigs.addElement(order_finished);
                                  S38282=7;
                                  S40480=0;
                                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 534, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                                    S40480=1;
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                  else {
                                    S40475=0;
                                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 534, column: 20
                                      S40475=1;
                                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                                        ends[52]=2;
                                        ;//sysj\conveyor_controller.sysj line: 534, column: 20
                                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 535, column: 20
                                        S38282=8;
                                        S40795=0;
                                        active[52]=1;
                                        ends[52]=1;
                                        tdone[52]=1;
                                      }
                                      else {
                                        active[52]=1;
                                        ends[52]=1;
                                        tdone[52]=1;
                                      }
                                    }
                                    else {
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S38292=1;
                S38292=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 407, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 407, column: 20
                  S38292=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  S38287=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 407, column: 20
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 407, column: 20
                    S38287=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 407, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 407, column: 20
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 407, column: 20
                      S38282=2;
                      __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 382, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 382, column: 9
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 382, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 410, column: 20
                        S38282=3;
                        if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 413, column: 24
                          S38442=0;
                          thread212991(tdone,ends);
                          thread212992(tdone,ends);
                          int biggest212993 = 0;
                          if(ends[53]>=biggest212993){
                            biggest212993=ends[53];
                          }
                          if(ends[54]>=biggest212993){
                            biggest212993=ends[54];
                          }
                          if(biggest212993 == 1){
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          S38282=4;
                          if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 443, column: 24
                            S38790=0;
                            thread212994(tdone,ends);
                            thread212995(tdone,ends);
                            int biggest212996 = 0;
                            if(ends[57]>=biggest212996){
                              biggest212996=ends[57];
                            }
                            if(ends[58]>=biggest212996){
                              biggest212996=ends[58];
                            }
                            if(biggest212996 == 1){
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            S38282=5;
                            if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 473, column: 24
                              S39254=0;
                              thread212997(tdone,ends);
                              thread212998(tdone,ends);
                              int biggest212999 = 0;
                              if(ends[61]>=biggest212999){
                                biggest212999=ends[61];
                              }
                              if(ends[62]>=biggest212999){
                                biggest212999=ends[62];
                              }
                              if(biggest212999 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              S38282=6;
                              if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 502, column: 24
                                S39834=0;
                                thread213000(tdone,ends);
                                thread213001(tdone,ends);
                                int biggest213002 = 0;
                                if(ends[65]>=biggest213002){
                                  biggest213002=ends[65];
                                }
                                if(ends[66]>=biggest213002){
                                  biggest213002=ends[66];
                                }
                                if(biggest213002 == 1){
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                              else {
                                order_finished.setPresent();//sysj\conveyor_controller.sysj line: 532, column: 20
                                currsigs.addElement(order_finished);
                                S38282=7;
                                S40480=0;
                                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 534, column: 20
                                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                                  S40480=1;
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                                else {
                                  S40475=0;
                                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 534, column: 20
                                    S40475=1;
                                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                                      ends[52]=2;
                                      ;//sysj\conveyor_controller.sysj line: 534, column: 20
                                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 535, column: 20
                                      S38282=8;
                                      S40795=0;
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                    else {
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                  }
                                  else {
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 382, column: 9
              ends[52]=2;
              ;//sysj\conveyor_controller.sysj line: 382, column: 9
              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 410, column: 20
              S38282=3;
              if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 413, column: 24
                S38442=0;
                thread213003(tdone,ends);
                thread213004(tdone,ends);
                int biggest213005 = 0;
                if(ends[53]>=biggest213005){
                  biggest213005=ends[53];
                }
                if(ends[54]>=biggest213005){
                  biggest213005=ends[54];
                }
                if(biggest213005 == 1){
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
              }
              else {
                S38282=4;
                if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 443, column: 24
                  S38790=0;
                  thread213006(tdone,ends);
                  thread213007(tdone,ends);
                  int biggest213008 = 0;
                  if(ends[57]>=biggest213008){
                    biggest213008=ends[57];
                  }
                  if(ends[58]>=biggest213008){
                    biggest213008=ends[58];
                  }
                  if(biggest213008 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  S38282=5;
                  if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 473, column: 24
                    S39254=0;
                    thread213009(tdone,ends);
                    thread213010(tdone,ends);
                    int biggest213011 = 0;
                    if(ends[61]>=biggest213011){
                      biggest213011=ends[61];
                    }
                    if(ends[62]>=biggest213011){
                      biggest213011=ends[62];
                    }
                    if(biggest213011 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    S38282=6;
                    if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 502, column: 24
                      S39834=0;
                      thread213012(tdone,ends);
                      thread213013(tdone,ends);
                      int biggest213014 = 0;
                      if(ends[65]>=biggest213014){
                        biggest213014=ends[65];
                      }
                      if(ends[66]>=biggest213014){
                        biggest213014=ends[66];
                      }
                      if(biggest213014 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      order_finished.setPresent();//sysj\conveyor_controller.sysj line: 532, column: 20
                      currsigs.addElement(order_finished);
                      S38282=7;
                      S40480=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 534, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                        S40480=1;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        S40475=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 534, column: 20
                          S40475=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 534, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 535, column: 20
                            S38282=8;
                            S40795=0;
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                    }
                  }
                }
              }
            }
            else {
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 3 : 
            switch(S38442){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 415, column: 30
                  S38442=1;
                  thread213015(tdone,ends);
                  thread213016(tdone,ends);
                  int biggest213017 = 0;
                  if(ends[55]>=biggest213017){
                    biggest213017=ends[55];
                  }
                  if(ends[56]>=biggest213017){
                    biggest213017=ends[56];
                  }
                  if(biggest213017 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread213018(tdone,ends);
                  thread213019(tdone,ends);
                  int biggest213020 = 0;
                  if(ends[53]>=biggest213020){
                    biggest213020=ends[53];
                  }
                  if(ends[54]>=biggest213020){
                    biggest213020=ends[54];
                  }
                  if(biggest213020 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest213020 == 0){
                    S38442=1;
                    thread213021(tdone,ends);
                    thread213022(tdone,ends);
                    int biggest213023 = 0;
                    if(ends[55]>=biggest213023){
                      biggest213023=ends[55];
                    }
                    if(ends[56]>=biggest213023){
                      biggest213023=ends[56];
                    }
                    if(biggest213023 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 425, column: 30
                  System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 436, column: 24
                  current_thread_52 += (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 437, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 438, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 439, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 439, column: 24
                  S38282=4;
                  if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 443, column: 24
                    S38790=0;
                    thread213024(tdone,ends);
                    thread213025(tdone,ends);
                    int biggest213026 = 0;
                    if(ends[57]>=biggest213026){
                      biggest213026=ends[57];
                    }
                    if(ends[58]>=biggest213026){
                      biggest213026=ends[58];
                    }
                    if(biggest213026 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    S38282=5;
                    if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 473, column: 24
                      S39254=0;
                      thread213027(tdone,ends);
                      thread213028(tdone,ends);
                      int biggest213029 = 0;
                      if(ends[61]>=biggest213029){
                        biggest213029=ends[61];
                      }
                      if(ends[62]>=biggest213029){
                        biggest213029=ends[62];
                      }
                      if(biggest213029 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      S38282=6;
                      if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 502, column: 24
                        S39834=0;
                        thread213030(tdone,ends);
                        thread213031(tdone,ends);
                        int biggest213032 = 0;
                        if(ends[65]>=biggest213032){
                          biggest213032=ends[65];
                        }
                        if(ends[66]>=biggest213032){
                          biggest213032=ends[66];
                        }
                        if(biggest213032 == 1){
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        order_finished.setPresent();//sysj\conveyor_controller.sysj line: 532, column: 20
                        currsigs.addElement(order_finished);
                        S38282=7;
                        S40480=0;
                        if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 534, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                          S40480=1;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          S40475=0;
                          if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                            fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 534, column: 20
                            S40475=1;
                            if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                              fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                              ends[52]=2;
                              ;//sysj\conveyor_controller.sysj line: 534, column: 20
                              System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 535, column: 20
                              S38282=8;
                              S40795=0;
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                            else {
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                      }
                    }
                  }
                }
                else {
                  thread213033(tdone,ends);
                  thread213034(tdone,ends);
                  int biggest213035 = 0;
                  if(ends[55]>=biggest213035){
                    biggest213035=ends[55];
                  }
                  if(ends[56]>=biggest213035){
                    biggest213035=ends[56];
                  }
                  if(biggest213035 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest213035 == 0){
                    System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 436, column: 24
                    current_thread_52 += (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 437, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 438, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 439, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 439, column: 24
                    S38282=4;
                    if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 443, column: 24
                      S38790=0;
                      thread213036(tdone,ends);
                      thread213037(tdone,ends);
                      int biggest213038 = 0;
                      if(ends[57]>=biggest213038){
                        biggest213038=ends[57];
                      }
                      if(ends[58]>=biggest213038){
                        biggest213038=ends[58];
                      }
                      if(biggest213038 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      S38282=5;
                      if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 473, column: 24
                        S39254=0;
                        thread213039(tdone,ends);
                        thread213040(tdone,ends);
                        int biggest213041 = 0;
                        if(ends[61]>=biggest213041){
                          biggest213041=ends[61];
                        }
                        if(ends[62]>=biggest213041){
                          biggest213041=ends[62];
                        }
                        if(biggest213041 == 1){
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        S38282=6;
                        if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 502, column: 24
                          S39834=0;
                          thread213042(tdone,ends);
                          thread213043(tdone,ends);
                          int biggest213044 = 0;
                          if(ends[65]>=biggest213044){
                            biggest213044=ends[65];
                          }
                          if(ends[66]>=biggest213044){
                            biggest213044=ends[66];
                          }
                          if(biggest213044 == 1){
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          order_finished.setPresent();//sysj\conveyor_controller.sysj line: 532, column: 20
                          currsigs.addElement(order_finished);
                          S38282=7;
                          S40480=0;
                          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 534, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                            S40480=1;
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                          else {
                            S40475=0;
                            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 534, column: 20
                              S40475=1;
                              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                                ends[52]=2;
                                ;//sysj\conveyor_controller.sysj line: 534, column: 20
                                System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 535, column: 20
                                S38282=8;
                                S40795=0;
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                              else {
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 4 : 
            switch(S38790){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 445, column: 30
                  S38790=1;
                  thread213045(tdone,ends);
                  thread213046(tdone,ends);
                  int biggest213047 = 0;
                  if(ends[59]>=biggest213047){
                    biggest213047=ends[59];
                  }
                  if(ends[60]>=biggest213047){
                    biggest213047=ends[60];
                  }
                  if(biggest213047 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread213048(tdone,ends);
                  thread213049(tdone,ends);
                  int biggest213050 = 0;
                  if(ends[57]>=biggest213050){
                    biggest213050=ends[57];
                  }
                  if(ends[58]>=biggest213050){
                    biggest213050=ends[58];
                  }
                  if(biggest213050 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest213050 == 0){
                    S38790=1;
                    thread213051(tdone,ends);
                    thread213052(tdone,ends);
                    int biggest213053 = 0;
                    if(ends[59]>=biggest213053){
                      biggest213053=ends[59];
                    }
                    if(ends[60]>=biggest213053){
                      biggest213053=ends[60];
                    }
                    if(biggest213053 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 455, column: 30
                  System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 466, column: 24
                  current_thread_52 += (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 467, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 468, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 469, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 469, column: 24
                  S38282=5;
                  if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 473, column: 24
                    S39254=0;
                    thread213054(tdone,ends);
                    thread213055(tdone,ends);
                    int biggest213056 = 0;
                    if(ends[61]>=biggest213056){
                      biggest213056=ends[61];
                    }
                    if(ends[62]>=biggest213056){
                      biggest213056=ends[62];
                    }
                    if(biggest213056 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    S38282=6;
                    if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 502, column: 24
                      S39834=0;
                      thread213057(tdone,ends);
                      thread213058(tdone,ends);
                      int biggest213059 = 0;
                      if(ends[65]>=biggest213059){
                        biggest213059=ends[65];
                      }
                      if(ends[66]>=biggest213059){
                        biggest213059=ends[66];
                      }
                      if(biggest213059 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      order_finished.setPresent();//sysj\conveyor_controller.sysj line: 532, column: 20
                      currsigs.addElement(order_finished);
                      S38282=7;
                      S40480=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 534, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                        S40480=1;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        S40475=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 534, column: 20
                          S40475=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 534, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 535, column: 20
                            S38282=8;
                            S40795=0;
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  thread213060(tdone,ends);
                  thread213061(tdone,ends);
                  int biggest213062 = 0;
                  if(ends[59]>=biggest213062){
                    biggest213062=ends[59];
                  }
                  if(ends[60]>=biggest213062){
                    biggest213062=ends[60];
                  }
                  if(biggest213062 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest213062 == 0){
                    System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 466, column: 24
                    current_thread_52 += (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 467, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 468, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 469, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 469, column: 24
                    S38282=5;
                    if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 473, column: 24
                      S39254=0;
                      thread213063(tdone,ends);
                      thread213064(tdone,ends);
                      int biggest213065 = 0;
                      if(ends[61]>=biggest213065){
                        biggest213065=ends[61];
                      }
                      if(ends[62]>=biggest213065){
                        biggest213065=ends[62];
                      }
                      if(biggest213065 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      S38282=6;
                      if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 502, column: 24
                        S39834=0;
                        thread213066(tdone,ends);
                        thread213067(tdone,ends);
                        int biggest213068 = 0;
                        if(ends[65]>=biggest213068){
                          biggest213068=ends[65];
                        }
                        if(ends[66]>=biggest213068){
                          biggest213068=ends[66];
                        }
                        if(biggest213068 == 1){
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        order_finished.setPresent();//sysj\conveyor_controller.sysj line: 532, column: 20
                        currsigs.addElement(order_finished);
                        S38282=7;
                        S40480=0;
                        if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 534, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                          S40480=1;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          S40475=0;
                          if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                            fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 534, column: 20
                            S40475=1;
                            if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                              fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                              ends[52]=2;
                              ;//sysj\conveyor_controller.sysj line: 534, column: 20
                              System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 535, column: 20
                              S38282=8;
                              S40795=0;
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                            else {
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 5 : 
            switch(S39254){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 475, column: 30
                  S39254=1;
                  thread213069(tdone,ends);
                  thread213070(tdone,ends);
                  int biggest213071 = 0;
                  if(ends[63]>=biggest213071){
                    biggest213071=ends[63];
                  }
                  if(ends[64]>=biggest213071){
                    biggest213071=ends[64];
                  }
                  if(biggest213071 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread213072(tdone,ends);
                  thread213073(tdone,ends);
                  int biggest213074 = 0;
                  if(ends[61]>=biggest213074){
                    biggest213074=ends[61];
                  }
                  if(ends[62]>=biggest213074){
                    biggest213074=ends[62];
                  }
                  if(biggest213074 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest213074 == 0){
                    S39254=1;
                    thread213075(tdone,ends);
                    thread213076(tdone,ends);
                    int biggest213077 = 0;
                    if(ends[63]>=biggest213077){
                      biggest213077=ends[63];
                    }
                    if(ends[64]>=biggest213077){
                      biggest213077=ends[64];
                    }
                    if(biggest213077 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 485, column: 30
                  System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 496, column: 24
                  current_thread_52 += (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 497, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 498, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 499, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 499, column: 24
                  S38282=6;
                  if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 502, column: 24
                    S39834=0;
                    thread213078(tdone,ends);
                    thread213079(tdone,ends);
                    int biggest213080 = 0;
                    if(ends[65]>=biggest213080){
                      biggest213080=ends[65];
                    }
                    if(ends[66]>=biggest213080){
                      biggest213080=ends[66];
                    }
                    if(biggest213080 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    order_finished.setPresent();//sysj\conveyor_controller.sysj line: 532, column: 20
                    currsigs.addElement(order_finished);
                    S38282=7;
                    S40480=0;
                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 534, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                      S40480=1;
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                    else {
                      S40475=0;
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 534, column: 20
                        S40475=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 534, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 535, column: 20
                          S38282=8;
                          S40795=0;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                  }
                }
                else {
                  thread213081(tdone,ends);
                  thread213082(tdone,ends);
                  int biggest213083 = 0;
                  if(ends[63]>=biggest213083){
                    biggest213083=ends[63];
                  }
                  if(ends[64]>=biggest213083){
                    biggest213083=ends[64];
                  }
                  if(biggest213083 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest213083 == 0){
                    System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 496, column: 24
                    current_thread_52 += (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 497, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 498, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 499, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 499, column: 24
                    S38282=6;
                    if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 502, column: 24
                      S39834=0;
                      thread213084(tdone,ends);
                      thread213085(tdone,ends);
                      int biggest213086 = 0;
                      if(ends[65]>=biggest213086){
                        biggest213086=ends[65];
                      }
                      if(ends[66]>=biggest213086){
                        biggest213086=ends[66];
                      }
                      if(biggest213086 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      order_finished.setPresent();//sysj\conveyor_controller.sysj line: 532, column: 20
                      currsigs.addElement(order_finished);
                      S38282=7;
                      S40480=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 534, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                        S40480=1;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        S40475=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 534, column: 20
                          S40475=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 534, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 535, column: 20
                            S38282=8;
                            S40795=0;
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 6 : 
            switch(S39834){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 504, column: 30
                  S39834=1;
                  thread213087(tdone,ends);
                  thread213088(tdone,ends);
                  int biggest213089 = 0;
                  if(ends[67]>=biggest213089){
                    biggest213089=ends[67];
                  }
                  if(ends[68]>=biggest213089){
                    biggest213089=ends[68];
                  }
                  if(biggest213089 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread213090(tdone,ends);
                  thread213091(tdone,ends);
                  int biggest213092 = 0;
                  if(ends[65]>=biggest213092){
                    biggest213092=ends[65];
                  }
                  if(ends[66]>=biggest213092){
                    biggest213092=ends[66];
                  }
                  if(biggest213092 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest213092 == 0){
                    S39834=1;
                    thread213093(tdone,ends);
                    thread213094(tdone,ends);
                    int biggest213095 = 0;
                    if(ends[67]>=biggest213095){
                      biggest213095=ends[67];
                    }
                    if(ends[68]>=biggest213095){
                      biggest213095=ends[68];
                    }
                    if(biggest213095 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 514, column: 30
                  System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 525, column: 24
                  current_thread_52 += (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 526, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 527, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 528, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 528, column: 24
                  order_finished.setPresent();//sysj\conveyor_controller.sysj line: 532, column: 20
                  currsigs.addElement(order_finished);
                  S38282=7;
                  S40480=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 534, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                    S40480=1;
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  else {
                    S40475=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 534, column: 20
                      S40475=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 534, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 535, column: 20
                        S38282=8;
                        S40795=0;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                else {
                  thread213096(tdone,ends);
                  thread213097(tdone,ends);
                  int biggest213098 = 0;
                  if(ends[67]>=biggest213098){
                    biggest213098=ends[67];
                  }
                  if(ends[68]>=biggest213098){
                    biggest213098=ends[68];
                  }
                  if(biggest213098 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest213098 == 0){
                    System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 525, column: 24
                    current_thread_52 += (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 526, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 527, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 528, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 528, column: 24
                    order_finished.setPresent();//sysj\conveyor_controller.sysj line: 532, column: 20
                    currsigs.addElement(order_finished);
                    S38282=7;
                    S40480=0;
                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 534, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                      S40480=1;
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                    else {
                      S40475=0;
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 534, column: 20
                        S40475=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 534, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 535, column: 20
                          S38282=8;
                          S40795=0;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 7 : 
            switch(S40480){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 534, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                  S40480=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  switch(S40475){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 534, column: 20
                        S40475=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 534, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 535, column: 20
                          S38282=8;
                          S40795=0;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 534, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 535, column: 20
                        S38282=8;
                        S40795=0;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S40480=1;
                S40480=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 534, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                  S40480=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  S40475=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 534, column: 20
                    S40475=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 534, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 534, column: 20
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 534, column: 20
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 535, column: 20
                      S38282=8;
                      S40795=0;
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S40795){
              case 0 : 
                if(!bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 538, column: 30
                  S40795=1;
                  if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 540, column: 36
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  else {
                    ends[52]=2;
                    ;//sysj\conveyor_controller.sysj line: 537, column: 20
                    if(ordered.getprestatus()){//sysj\conveyor_controller.sysj line: 391, column: 25
                      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 392, column: 24
                      currsigs.addElement(filler1_amount_51);
                      filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 392, column: 24
                      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 393, column: 24
                      currsigs.addElement(filler2_amount_51);
                      filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 393, column: 24
                      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 24
                      currsigs.addElement(filler3_amount_51);
                      filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 394, column: 24
                      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 395, column: 24
                      currsigs.addElement(filler4_amount_51);
                      filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 395, column: 24
                      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 405, column: 20
                      S38282=0;
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                    else {
                      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 398, column: 23
                      currsigs.addElement(filler1_amount_51);
                      filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 398, column: 23
                      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 399, column: 25
                      currsigs.addElement(filler2_amount_51);
                      filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 399, column: 25
                      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 400, column: 25
                      currsigs.addElement(filler3_amount_51);
                      filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 400, column: 25
                      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 401, column: 25
                      currsigs.addElement(filler4_amount_51);
                      filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 401, column: 25
                      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 405, column: 20
                      S38282=0;
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                else {
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 540, column: 36
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  ends[52]=2;
                  ;//sysj\conveyor_controller.sysj line: 537, column: 20
                  if(ordered.getprestatus()){//sysj\conveyor_controller.sysj line: 391, column: 25
                    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 392, column: 24
                    currsigs.addElement(filler1_amount_51);
                    filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 392, column: 24
                    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 393, column: 24
                    currsigs.addElement(filler2_amount_51);
                    filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 393, column: 24
                    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 24
                    currsigs.addElement(filler3_amount_51);
                    filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 394, column: 24
                    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 395, column: 24
                    currsigs.addElement(filler4_amount_51);
                    filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 395, column: 24
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 405, column: 20
                    S38282=0;
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  else {
                    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 398, column: 23
                    currsigs.addElement(filler1_amount_51);
                    filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 398, column: 23
                    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 399, column: 25
                    currsigs.addElement(filler2_amount_51);
                    filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 399, column: 25
                    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 400, column: 25
                    currsigs.addElement(filler3_amount_51);
                    filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 400, column: 25
                    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 401, column: 25
                    currsigs.addElement(filler4_amount_51);
                    filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 401, column: 25
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 405, column: 20
                    S38282=0;
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212951(int [] tdone, int [] ends){
        S65800=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread212950(int [] tdone, int [] ends){
        S65797=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 569, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread212949(int [] tdone, int [] ends){
        S65827=1;
    S65803=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 566, column: 26
      thread212950(tdone,ends);
      thread212951(tdone,ends);
      int biggest212952 = 0;
      if(ends[71]>=biggest212952){
        biggest212952=ends[71];
      }
      if(ends[72]>=biggest212952){
        biggest212952=ends[72];
      }
      if(biggest212952 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S65803=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread212948(int [] tdone, int [] ends){
        S65792=1;
    S65736=0;
    S65716=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 555, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 555, column: 12
      S65716=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S65711=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 555, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 555, column: 12
        S65711=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 555, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 555, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 555, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 556, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 557, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S65736=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S65736=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
        }
        else {
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
      }
      else {
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
  }

  public void thread212947(int [] tdone, int [] ends){
        S65709=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 383, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 384, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 385, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 386, column: 16
    if(ordered.getprestatus()){//sysj\conveyor_controller.sysj line: 391, column: 25
      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 392, column: 24
      currsigs.addElement(filler1_amount_51);
      filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 392, column: 24
      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 393, column: 24
      currsigs.addElement(filler2_amount_51);
      filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 393, column: 24
      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 24
      currsigs.addElement(filler3_amount_51);
      filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 394, column: 24
      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 395, column: 24
      currsigs.addElement(filler4_amount_51);
      filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 395, column: 24
      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 405, column: 20
      S38282=0;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
    else {
      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 398, column: 23
      currsigs.addElement(filler1_amount_51);
      filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 398, column: 23
      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 399, column: 25
      currsigs.addElement(filler2_amount_51);
      filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 399, column: 25
      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 400, column: 25
      currsigs.addElement(filler3_amount_51);
      filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 400, column: 25
      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 401, column: 25
      currsigs.addElement(filler4_amount_51);
      filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 401, column: 25
      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 405, column: 20
      S38282=0;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread212944(int [] tdone, int [] ends){
        S65800=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread212943(int [] tdone, int [] ends){
        S65797=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 569, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread212942(int [] tdone, int [] ends){
        S65827=1;
    S65803=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 566, column: 26
      thread212943(tdone,ends);
      thread212944(tdone,ends);
      int biggest212945 = 0;
      if(ends[71]>=biggest212945){
        biggest212945=ends[71];
      }
      if(ends[72]>=biggest212945){
        biggest212945=ends[72];
      }
      if(biggest212945 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S65803=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread212941(int [] tdone, int [] ends){
        S65792=1;
    S65736=0;
    S65716=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 555, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 555, column: 12
      S65716=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S65711=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 555, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 555, column: 12
        S65711=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 555, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 555, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 555, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 556, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 557, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S65736=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S65736=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
        }
        else {
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
      }
      else {
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
  }

  public void thread212940(int [] tdone, int [] ends){
        S65709=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 383, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 384, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 385, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 386, column: 16
    if(ordered.getprestatus()){//sysj\conveyor_controller.sysj line: 391, column: 25
      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 392, column: 24
      currsigs.addElement(filler1_amount_51);
      filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 392, column: 24
      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 393, column: 24
      currsigs.addElement(filler2_amount_51);
      filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 393, column: 24
      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 24
      currsigs.addElement(filler3_amount_51);
      filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 394, column: 24
      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 395, column: 24
      currsigs.addElement(filler4_amount_51);
      filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 395, column: 24
      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 405, column: 20
      S38282=0;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
    else {
      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 398, column: 23
      currsigs.addElement(filler1_amount_51);
      filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 398, column: 23
      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 399, column: 25
      currsigs.addElement(filler2_amount_51);
      filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 399, column: 25
      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 400, column: 25
      currsigs.addElement(filler3_amount_51);
      filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 400, column: 25
      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 401, column: 25
      currsigs.addElement(filler4_amount_51);
      filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 401, column: 25
      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 405, column: 20
      S38282=0;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread212937(int [] tdone, int [] ends){
        S65800=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread212936(int [] tdone, int [] ends){
        S65797=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 569, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread212935(int [] tdone, int [] ends){
        S65827=1;
    S65803=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 566, column: 26
      thread212936(tdone,ends);
      thread212937(tdone,ends);
      int biggest212938 = 0;
      if(ends[71]>=biggest212938){
        biggest212938=ends[71];
      }
      if(ends[72]>=biggest212938){
        biggest212938=ends[72];
      }
      if(biggest212938 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S65803=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread212934(int [] tdone, int [] ends){
        S65792=1;
    S65736=0;
    S65716=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 555, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 555, column: 12
      S65716=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S65711=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 555, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 555, column: 12
        S65711=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 555, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 555, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 555, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 556, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 557, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S65736=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S65736=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
        }
        else {
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
      }
      else {
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
  }

  public void thread212933(int [] tdone, int [] ends){
        S65709=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 383, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 384, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 385, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 386, column: 16
    if(ordered.getprestatus()){//sysj\conveyor_controller.sysj line: 391, column: 25
      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 392, column: 24
      currsigs.addElement(filler1_amount_51);
      filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 392, column: 24
      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 393, column: 24
      currsigs.addElement(filler2_amount_51);
      filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 393, column: 24
      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 24
      currsigs.addElement(filler3_amount_51);
      filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 394, column: 24
      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 395, column: 24
      currsigs.addElement(filler4_amount_51);
      filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 395, column: 24
      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 405, column: 20
      S38282=0;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
    else {
      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 398, column: 23
      currsigs.addElement(filler1_amount_51);
      filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 398, column: 23
      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 399, column: 25
      currsigs.addElement(filler2_amount_51);
      filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 399, column: 25
      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 400, column: 25
      currsigs.addElement(filler3_amount_51);
      filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 400, column: 25
      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 401, column: 25
      currsigs.addElement(filler4_amount_51);
      filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 401, column: 25
      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 405, column: 20
      S38282=0;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread212930(int [] tdone, int [] ends){
        S65800=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread212929(int [] tdone, int [] ends){
        S65797=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 569, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread212928(int [] tdone, int [] ends){
        S65827=1;
    S65803=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 566, column: 26
      thread212929(tdone,ends);
      thread212930(tdone,ends);
      int biggest212931 = 0;
      if(ends[71]>=biggest212931){
        biggest212931=ends[71];
      }
      if(ends[72]>=biggest212931){
        biggest212931=ends[72];
      }
      if(biggest212931 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S65803=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread212927(int [] tdone, int [] ends){
        S65792=1;
    S65736=0;
    S65716=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 555, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 555, column: 12
      S65716=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S65711=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 555, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 555, column: 12
        S65711=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 555, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 555, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 555, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 556, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 557, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S65736=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S65736=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
        }
        else {
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
      }
      else {
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
  }

  public void thread212926(int [] tdone, int [] ends){
        S65709=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 383, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 384, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 385, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 386, column: 16
    if(ordered.getprestatus()){//sysj\conveyor_controller.sysj line: 391, column: 25
      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 392, column: 24
      currsigs.addElement(filler1_amount_51);
      filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 392, column: 24
      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 393, column: 24
      currsigs.addElement(filler2_amount_51);
      filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 393, column: 24
      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 394, column: 24
      currsigs.addElement(filler3_amount_51);
      filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 394, column: 24
      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 395, column: 24
      currsigs.addElement(filler4_amount_51);
      filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 395, column: 24
      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 405, column: 20
      S38282=0;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
    else {
      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 398, column: 23
      currsigs.addElement(filler1_amount_51);
      filler1_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 398, column: 23
      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 399, column: 25
      currsigs.addElement(filler2_amount_51);
      filler2_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 399, column: 25
      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 400, column: 25
      currsigs.addElement(filler3_amount_51);
      filler3_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 400, column: 25
      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 401, column: 25
      currsigs.addElement(filler4_amount_51);
      filler4_amount_51.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 401, column: 25
      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 405, column: 20
      S38282=0;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S148479){
        case 0 : 
          S148479=0;
          break RUN;
        
        case 1 : 
          S148479=2;
          S148479=2;
          filler1_51.setClear();//sysj\conveyor_controller.sysj line: 373, column: 9
          filler2_51.setClear();//sysj\conveyor_controller.sysj line: 373, column: 9
          filler3_51.setClear();//sysj\conveyor_controller.sysj line: 373, column: 9
          filler4_51.setClear();//sysj\conveyor_controller.sysj line: 373, column: 9
          filler1_amount_51.setClear();//sysj\conveyor_controller.sysj line: 375, column: 9
          filler2_amount_51.setClear();//sysj\conveyor_controller.sysj line: 375, column: 9
          filler3_amount_51.setClear();//sysj\conveyor_controller.sysj line: 375, column: 9
          filler4_amount_51.setClear();//sysj\conveyor_controller.sysj line: 375, column: 9
          current_fill_51.setClear();//sysj\conveyor_controller.sysj line: 376, column: 9
          total_fill_51.setClear();//sysj\conveyor_controller.sysj line: 376, column: 9
          bottleAtPos2_51.setClear();//sysj\conveyor_controller.sysj line: 378, column: 9
          S148478=0;
          S38262=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 380, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 380, column: 9
            S38262=1;
            active[51]=1;
            ends[51]=1;
            break RUN;
          }
          else {
            S38257=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 380, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 380, column: 9
              S38257=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 380, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 380, column: 9
                ends[51]=2;
                ;//sysj\conveyor_controller.sysj line: 380, column: 9
                S148478=1;
                thread212926(tdone,ends);
                thread212927(tdone,ends);
                thread212928(tdone,ends);
                int biggest212932 = 0;
                if(ends[52]>=biggest212932){
                  biggest212932=ends[52];
                }
                if(ends[69]>=biggest212932){
                  biggest212932=ends[69];
                }
                if(ends[70]>=biggest212932){
                  biggest212932=ends[70];
                }
                if(biggest212932 == 1){
                  active[51]=1;
                  ends[51]=1;
                  break RUN;
                }
              }
              else {
                active[51]=1;
                ends[51]=1;
                break RUN;
              }
            }
            else {
              active[51]=1;
              ends[51]=1;
              break RUN;
            }
          }
        
        case 2 : 
          filler1_51.setClear();//sysj\conveyor_controller.sysj line: 373, column: 9
          filler2_51.setClear();//sysj\conveyor_controller.sysj line: 373, column: 9
          filler3_51.setClear();//sysj\conveyor_controller.sysj line: 373, column: 9
          filler4_51.setClear();//sysj\conveyor_controller.sysj line: 373, column: 9
          filler1_amount_51.setClear();//sysj\conveyor_controller.sysj line: 375, column: 9
          filler2_amount_51.setClear();//sysj\conveyor_controller.sysj line: 375, column: 9
          filler3_amount_51.setClear();//sysj\conveyor_controller.sysj line: 375, column: 9
          filler4_amount_51.setClear();//sysj\conveyor_controller.sysj line: 375, column: 9
          current_fill_51.setClear();//sysj\conveyor_controller.sysj line: 376, column: 9
          total_fill_51.setClear();//sysj\conveyor_controller.sysj line: 376, column: 9
          bottleAtPos2_51.setClear();//sysj\conveyor_controller.sysj line: 378, column: 9
          switch(S148478){
            case 0 : 
              switch(S38262){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 380, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 380, column: 9
                    S38262=1;
                    active[51]=1;
                    ends[51]=1;
                    break RUN;
                  }
                  else {
                    switch(S38257){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 380, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 380, column: 9
                          S38257=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 380, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 380, column: 9
                            ends[51]=2;
                            ;//sysj\conveyor_controller.sysj line: 380, column: 9
                            S148478=1;
                            thread212933(tdone,ends);
                            thread212934(tdone,ends);
                            thread212935(tdone,ends);
                            int biggest212939 = 0;
                            if(ends[52]>=biggest212939){
                              biggest212939=ends[52];
                            }
                            if(ends[69]>=biggest212939){
                              biggest212939=ends[69];
                            }
                            if(ends[70]>=biggest212939){
                              biggest212939=ends[70];
                            }
                            if(biggest212939 == 1){
                              active[51]=1;
                              ends[51]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[51]=1;
                            ends[51]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[51]=1;
                          ends[51]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 380, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 380, column: 9
                          ends[51]=2;
                          ;//sysj\conveyor_controller.sysj line: 380, column: 9
                          S148478=1;
                          thread212940(tdone,ends);
                          thread212941(tdone,ends);
                          thread212942(tdone,ends);
                          int biggest212946 = 0;
                          if(ends[52]>=biggest212946){
                            biggest212946=ends[52];
                          }
                          if(ends[69]>=biggest212946){
                            biggest212946=ends[69];
                          }
                          if(ends[70]>=biggest212946){
                            biggest212946=ends[70];
                          }
                          if(biggest212946 == 1){
                            active[51]=1;
                            ends[51]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[51]=1;
                          ends[51]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S38262=1;
                  S38262=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 380, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 380, column: 9
                    S38262=1;
                    active[51]=1;
                    ends[51]=1;
                    break RUN;
                  }
                  else {
                    S38257=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 380, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 380, column: 9
                      S38257=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 380, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 380, column: 9
                        ends[51]=2;
                        ;//sysj\conveyor_controller.sysj line: 380, column: 9
                        S148478=1;
                        thread212947(tdone,ends);
                        thread212948(tdone,ends);
                        thread212949(tdone,ends);
                        int biggest212953 = 0;
                        if(ends[52]>=biggest212953){
                          biggest212953=ends[52];
                        }
                        if(ends[69]>=biggest212953){
                          biggest212953=ends[69];
                        }
                        if(ends[70]>=biggest212953){
                          biggest212953=ends[70];
                        }
                        if(biggest212953 == 1){
                          active[51]=1;
                          ends[51]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[51]=1;
                        ends[51]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[51]=1;
                      ends[51]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread212954(tdone,ends);
              thread213099(tdone,ends);
              thread213100(tdone,ends);
              int biggest213107 = 0;
              if(ends[52]>=biggest213107){
                biggest213107=ends[52];
              }
              if(ends[69]>=biggest213107){
                biggest213107=ends[69];
              }
              if(ends[70]>=biggest213107){
                biggest213107=ends[70];
              }
              if(biggest213107 == 1){
                active[51]=1;
                ends[51]=1;
                break RUN;
              }
              //FINXME code
              if(biggest213107 == 0){
                S148479=0;
                active[51]=0;
                ends[51]=0;
                S148479=0;
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
    filler1_51 = new Signal();
    filler2_51 = new Signal();
    filler3_51 = new Signal();
    filler4_51 = new Signal();
    filler1_amount_51 = new Signal();
    filler2_amount_51 = new Signal();
    filler3_amount_51 = new Signal();
    filler4_amount_51 = new Signal();
    current_fill_51 = new Signal();
    total_fill_51 = new Signal();
    bottleAtPos2_51 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[51] != 0){
      int index = 51;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[51]!=0 || suspended[51]!=0 || active[51]!=1);
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
      filler1_51.setpreclear();
      filler2_51.setpreclear();
      filler3_51.setpreclear();
      filler4_51.setpreclear();
      filler1_amount_51.setpreclear();
      filler2_amount_51.setpreclear();
      filler3_amount_51.setpreclear();
      filler4_amount_51.setpreclear();
      current_fill_51.setpreclear();
      total_fill_51.setpreclear();
      bottleAtPos2_51.setpreclear();
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
      filler1_51.setClear();
      filler2_51.setClear();
      filler3_51.setClear();
      filler4_51.setClear();
      filler1_amount_51.setClear();
      filler2_amount_51.setClear();
      filler3_amount_51.setClear();
      filler4_amount_51.setClear();
      current_fill_51.setClear();
      total_fill_51.setClear();
      bottleAtPos2_51.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[51]!=0 || suspended[51]!=0 || active[51]!=1);
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
      if(active[51] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
