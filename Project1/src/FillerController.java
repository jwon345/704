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
  private int current_thread_52;//sysj\conveyor_controller.sysj line: 375, column: 16
  private int total_thread_52;//sysj\conveyor_controller.sysj line: 376, column: 16
  private long __start_thread_52;//sysj\conveyor_controller.sysj line: 374, column: 9
  private int S146239 = 1;
  private int S146238 = 1;
  private int S36022 = 1;
  private int S36017 = 1;
  private int S63469 = 1;
  private int S36042 = 1;
  private int S36052 = 1;
  private int S36047 = 1;
  private int S36202 = 1;
  private int S36153 = 1;
  private int S36158 = 1;
  private int S36167 = 1;
  private int S36172 = 1;
  private int S36550 = 1;
  private int S36501 = 1;
  private int S36506 = 1;
  private int S36515 = 1;
  private int S36520 = 1;
  private int S37014 = 1;
  private int S36965 = 1;
  private int S36970 = 1;
  private int S36979 = 1;
  private int S36984 = 1;
  private int S37594 = 1;
  private int S37545 = 1;
  private int S37550 = 1;
  private int S37559 = 1;
  private int S37564 = 1;
  private int S38240 = 1;
  private int S38235 = 1;
  private int S38555 = 1;
  private int S63552 = 1;
  private int S63496 = 1;
  private int S63476 = 1;
  private int S63471 = 1;
  private int S63587 = 1;
  private int S63563 = 1;
  private int S63557 = 1;
  private int S63560 = 1;
  
  private int[] ends = new int[100];
  private int[] tdone = new int[100];
  
  public void thread210860(int [] tdone, int [] ends){
        S63560=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread210859(int [] tdone, int [] ends){
        S63557=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread210857(int [] tdone, int [] ends){
        switch(S63560){
      case 0 : 
        active[72]=0;
        ends[72]=0;
        tdone[72]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 565, column: 35
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

  public void thread210856(int [] tdone, int [] ends){
        switch(S63557){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
        break;
      
    }
  }

  public void thread210855(int [] tdone, int [] ends){
        switch(S63587){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        switch(S63563){
          case 0 : 
            thread210856(tdone,ends);
            thread210857(tdone,ends);
            int biggest210858 = 0;
            if(ends[71]>=biggest210858){
              biggest210858=ends[71];
            }
            if(ends[72]>=biggest210858){
              biggest210858=ends[72];
            }
            if(biggest210858 == 1){
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            if(biggest210858 == 2){
              ends[70]=2;
              ;//sysj\conveyor_controller.sysj line: 559, column: 18
              S63563=1;
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            //FINXME code
            if(biggest210858 == 0){
              S63563=1;
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            break;
          
          case 1 : 
            S63563=1;
            S63563=0;
            if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 558, column: 26
              thread210859(tdone,ends);
              thread210860(tdone,ends);
              int biggest210861 = 0;
              if(ends[71]>=biggest210861){
                biggest210861=ends[71];
              }
              if(ends[72]>=biggest210861){
                biggest210861=ends[72];
              }
              if(biggest210861 == 1){
                active[70]=1;
                ends[70]=1;
                tdone[70]=1;
              }
            }
            else {
              S63563=1;
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread210854(int [] tdone, int [] ends){
        switch(S63552){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        switch(S63496){
          case 0 : 
            switch(S63476){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 547, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 547, column: 12
                  S63476=1;
                  active[69]=1;
                  ends[69]=1;
                  tdone[69]=1;
                }
                else {
                  switch(S63471){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 547, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 547, column: 12
                        S63471=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 547, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 547, column: 12
                          ends[69]=2;
                          ;//sysj\conveyor_controller.sysj line: 547, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 548, column: 15
                            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 549, column: 13
                            currsigs.addElement(bottleAtPos2_51);
                            S63496=1;
                            active[69]=1;
                            ends[69]=1;
                            tdone[69]=1;
                          }
                          else {
                            S63496=1;
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
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 547, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 547, column: 12
                        ends[69]=2;
                        ;//sysj\conveyor_controller.sysj line: 547, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 548, column: 15
                          bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 549, column: 13
                          currsigs.addElement(bottleAtPos2_51);
                          S63496=1;
                          active[69]=1;
                          ends[69]=1;
                          tdone[69]=1;
                        }
                        else {
                          S63496=1;
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
                S63476=1;
                S63476=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 547, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 547, column: 12
                  S63476=1;
                  active[69]=1;
                  ends[69]=1;
                  tdone[69]=1;
                }
                else {
                  S63471=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 547, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 547, column: 12
                    S63471=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 547, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 547, column: 12
                      ends[69]=2;
                      ;//sysj\conveyor_controller.sysj line: 547, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 548, column: 15
                        bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 549, column: 13
                        currsigs.addElement(bottleAtPos2_51);
                        S63496=1;
                        active[69]=1;
                        ends[69]=1;
                        tdone[69]=1;
                      }
                      else {
                        S63496=1;
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
            S63496=1;
            S63496=0;
            S63476=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 547, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 547, column: 12
              S63476=1;
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            else {
              S63471=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 547, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 547, column: 12
                S63471=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 547, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 547, column: 12
                  ends[69]=2;
                  ;//sysj\conveyor_controller.sysj line: 547, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 548, column: 15
                    bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 549, column: 13
                    currsigs.addElement(bottleAtPos2_51);
                    S63496=1;
                    active[69]=1;
                    ends[69]=1;
                    tdone[69]=1;
                  }
                  else {
                    S63496=1;
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

  public void thread210852(int [] tdone, int [] ends){
        switch(S37564){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 513, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[68]=1;
        ends[68]=1;
        tdone[68]=1;
        break;
      
    }
  }

  public void thread210851(int [] tdone, int [] ends){
        switch(S37559){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 509, column: 32
        currsigs.addElement(valveInletOnOff);
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
        break;
      
    }
  }

  public void thread210849(int [] tdone, int [] ends){
        S37564=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 513, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread210848(int [] tdone, int [] ends){
        S37559=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 508, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 509, column: 32
    currsigs.addElement(valveInletOnOff);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread210846(int [] tdone, int [] ends){
        switch(S37550){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 503, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
        break;
      
    }
  }

  public void thread210845(int [] tdone, int [] ends){
        switch(S37545){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 499, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
        break;
      
    }
  }

  public void thread210843(int [] tdone, int [] ends){
        S37564=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 513, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread210842(int [] tdone, int [] ends){
        S37559=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 508, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 509, column: 32
    currsigs.addElement(valveInletOnOff);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread210840(int [] tdone, int [] ends){
        S37550=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 503, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread210839(int [] tdone, int [] ends){
        S37545=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 498, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 499, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread210837(int [] tdone, int [] ends){
        switch(S36984){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 484, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[64]=1;
        ends[64]=1;
        tdone[64]=1;
        break;
      
    }
  }

  public void thread210836(int [] tdone, int [] ends){
        switch(S36979){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 480, column: 32
        currsigs.addElement(valveInletOnOff);
        active[63]=1;
        ends[63]=1;
        tdone[63]=1;
        break;
      
    }
  }

  public void thread210834(int [] tdone, int [] ends){
        S37550=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 503, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread210833(int [] tdone, int [] ends){
        S37545=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 498, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 499, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread210831(int [] tdone, int [] ends){
        S36984=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 484, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread210830(int [] tdone, int [] ends){
        S36979=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 479, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 480, column: 32
    currsigs.addElement(valveInletOnOff);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread210828(int [] tdone, int [] ends){
        switch(S36970){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 474, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[62]=1;
        ends[62]=1;
        tdone[62]=1;
        break;
      
    }
  }

  public void thread210827(int [] tdone, int [] ends){
        switch(S36965){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 470, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[61]=1;
        ends[61]=1;
        tdone[61]=1;
        break;
      
    }
  }

  public void thread210825(int [] tdone, int [] ends){
        S36984=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 484, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread210824(int [] tdone, int [] ends){
        S36979=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 479, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 480, column: 32
    currsigs.addElement(valveInletOnOff);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread210822(int [] tdone, int [] ends){
        S37550=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 503, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread210821(int [] tdone, int [] ends){
        S37545=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 498, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 499, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread210819(int [] tdone, int [] ends){
        S36970=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 474, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread210818(int [] tdone, int [] ends){
        S36965=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 469, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 470, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread210816(int [] tdone, int [] ends){
        switch(S36520){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 454, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
        break;
      
    }
  }

  public void thread210815(int [] tdone, int [] ends){
        switch(S36515){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 450, column: 32
        currsigs.addElement(valveInletOnOff);
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
        break;
      
    }
  }

  public void thread210813(int [] tdone, int [] ends){
        S37550=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 503, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread210812(int [] tdone, int [] ends){
        S37545=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 498, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 499, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread210810(int [] tdone, int [] ends){
        S36970=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 474, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread210809(int [] tdone, int [] ends){
        S36965=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 469, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 470, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread210807(int [] tdone, int [] ends){
        S36520=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 454, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread210806(int [] tdone, int [] ends){
        S36515=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 449, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 450, column: 32
    currsigs.addElement(valveInletOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread210804(int [] tdone, int [] ends){
        switch(S36506){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 444, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
        break;
      
    }
  }

  public void thread210803(int [] tdone, int [] ends){
        switch(S36501){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 440, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
        break;
      
    }
  }

  public void thread210801(int [] tdone, int [] ends){
        S36520=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 454, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread210800(int [] tdone, int [] ends){
        S36515=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 449, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 450, column: 32
    currsigs.addElement(valveInletOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread210798(int [] tdone, int [] ends){
        S37550=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 503, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread210797(int [] tdone, int [] ends){
        S37545=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 498, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 499, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread210795(int [] tdone, int [] ends){
        S36970=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 474, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread210794(int [] tdone, int [] ends){
        S36965=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 469, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 470, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread210792(int [] tdone, int [] ends){
        S36506=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 444, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread210791(int [] tdone, int [] ends){
        S36501=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 439, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 440, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread210789(int [] tdone, int [] ends){
        switch(S36172){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 424, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
        break;
      
    }
  }

  public void thread210788(int [] tdone, int [] ends){
        switch(S36167){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 420, column: 32
        currsigs.addElement(valveInletOnOff);
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
        break;
      
    }
  }

  public void thread210786(int [] tdone, int [] ends){
        S37550=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 503, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread210785(int [] tdone, int [] ends){
        S37545=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 498, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 499, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread210783(int [] tdone, int [] ends){
        S36970=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 474, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread210782(int [] tdone, int [] ends){
        S36965=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 469, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 470, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread210780(int [] tdone, int [] ends){
        S36506=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 444, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread210779(int [] tdone, int [] ends){
        S36501=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 439, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 440, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread210777(int [] tdone, int [] ends){
        S36172=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 424, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread210776(int [] tdone, int [] ends){
        S36167=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 419, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 420, column: 32
    currsigs.addElement(valveInletOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread210774(int [] tdone, int [] ends){
        switch(S36158){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 414, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
        break;
      
    }
  }

  public void thread210773(int [] tdone, int [] ends){
        switch(S36153){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 410, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
        break;
      
    }
  }

  public void thread210771(int [] tdone, int [] ends){
        S36172=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 424, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread210770(int [] tdone, int [] ends){
        S36167=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 419, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 420, column: 32
    currsigs.addElement(valveInletOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread210768(int [] tdone, int [] ends){
        S37550=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 503, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread210767(int [] tdone, int [] ends){
        S37545=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 498, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 499, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread210765(int [] tdone, int [] ends){
        S36970=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 474, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread210764(int [] tdone, int [] ends){
        S36965=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 469, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 470, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread210762(int [] tdone, int [] ends){
        S36506=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 444, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread210761(int [] tdone, int [] ends){
        S36501=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 439, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 440, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread210759(int [] tdone, int [] ends){
        S36158=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 414, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread210758(int [] tdone, int [] ends){
        S36153=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 409, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 410, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread210756(int [] tdone, int [] ends){
        S37550=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 503, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread210755(int [] tdone, int [] ends){
        S37545=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 498, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 499, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread210753(int [] tdone, int [] ends){
        S36970=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 474, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread210752(int [] tdone, int [] ends){
        S36965=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 469, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 470, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread210750(int [] tdone, int [] ends){
        S36506=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 444, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread210749(int [] tdone, int [] ends){
        S36501=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 439, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 440, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread210747(int [] tdone, int [] ends){
        S36158=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 414, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread210746(int [] tdone, int [] ends){
        S36153=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 409, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 410, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread210744(int [] tdone, int [] ends){
        S37550=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 503, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread210743(int [] tdone, int [] ends){
        S37545=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 498, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 499, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread210741(int [] tdone, int [] ends){
        S36970=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 474, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread210740(int [] tdone, int [] ends){
        S36965=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 469, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 470, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread210738(int [] tdone, int [] ends){
        S36506=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 444, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread210737(int [] tdone, int [] ends){
        S36501=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 439, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 440, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread210735(int [] tdone, int [] ends){
        S36158=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 414, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread210734(int [] tdone, int [] ends){
        S36153=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 409, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 410, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread210732(int [] tdone, int [] ends){
        S37550=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 503, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread210731(int [] tdone, int [] ends){
        S37545=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 498, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 499, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread210729(int [] tdone, int [] ends){
        S36970=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 474, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread210728(int [] tdone, int [] ends){
        S36965=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 469, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 470, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread210726(int [] tdone, int [] ends){
        S36506=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 444, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread210725(int [] tdone, int [] ends){
        S36501=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 439, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 440, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread210723(int [] tdone, int [] ends){
        S36158=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 414, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread210722(int [] tdone, int [] ends){
        S36153=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 409, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 410, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread210720(int [] tdone, int [] ends){
        S37550=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 503, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread210719(int [] tdone, int [] ends){
        S37545=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 498, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 499, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread210717(int [] tdone, int [] ends){
        S36970=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 474, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread210716(int [] tdone, int [] ends){
        S36965=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 469, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 470, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread210714(int [] tdone, int [] ends){
        S36506=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 444, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread210713(int [] tdone, int [] ends){
        S36501=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 439, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 440, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread210711(int [] tdone, int [] ends){
        S36158=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 414, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread210710(int [] tdone, int [] ends){
        S36153=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 409, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 410, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread210709(int [] tdone, int [] ends){
        switch(S63469){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        switch(S36042){
          case 0 : 
            if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 398, column: 26
              S36042=1;
              S36052=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 399, column: 20
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 399, column: 20
                S36052=1;
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
              else {
                S36047=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 399, column: 20
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 399, column: 20
                  S36047=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 399, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 399, column: 20
                    ends[52]=2;
                    ;//sysj\conveyor_controller.sysj line: 399, column: 20
                    S36042=2;
                    __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 374, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 374, column: 9
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 374, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 402, column: 20
                      S36042=3;
                      if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 405, column: 24
                        S36202=0;
                        thread210710(tdone,ends);
                        thread210711(tdone,ends);
                        int biggest210712 = 0;
                        if(ends[53]>=biggest210712){
                          biggest210712=ends[53];
                        }
                        if(ends[54]>=biggest210712){
                          biggest210712=ends[54];
                        }
                        if(biggest210712 == 1){
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        S36042=4;
                        if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 435, column: 24
                          S36550=0;
                          thread210713(tdone,ends);
                          thread210714(tdone,ends);
                          int biggest210715 = 0;
                          if(ends[57]>=biggest210715){
                            biggest210715=ends[57];
                          }
                          if(ends[58]>=biggest210715){
                            biggest210715=ends[58];
                          }
                          if(biggest210715 == 1){
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          S36042=5;
                          if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 465, column: 24
                            S37014=0;
                            thread210716(tdone,ends);
                            thread210717(tdone,ends);
                            int biggest210718 = 0;
                            if(ends[61]>=biggest210718){
                              biggest210718=ends[61];
                            }
                            if(ends[62]>=biggest210718){
                              biggest210718=ends[62];
                            }
                            if(biggest210718 == 1){
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            S36042=6;
                            if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 494, column: 24
                              S37594=0;
                              thread210719(tdone,ends);
                              thread210720(tdone,ends);
                              int biggest210721 = 0;
                              if(ends[65]>=biggest210721){
                                biggest210721=ends[65];
                              }
                              if(ends[66]>=biggest210721){
                                biggest210721=ends[66];
                              }
                              if(biggest210721 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              order_finished.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 20
                              currsigs.addElement(order_finished);
                              S36042=7;
                              S38240=0;
                              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 526, column: 20
                                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                                S38240=1;
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                              else {
                                S38235=0;
                                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 526, column: 20
                                  S38235=1;
                                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                                    ends[52]=2;
                                    ;//sysj\conveyor_controller.sysj line: 526, column: 20
                                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 527, column: 20
                                    S36042=8;
                                    S38555=0;
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
            switch(S36052){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 399, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 399, column: 20
                  S36052=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  switch(S36047){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 399, column: 20
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 399, column: 20
                        S36047=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 399, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 399, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 399, column: 20
                          S36042=2;
                          __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 374, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 374, column: 9
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 374, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 402, column: 20
                            S36042=3;
                            if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 405, column: 24
                              S36202=0;
                              thread210722(tdone,ends);
                              thread210723(tdone,ends);
                              int biggest210724 = 0;
                              if(ends[53]>=biggest210724){
                                biggest210724=ends[53];
                              }
                              if(ends[54]>=biggest210724){
                                biggest210724=ends[54];
                              }
                              if(biggest210724 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              S36042=4;
                              if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 435, column: 24
                                S36550=0;
                                thread210725(tdone,ends);
                                thread210726(tdone,ends);
                                int biggest210727 = 0;
                                if(ends[57]>=biggest210727){
                                  biggest210727=ends[57];
                                }
                                if(ends[58]>=biggest210727){
                                  biggest210727=ends[58];
                                }
                                if(biggest210727 == 1){
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                              else {
                                S36042=5;
                                if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 465, column: 24
                                  S37014=0;
                                  thread210728(tdone,ends);
                                  thread210729(tdone,ends);
                                  int biggest210730 = 0;
                                  if(ends[61]>=biggest210730){
                                    biggest210730=ends[61];
                                  }
                                  if(ends[62]>=biggest210730){
                                    biggest210730=ends[62];
                                  }
                                  if(biggest210730 == 1){
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                }
                                else {
                                  S36042=6;
                                  if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 494, column: 24
                                    S37594=0;
                                    thread210731(tdone,ends);
                                    thread210732(tdone,ends);
                                    int biggest210733 = 0;
                                    if(ends[65]>=biggest210733){
                                      biggest210733=ends[65];
                                    }
                                    if(ends[66]>=biggest210733){
                                      biggest210733=ends[66];
                                    }
                                    if(biggest210733 == 1){
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                  }
                                  else {
                                    order_finished.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 20
                                    currsigs.addElement(order_finished);
                                    S36042=7;
                                    S38240=0;
                                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 526, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                                      S38240=1;
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                    else {
                                      S38235=0;
                                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 526, column: 20
                                        S38235=1;
                                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                                          ends[52]=2;
                                          ;//sysj\conveyor_controller.sysj line: 526, column: 20
                                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 527, column: 20
                                          S36042=8;
                                          S38555=0;
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
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 399, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 399, column: 20
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 399, column: 20
                        S36042=2;
                        __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 374, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 374, column: 9
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 374, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 402, column: 20
                          S36042=3;
                          if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 405, column: 24
                            S36202=0;
                            thread210734(tdone,ends);
                            thread210735(tdone,ends);
                            int biggest210736 = 0;
                            if(ends[53]>=biggest210736){
                              biggest210736=ends[53];
                            }
                            if(ends[54]>=biggest210736){
                              biggest210736=ends[54];
                            }
                            if(biggest210736 == 1){
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            S36042=4;
                            if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 435, column: 24
                              S36550=0;
                              thread210737(tdone,ends);
                              thread210738(tdone,ends);
                              int biggest210739 = 0;
                              if(ends[57]>=biggest210739){
                                biggest210739=ends[57];
                              }
                              if(ends[58]>=biggest210739){
                                biggest210739=ends[58];
                              }
                              if(biggest210739 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              S36042=5;
                              if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 465, column: 24
                                S37014=0;
                                thread210740(tdone,ends);
                                thread210741(tdone,ends);
                                int biggest210742 = 0;
                                if(ends[61]>=biggest210742){
                                  biggest210742=ends[61];
                                }
                                if(ends[62]>=biggest210742){
                                  biggest210742=ends[62];
                                }
                                if(biggest210742 == 1){
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                              else {
                                S36042=6;
                                if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 494, column: 24
                                  S37594=0;
                                  thread210743(tdone,ends);
                                  thread210744(tdone,ends);
                                  int biggest210745 = 0;
                                  if(ends[65]>=biggest210745){
                                    biggest210745=ends[65];
                                  }
                                  if(ends[66]>=biggest210745){
                                    biggest210745=ends[66];
                                  }
                                  if(biggest210745 == 1){
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                }
                                else {
                                  order_finished.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 20
                                  currsigs.addElement(order_finished);
                                  S36042=7;
                                  S38240=0;
                                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 526, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                                    S38240=1;
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                  else {
                                    S38235=0;
                                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 526, column: 20
                                      S38235=1;
                                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                                        ends[52]=2;
                                        ;//sysj\conveyor_controller.sysj line: 526, column: 20
                                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 527, column: 20
                                        S36042=8;
                                        S38555=0;
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
                S36052=1;
                S36052=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 399, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 399, column: 20
                  S36052=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  S36047=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 399, column: 20
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 399, column: 20
                    S36047=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 399, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 399, column: 20
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 399, column: 20
                      S36042=2;
                      __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 374, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 374, column: 9
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 374, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 402, column: 20
                        S36042=3;
                        if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 405, column: 24
                          S36202=0;
                          thread210746(tdone,ends);
                          thread210747(tdone,ends);
                          int biggest210748 = 0;
                          if(ends[53]>=biggest210748){
                            biggest210748=ends[53];
                          }
                          if(ends[54]>=biggest210748){
                            biggest210748=ends[54];
                          }
                          if(biggest210748 == 1){
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          S36042=4;
                          if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 435, column: 24
                            S36550=0;
                            thread210749(tdone,ends);
                            thread210750(tdone,ends);
                            int biggest210751 = 0;
                            if(ends[57]>=biggest210751){
                              biggest210751=ends[57];
                            }
                            if(ends[58]>=biggest210751){
                              biggest210751=ends[58];
                            }
                            if(biggest210751 == 1){
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            S36042=5;
                            if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 465, column: 24
                              S37014=0;
                              thread210752(tdone,ends);
                              thread210753(tdone,ends);
                              int biggest210754 = 0;
                              if(ends[61]>=biggest210754){
                                biggest210754=ends[61];
                              }
                              if(ends[62]>=biggest210754){
                                biggest210754=ends[62];
                              }
                              if(biggest210754 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              S36042=6;
                              if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 494, column: 24
                                S37594=0;
                                thread210755(tdone,ends);
                                thread210756(tdone,ends);
                                int biggest210757 = 0;
                                if(ends[65]>=biggest210757){
                                  biggest210757=ends[65];
                                }
                                if(ends[66]>=biggest210757){
                                  biggest210757=ends[66];
                                }
                                if(biggest210757 == 1){
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                              else {
                                order_finished.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 20
                                currsigs.addElement(order_finished);
                                S36042=7;
                                S38240=0;
                                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 526, column: 20
                                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                                  S38240=1;
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                                else {
                                  S38235=0;
                                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 526, column: 20
                                    S38235=1;
                                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                                      ends[52]=2;
                                      ;//sysj\conveyor_controller.sysj line: 526, column: 20
                                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 527, column: 20
                                      S36042=8;
                                      S38555=0;
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
            if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 374, column: 9
              ends[52]=2;
              ;//sysj\conveyor_controller.sysj line: 374, column: 9
              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 402, column: 20
              S36042=3;
              if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 405, column: 24
                S36202=0;
                thread210758(tdone,ends);
                thread210759(tdone,ends);
                int biggest210760 = 0;
                if(ends[53]>=biggest210760){
                  biggest210760=ends[53];
                }
                if(ends[54]>=biggest210760){
                  biggest210760=ends[54];
                }
                if(biggest210760 == 1){
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
              }
              else {
                S36042=4;
                if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 435, column: 24
                  S36550=0;
                  thread210761(tdone,ends);
                  thread210762(tdone,ends);
                  int biggest210763 = 0;
                  if(ends[57]>=biggest210763){
                    biggest210763=ends[57];
                  }
                  if(ends[58]>=biggest210763){
                    biggest210763=ends[58];
                  }
                  if(biggest210763 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  S36042=5;
                  if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 465, column: 24
                    S37014=0;
                    thread210764(tdone,ends);
                    thread210765(tdone,ends);
                    int biggest210766 = 0;
                    if(ends[61]>=biggest210766){
                      biggest210766=ends[61];
                    }
                    if(ends[62]>=biggest210766){
                      biggest210766=ends[62];
                    }
                    if(biggest210766 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    S36042=6;
                    if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 494, column: 24
                      S37594=0;
                      thread210767(tdone,ends);
                      thread210768(tdone,ends);
                      int biggest210769 = 0;
                      if(ends[65]>=biggest210769){
                        biggest210769=ends[65];
                      }
                      if(ends[66]>=biggest210769){
                        biggest210769=ends[66];
                      }
                      if(biggest210769 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      order_finished.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 20
                      currsigs.addElement(order_finished);
                      S36042=7;
                      S38240=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 526, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                        S38240=1;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        S38235=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 526, column: 20
                          S38235=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 526, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 527, column: 20
                            S36042=8;
                            S38555=0;
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
            switch(S36202){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 407, column: 30
                  S36202=1;
                  thread210770(tdone,ends);
                  thread210771(tdone,ends);
                  int biggest210772 = 0;
                  if(ends[55]>=biggest210772){
                    biggest210772=ends[55];
                  }
                  if(ends[56]>=biggest210772){
                    biggest210772=ends[56];
                  }
                  if(biggest210772 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread210773(tdone,ends);
                  thread210774(tdone,ends);
                  int biggest210775 = 0;
                  if(ends[53]>=biggest210775){
                    biggest210775=ends[53];
                  }
                  if(ends[54]>=biggest210775){
                    biggest210775=ends[54];
                  }
                  if(biggest210775 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest210775 == 0){
                    S36202=1;
                    thread210776(tdone,ends);
                    thread210777(tdone,ends);
                    int biggest210778 = 0;
                    if(ends[55]>=biggest210778){
                      biggest210778=ends[55];
                    }
                    if(ends[56]>=biggest210778){
                      biggest210778=ends[56];
                    }
                    if(biggest210778 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 417, column: 30
                  System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 428, column: 24
                  current_thread_52 += (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 429, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 430, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 431, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 431, column: 24
                  S36042=4;
                  if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 435, column: 24
                    S36550=0;
                    thread210779(tdone,ends);
                    thread210780(tdone,ends);
                    int biggest210781 = 0;
                    if(ends[57]>=biggest210781){
                      biggest210781=ends[57];
                    }
                    if(ends[58]>=biggest210781){
                      biggest210781=ends[58];
                    }
                    if(biggest210781 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    S36042=5;
                    if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 465, column: 24
                      S37014=0;
                      thread210782(tdone,ends);
                      thread210783(tdone,ends);
                      int biggest210784 = 0;
                      if(ends[61]>=biggest210784){
                        biggest210784=ends[61];
                      }
                      if(ends[62]>=biggest210784){
                        biggest210784=ends[62];
                      }
                      if(biggest210784 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      S36042=6;
                      if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 494, column: 24
                        S37594=0;
                        thread210785(tdone,ends);
                        thread210786(tdone,ends);
                        int biggest210787 = 0;
                        if(ends[65]>=biggest210787){
                          biggest210787=ends[65];
                        }
                        if(ends[66]>=biggest210787){
                          biggest210787=ends[66];
                        }
                        if(biggest210787 == 1){
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        order_finished.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 20
                        currsigs.addElement(order_finished);
                        S36042=7;
                        S38240=0;
                        if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 526, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                          S38240=1;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          S38235=0;
                          if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                            fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 526, column: 20
                            S38235=1;
                            if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                              fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                              ends[52]=2;
                              ;//sysj\conveyor_controller.sysj line: 526, column: 20
                              System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 527, column: 20
                              S36042=8;
                              S38555=0;
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
                  thread210788(tdone,ends);
                  thread210789(tdone,ends);
                  int biggest210790 = 0;
                  if(ends[55]>=biggest210790){
                    biggest210790=ends[55];
                  }
                  if(ends[56]>=biggest210790){
                    biggest210790=ends[56];
                  }
                  if(biggest210790 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest210790 == 0){
                    System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 428, column: 24
                    current_thread_52 += (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 429, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 430, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 431, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 431, column: 24
                    S36042=4;
                    if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 435, column: 24
                      S36550=0;
                      thread210791(tdone,ends);
                      thread210792(tdone,ends);
                      int biggest210793 = 0;
                      if(ends[57]>=biggest210793){
                        biggest210793=ends[57];
                      }
                      if(ends[58]>=biggest210793){
                        biggest210793=ends[58];
                      }
                      if(biggest210793 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      S36042=5;
                      if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 465, column: 24
                        S37014=0;
                        thread210794(tdone,ends);
                        thread210795(tdone,ends);
                        int biggest210796 = 0;
                        if(ends[61]>=biggest210796){
                          biggest210796=ends[61];
                        }
                        if(ends[62]>=biggest210796){
                          biggest210796=ends[62];
                        }
                        if(biggest210796 == 1){
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        S36042=6;
                        if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 494, column: 24
                          S37594=0;
                          thread210797(tdone,ends);
                          thread210798(tdone,ends);
                          int biggest210799 = 0;
                          if(ends[65]>=biggest210799){
                            biggest210799=ends[65];
                          }
                          if(ends[66]>=biggest210799){
                            biggest210799=ends[66];
                          }
                          if(biggest210799 == 1){
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          order_finished.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 20
                          currsigs.addElement(order_finished);
                          S36042=7;
                          S38240=0;
                          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 526, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                            S38240=1;
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                          else {
                            S38235=0;
                            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 526, column: 20
                              S38235=1;
                              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                                ends[52]=2;
                                ;//sysj\conveyor_controller.sysj line: 526, column: 20
                                System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 527, column: 20
                                S36042=8;
                                S38555=0;
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
            switch(S36550){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 437, column: 30
                  S36550=1;
                  thread210800(tdone,ends);
                  thread210801(tdone,ends);
                  int biggest210802 = 0;
                  if(ends[59]>=biggest210802){
                    biggest210802=ends[59];
                  }
                  if(ends[60]>=biggest210802){
                    biggest210802=ends[60];
                  }
                  if(biggest210802 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread210803(tdone,ends);
                  thread210804(tdone,ends);
                  int biggest210805 = 0;
                  if(ends[57]>=biggest210805){
                    biggest210805=ends[57];
                  }
                  if(ends[58]>=biggest210805){
                    biggest210805=ends[58];
                  }
                  if(biggest210805 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest210805 == 0){
                    S36550=1;
                    thread210806(tdone,ends);
                    thread210807(tdone,ends);
                    int biggest210808 = 0;
                    if(ends[59]>=biggest210808){
                      biggest210808=ends[59];
                    }
                    if(ends[60]>=biggest210808){
                      biggest210808=ends[60];
                    }
                    if(biggest210808 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 447, column: 30
                  System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 458, column: 24
                  current_thread_52 += (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 459, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 460, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 461, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 461, column: 24
                  S36042=5;
                  if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 465, column: 24
                    S37014=0;
                    thread210809(tdone,ends);
                    thread210810(tdone,ends);
                    int biggest210811 = 0;
                    if(ends[61]>=biggest210811){
                      biggest210811=ends[61];
                    }
                    if(ends[62]>=biggest210811){
                      biggest210811=ends[62];
                    }
                    if(biggest210811 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    S36042=6;
                    if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 494, column: 24
                      S37594=0;
                      thread210812(tdone,ends);
                      thread210813(tdone,ends);
                      int biggest210814 = 0;
                      if(ends[65]>=biggest210814){
                        biggest210814=ends[65];
                      }
                      if(ends[66]>=biggest210814){
                        biggest210814=ends[66];
                      }
                      if(biggest210814 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      order_finished.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 20
                      currsigs.addElement(order_finished);
                      S36042=7;
                      S38240=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 526, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                        S38240=1;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        S38235=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 526, column: 20
                          S38235=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 526, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 527, column: 20
                            S36042=8;
                            S38555=0;
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
                  thread210815(tdone,ends);
                  thread210816(tdone,ends);
                  int biggest210817 = 0;
                  if(ends[59]>=biggest210817){
                    biggest210817=ends[59];
                  }
                  if(ends[60]>=biggest210817){
                    biggest210817=ends[60];
                  }
                  if(biggest210817 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest210817 == 0){
                    System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 458, column: 24
                    current_thread_52 += (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 459, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 460, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 461, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 461, column: 24
                    S36042=5;
                    if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 465, column: 24
                      S37014=0;
                      thread210818(tdone,ends);
                      thread210819(tdone,ends);
                      int biggest210820 = 0;
                      if(ends[61]>=biggest210820){
                        biggest210820=ends[61];
                      }
                      if(ends[62]>=biggest210820){
                        biggest210820=ends[62];
                      }
                      if(biggest210820 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      S36042=6;
                      if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 494, column: 24
                        S37594=0;
                        thread210821(tdone,ends);
                        thread210822(tdone,ends);
                        int biggest210823 = 0;
                        if(ends[65]>=biggest210823){
                          biggest210823=ends[65];
                        }
                        if(ends[66]>=biggest210823){
                          biggest210823=ends[66];
                        }
                        if(biggest210823 == 1){
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        order_finished.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 20
                        currsigs.addElement(order_finished);
                        S36042=7;
                        S38240=0;
                        if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 526, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                          S38240=1;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          S38235=0;
                          if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                            fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 526, column: 20
                            S38235=1;
                            if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                              fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                              ends[52]=2;
                              ;//sysj\conveyor_controller.sysj line: 526, column: 20
                              System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 527, column: 20
                              S36042=8;
                              S38555=0;
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
            switch(S37014){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 467, column: 30
                  S37014=1;
                  thread210824(tdone,ends);
                  thread210825(tdone,ends);
                  int biggest210826 = 0;
                  if(ends[63]>=biggest210826){
                    biggest210826=ends[63];
                  }
                  if(ends[64]>=biggest210826){
                    biggest210826=ends[64];
                  }
                  if(biggest210826 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread210827(tdone,ends);
                  thread210828(tdone,ends);
                  int biggest210829 = 0;
                  if(ends[61]>=biggest210829){
                    biggest210829=ends[61];
                  }
                  if(ends[62]>=biggest210829){
                    biggest210829=ends[62];
                  }
                  if(biggest210829 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest210829 == 0){
                    S37014=1;
                    thread210830(tdone,ends);
                    thread210831(tdone,ends);
                    int biggest210832 = 0;
                    if(ends[63]>=biggest210832){
                      biggest210832=ends[63];
                    }
                    if(ends[64]>=biggest210832){
                      biggest210832=ends[64];
                    }
                    if(biggest210832 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 477, column: 30
                  System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 488, column: 24
                  current_thread_52 += (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 489, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 490, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 491, column: 24
                  S36042=6;
                  if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 494, column: 24
                    S37594=0;
                    thread210833(tdone,ends);
                    thread210834(tdone,ends);
                    int biggest210835 = 0;
                    if(ends[65]>=biggest210835){
                      biggest210835=ends[65];
                    }
                    if(ends[66]>=biggest210835){
                      biggest210835=ends[66];
                    }
                    if(biggest210835 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    order_finished.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 20
                    currsigs.addElement(order_finished);
                    S36042=7;
                    S38240=0;
                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 526, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                      S38240=1;
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                    else {
                      S38235=0;
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 526, column: 20
                        S38235=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 526, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 527, column: 20
                          S36042=8;
                          S38555=0;
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
                  thread210836(tdone,ends);
                  thread210837(tdone,ends);
                  int biggest210838 = 0;
                  if(ends[63]>=biggest210838){
                    biggest210838=ends[63];
                  }
                  if(ends[64]>=biggest210838){
                    biggest210838=ends[64];
                  }
                  if(biggest210838 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest210838 == 0){
                    System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 488, column: 24
                    current_thread_52 += (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 489, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 490, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 491, column: 24
                    S36042=6;
                    if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 494, column: 24
                      S37594=0;
                      thread210839(tdone,ends);
                      thread210840(tdone,ends);
                      int biggest210841 = 0;
                      if(ends[65]>=biggest210841){
                        biggest210841=ends[65];
                      }
                      if(ends[66]>=biggest210841){
                        biggest210841=ends[66];
                      }
                      if(biggest210841 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      order_finished.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 20
                      currsigs.addElement(order_finished);
                      S36042=7;
                      S38240=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 526, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                        S38240=1;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        S38235=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 526, column: 20
                          S38235=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 526, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 527, column: 20
                            S36042=8;
                            S38555=0;
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
            switch(S37594){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 496, column: 30
                  S37594=1;
                  thread210842(tdone,ends);
                  thread210843(tdone,ends);
                  int biggest210844 = 0;
                  if(ends[67]>=biggest210844){
                    biggest210844=ends[67];
                  }
                  if(ends[68]>=biggest210844){
                    biggest210844=ends[68];
                  }
                  if(biggest210844 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread210845(tdone,ends);
                  thread210846(tdone,ends);
                  int biggest210847 = 0;
                  if(ends[65]>=biggest210847){
                    biggest210847=ends[65];
                  }
                  if(ends[66]>=biggest210847){
                    biggest210847=ends[66];
                  }
                  if(biggest210847 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest210847 == 0){
                    S37594=1;
                    thread210848(tdone,ends);
                    thread210849(tdone,ends);
                    int biggest210850 = 0;
                    if(ends[67]>=biggest210850){
                      biggest210850=ends[67];
                    }
                    if(ends[68]>=biggest210850){
                      biggest210850=ends[68];
                    }
                    if(biggest210850 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 506, column: 30
                  System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 517, column: 24
                  current_thread_52 += (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 518, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 519, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 520, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 520, column: 24
                  order_finished.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 20
                  currsigs.addElement(order_finished);
                  S36042=7;
                  S38240=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 526, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                    S38240=1;
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  else {
                    S38235=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 526, column: 20
                      S38235=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 526, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 527, column: 20
                        S36042=8;
                        S38555=0;
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
                  thread210851(tdone,ends);
                  thread210852(tdone,ends);
                  int biggest210853 = 0;
                  if(ends[67]>=biggest210853){
                    biggest210853=ends[67];
                  }
                  if(ends[68]>=biggest210853){
                    biggest210853=ends[68];
                  }
                  if(biggest210853 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest210853 == 0){
                    System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 517, column: 24
                    current_thread_52 += (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 518, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 519, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 520, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 520, column: 24
                    order_finished.setPresent();//sysj\conveyor_controller.sysj line: 524, column: 20
                    currsigs.addElement(order_finished);
                    S36042=7;
                    S38240=0;
                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 526, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                      S38240=1;
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                    else {
                      S38235=0;
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 526, column: 20
                        S38235=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 526, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 527, column: 20
                          S36042=8;
                          S38555=0;
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
            switch(S38240){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 526, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                  S38240=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  switch(S38235){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 526, column: 20
                        S38235=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 526, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 527, column: 20
                          S36042=8;
                          S38555=0;
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
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 526, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 527, column: 20
                        S36042=8;
                        S38555=0;
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
                S38240=1;
                S38240=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 526, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                  S38240=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  S38235=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 526, column: 20
                    S38235=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 526, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 526, column: 20
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 526, column: 20
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 527, column: 20
                      S36042=8;
                      S38555=0;
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
            switch(S38555){
              case 0 : 
                if(!bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 530, column: 30
                  S38555=1;
                  if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 532, column: 36
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  else {
                    ends[52]=2;
                    ;//sysj\conveyor_controller.sysj line: 529, column: 20
                    if(ordered.getprestatus()){//sysj\conveyor_controller.sysj line: 383, column: 25
                      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 384, column: 24
                      currsigs.addElement(filler1_amount_51);
                      filler1_amount_51.setValue((orderFill_1.getpreval() == null ? 0 : ((Integer)orderFill_1.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 384, column: 24
                      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 24
                      currsigs.addElement(filler2_amount_51);
                      filler2_amount_51.setValue((orderFill_2.getpreval() == null ? 0 : ((Integer)orderFill_2.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 385, column: 24
                      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 24
                      currsigs.addElement(filler3_amount_51);
                      filler3_amount_51.setValue((orderFill_3.getpreval() == null ? 0 : ((Integer)orderFill_3.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 386, column: 24
                      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 24
                      currsigs.addElement(filler4_amount_51);
                      filler4_amount_51.setValue((orderFill_4.getpreval() == null ? 0 : ((Integer)orderFill_4.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 387, column: 24
                      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 397, column: 20
                      S36042=0;
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                    else {
                      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 390, column: 24
                      currsigs.addElement(filler1_amount_51);
                      filler1_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 390, column: 24
                      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 391, column: 24
                      currsigs.addElement(filler2_amount_51);
                      filler2_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 391, column: 24
                      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 392, column: 24
                      currsigs.addElement(filler3_amount_51);
                      filler3_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 392, column: 24
                      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 393, column: 24
                      currsigs.addElement(filler4_amount_51);
                      filler4_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 393, column: 24
                      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 397, column: 20
                      S36042=0;
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
                if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 532, column: 36
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  ends[52]=2;
                  ;//sysj\conveyor_controller.sysj line: 529, column: 20
                  if(ordered.getprestatus()){//sysj\conveyor_controller.sysj line: 383, column: 25
                    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 384, column: 24
                    currsigs.addElement(filler1_amount_51);
                    filler1_amount_51.setValue((orderFill_1.getpreval() == null ? 0 : ((Integer)orderFill_1.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 384, column: 24
                    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 24
                    currsigs.addElement(filler2_amount_51);
                    filler2_amount_51.setValue((orderFill_2.getpreval() == null ? 0 : ((Integer)orderFill_2.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 385, column: 24
                    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 24
                    currsigs.addElement(filler3_amount_51);
                    filler3_amount_51.setValue((orderFill_3.getpreval() == null ? 0 : ((Integer)orderFill_3.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 386, column: 24
                    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 24
                    currsigs.addElement(filler4_amount_51);
                    filler4_amount_51.setValue((orderFill_4.getpreval() == null ? 0 : ((Integer)orderFill_4.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 387, column: 24
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 397, column: 20
                    S36042=0;
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  else {
                    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 390, column: 24
                    currsigs.addElement(filler1_amount_51);
                    filler1_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 390, column: 24
                    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 391, column: 24
                    currsigs.addElement(filler2_amount_51);
                    filler2_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 391, column: 24
                    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 392, column: 24
                    currsigs.addElement(filler3_amount_51);
                    filler3_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 392, column: 24
                    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 393, column: 24
                    currsigs.addElement(filler4_amount_51);
                    filler4_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 393, column: 24
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 397, column: 20
                    S36042=0;
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

  public void thread210706(int [] tdone, int [] ends){
        S63560=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread210705(int [] tdone, int [] ends){
        S63557=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread210704(int [] tdone, int [] ends){
        S63587=1;
    S63563=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 558, column: 26
      thread210705(tdone,ends);
      thread210706(tdone,ends);
      int biggest210707 = 0;
      if(ends[71]>=biggest210707){
        biggest210707=ends[71];
      }
      if(ends[72]>=biggest210707){
        biggest210707=ends[72];
      }
      if(biggest210707 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S63563=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread210703(int [] tdone, int [] ends){
        S63552=1;
    S63496=0;
    S63476=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 547, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 547, column: 12
      S63476=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S63471=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 547, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 547, column: 12
        S63471=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 547, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 547, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 547, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 548, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 549, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S63496=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S63496=1;
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

  public void thread210702(int [] tdone, int [] ends){
        S63469=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 375, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 376, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 377, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 377, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 378, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 378, column: 16
    if(ordered.getprestatus()){//sysj\conveyor_controller.sysj line: 383, column: 25
      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 384, column: 24
      currsigs.addElement(filler1_amount_51);
      filler1_amount_51.setValue((orderFill_1.getpreval() == null ? 0 : ((Integer)orderFill_1.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 384, column: 24
      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 24
      currsigs.addElement(filler2_amount_51);
      filler2_amount_51.setValue((orderFill_2.getpreval() == null ? 0 : ((Integer)orderFill_2.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 385, column: 24
      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 24
      currsigs.addElement(filler3_amount_51);
      filler3_amount_51.setValue((orderFill_3.getpreval() == null ? 0 : ((Integer)orderFill_3.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 386, column: 24
      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 24
      currsigs.addElement(filler4_amount_51);
      filler4_amount_51.setValue((orderFill_4.getpreval() == null ? 0 : ((Integer)orderFill_4.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 387, column: 24
      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 397, column: 20
      S36042=0;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
    else {
      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 390, column: 24
      currsigs.addElement(filler1_amount_51);
      filler1_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 390, column: 24
      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 391, column: 24
      currsigs.addElement(filler2_amount_51);
      filler2_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 391, column: 24
      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 392, column: 24
      currsigs.addElement(filler3_amount_51);
      filler3_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 392, column: 24
      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 393, column: 24
      currsigs.addElement(filler4_amount_51);
      filler4_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 393, column: 24
      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 397, column: 20
      S36042=0;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread210699(int [] tdone, int [] ends){
        S63560=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread210698(int [] tdone, int [] ends){
        S63557=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread210697(int [] tdone, int [] ends){
        S63587=1;
    S63563=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 558, column: 26
      thread210698(tdone,ends);
      thread210699(tdone,ends);
      int biggest210700 = 0;
      if(ends[71]>=biggest210700){
        biggest210700=ends[71];
      }
      if(ends[72]>=biggest210700){
        biggest210700=ends[72];
      }
      if(biggest210700 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S63563=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread210696(int [] tdone, int [] ends){
        S63552=1;
    S63496=0;
    S63476=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 547, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 547, column: 12
      S63476=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S63471=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 547, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 547, column: 12
        S63471=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 547, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 547, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 547, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 548, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 549, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S63496=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S63496=1;
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

  public void thread210695(int [] tdone, int [] ends){
        S63469=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 375, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 376, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 377, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 377, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 378, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 378, column: 16
    if(ordered.getprestatus()){//sysj\conveyor_controller.sysj line: 383, column: 25
      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 384, column: 24
      currsigs.addElement(filler1_amount_51);
      filler1_amount_51.setValue((orderFill_1.getpreval() == null ? 0 : ((Integer)orderFill_1.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 384, column: 24
      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 24
      currsigs.addElement(filler2_amount_51);
      filler2_amount_51.setValue((orderFill_2.getpreval() == null ? 0 : ((Integer)orderFill_2.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 385, column: 24
      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 24
      currsigs.addElement(filler3_amount_51);
      filler3_amount_51.setValue((orderFill_3.getpreval() == null ? 0 : ((Integer)orderFill_3.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 386, column: 24
      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 24
      currsigs.addElement(filler4_amount_51);
      filler4_amount_51.setValue((orderFill_4.getpreval() == null ? 0 : ((Integer)orderFill_4.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 387, column: 24
      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 397, column: 20
      S36042=0;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
    else {
      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 390, column: 24
      currsigs.addElement(filler1_amount_51);
      filler1_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 390, column: 24
      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 391, column: 24
      currsigs.addElement(filler2_amount_51);
      filler2_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 391, column: 24
      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 392, column: 24
      currsigs.addElement(filler3_amount_51);
      filler3_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 392, column: 24
      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 393, column: 24
      currsigs.addElement(filler4_amount_51);
      filler4_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 393, column: 24
      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 397, column: 20
      S36042=0;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread210692(int [] tdone, int [] ends){
        S63560=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread210691(int [] tdone, int [] ends){
        S63557=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread210690(int [] tdone, int [] ends){
        S63587=1;
    S63563=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 558, column: 26
      thread210691(tdone,ends);
      thread210692(tdone,ends);
      int biggest210693 = 0;
      if(ends[71]>=biggest210693){
        biggest210693=ends[71];
      }
      if(ends[72]>=biggest210693){
        biggest210693=ends[72];
      }
      if(biggest210693 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S63563=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread210689(int [] tdone, int [] ends){
        S63552=1;
    S63496=0;
    S63476=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 547, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 547, column: 12
      S63476=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S63471=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 547, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 547, column: 12
        S63471=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 547, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 547, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 547, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 548, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 549, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S63496=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S63496=1;
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

  public void thread210688(int [] tdone, int [] ends){
        S63469=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 375, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 376, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 377, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 377, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 378, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 378, column: 16
    if(ordered.getprestatus()){//sysj\conveyor_controller.sysj line: 383, column: 25
      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 384, column: 24
      currsigs.addElement(filler1_amount_51);
      filler1_amount_51.setValue((orderFill_1.getpreval() == null ? 0 : ((Integer)orderFill_1.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 384, column: 24
      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 24
      currsigs.addElement(filler2_amount_51);
      filler2_amount_51.setValue((orderFill_2.getpreval() == null ? 0 : ((Integer)orderFill_2.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 385, column: 24
      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 24
      currsigs.addElement(filler3_amount_51);
      filler3_amount_51.setValue((orderFill_3.getpreval() == null ? 0 : ((Integer)orderFill_3.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 386, column: 24
      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 24
      currsigs.addElement(filler4_amount_51);
      filler4_amount_51.setValue((orderFill_4.getpreval() == null ? 0 : ((Integer)orderFill_4.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 387, column: 24
      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 397, column: 20
      S36042=0;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
    else {
      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 390, column: 24
      currsigs.addElement(filler1_amount_51);
      filler1_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 390, column: 24
      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 391, column: 24
      currsigs.addElement(filler2_amount_51);
      filler2_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 391, column: 24
      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 392, column: 24
      currsigs.addElement(filler3_amount_51);
      filler3_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 392, column: 24
      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 393, column: 24
      currsigs.addElement(filler4_amount_51);
      filler4_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 393, column: 24
      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 397, column: 20
      S36042=0;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
  }

  public void thread210685(int [] tdone, int [] ends){
        S63560=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread210684(int [] tdone, int [] ends){
        S63557=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 561, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread210683(int [] tdone, int [] ends){
        S63587=1;
    S63563=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 558, column: 26
      thread210684(tdone,ends);
      thread210685(tdone,ends);
      int biggest210686 = 0;
      if(ends[71]>=biggest210686){
        biggest210686=ends[71];
      }
      if(ends[72]>=biggest210686){
        biggest210686=ends[72];
      }
      if(biggest210686 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S63563=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread210682(int [] tdone, int [] ends){
        S63552=1;
    S63496=0;
    S63476=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 547, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 547, column: 12
      S63476=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S63471=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 547, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 547, column: 12
        S63471=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 547, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 547, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 547, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 548, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 549, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S63496=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S63496=1;
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

  public void thread210681(int [] tdone, int [] ends){
        S63469=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 375, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 376, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 377, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 377, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 378, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 378, column: 16
    if(ordered.getprestatus()){//sysj\conveyor_controller.sysj line: 383, column: 25
      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 384, column: 24
      currsigs.addElement(filler1_amount_51);
      filler1_amount_51.setValue((orderFill_1.getpreval() == null ? 0 : ((Integer)orderFill_1.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 384, column: 24
      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 24
      currsigs.addElement(filler2_amount_51);
      filler2_amount_51.setValue((orderFill_2.getpreval() == null ? 0 : ((Integer)orderFill_2.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 385, column: 24
      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 24
      currsigs.addElement(filler3_amount_51);
      filler3_amount_51.setValue((orderFill_3.getpreval() == null ? 0 : ((Integer)orderFill_3.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 386, column: 24
      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 24
      currsigs.addElement(filler4_amount_51);
      filler4_amount_51.setValue((orderFill_4.getpreval() == null ? 0 : ((Integer)orderFill_4.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 387, column: 24
      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 397, column: 20
      S36042=0;
      active[52]=1;
      ends[52]=1;
      tdone[52]=1;
    }
    else {
      filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 390, column: 24
      currsigs.addElement(filler1_amount_51);
      filler1_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 390, column: 24
      filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 391, column: 24
      currsigs.addElement(filler2_amount_51);
      filler2_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 391, column: 24
      filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 392, column: 24
      currsigs.addElement(filler3_amount_51);
      filler3_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 392, column: 24
      filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 393, column: 24
      currsigs.addElement(filler4_amount_51);
      filler4_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 393, column: 24
      System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 397, column: 20
      S36042=0;
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
      switch(S146239){
        case 0 : 
          S146239=0;
          break RUN;
        
        case 1 : 
          S146239=2;
          S146239=2;
          filler1_51.setClear();//sysj\conveyor_controller.sysj line: 365, column: 9
          filler2_51.setClear();//sysj\conveyor_controller.sysj line: 365, column: 9
          filler3_51.setClear();//sysj\conveyor_controller.sysj line: 365, column: 9
          filler4_51.setClear();//sysj\conveyor_controller.sysj line: 365, column: 9
          filler1_amount_51.setClear();//sysj\conveyor_controller.sysj line: 367, column: 9
          filler2_amount_51.setClear();//sysj\conveyor_controller.sysj line: 367, column: 9
          filler3_amount_51.setClear();//sysj\conveyor_controller.sysj line: 367, column: 9
          filler4_amount_51.setClear();//sysj\conveyor_controller.sysj line: 367, column: 9
          current_fill_51.setClear();//sysj\conveyor_controller.sysj line: 368, column: 9
          total_fill_51.setClear();//sysj\conveyor_controller.sysj line: 368, column: 9
          bottleAtPos2_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          S146238=0;
          S36022=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 372, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 372, column: 9
            S36022=1;
            active[51]=1;
            ends[51]=1;
            break RUN;
          }
          else {
            S36017=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 372, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 372, column: 9
              S36017=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 372, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 372, column: 9
                ends[51]=2;
                ;//sysj\conveyor_controller.sysj line: 372, column: 9
                S146238=1;
                thread210681(tdone,ends);
                thread210682(tdone,ends);
                thread210683(tdone,ends);
                int biggest210687 = 0;
                if(ends[52]>=biggest210687){
                  biggest210687=ends[52];
                }
                if(ends[69]>=biggest210687){
                  biggest210687=ends[69];
                }
                if(ends[70]>=biggest210687){
                  biggest210687=ends[70];
                }
                if(biggest210687 == 1){
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
          filler1_51.setClear();//sysj\conveyor_controller.sysj line: 365, column: 9
          filler2_51.setClear();//sysj\conveyor_controller.sysj line: 365, column: 9
          filler3_51.setClear();//sysj\conveyor_controller.sysj line: 365, column: 9
          filler4_51.setClear();//sysj\conveyor_controller.sysj line: 365, column: 9
          filler1_amount_51.setClear();//sysj\conveyor_controller.sysj line: 367, column: 9
          filler2_amount_51.setClear();//sysj\conveyor_controller.sysj line: 367, column: 9
          filler3_amount_51.setClear();//sysj\conveyor_controller.sysj line: 367, column: 9
          filler4_amount_51.setClear();//sysj\conveyor_controller.sysj line: 367, column: 9
          current_fill_51.setClear();//sysj\conveyor_controller.sysj line: 368, column: 9
          total_fill_51.setClear();//sysj\conveyor_controller.sysj line: 368, column: 9
          bottleAtPos2_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          switch(S146238){
            case 0 : 
              switch(S36022){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 372, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 372, column: 9
                    S36022=1;
                    active[51]=1;
                    ends[51]=1;
                    break RUN;
                  }
                  else {
                    switch(S36017){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 372, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 372, column: 9
                          S36017=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 372, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 372, column: 9
                            ends[51]=2;
                            ;//sysj\conveyor_controller.sysj line: 372, column: 9
                            S146238=1;
                            thread210688(tdone,ends);
                            thread210689(tdone,ends);
                            thread210690(tdone,ends);
                            int biggest210694 = 0;
                            if(ends[52]>=biggest210694){
                              biggest210694=ends[52];
                            }
                            if(ends[69]>=biggest210694){
                              biggest210694=ends[69];
                            }
                            if(ends[70]>=biggest210694){
                              biggest210694=ends[70];
                            }
                            if(biggest210694 == 1){
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
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 372, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 372, column: 9
                          ends[51]=2;
                          ;//sysj\conveyor_controller.sysj line: 372, column: 9
                          S146238=1;
                          thread210695(tdone,ends);
                          thread210696(tdone,ends);
                          thread210697(tdone,ends);
                          int biggest210701 = 0;
                          if(ends[52]>=biggest210701){
                            biggest210701=ends[52];
                          }
                          if(ends[69]>=biggest210701){
                            biggest210701=ends[69];
                          }
                          if(ends[70]>=biggest210701){
                            biggest210701=ends[70];
                          }
                          if(biggest210701 == 1){
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
                  S36022=1;
                  S36022=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 372, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 372, column: 9
                    S36022=1;
                    active[51]=1;
                    ends[51]=1;
                    break RUN;
                  }
                  else {
                    S36017=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 372, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 372, column: 9
                      S36017=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 372, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 372, column: 9
                        ends[51]=2;
                        ;//sysj\conveyor_controller.sysj line: 372, column: 9
                        S146238=1;
                        thread210702(tdone,ends);
                        thread210703(tdone,ends);
                        thread210704(tdone,ends);
                        int biggest210708 = 0;
                        if(ends[52]>=biggest210708){
                          biggest210708=ends[52];
                        }
                        if(ends[69]>=biggest210708){
                          biggest210708=ends[69];
                        }
                        if(ends[70]>=biggest210708){
                          biggest210708=ends[70];
                        }
                        if(biggest210708 == 1){
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
              thread210709(tdone,ends);
              thread210854(tdone,ends);
              thread210855(tdone,ends);
              int biggest210862 = 0;
              if(ends[52]>=biggest210862){
                biggest210862=ends[52];
              }
              if(ends[69]>=biggest210862){
                biggest210862=ends[69];
              }
              if(ends[70]>=biggest210862){
                biggest210862=ends[70];
              }
              if(biggest210862 == 1){
                active[51]=1;
                ends[51]=1;
                break RUN;
              }
              //FINXME code
              if(biggest210862 == 0){
                S146239=0;
                active[51]=0;
                ends[51]=0;
                S146239=0;
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
