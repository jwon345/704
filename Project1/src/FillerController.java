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
  private Signal filler1_1;
  private Signal filler2_1;
  private Signal filler3_1;
  private Signal filler4_1;
  private Signal done_1;
  private Signal filler1_amount_1;
  private Signal filler2_amount_1;
  private Signal filler3_amount_1;
  private Signal filler4_amount_1;
  private Signal current_fill_1;
  private Signal total_fill_1;
  private Signal bottleAtPos2_1;
  private int current_thread_2;//sysj\filler.sysj line: 25, column: 16
  private int total_thread_2;//sysj\filler.sysj line: 26, column: 16
  private long __start_thread_2;//sysj\filler.sysj line: 24, column: 9
  private int S115987 = 1;
  private int S115986 = 1;
  private int S25750 = 1;
  private int S25745 = 1;
  private int S48197 = 1;
  private int S25769 = 1;
  private int S25776 = 1;
  private int S25771 = 1;
  private int S25815 = 1;
  private int S25926 = 1;
  private int S25877 = 1;
  private int S25882 = 1;
  private int S25891 = 1;
  private int S25896 = 1;
  private int S26274 = 1;
  private int S26225 = 1;
  private int S26230 = 1;
  private int S26239 = 1;
  private int S26244 = 1;
  private int S26680 = 1;
  private int S26631 = 1;
  private int S26636 = 1;
  private int S26645 = 1;
  private int S26650 = 1;
  private int S27144 = 1;
  private int S27095 = 1;
  private int S27100 = 1;
  private int S27109 = 1;
  private int S27114 = 1;
  private int S27616 = 1;
  private int S27611 = 1;
  private int S27843 = 1;
  private int S48202 = 1;
  private int S48285 = 1;
  private int S48229 = 1;
  private int S48209 = 1;
  private int S48204 = 1;
  private int S48320 = 1;
  private int S48296 = 1;
  private int S48290 = 1;
  private int S48293 = 1;
  
  private int[] ends = new int[35];
  private int[] tdone = new int[35];
  
  public void thread116416(int [] tdone, int [] ends){
        S48293=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread116415(int [] tdone, int [] ends){
        S48290=1;
    bottleAtPos2E.setPresent();//sysj\filler.sysj line: 219, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread116413(int [] tdone, int [] ends){
        switch(S48293){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(done_1.getprestatus()){//sysj\filler.sysj line: 223, column: 35
          ends[23]=2;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread116412(int [] tdone, int [] ends){
        switch(S48290){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\filler.sysj line: 219, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
        break;
      
    }
  }

  public void thread116411(int [] tdone, int [] ends){
        switch(S48320){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S48296){
          case 0 : 
            thread116412(tdone,ends);
            thread116413(tdone,ends);
            int biggest116414 = 0;
            if(ends[22]>=biggest116414){
              biggest116414=ends[22];
            }
            if(ends[23]>=biggest116414){
              biggest116414=ends[23];
            }
            if(biggest116414 == 1){
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            if(biggest116414 == 2){
              ends[21]=2;
              ;//sysj\filler.sysj line: 217, column: 18
              S48296=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            //FINXME code
            if(biggest116414 == 0){
              S48296=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
          case 1 : 
            S48296=1;
            S48296=0;
            if(bottleAtPos2_1.getprestatus()){//sysj\filler.sysj line: 216, column: 26
              thread116415(tdone,ends);
              thread116416(tdone,ends);
              int biggest116417 = 0;
              if(ends[22]>=biggest116417){
                biggest116417=ends[22];
              }
              if(ends[23]>=biggest116417){
                biggest116417=ends[23];
              }
              if(biggest116417 == 1){
                active[21]=1;
                ends[21]=1;
                tdone[21]=1;
              }
            }
            else {
              S48296=1;
              active[21]=1;
              ends[21]=1;
              tdone[21]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread116410(int [] tdone, int [] ends){
        switch(S48285){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S48229){
          case 0 : 
            switch(S48209){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\filler.sysj line: 201, column: 12
                  simFiller_in.setACK(false);//sysj\filler.sysj line: 201, column: 12
                  S48209=1;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  switch(S48204){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\filler.sysj line: 201, column: 12
                        simFiller_in.setACK(true);//sysj\filler.sysj line: 201, column: 12
                        S48204=1;
                        if(simFiller_in.isREQ()){//sysj\filler.sysj line: 201, column: 12
                          simFiller_in.setACK(false);//sysj\filler.sysj line: 201, column: 12
                          ends[20]=2;
                          ;//sysj\filler.sysj line: 201, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\filler.sysj line: 202, column: 15
                            bottleAtPos2_1.setPresent();//sysj\filler.sysj line: 203, column: 13
                            currsigs.addElement(bottleAtPos2_1);
                            S48229=1;
                            active[20]=1;
                            ends[20]=1;
                            tdone[20]=1;
                          }
                          else {
                            done_1.setPresent();//sysj\filler.sysj line: 206, column: 13
                            currsigs.addElement(done_1);
                            S48229=1;
                            active[20]=1;
                            ends[20]=1;
                            tdone[20]=1;
                          }
                        }
                        else {
                          active[20]=1;
                          ends[20]=1;
                          tdone[20]=1;
                        }
                      }
                      else {
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\filler.sysj line: 201, column: 12
                        simFiller_in.setACK(false);//sysj\filler.sysj line: 201, column: 12
                        ends[20]=2;
                        ;//sysj\filler.sysj line: 201, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\filler.sysj line: 202, column: 15
                          bottleAtPos2_1.setPresent();//sysj\filler.sysj line: 203, column: 13
                          currsigs.addElement(bottleAtPos2_1);
                          S48229=1;
                          active[20]=1;
                          ends[20]=1;
                          tdone[20]=1;
                        }
                        else {
                          done_1.setPresent();//sysj\filler.sysj line: 206, column: 13
                          currsigs.addElement(done_1);
                          S48229=1;
                          active[20]=1;
                          ends[20]=1;
                          tdone[20]=1;
                        }
                      }
                      else {
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S48209=1;
                S48209=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\filler.sysj line: 201, column: 12
                  simFiller_in.setACK(false);//sysj\filler.sysj line: 201, column: 12
                  S48209=1;
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
                else {
                  S48204=0;
                  if(!simFiller_in.isREQ()){//sysj\filler.sysj line: 201, column: 12
                    simFiller_in.setACK(true);//sysj\filler.sysj line: 201, column: 12
                    S48204=1;
                    if(simFiller_in.isREQ()){//sysj\filler.sysj line: 201, column: 12
                      simFiller_in.setACK(false);//sysj\filler.sysj line: 201, column: 12
                      ends[20]=2;
                      ;//sysj\filler.sysj line: 201, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\filler.sysj line: 202, column: 15
                        bottleAtPos2_1.setPresent();//sysj\filler.sysj line: 203, column: 13
                        currsigs.addElement(bottleAtPos2_1);
                        S48229=1;
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                      else {
                        done_1.setPresent();//sysj\filler.sysj line: 206, column: 13
                        currsigs.addElement(done_1);
                        S48229=1;
                        active[20]=1;
                        ends[20]=1;
                        tdone[20]=1;
                      }
                    }
                    else {
                      active[20]=1;
                      ends[20]=1;
                      tdone[20]=1;
                    }
                  }
                  else {
                    active[20]=1;
                    ends[20]=1;
                    tdone[20]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S48229=1;
            S48229=0;
            S48209=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\filler.sysj line: 201, column: 12
              simFiller_in.setACK(false);//sysj\filler.sysj line: 201, column: 12
              S48209=1;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            else {
              S48204=0;
              if(!simFiller_in.isREQ()){//sysj\filler.sysj line: 201, column: 12
                simFiller_in.setACK(true);//sysj\filler.sysj line: 201, column: 12
                S48204=1;
                if(simFiller_in.isREQ()){//sysj\filler.sysj line: 201, column: 12
                  simFiller_in.setACK(false);//sysj\filler.sysj line: 201, column: 12
                  ends[20]=2;
                  ;//sysj\filler.sysj line: 201, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\filler.sysj line: 202, column: 15
                    bottleAtPos2_1.setPresent();//sysj\filler.sysj line: 203, column: 13
                    currsigs.addElement(bottleAtPos2_1);
                    S48229=1;
                    active[20]=1;
                    ends[20]=1;
                    tdone[20]=1;
                  }
                  else {
                    done_1.setPresent();//sysj\filler.sysj line: 206, column: 13
                    currsigs.addElement(done_1);
                    S48229=1;
                    active[20]=1;
                    ends[20]=1;
                    tdone[20]=1;
                  }
                }
                else {
                  active[20]=1;
                  ends[20]=1;
                  tdone[20]=1;
                }
              }
              else {
                active[20]=1;
                ends[20]=1;
                tdone[20]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread116409(int [] tdone, int [] ends){
        switch(S48202){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        filler1_amount_1.setPresent();//sysj\filler.sysj line: 188, column: 11
        currsigs.addElement(filler1_amount_1);
        filler1_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\filler.sysj line: 188, column: 11
        filler2_amount_1.setPresent();//sysj\filler.sysj line: 189, column: 8
        currsigs.addElement(filler2_amount_1);
        filler2_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\filler.sysj line: 189, column: 8
        filler3_amount_1.setPresent();//sysj\filler.sysj line: 190, column: 8
        currsigs.addElement(filler3_amount_1);
        filler3_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\filler.sysj line: 190, column: 8
        filler4_amount_1.setPresent();//sysj\filler.sysj line: 191, column: 8
        currsigs.addElement(filler4_amount_1);
        filler4_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\filler.sysj line: 191, column: 8
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
        break;
      
    }
  }

  public void thread116407(int [] tdone, int [] ends){
        switch(S27114){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\filler.sysj line: 155, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
        break;
      
    }
  }

  public void thread116406(int [] tdone, int [] ends){
        switch(S27109){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\filler.sysj line: 151, column: 32
        currsigs.addElement(valveInletOnOff);
        active[17]=1;
        ends[17]=1;
        tdone[17]=1;
        break;
      
    }
  }

  public void thread116404(int [] tdone, int [] ends){
        S27114=1;
    dosUnitValveExtend.setPresent();//sysj\filler.sysj line: 155, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116403(int [] tdone, int [] ends){
        S27109=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\filler.sysj line: 150, column: 32
    valveInletOnOff.setPresent();//sysj\filler.sysj line: 151, column: 32
    currsigs.addElement(valveInletOnOff);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116401(int [] tdone, int [] ends){
        switch(S27100){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 145, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
        break;
      
    }
  }

  public void thread116400(int [] tdone, int [] ends){
        switch(S27095){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 141, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
        break;
      
    }
  }

  public void thread116398(int [] tdone, int [] ends){
        S27114=1;
    dosUnitValveExtend.setPresent();//sysj\filler.sysj line: 155, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[18]=1;
    ends[18]=1;
    tdone[18]=1;
  }

  public void thread116397(int [] tdone, int [] ends){
        S27109=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\filler.sysj line: 150, column: 32
    valveInletOnOff.setPresent();//sysj\filler.sysj line: 151, column: 32
    currsigs.addElement(valveInletOnOff);
    active[17]=1;
    ends[17]=1;
    tdone[17]=1;
  }

  public void thread116395(int [] tdone, int [] ends){
        S27100=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 145, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread116394(int [] tdone, int [] ends){
        S27095=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\filler.sysj line: 140, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 141, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116392(int [] tdone, int [] ends){
        switch(S26650){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\filler.sysj line: 125, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread116391(int [] tdone, int [] ends){
        switch(S26645){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\filler.sysj line: 121, column: 32
        currsigs.addElement(valveInletOnOff);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread116389(int [] tdone, int [] ends){
        S26650=1;
    dosUnitValveExtend.setPresent();//sysj\filler.sysj line: 125, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116388(int [] tdone, int [] ends){
        S26645=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\filler.sysj line: 120, column: 32
    valveInletOnOff.setPresent();//sysj\filler.sysj line: 121, column: 32
    currsigs.addElement(valveInletOnOff);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread116386(int [] tdone, int [] ends){
        switch(S26636){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 115, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
        break;
      
    }
  }

  public void thread116385(int [] tdone, int [] ends){
        switch(S26631){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 111, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
        break;
      
    }
  }

  public void thread116383(int [] tdone, int [] ends){
        S26650=1;
    dosUnitValveExtend.setPresent();//sysj\filler.sysj line: 125, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread116382(int [] tdone, int [] ends){
        S26645=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\filler.sysj line: 120, column: 32
    valveInletOnOff.setPresent();//sysj\filler.sysj line: 121, column: 32
    currsigs.addElement(valveInletOnOff);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread116380(int [] tdone, int [] ends){
        S27100=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 145, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread116379(int [] tdone, int [] ends){
        S27095=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\filler.sysj line: 140, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 141, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116377(int [] tdone, int [] ends){
        S26636=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 115, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread116376(int [] tdone, int [] ends){
        S26631=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\filler.sysj line: 110, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 111, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread116374(int [] tdone, int [] ends){
        switch(S26244){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\filler.sysj line: 95, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread116373(int [] tdone, int [] ends){
        switch(S26239){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\filler.sysj line: 91, column: 32
        currsigs.addElement(valveInletOnOff);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread116371(int [] tdone, int [] ends){
        S26244=1;
    dosUnitValveExtend.setPresent();//sysj\filler.sysj line: 95, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread116370(int [] tdone, int [] ends){
        S26239=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\filler.sysj line: 90, column: 32
    valveInletOnOff.setPresent();//sysj\filler.sysj line: 91, column: 32
    currsigs.addElement(valveInletOnOff);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread116368(int [] tdone, int [] ends){
        switch(S26230){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 83, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread116367(int [] tdone, int [] ends){
        switch(S26225){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 79, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread116365(int [] tdone, int [] ends){
        S26244=1;
    dosUnitValveExtend.setPresent();//sysj\filler.sysj line: 95, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread116364(int [] tdone, int [] ends){
        S26239=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\filler.sysj line: 90, column: 32
    valveInletOnOff.setPresent();//sysj\filler.sysj line: 91, column: 32
    currsigs.addElement(valveInletOnOff);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread116362(int [] tdone, int [] ends){
        S27100=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 145, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread116361(int [] tdone, int [] ends){
        S27095=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\filler.sysj line: 140, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 141, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116359(int [] tdone, int [] ends){
        S26636=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 115, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread116358(int [] tdone, int [] ends){
        S26631=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\filler.sysj line: 110, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 111, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread116356(int [] tdone, int [] ends){
        S26230=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 83, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread116355(int [] tdone, int [] ends){
        S26225=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\filler.sysj line: 78, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 79, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread116353(int [] tdone, int [] ends){
        switch(S25896){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\filler.sysj line: 63, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread116352(int [] tdone, int [] ends){
        switch(S25891){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\filler.sysj line: 59, column: 32
        currsigs.addElement(valveInletOnOff);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread116350(int [] tdone, int [] ends){
        S25896=1;
    dosUnitValveExtend.setPresent();//sysj\filler.sysj line: 63, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread116349(int [] tdone, int [] ends){
        S25891=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\filler.sysj line: 58, column: 32
    valveInletOnOff.setPresent();//sysj\filler.sysj line: 59, column: 32
    currsigs.addElement(valveInletOnOff);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread116347(int [] tdone, int [] ends){
        switch(S25882){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 53, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread116346(int [] tdone, int [] ends){
        switch(S25877){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 49, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread116344(int [] tdone, int [] ends){
        S25896=1;
    dosUnitValveExtend.setPresent();//sysj\filler.sysj line: 63, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread116343(int [] tdone, int [] ends){
        S25891=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\filler.sysj line: 58, column: 32
    valveInletOnOff.setPresent();//sysj\filler.sysj line: 59, column: 32
    currsigs.addElement(valveInletOnOff);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread116341(int [] tdone, int [] ends){
        S27100=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 145, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread116340(int [] tdone, int [] ends){
        S27095=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\filler.sysj line: 140, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 141, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116338(int [] tdone, int [] ends){
        S26636=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 115, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread116337(int [] tdone, int [] ends){
        S26631=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\filler.sysj line: 110, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 111, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread116335(int [] tdone, int [] ends){
        S26230=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 83, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread116334(int [] tdone, int [] ends){
        S26225=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\filler.sysj line: 78, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 79, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread116332(int [] tdone, int [] ends){
        S25882=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 53, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread116331(int [] tdone, int [] ends){
        S25877=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\filler.sysj line: 48, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 49, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116329(int [] tdone, int [] ends){
        S27100=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 145, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread116328(int [] tdone, int [] ends){
        S27095=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\filler.sysj line: 140, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 141, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116326(int [] tdone, int [] ends){
        S26636=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 115, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread116325(int [] tdone, int [] ends){
        S26631=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\filler.sysj line: 110, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 111, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread116323(int [] tdone, int [] ends){
        S26230=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 83, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread116322(int [] tdone, int [] ends){
        S26225=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\filler.sysj line: 78, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 79, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread116320(int [] tdone, int [] ends){
        S25882=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 53, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread116319(int [] tdone, int [] ends){
        S25877=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\filler.sysj line: 48, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 49, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116317(int [] tdone, int [] ends){
        S27100=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 145, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread116316(int [] tdone, int [] ends){
        S27095=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\filler.sysj line: 140, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 141, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116314(int [] tdone, int [] ends){
        S26636=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 115, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread116313(int [] tdone, int [] ends){
        S26631=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\filler.sysj line: 110, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 111, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread116311(int [] tdone, int [] ends){
        S26230=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 83, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread116310(int [] tdone, int [] ends){
        S26225=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\filler.sysj line: 78, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 79, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread116308(int [] tdone, int [] ends){
        S25882=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 53, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread116307(int [] tdone, int [] ends){
        S25877=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\filler.sysj line: 48, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 49, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116305(int [] tdone, int [] ends){
        S27100=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 145, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread116304(int [] tdone, int [] ends){
        S27095=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\filler.sysj line: 140, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 141, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116302(int [] tdone, int [] ends){
        S26636=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 115, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread116301(int [] tdone, int [] ends){
        S26631=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\filler.sysj line: 110, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 111, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread116299(int [] tdone, int [] ends){
        S26230=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 83, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread116298(int [] tdone, int [] ends){
        S26225=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\filler.sysj line: 78, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 79, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread116296(int [] tdone, int [] ends){
        S25882=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 53, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread116295(int [] tdone, int [] ends){
        S25877=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\filler.sysj line: 48, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 49, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116293(int [] tdone, int [] ends){
        S27100=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 145, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread116292(int [] tdone, int [] ends){
        S27095=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\filler.sysj line: 140, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 141, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116290(int [] tdone, int [] ends){
        S26636=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 115, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread116289(int [] tdone, int [] ends){
        S26631=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\filler.sysj line: 110, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 111, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread116287(int [] tdone, int [] ends){
        S26230=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 83, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread116286(int [] tdone, int [] ends){
        S26225=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\filler.sysj line: 78, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 79, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread116284(int [] tdone, int [] ends){
        S25882=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 53, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread116283(int [] tdone, int [] ends){
        S25877=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\filler.sysj line: 48, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 49, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116281(int [] tdone, int [] ends){
        S27100=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 145, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread116280(int [] tdone, int [] ends){
        S27095=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\filler.sysj line: 140, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 141, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread116278(int [] tdone, int [] ends){
        S26636=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 115, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[12]=1;
    ends[12]=1;
    tdone[12]=1;
  }

  public void thread116277(int [] tdone, int [] ends){
        S26631=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\filler.sysj line: 110, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 111, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread116275(int [] tdone, int [] ends){
        S26230=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 83, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread116274(int [] tdone, int [] ends){
        S26225=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\filler.sysj line: 78, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 79, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread116272(int [] tdone, int [] ends){
        S25882=1;
    dosUnitValveRetract.setPresent();//sysj\filler.sysj line: 53, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread116271(int [] tdone, int [] ends){
        S25877=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\filler.sysj line: 48, column: 32
    valveInjectorOnOff.setPresent();//sysj\filler.sysj line: 49, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread116270(int [] tdone, int [] ends){
        switch(S48197){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S25769){
          case 0 : 
            if(bottleAtPos2_1.getprestatus()){//sysj\filler.sysj line: 37, column: 26
              S25769=1;
              S25776=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\filler.sysj line: 38, column: 20
                fillerReady_o.setREQ(false);//sysj\filler.sysj line: 38, column: 20
                S25776=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S25771=0;
                if(fillerReady_o.isACK()){//sysj\filler.sysj line: 38, column: 20
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\filler.sysj line: 38, column: 20
                  S25771=1;
                  if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 38, column: 20
                    fillerReady_o.setREQ(false);//sysj\filler.sysj line: 38, column: 20
                    ends[2]=2;
                    ;//sysj\filler.sysj line: 38, column: 20
                    S25769=2;
                    __start_thread_2 = com.systemj.Timer.getMs();//sysj\filler.sysj line: 24, column: 9
                    S25815=0;
                    if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\filler.sysj line: 24, column: 9
                      ends[2]=2;
                      ;//sysj\filler.sysj line: 24, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\filler.sysj line: 41, column: 20
                      S25769=3;
                      if(((filler1_amount_1.getpreval() == null ? 0 : ((Integer)filler1_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler1_amount_1.getpreval() == null ? 0 : ((Integer)filler1_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 44, column: 24
                        S25926=0;
                        thread116271(tdone,ends);
                        thread116272(tdone,ends);
                        int biggest116273 = 0;
                        if(ends[3]>=biggest116273){
                          biggest116273=ends[3];
                        }
                        if(ends[4]>=biggest116273){
                          biggest116273=ends[4];
                        }
                        if(biggest116273 == 1){
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        S25769=4;
                        if(((filler2_amount_1.getpreval() == null ? 0 : ((Integer)filler2_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler2_amount_1.getpreval() == null ? 0 : ((Integer)filler2_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 74, column: 24
                          S26274=0;
                          thread116274(tdone,ends);
                          thread116275(tdone,ends);
                          int biggest116276 = 0;
                          if(ends[7]>=biggest116276){
                            biggest116276=ends[7];
                          }
                          if(ends[8]>=biggest116276){
                            biggest116276=ends[8];
                          }
                          if(biggest116276 == 1){
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          S25769=5;
                          if(((filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 106, column: 24
                            S26680=0;
                            thread116277(tdone,ends);
                            thread116278(tdone,ends);
                            int biggest116279 = 0;
                            if(ends[11]>=biggest116279){
                              biggest116279=ends[11];
                            }
                            if(ends[12]>=biggest116279){
                              biggest116279=ends[12];
                            }
                            if(biggest116279 == 1){
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            S25769=6;
                            if(((filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 136, column: 24
                              S27144=0;
                              thread116280(tdone,ends);
                              thread116281(tdone,ends);
                              int biggest116282 = 0;
                              if(ends[15]>=biggest116282){
                                biggest116282=ends[15];
                              }
                              if(ends[16]>=biggest116282){
                                biggest116282=ends[16];
                              }
                              if(biggest116282 == 1){
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                            else {
                              current_thread_2 = 0;//sysj\filler.sysj line: 167, column: 20
                              current_fill_1.setPresent();//sysj\filler.sysj line: 168, column: 20
                              currsigs.addElement(current_fill_1);
                              current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 168, column: 20
                              S25769=7;
                              S27616=0;
                              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\filler.sysj line: 170, column: 20
                                fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                                S27616=1;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
                                S27611=0;
                                if(fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                                  fillerReady_o.setVal(Boolean.TRUE);//sysj\filler.sysj line: 170, column: 20
                                  S27611=1;
                                  if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                                    fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                                    ends[2]=2;
                                    ;//sysj\filler.sysj line: 170, column: 20
                                    System.out.println("*Filler operation done");//sysj\filler.sysj line: 171, column: 20
                                    S25769=8;
                                    S27843=0;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
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
                              }
                            }
                          }
                        }
                      }
                    }
                    else {
                      S25815=1;
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
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            switch(S25776){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\filler.sysj line: 38, column: 20
                  fillerReady_o.setREQ(false);//sysj\filler.sysj line: 38, column: 20
                  S25776=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S25771){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\filler.sysj line: 38, column: 20
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\filler.sysj line: 38, column: 20
                        S25771=1;
                        if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 38, column: 20
                          fillerReady_o.setREQ(false);//sysj\filler.sysj line: 38, column: 20
                          ends[2]=2;
                          ;//sysj\filler.sysj line: 38, column: 20
                          S25769=2;
                          __start_thread_2 = com.systemj.Timer.getMs();//sysj\filler.sysj line: 24, column: 9
                          S25815=0;
                          if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\filler.sysj line: 24, column: 9
                            ends[2]=2;
                            ;//sysj\filler.sysj line: 24, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\filler.sysj line: 41, column: 20
                            S25769=3;
                            if(((filler1_amount_1.getpreval() == null ? 0 : ((Integer)filler1_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler1_amount_1.getpreval() == null ? 0 : ((Integer)filler1_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 44, column: 24
                              S25926=0;
                              thread116283(tdone,ends);
                              thread116284(tdone,ends);
                              int biggest116285 = 0;
                              if(ends[3]>=biggest116285){
                                biggest116285=ends[3];
                              }
                              if(ends[4]>=biggest116285){
                                biggest116285=ends[4];
                              }
                              if(biggest116285 == 1){
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                            else {
                              S25769=4;
                              if(((filler2_amount_1.getpreval() == null ? 0 : ((Integer)filler2_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler2_amount_1.getpreval() == null ? 0 : ((Integer)filler2_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 74, column: 24
                                S26274=0;
                                thread116286(tdone,ends);
                                thread116287(tdone,ends);
                                int biggest116288 = 0;
                                if(ends[7]>=biggest116288){
                                  biggest116288=ends[7];
                                }
                                if(ends[8]>=biggest116288){
                                  biggest116288=ends[8];
                                }
                                if(biggest116288 == 1){
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                              else {
                                S25769=5;
                                if(((filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 106, column: 24
                                  S26680=0;
                                  thread116289(tdone,ends);
                                  thread116290(tdone,ends);
                                  int biggest116291 = 0;
                                  if(ends[11]>=biggest116291){
                                    biggest116291=ends[11];
                                  }
                                  if(ends[12]>=biggest116291){
                                    biggest116291=ends[12];
                                  }
                                  if(biggest116291 == 1){
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                                else {
                                  S25769=6;
                                  if(((filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 136, column: 24
                                    S27144=0;
                                    thread116292(tdone,ends);
                                    thread116293(tdone,ends);
                                    int biggest116294 = 0;
                                    if(ends[15]>=biggest116294){
                                      biggest116294=ends[15];
                                    }
                                    if(ends[16]>=biggest116294){
                                      biggest116294=ends[16];
                                    }
                                    if(biggest116294 == 1){
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                  }
                                  else {
                                    current_thread_2 = 0;//sysj\filler.sysj line: 167, column: 20
                                    current_fill_1.setPresent();//sysj\filler.sysj line: 168, column: 20
                                    currsigs.addElement(current_fill_1);
                                    current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 168, column: 20
                                    S25769=7;
                                    S27616=0;
                                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\filler.sysj line: 170, column: 20
                                      fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                                      S27616=1;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
                                      S27611=0;
                                      if(fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                                        fillerReady_o.setVal(Boolean.TRUE);//sysj\filler.sysj line: 170, column: 20
                                        S27611=1;
                                        if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                                          fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                                          ends[2]=2;
                                          ;//sysj\filler.sysj line: 170, column: 20
                                          System.out.println("*Filler operation done");//sysj\filler.sysj line: 171, column: 20
                                          S25769=8;
                                          S27843=0;
                                          active[2]=1;
                                          ends[2]=1;
                                          tdone[2]=1;
                                        }
                                        else {
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
                                    }
                                  }
                                }
                              }
                            }
                          }
                          else {
                            S25815=1;
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
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 38, column: 20
                        fillerReady_o.setREQ(false);//sysj\filler.sysj line: 38, column: 20
                        ends[2]=2;
                        ;//sysj\filler.sysj line: 38, column: 20
                        S25769=2;
                        __start_thread_2 = com.systemj.Timer.getMs();//sysj\filler.sysj line: 24, column: 9
                        S25815=0;
                        if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\filler.sysj line: 24, column: 9
                          ends[2]=2;
                          ;//sysj\filler.sysj line: 24, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\filler.sysj line: 41, column: 20
                          S25769=3;
                          if(((filler1_amount_1.getpreval() == null ? 0 : ((Integer)filler1_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler1_amount_1.getpreval() == null ? 0 : ((Integer)filler1_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 44, column: 24
                            S25926=0;
                            thread116295(tdone,ends);
                            thread116296(tdone,ends);
                            int biggest116297 = 0;
                            if(ends[3]>=biggest116297){
                              biggest116297=ends[3];
                            }
                            if(ends[4]>=biggest116297){
                              biggest116297=ends[4];
                            }
                            if(biggest116297 == 1){
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            S25769=4;
                            if(((filler2_amount_1.getpreval() == null ? 0 : ((Integer)filler2_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler2_amount_1.getpreval() == null ? 0 : ((Integer)filler2_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 74, column: 24
                              S26274=0;
                              thread116298(tdone,ends);
                              thread116299(tdone,ends);
                              int biggest116300 = 0;
                              if(ends[7]>=biggest116300){
                                biggest116300=ends[7];
                              }
                              if(ends[8]>=biggest116300){
                                biggest116300=ends[8];
                              }
                              if(biggest116300 == 1){
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                            else {
                              S25769=5;
                              if(((filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 106, column: 24
                                S26680=0;
                                thread116301(tdone,ends);
                                thread116302(tdone,ends);
                                int biggest116303 = 0;
                                if(ends[11]>=biggest116303){
                                  biggest116303=ends[11];
                                }
                                if(ends[12]>=biggest116303){
                                  biggest116303=ends[12];
                                }
                                if(biggest116303 == 1){
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                              else {
                                S25769=6;
                                if(((filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 136, column: 24
                                  S27144=0;
                                  thread116304(tdone,ends);
                                  thread116305(tdone,ends);
                                  int biggest116306 = 0;
                                  if(ends[15]>=biggest116306){
                                    biggest116306=ends[15];
                                  }
                                  if(ends[16]>=biggest116306){
                                    biggest116306=ends[16];
                                  }
                                  if(biggest116306 == 1){
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                }
                                else {
                                  current_thread_2 = 0;//sysj\filler.sysj line: 167, column: 20
                                  current_fill_1.setPresent();//sysj\filler.sysj line: 168, column: 20
                                  currsigs.addElement(current_fill_1);
                                  current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 168, column: 20
                                  S25769=7;
                                  S27616=0;
                                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\filler.sysj line: 170, column: 20
                                    fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                                    S27616=1;
                                    active[2]=1;
                                    ends[2]=1;
                                    tdone[2]=1;
                                  }
                                  else {
                                    S27611=0;
                                    if(fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                                      fillerReady_o.setVal(Boolean.TRUE);//sysj\filler.sysj line: 170, column: 20
                                      S27611=1;
                                      if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                                        fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                                        ends[2]=2;
                                        ;//sysj\filler.sysj line: 170, column: 20
                                        System.out.println("*Filler operation done");//sysj\filler.sysj line: 171, column: 20
                                        S25769=8;
                                        S27843=0;
                                        active[2]=1;
                                        ends[2]=1;
                                        tdone[2]=1;
                                      }
                                      else {
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
                                  }
                                }
                              }
                            }
                          }
                        }
                        else {
                          S25815=1;
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
                    
                  }
                }
                break;
              
              case 1 : 
                S25776=1;
                S25776=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\filler.sysj line: 38, column: 20
                  fillerReady_o.setREQ(false);//sysj\filler.sysj line: 38, column: 20
                  S25776=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S25771=0;
                  if(fillerReady_o.isACK()){//sysj\filler.sysj line: 38, column: 20
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\filler.sysj line: 38, column: 20
                    S25771=1;
                    if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 38, column: 20
                      fillerReady_o.setREQ(false);//sysj\filler.sysj line: 38, column: 20
                      ends[2]=2;
                      ;//sysj\filler.sysj line: 38, column: 20
                      S25769=2;
                      __start_thread_2 = com.systemj.Timer.getMs();//sysj\filler.sysj line: 24, column: 9
                      S25815=0;
                      if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\filler.sysj line: 24, column: 9
                        ends[2]=2;
                        ;//sysj\filler.sysj line: 24, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\filler.sysj line: 41, column: 20
                        S25769=3;
                        if(((filler1_amount_1.getpreval() == null ? 0 : ((Integer)filler1_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler1_amount_1.getpreval() == null ? 0 : ((Integer)filler1_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 44, column: 24
                          S25926=0;
                          thread116307(tdone,ends);
                          thread116308(tdone,ends);
                          int biggest116309 = 0;
                          if(ends[3]>=biggest116309){
                            biggest116309=ends[3];
                          }
                          if(ends[4]>=biggest116309){
                            biggest116309=ends[4];
                          }
                          if(biggest116309 == 1){
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          S25769=4;
                          if(((filler2_amount_1.getpreval() == null ? 0 : ((Integer)filler2_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler2_amount_1.getpreval() == null ? 0 : ((Integer)filler2_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 74, column: 24
                            S26274=0;
                            thread116310(tdone,ends);
                            thread116311(tdone,ends);
                            int biggest116312 = 0;
                            if(ends[7]>=biggest116312){
                              biggest116312=ends[7];
                            }
                            if(ends[8]>=biggest116312){
                              biggest116312=ends[8];
                            }
                            if(biggest116312 == 1){
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                          }
                          else {
                            S25769=5;
                            if(((filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 106, column: 24
                              S26680=0;
                              thread116313(tdone,ends);
                              thread116314(tdone,ends);
                              int biggest116315 = 0;
                              if(ends[11]>=biggest116315){
                                biggest116315=ends[11];
                              }
                              if(ends[12]>=biggest116315){
                                biggest116315=ends[12];
                              }
                              if(biggest116315 == 1){
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                            }
                            else {
                              S25769=6;
                              if(((filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 136, column: 24
                                S27144=0;
                                thread116316(tdone,ends);
                                thread116317(tdone,ends);
                                int biggest116318 = 0;
                                if(ends[15]>=biggest116318){
                                  biggest116318=ends[15];
                                }
                                if(ends[16]>=biggest116318){
                                  biggest116318=ends[16];
                                }
                                if(biggest116318 == 1){
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                              }
                              else {
                                current_thread_2 = 0;//sysj\filler.sysj line: 167, column: 20
                                current_fill_1.setPresent();//sysj\filler.sysj line: 168, column: 20
                                currsigs.addElement(current_fill_1);
                                current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 168, column: 20
                                S25769=7;
                                S27616=0;
                                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\filler.sysj line: 170, column: 20
                                  fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                                  S27616=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
                                  S27611=0;
                                  if(fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                                    fillerReady_o.setVal(Boolean.TRUE);//sysj\filler.sysj line: 170, column: 20
                                    S27611=1;
                                    if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                                      fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                                      ends[2]=2;
                                      ;//sysj\filler.sysj line: 170, column: 20
                                      System.out.println("*Filler operation done");//sysj\filler.sysj line: 171, column: 20
                                      S25769=8;
                                      S27843=0;
                                      active[2]=1;
                                      ends[2]=1;
                                      tdone[2]=1;
                                    }
                                    else {
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
                                }
                              }
                            }
                          }
                        }
                      }
                      else {
                        S25815=1;
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
                  }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            switch(S25815){
              case 0 : 
                S25815=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\filler.sysj line: 24, column: 9
                  ends[2]=2;
                  ;//sysj\filler.sysj line: 24, column: 9
                  System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\filler.sysj line: 41, column: 20
                  S25769=3;
                  if(((filler1_amount_1.getpreval() == null ? 0 : ((Integer)filler1_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler1_amount_1.getpreval() == null ? 0 : ((Integer)filler1_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 44, column: 24
                    S25926=0;
                    thread116319(tdone,ends);
                    thread116320(tdone,ends);
                    int biggest116321 = 0;
                    if(ends[3]>=biggest116321){
                      biggest116321=ends[3];
                    }
                    if(ends[4]>=biggest116321){
                      biggest116321=ends[4];
                    }
                    if(biggest116321 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    S25769=4;
                    if(((filler2_amount_1.getpreval() == null ? 0 : ((Integer)filler2_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler2_amount_1.getpreval() == null ? 0 : ((Integer)filler2_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 74, column: 24
                      S26274=0;
                      thread116322(tdone,ends);
                      thread116323(tdone,ends);
                      int biggest116324 = 0;
                      if(ends[7]>=biggest116324){
                        biggest116324=ends[7];
                      }
                      if(ends[8]>=biggest116324){
                        biggest116324=ends[8];
                      }
                      if(biggest116324 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S25769=5;
                      if(((filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 106, column: 24
                        S26680=0;
                        thread116325(tdone,ends);
                        thread116326(tdone,ends);
                        int biggest116327 = 0;
                        if(ends[11]>=biggest116327){
                          biggest116327=ends[11];
                        }
                        if(ends[12]>=biggest116327){
                          biggest116327=ends[12];
                        }
                        if(biggest116327 == 1){
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        S25769=6;
                        if(((filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 136, column: 24
                          S27144=0;
                          thread116328(tdone,ends);
                          thread116329(tdone,ends);
                          int biggest116330 = 0;
                          if(ends[15]>=biggest116330){
                            biggest116330=ends[15];
                          }
                          if(ends[16]>=biggest116330){
                            biggest116330=ends[16];
                          }
                          if(biggest116330 == 1){
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          current_thread_2 = 0;//sysj\filler.sysj line: 167, column: 20
                          current_fill_1.setPresent();//sysj\filler.sysj line: 168, column: 20
                          currsigs.addElement(current_fill_1);
                          current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 168, column: 20
                          S25769=7;
                          S27616=0;
                          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\filler.sysj line: 170, column: 20
                            fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                            S27616=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S27611=0;
                            if(fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                              fillerReady_o.setVal(Boolean.TRUE);//sysj\filler.sysj line: 170, column: 20
                              S27611=1;
                              if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                                fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                                ends[2]=2;
                                ;//sysj\filler.sysj line: 170, column: 20
                                System.out.println("*Filler operation done");//sysj\filler.sysj line: 171, column: 20
                                S25769=8;
                                S27843=0;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
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
                          }
                        }
                      }
                    }
                  }
                }
                else {
                  S25815=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                S25815=1;
                S25815=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (2) * 1000){//sysj\filler.sysj line: 24, column: 9
                  ends[2]=2;
                  ;//sysj\filler.sysj line: 24, column: 9
                  System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\filler.sysj line: 41, column: 20
                  S25769=3;
                  if(((filler1_amount_1.getpreval() == null ? 0 : ((Integer)filler1_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler1_amount_1.getpreval() == null ? 0 : ((Integer)filler1_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 44, column: 24
                    S25926=0;
                    thread116331(tdone,ends);
                    thread116332(tdone,ends);
                    int biggest116333 = 0;
                    if(ends[3]>=biggest116333){
                      biggest116333=ends[3];
                    }
                    if(ends[4]>=biggest116333){
                      biggest116333=ends[4];
                    }
                    if(biggest116333 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    S25769=4;
                    if(((filler2_amount_1.getpreval() == null ? 0 : ((Integer)filler2_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler2_amount_1.getpreval() == null ? 0 : ((Integer)filler2_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 74, column: 24
                      S26274=0;
                      thread116334(tdone,ends);
                      thread116335(tdone,ends);
                      int biggest116336 = 0;
                      if(ends[7]>=biggest116336){
                        biggest116336=ends[7];
                      }
                      if(ends[8]>=biggest116336){
                        biggest116336=ends[8];
                      }
                      if(biggest116336 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S25769=5;
                      if(((filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 106, column: 24
                        S26680=0;
                        thread116337(tdone,ends);
                        thread116338(tdone,ends);
                        int biggest116339 = 0;
                        if(ends[11]>=biggest116339){
                          biggest116339=ends[11];
                        }
                        if(ends[12]>=biggest116339){
                          biggest116339=ends[12];
                        }
                        if(biggest116339 == 1){
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        S25769=6;
                        if(((filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 136, column: 24
                          S27144=0;
                          thread116340(tdone,ends);
                          thread116341(tdone,ends);
                          int biggest116342 = 0;
                          if(ends[15]>=biggest116342){
                            biggest116342=ends[15];
                          }
                          if(ends[16]>=biggest116342){
                            biggest116342=ends[16];
                          }
                          if(biggest116342 == 1){
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                        }
                        else {
                          current_thread_2 = 0;//sysj\filler.sysj line: 167, column: 20
                          current_fill_1.setPresent();//sysj\filler.sysj line: 168, column: 20
                          currsigs.addElement(current_fill_1);
                          current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 168, column: 20
                          S25769=7;
                          S27616=0;
                          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\filler.sysj line: 170, column: 20
                            fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                            S27616=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S27611=0;
                            if(fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                              fillerReady_o.setVal(Boolean.TRUE);//sysj\filler.sysj line: 170, column: 20
                              S27611=1;
                              if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                                fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                                ends[2]=2;
                                ;//sysj\filler.sysj line: 170, column: 20
                                System.out.println("*Filler operation done");//sysj\filler.sysj line: 171, column: 20
                                S25769=8;
                                S27843=0;
                                active[2]=1;
                                ends[2]=1;
                                tdone[2]=1;
                              }
                              else {
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
                          }
                        }
                      }
                    }
                  }
                }
                else {
                  S25815=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 3 : 
            switch(S25926){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\filler.sysj line: 46, column: 30
                  S25926=1;
                  thread116343(tdone,ends);
                  thread116344(tdone,ends);
                  int biggest116345 = 0;
                  if(ends[5]>=biggest116345){
                    biggest116345=ends[5];
                  }
                  if(ends[6]>=biggest116345){
                    biggest116345=ends[6];
                  }
                  if(biggest116345 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  thread116346(tdone,ends);
                  thread116347(tdone,ends);
                  int biggest116348 = 0;
                  if(ends[3]>=biggest116348){
                    biggest116348=ends[3];
                  }
                  if(ends[4]>=biggest116348){
                    biggest116348=ends[4];
                  }
                  if(biggest116348 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest116348 == 0){
                    S25926=1;
                    thread116349(tdone,ends);
                    thread116350(tdone,ends);
                    int biggest116351 = 0;
                    if(ends[5]>=biggest116351){
                      biggest116351=ends[5];
                    }
                    if(ends[6]>=biggest116351){
                      biggest116351=ends[6];
                    }
                    if(biggest116351 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\filler.sysj line: 56, column: 30
                  System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_1.getpreval() == null ? 0 : ((Integer)filler1_amount_1.getpreval()).intValue()));//sysj\filler.sysj line: 67, column: 24
                  current_thread_2 += (filler1_amount_1.getpreval() == null ? 0 : ((Integer)filler1_amount_1.getpreval()).intValue());//sysj\filler.sysj line: 68, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_2);//sysj\filler.sysj line: 69, column: 24
                  current_fill_1.setPresent();//sysj\filler.sysj line: 70, column: 24
                  currsigs.addElement(current_fill_1);
                  current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 70, column: 24
                  S25926=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  thread116352(tdone,ends);
                  thread116353(tdone,ends);
                  int biggest116354 = 0;
                  if(ends[5]>=biggest116354){
                    biggest116354=ends[5];
                  }
                  if(ends[6]>=biggest116354){
                    biggest116354=ends[6];
                  }
                  if(biggest116354 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest116354 == 0){
                    System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_1.getpreval() == null ? 0 : ((Integer)filler1_amount_1.getpreval()).intValue()));//sysj\filler.sysj line: 67, column: 24
                    current_thread_2 += (filler1_amount_1.getpreval() == null ? 0 : ((Integer)filler1_amount_1.getpreval()).intValue());//sysj\filler.sysj line: 68, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_2);//sysj\filler.sysj line: 69, column: 24
                    current_fill_1.setPresent();//sysj\filler.sysj line: 70, column: 24
                    currsigs.addElement(current_fill_1);
                    current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 70, column: 24
                    S25926=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                break;
              
              case 2 : 
                S25926=2;
                S25769=4;
                if(((filler2_amount_1.getpreval() == null ? 0 : ((Integer)filler2_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler2_amount_1.getpreval() == null ? 0 : ((Integer)filler2_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 74, column: 24
                  S26274=0;
                  thread116355(tdone,ends);
                  thread116356(tdone,ends);
                  int biggest116357 = 0;
                  if(ends[7]>=biggest116357){
                    biggest116357=ends[7];
                  }
                  if(ends[8]>=biggest116357){
                    biggest116357=ends[8];
                  }
                  if(biggest116357 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S25769=5;
                  if(((filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 106, column: 24
                    S26680=0;
                    thread116358(tdone,ends);
                    thread116359(tdone,ends);
                    int biggest116360 = 0;
                    if(ends[11]>=biggest116360){
                      biggest116360=ends[11];
                    }
                    if(ends[12]>=biggest116360){
                      biggest116360=ends[12];
                    }
                    if(biggest116360 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    S25769=6;
                    if(((filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 136, column: 24
                      S27144=0;
                      thread116361(tdone,ends);
                      thread116362(tdone,ends);
                      int biggest116363 = 0;
                      if(ends[15]>=biggest116363){
                        biggest116363=ends[15];
                      }
                      if(ends[16]>=biggest116363){
                        biggest116363=ends[16];
                      }
                      if(biggest116363 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      current_thread_2 = 0;//sysj\filler.sysj line: 167, column: 20
                      current_fill_1.setPresent();//sysj\filler.sysj line: 168, column: 20
                      currsigs.addElement(current_fill_1);
                      current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 168, column: 20
                      S25769=7;
                      S27616=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\filler.sysj line: 170, column: 20
                        fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                        S27616=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S27611=0;
                        if(fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\filler.sysj line: 170, column: 20
                          S27611=1;
                          if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                            fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                            ends[2]=2;
                            ;//sysj\filler.sysj line: 170, column: 20
                            System.out.println("*Filler operation done");//sysj\filler.sysj line: 171, column: 20
                            S25769=8;
                            S27843=0;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
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
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 4 : 
            switch(S26274){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\filler.sysj line: 76, column: 30
                  S26274=1;
                  thread116364(tdone,ends);
                  thread116365(tdone,ends);
                  int biggest116366 = 0;
                  if(ends[9]>=biggest116366){
                    biggest116366=ends[9];
                  }
                  if(ends[10]>=biggest116366){
                    biggest116366=ends[10];
                  }
                  if(biggest116366 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  thread116367(tdone,ends);
                  thread116368(tdone,ends);
                  int biggest116369 = 0;
                  if(ends[7]>=biggest116369){
                    biggest116369=ends[7];
                  }
                  if(ends[8]>=biggest116369){
                    biggest116369=ends[8];
                  }
                  if(biggest116369 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest116369 == 0){
                    S26274=1;
                    thread116370(tdone,ends);
                    thread116371(tdone,ends);
                    int biggest116372 = 0;
                    if(ends[9]>=biggest116372){
                      biggest116372=ends[9];
                    }
                    if(ends[10]>=biggest116372){
                      biggest116372=ends[10];
                    }
                    if(biggest116372 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\filler.sysj line: 88, column: 30
                  System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_1.getpreval() == null ? 0 : ((Integer)filler2_amount_1.getpreval()).intValue()));//sysj\filler.sysj line: 99, column: 24
                  current_thread_2 += (filler2_amount_1.getpreval() == null ? 0 : ((Integer)filler2_amount_1.getpreval()).intValue());//sysj\filler.sysj line: 100, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_2);//sysj\filler.sysj line: 101, column: 24
                  current_fill_1.setPresent();//sysj\filler.sysj line: 102, column: 24
                  currsigs.addElement(current_fill_1);
                  current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 102, column: 24
                  S26274=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  thread116373(tdone,ends);
                  thread116374(tdone,ends);
                  int biggest116375 = 0;
                  if(ends[9]>=biggest116375){
                    biggest116375=ends[9];
                  }
                  if(ends[10]>=biggest116375){
                    biggest116375=ends[10];
                  }
                  if(biggest116375 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest116375 == 0){
                    System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_1.getpreval() == null ? 0 : ((Integer)filler2_amount_1.getpreval()).intValue()));//sysj\filler.sysj line: 99, column: 24
                    current_thread_2 += (filler2_amount_1.getpreval() == null ? 0 : ((Integer)filler2_amount_1.getpreval()).intValue());//sysj\filler.sysj line: 100, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_2);//sysj\filler.sysj line: 101, column: 24
                    current_fill_1.setPresent();//sysj\filler.sysj line: 102, column: 24
                    currsigs.addElement(current_fill_1);
                    current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 102, column: 24
                    S26274=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                break;
              
              case 2 : 
                S26274=2;
                S25769=5;
                if(((filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 106, column: 24
                  S26680=0;
                  thread116376(tdone,ends);
                  thread116377(tdone,ends);
                  int biggest116378 = 0;
                  if(ends[11]>=biggest116378){
                    biggest116378=ends[11];
                  }
                  if(ends[12]>=biggest116378){
                    biggest116378=ends[12];
                  }
                  if(biggest116378 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S25769=6;
                  if(((filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 136, column: 24
                    S27144=0;
                    thread116379(tdone,ends);
                    thread116380(tdone,ends);
                    int biggest116381 = 0;
                    if(ends[15]>=biggest116381){
                      biggest116381=ends[15];
                    }
                    if(ends[16]>=biggest116381){
                      biggest116381=ends[16];
                    }
                    if(biggest116381 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    current_thread_2 = 0;//sysj\filler.sysj line: 167, column: 20
                    current_fill_1.setPresent();//sysj\filler.sysj line: 168, column: 20
                    currsigs.addElement(current_fill_1);
                    current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 168, column: 20
                    S25769=7;
                    S27616=0;
                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\filler.sysj line: 170, column: 20
                      fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                      S27616=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S27611=0;
                      if(fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\filler.sysj line: 170, column: 20
                        S27611=1;
                        if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                          fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                          ends[2]=2;
                          ;//sysj\filler.sysj line: 170, column: 20
                          System.out.println("*Filler operation done");//sysj\filler.sysj line: 171, column: 20
                          S25769=8;
                          S27843=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
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
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 5 : 
            switch(S26680){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\filler.sysj line: 108, column: 30
                  S26680=1;
                  thread116382(tdone,ends);
                  thread116383(tdone,ends);
                  int biggest116384 = 0;
                  if(ends[13]>=biggest116384){
                    biggest116384=ends[13];
                  }
                  if(ends[14]>=biggest116384){
                    biggest116384=ends[14];
                  }
                  if(biggest116384 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  thread116385(tdone,ends);
                  thread116386(tdone,ends);
                  int biggest116387 = 0;
                  if(ends[11]>=biggest116387){
                    biggest116387=ends[11];
                  }
                  if(ends[12]>=biggest116387){
                    biggest116387=ends[12];
                  }
                  if(biggest116387 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest116387 == 0){
                    S26680=1;
                    thread116388(tdone,ends);
                    thread116389(tdone,ends);
                    int biggest116390 = 0;
                    if(ends[13]>=biggest116390){
                      biggest116390=ends[13];
                    }
                    if(ends[14]>=biggest116390){
                      biggest116390=ends[14];
                    }
                    if(biggest116390 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\filler.sysj line: 118, column: 30
                  System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue()));//sysj\filler.sysj line: 129, column: 24
                  current_thread_2 += (filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue());//sysj\filler.sysj line: 130, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_2);//sysj\filler.sysj line: 131, column: 24
                  current_fill_1.setPresent();//sysj\filler.sysj line: 132, column: 24
                  currsigs.addElement(current_fill_1);
                  current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 132, column: 24
                  S26680=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  thread116391(tdone,ends);
                  thread116392(tdone,ends);
                  int biggest116393 = 0;
                  if(ends[13]>=biggest116393){
                    biggest116393=ends[13];
                  }
                  if(ends[14]>=biggest116393){
                    biggest116393=ends[14];
                  }
                  if(biggest116393 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest116393 == 0){
                    System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue()));//sysj\filler.sysj line: 129, column: 24
                    current_thread_2 += (filler3_amount_1.getpreval() == null ? 0 : ((Integer)filler3_amount_1.getpreval()).intValue());//sysj\filler.sysj line: 130, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_2);//sysj\filler.sysj line: 131, column: 24
                    current_fill_1.setPresent();//sysj\filler.sysj line: 132, column: 24
                    currsigs.addElement(current_fill_1);
                    current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 132, column: 24
                    S26680=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                break;
              
              case 2 : 
                S26680=2;
                S25769=6;
                if(((filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()) > 0) && (current_thread_2 + (filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()) <= total_thread_2)){//sysj\filler.sysj line: 136, column: 24
                  S27144=0;
                  thread116394(tdone,ends);
                  thread116395(tdone,ends);
                  int biggest116396 = 0;
                  if(ends[15]>=biggest116396){
                    biggest116396=ends[15];
                  }
                  if(ends[16]>=biggest116396){
                    biggest116396=ends[16];
                  }
                  if(biggest116396 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  current_thread_2 = 0;//sysj\filler.sysj line: 167, column: 20
                  current_fill_1.setPresent();//sysj\filler.sysj line: 168, column: 20
                  currsigs.addElement(current_fill_1);
                  current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 168, column: 20
                  S25769=7;
                  S27616=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\filler.sysj line: 170, column: 20
                    fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                    S27616=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S27611=0;
                    if(fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\filler.sysj line: 170, column: 20
                      S27611=1;
                      if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                        fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                        ends[2]=2;
                        ;//sysj\filler.sysj line: 170, column: 20
                        System.out.println("*Filler operation done");//sysj\filler.sysj line: 171, column: 20
                        S25769=8;
                        S27843=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
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
                  }
                }
                break;
              
            }
            break;
          
          case 6 : 
            switch(S27144){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\filler.sysj line: 138, column: 30
                  S27144=1;
                  thread116397(tdone,ends);
                  thread116398(tdone,ends);
                  int biggest116399 = 0;
                  if(ends[17]>=biggest116399){
                    biggest116399=ends[17];
                  }
                  if(ends[18]>=biggest116399){
                    biggest116399=ends[18];
                  }
                  if(biggest116399 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  thread116400(tdone,ends);
                  thread116401(tdone,ends);
                  int biggest116402 = 0;
                  if(ends[15]>=biggest116402){
                    biggest116402=ends[15];
                  }
                  if(ends[16]>=biggest116402){
                    biggest116402=ends[16];
                  }
                  if(biggest116402 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest116402 == 0){
                    S27144=1;
                    thread116403(tdone,ends);
                    thread116404(tdone,ends);
                    int biggest116405 = 0;
                    if(ends[17]>=biggest116405){
                      biggest116405=ends[17];
                    }
                    if(ends[18]>=biggest116405){
                      biggest116405=ends[18];
                    }
                    if(biggest116405 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\filler.sysj line: 148, column: 30
                  System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()));//sysj\filler.sysj line: 159, column: 24
                  current_thread_2 += (filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue());//sysj\filler.sysj line: 160, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_2);//sysj\filler.sysj line: 161, column: 24
                  S27144=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  thread116406(tdone,ends);
                  thread116407(tdone,ends);
                  int biggest116408 = 0;
                  if(ends[17]>=biggest116408){
                    biggest116408=ends[17];
                  }
                  if(ends[18]>=biggest116408){
                    biggest116408=ends[18];
                  }
                  if(biggest116408 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest116408 == 0){
                    System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue()));//sysj\filler.sysj line: 159, column: 24
                    current_thread_2 += (filler4_amount_1.getpreval() == null ? 0 : ((Integer)filler4_amount_1.getpreval()).intValue());//sysj\filler.sysj line: 160, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_2);//sysj\filler.sysj line: 161, column: 24
                    S27144=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                break;
              
              case 2 : 
                S27144=2;
                current_thread_2 = 0;//sysj\filler.sysj line: 167, column: 20
                current_fill_1.setPresent();//sysj\filler.sysj line: 168, column: 20
                currsigs.addElement(current_fill_1);
                current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 168, column: 20
                S25769=7;
                S27616=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\filler.sysj line: 170, column: 20
                  fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                  S27616=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S27611=0;
                  if(fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\filler.sysj line: 170, column: 20
                    S27611=1;
                    if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                      fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                      ends[2]=2;
                      ;//sysj\filler.sysj line: 170, column: 20
                      System.out.println("*Filler operation done");//sysj\filler.sysj line: 171, column: 20
                      S25769=8;
                      S27843=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
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
                }
                break;
              
            }
            break;
          
          case 7 : 
            switch(S27616){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\filler.sysj line: 170, column: 20
                  fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                  S27616=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S27611){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\filler.sysj line: 170, column: 20
                        S27611=1;
                        if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                          fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                          ends[2]=2;
                          ;//sysj\filler.sysj line: 170, column: 20
                          System.out.println("*Filler operation done");//sysj\filler.sysj line: 171, column: 20
                          S25769=8;
                          S27843=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
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
                      if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                        fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                        ends[2]=2;
                        ;//sysj\filler.sysj line: 170, column: 20
                        System.out.println("*Filler operation done");//sysj\filler.sysj line: 171, column: 20
                        S25769=8;
                        S27843=0;
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
                }
                break;
              
              case 1 : 
                S27616=1;
                S27616=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\filler.sysj line: 170, column: 20
                  fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                  S27616=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S27611=0;
                  if(fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\filler.sysj line: 170, column: 20
                    S27611=1;
                    if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 170, column: 20
                      fillerReady_o.setREQ(false);//sysj\filler.sysj line: 170, column: 20
                      ends[2]=2;
                      ;//sysj\filler.sysj line: 170, column: 20
                      System.out.println("*Filler operation done");//sysj\filler.sysj line: 171, column: 20
                      S25769=8;
                      S27843=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
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
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S27843){
              case 0 : 
                if(!bottleAtPos2_1.getprestatus()){//sysj\filler.sysj line: 174, column: 30
                  S27843=1;
                  if(bottleAtPos2_1.getprestatus()){//sysj\filler.sysj line: 176, column: 36
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    ends[2]=2;
                    ;//sysj\filler.sysj line: 173, column: 20
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\filler.sysj line: 36, column: 20
                    S25769=0;
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
                if(bottleAtPos2_1.getprestatus()){//sysj\filler.sysj line: 176, column: 36
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  ends[2]=2;
                  ;//sysj\filler.sysj line: 173, column: 20
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\filler.sysj line: 36, column: 20
                  S25769=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread116267(int [] tdone, int [] ends){
        S48293=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread116266(int [] tdone, int [] ends){
        S48290=1;
    bottleAtPos2E.setPresent();//sysj\filler.sysj line: 219, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread116265(int [] tdone, int [] ends){
        S48320=1;
    S48296=0;
    if(bottleAtPos2_1.getprestatus()){//sysj\filler.sysj line: 216, column: 26
      thread116266(tdone,ends);
      thread116267(tdone,ends);
      int biggest116268 = 0;
      if(ends[22]>=biggest116268){
        biggest116268=ends[22];
      }
      if(ends[23]>=biggest116268){
        biggest116268=ends[23];
      }
      if(biggest116268 == 1){
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
    else {
      S48296=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread116264(int [] tdone, int [] ends){
        S48285=1;
    S48229=0;
    S48209=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\filler.sysj line: 201, column: 12
      simFiller_in.setACK(false);//sysj\filler.sysj line: 201, column: 12
      S48209=1;
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S48204=0;
      if(!simFiller_in.isREQ()){//sysj\filler.sysj line: 201, column: 12
        simFiller_in.setACK(true);//sysj\filler.sysj line: 201, column: 12
        S48204=1;
        if(simFiller_in.isREQ()){//sysj\filler.sysj line: 201, column: 12
          simFiller_in.setACK(false);//sysj\filler.sysj line: 201, column: 12
          ends[20]=2;
          ;//sysj\filler.sysj line: 201, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\filler.sysj line: 202, column: 15
            bottleAtPos2_1.setPresent();//sysj\filler.sysj line: 203, column: 13
            currsigs.addElement(bottleAtPos2_1);
            S48229=1;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
          }
          else {
            done_1.setPresent();//sysj\filler.sysj line: 206, column: 13
            currsigs.addElement(done_1);
            S48229=1;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
          }
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
      }
      else {
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
      }
    }
  }

  public void thread116263(int [] tdone, int [] ends){
        S48202=1;
    filler1_amount_1.setPresent();//sysj\filler.sysj line: 188, column: 11
    currsigs.addElement(filler1_amount_1);
    filler1_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\filler.sysj line: 188, column: 11
    filler2_amount_1.setPresent();//sysj\filler.sysj line: 189, column: 8
    currsigs.addElement(filler2_amount_1);
    filler2_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\filler.sysj line: 189, column: 8
    filler3_amount_1.setPresent();//sysj\filler.sysj line: 190, column: 8
    currsigs.addElement(filler3_amount_1);
    filler3_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\filler.sysj line: 190, column: 8
    filler4_amount_1.setPresent();//sysj\filler.sysj line: 191, column: 8
    currsigs.addElement(filler4_amount_1);
    filler4_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\filler.sysj line: 191, column: 8
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116262(int [] tdone, int [] ends){
        S48197=1;
    current_thread_2 = 0;//sysj\filler.sysj line: 25, column: 16
    total_thread_2 = 100;//sysj\filler.sysj line: 26, column: 16
    total_fill_1.setPresent();//sysj\filler.sysj line: 27, column: 16
    currsigs.addElement(total_fill_1);
    total_fill_1.setValue(total_thread_2);//sysj\filler.sysj line: 27, column: 16
    current_fill_1.setPresent();//sysj\filler.sysj line: 28, column: 16
    currsigs.addElement(current_fill_1);
    current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 28, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\filler.sysj line: 36, column: 20
    S25769=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread116259(int [] tdone, int [] ends){
        S48293=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread116258(int [] tdone, int [] ends){
        S48290=1;
    bottleAtPos2E.setPresent();//sysj\filler.sysj line: 219, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread116257(int [] tdone, int [] ends){
        S48320=1;
    S48296=0;
    if(bottleAtPos2_1.getprestatus()){//sysj\filler.sysj line: 216, column: 26
      thread116258(tdone,ends);
      thread116259(tdone,ends);
      int biggest116260 = 0;
      if(ends[22]>=biggest116260){
        biggest116260=ends[22];
      }
      if(ends[23]>=biggest116260){
        biggest116260=ends[23];
      }
      if(biggest116260 == 1){
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
    else {
      S48296=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread116256(int [] tdone, int [] ends){
        S48285=1;
    S48229=0;
    S48209=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\filler.sysj line: 201, column: 12
      simFiller_in.setACK(false);//sysj\filler.sysj line: 201, column: 12
      S48209=1;
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S48204=0;
      if(!simFiller_in.isREQ()){//sysj\filler.sysj line: 201, column: 12
        simFiller_in.setACK(true);//sysj\filler.sysj line: 201, column: 12
        S48204=1;
        if(simFiller_in.isREQ()){//sysj\filler.sysj line: 201, column: 12
          simFiller_in.setACK(false);//sysj\filler.sysj line: 201, column: 12
          ends[20]=2;
          ;//sysj\filler.sysj line: 201, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\filler.sysj line: 202, column: 15
            bottleAtPos2_1.setPresent();//sysj\filler.sysj line: 203, column: 13
            currsigs.addElement(bottleAtPos2_1);
            S48229=1;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
          }
          else {
            done_1.setPresent();//sysj\filler.sysj line: 206, column: 13
            currsigs.addElement(done_1);
            S48229=1;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
          }
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
      }
      else {
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
      }
    }
  }

  public void thread116255(int [] tdone, int [] ends){
        S48202=1;
    filler1_amount_1.setPresent();//sysj\filler.sysj line: 188, column: 11
    currsigs.addElement(filler1_amount_1);
    filler1_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\filler.sysj line: 188, column: 11
    filler2_amount_1.setPresent();//sysj\filler.sysj line: 189, column: 8
    currsigs.addElement(filler2_amount_1);
    filler2_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\filler.sysj line: 189, column: 8
    filler3_amount_1.setPresent();//sysj\filler.sysj line: 190, column: 8
    currsigs.addElement(filler3_amount_1);
    filler3_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\filler.sysj line: 190, column: 8
    filler4_amount_1.setPresent();//sysj\filler.sysj line: 191, column: 8
    currsigs.addElement(filler4_amount_1);
    filler4_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\filler.sysj line: 191, column: 8
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116254(int [] tdone, int [] ends){
        S48197=1;
    current_thread_2 = 0;//sysj\filler.sysj line: 25, column: 16
    total_thread_2 = 100;//sysj\filler.sysj line: 26, column: 16
    total_fill_1.setPresent();//sysj\filler.sysj line: 27, column: 16
    currsigs.addElement(total_fill_1);
    total_fill_1.setValue(total_thread_2);//sysj\filler.sysj line: 27, column: 16
    current_fill_1.setPresent();//sysj\filler.sysj line: 28, column: 16
    currsigs.addElement(current_fill_1);
    current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 28, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\filler.sysj line: 36, column: 20
    S25769=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread116251(int [] tdone, int [] ends){
        S48293=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread116250(int [] tdone, int [] ends){
        S48290=1;
    bottleAtPos2E.setPresent();//sysj\filler.sysj line: 219, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread116249(int [] tdone, int [] ends){
        S48320=1;
    S48296=0;
    if(bottleAtPos2_1.getprestatus()){//sysj\filler.sysj line: 216, column: 26
      thread116250(tdone,ends);
      thread116251(tdone,ends);
      int biggest116252 = 0;
      if(ends[22]>=biggest116252){
        biggest116252=ends[22];
      }
      if(ends[23]>=biggest116252){
        biggest116252=ends[23];
      }
      if(biggest116252 == 1){
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
    else {
      S48296=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread116248(int [] tdone, int [] ends){
        S48285=1;
    S48229=0;
    S48209=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\filler.sysj line: 201, column: 12
      simFiller_in.setACK(false);//sysj\filler.sysj line: 201, column: 12
      S48209=1;
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S48204=0;
      if(!simFiller_in.isREQ()){//sysj\filler.sysj line: 201, column: 12
        simFiller_in.setACK(true);//sysj\filler.sysj line: 201, column: 12
        S48204=1;
        if(simFiller_in.isREQ()){//sysj\filler.sysj line: 201, column: 12
          simFiller_in.setACK(false);//sysj\filler.sysj line: 201, column: 12
          ends[20]=2;
          ;//sysj\filler.sysj line: 201, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\filler.sysj line: 202, column: 15
            bottleAtPos2_1.setPresent();//sysj\filler.sysj line: 203, column: 13
            currsigs.addElement(bottleAtPos2_1);
            S48229=1;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
          }
          else {
            done_1.setPresent();//sysj\filler.sysj line: 206, column: 13
            currsigs.addElement(done_1);
            S48229=1;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
          }
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
      }
      else {
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
      }
    }
  }

  public void thread116247(int [] tdone, int [] ends){
        S48202=1;
    filler1_amount_1.setPresent();//sysj\filler.sysj line: 188, column: 11
    currsigs.addElement(filler1_amount_1);
    filler1_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\filler.sysj line: 188, column: 11
    filler2_amount_1.setPresent();//sysj\filler.sysj line: 189, column: 8
    currsigs.addElement(filler2_amount_1);
    filler2_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\filler.sysj line: 189, column: 8
    filler3_amount_1.setPresent();//sysj\filler.sysj line: 190, column: 8
    currsigs.addElement(filler3_amount_1);
    filler3_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\filler.sysj line: 190, column: 8
    filler4_amount_1.setPresent();//sysj\filler.sysj line: 191, column: 8
    currsigs.addElement(filler4_amount_1);
    filler4_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\filler.sysj line: 191, column: 8
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116246(int [] tdone, int [] ends){
        S48197=1;
    current_thread_2 = 0;//sysj\filler.sysj line: 25, column: 16
    total_thread_2 = 100;//sysj\filler.sysj line: 26, column: 16
    total_fill_1.setPresent();//sysj\filler.sysj line: 27, column: 16
    currsigs.addElement(total_fill_1);
    total_fill_1.setValue(total_thread_2);//sysj\filler.sysj line: 27, column: 16
    current_fill_1.setPresent();//sysj\filler.sysj line: 28, column: 16
    currsigs.addElement(current_fill_1);
    current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 28, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\filler.sysj line: 36, column: 20
    S25769=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread116243(int [] tdone, int [] ends){
        S48293=1;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread116242(int [] tdone, int [] ends){
        S48290=1;
    bottleAtPos2E.setPresent();//sysj\filler.sysj line: 219, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread116241(int [] tdone, int [] ends){
        S48320=1;
    S48296=0;
    if(bottleAtPos2_1.getprestatus()){//sysj\filler.sysj line: 216, column: 26
      thread116242(tdone,ends);
      thread116243(tdone,ends);
      int biggest116244 = 0;
      if(ends[22]>=biggest116244){
        biggest116244=ends[22];
      }
      if(ends[23]>=biggest116244){
        biggest116244=ends[23];
      }
      if(biggest116244 == 1){
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
    else {
      S48296=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread116240(int [] tdone, int [] ends){
        S48285=1;
    S48229=0;
    S48209=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\filler.sysj line: 201, column: 12
      simFiller_in.setACK(false);//sysj\filler.sysj line: 201, column: 12
      S48209=1;
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S48204=0;
      if(!simFiller_in.isREQ()){//sysj\filler.sysj line: 201, column: 12
        simFiller_in.setACK(true);//sysj\filler.sysj line: 201, column: 12
        S48204=1;
        if(simFiller_in.isREQ()){//sysj\filler.sysj line: 201, column: 12
          simFiller_in.setACK(false);//sysj\filler.sysj line: 201, column: 12
          ends[20]=2;
          ;//sysj\filler.sysj line: 201, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\filler.sysj line: 202, column: 15
            bottleAtPos2_1.setPresent();//sysj\filler.sysj line: 203, column: 13
            currsigs.addElement(bottleAtPos2_1);
            S48229=1;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
          }
          else {
            done_1.setPresent();//sysj\filler.sysj line: 206, column: 13
            currsigs.addElement(done_1);
            S48229=1;
            active[20]=1;
            ends[20]=1;
            tdone[20]=1;
          }
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
      }
      else {
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
      }
    }
  }

  public void thread116239(int [] tdone, int [] ends){
        S48202=1;
    filler1_amount_1.setPresent();//sysj\filler.sysj line: 188, column: 11
    currsigs.addElement(filler1_amount_1);
    filler1_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\filler.sysj line: 188, column: 11
    filler2_amount_1.setPresent();//sysj\filler.sysj line: 189, column: 8
    currsigs.addElement(filler2_amount_1);
    filler2_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\filler.sysj line: 189, column: 8
    filler3_amount_1.setPresent();//sysj\filler.sysj line: 190, column: 8
    currsigs.addElement(filler3_amount_1);
    filler3_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\filler.sysj line: 190, column: 8
    filler4_amount_1.setPresent();//sysj\filler.sysj line: 191, column: 8
    currsigs.addElement(filler4_amount_1);
    filler4_amount_1.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\filler.sysj line: 191, column: 8
    active[19]=1;
    ends[19]=1;
    tdone[19]=1;
  }

  public void thread116238(int [] tdone, int [] ends){
        S48197=1;
    current_thread_2 = 0;//sysj\filler.sysj line: 25, column: 16
    total_thread_2 = 100;//sysj\filler.sysj line: 26, column: 16
    total_fill_1.setPresent();//sysj\filler.sysj line: 27, column: 16
    currsigs.addElement(total_fill_1);
    total_fill_1.setValue(total_thread_2);//sysj\filler.sysj line: 27, column: 16
    current_fill_1.setPresent();//sysj\filler.sysj line: 28, column: 16
    currsigs.addElement(current_fill_1);
    current_fill_1.setValue(current_thread_2);//sysj\filler.sysj line: 28, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\filler.sysj line: 36, column: 20
    S25769=0;
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
      switch(S115987){
        case 0 : 
          S115987=0;
          break RUN;
        
        case 1 : 
          S115987=2;
          S115987=2;
          filler1_1.setClear();//sysj\filler.sysj line: 15, column: 9
          filler2_1.setClear();//sysj\filler.sysj line: 15, column: 9
          filler3_1.setClear();//sysj\filler.sysj line: 15, column: 9
          filler4_1.setClear();//sysj\filler.sysj line: 15, column: 9
          done_1.setClear();//sysj\filler.sysj line: 15, column: 9
          filler1_amount_1.setClear();//sysj\filler.sysj line: 17, column: 9
          filler2_amount_1.setClear();//sysj\filler.sysj line: 17, column: 9
          filler3_amount_1.setClear();//sysj\filler.sysj line: 17, column: 9
          filler4_amount_1.setClear();//sysj\filler.sysj line: 17, column: 9
          current_fill_1.setClear();//sysj\filler.sysj line: 18, column: 9
          total_fill_1.setClear();//sysj\filler.sysj line: 18, column: 9
          bottleAtPos2_1.setClear();//sysj\filler.sysj line: 20, column: 9
          S115986=0;
          S25750=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\filler.sysj line: 22, column: 9
            fillerReady_o.setREQ(false);//sysj\filler.sysj line: 22, column: 9
            S25750=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S25745=0;
            if(fillerReady_o.isACK()){//sysj\filler.sysj line: 22, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\filler.sysj line: 22, column: 9
              S25745=1;
              if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 22, column: 9
                fillerReady_o.setREQ(false);//sysj\filler.sysj line: 22, column: 9
                ends[1]=2;
                ;//sysj\filler.sysj line: 22, column: 9
                S115986=1;
                thread116238(tdone,ends);
                thread116239(tdone,ends);
                thread116240(tdone,ends);
                thread116241(tdone,ends);
                int biggest116245 = 0;
                if(ends[2]>=biggest116245){
                  biggest116245=ends[2];
                }
                if(ends[19]>=biggest116245){
                  biggest116245=ends[19];
                }
                if(ends[20]>=biggest116245){
                  biggest116245=ends[20];
                }
                if(ends[21]>=biggest116245){
                  biggest116245=ends[21];
                }
                if(biggest116245 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
            else {
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
        
        case 2 : 
          filler1_1.setClear();//sysj\filler.sysj line: 15, column: 9
          filler2_1.setClear();//sysj\filler.sysj line: 15, column: 9
          filler3_1.setClear();//sysj\filler.sysj line: 15, column: 9
          filler4_1.setClear();//sysj\filler.sysj line: 15, column: 9
          done_1.setClear();//sysj\filler.sysj line: 15, column: 9
          filler1_amount_1.setClear();//sysj\filler.sysj line: 17, column: 9
          filler2_amount_1.setClear();//sysj\filler.sysj line: 17, column: 9
          filler3_amount_1.setClear();//sysj\filler.sysj line: 17, column: 9
          filler4_amount_1.setClear();//sysj\filler.sysj line: 17, column: 9
          current_fill_1.setClear();//sysj\filler.sysj line: 18, column: 9
          total_fill_1.setClear();//sysj\filler.sysj line: 18, column: 9
          bottleAtPos2_1.setClear();//sysj\filler.sysj line: 20, column: 9
          switch(S115986){
            case 0 : 
              switch(S25750){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\filler.sysj line: 22, column: 9
                    fillerReady_o.setREQ(false);//sysj\filler.sysj line: 22, column: 9
                    S25750=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S25745){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\filler.sysj line: 22, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\filler.sysj line: 22, column: 9
                          S25745=1;
                          if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 22, column: 9
                            fillerReady_o.setREQ(false);//sysj\filler.sysj line: 22, column: 9
                            ends[1]=2;
                            ;//sysj\filler.sysj line: 22, column: 9
                            S115986=1;
                            thread116246(tdone,ends);
                            thread116247(tdone,ends);
                            thread116248(tdone,ends);
                            thread116249(tdone,ends);
                            int biggest116253 = 0;
                            if(ends[2]>=biggest116253){
                              biggest116253=ends[2];
                            }
                            if(ends[19]>=biggest116253){
                              biggest116253=ends[19];
                            }
                            if(ends[20]>=biggest116253){
                              biggest116253=ends[20];
                            }
                            if(ends[21]>=biggest116253){
                              biggest116253=ends[21];
                            }
                            if(biggest116253 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 22, column: 9
                          fillerReady_o.setREQ(false);//sysj\filler.sysj line: 22, column: 9
                          ends[1]=2;
                          ;//sysj\filler.sysj line: 22, column: 9
                          S115986=1;
                          thread116254(tdone,ends);
                          thread116255(tdone,ends);
                          thread116256(tdone,ends);
                          thread116257(tdone,ends);
                          int biggest116261 = 0;
                          if(ends[2]>=biggest116261){
                            biggest116261=ends[2];
                          }
                          if(ends[19]>=biggest116261){
                            biggest116261=ends[19];
                          }
                          if(ends[20]>=biggest116261){
                            biggest116261=ends[20];
                          }
                          if(ends[21]>=biggest116261){
                            biggest116261=ends[21];
                          }
                          if(biggest116261 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S25750=1;
                  S25750=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\filler.sysj line: 22, column: 9
                    fillerReady_o.setREQ(false);//sysj\filler.sysj line: 22, column: 9
                    S25750=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S25745=0;
                    if(fillerReady_o.isACK()){//sysj\filler.sysj line: 22, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\filler.sysj line: 22, column: 9
                      S25745=1;
                      if(!fillerReady_o.isACK()){//sysj\filler.sysj line: 22, column: 9
                        fillerReady_o.setREQ(false);//sysj\filler.sysj line: 22, column: 9
                        ends[1]=2;
                        ;//sysj\filler.sysj line: 22, column: 9
                        S115986=1;
                        thread116262(tdone,ends);
                        thread116263(tdone,ends);
                        thread116264(tdone,ends);
                        thread116265(tdone,ends);
                        int biggest116269 = 0;
                        if(ends[2]>=biggest116269){
                          biggest116269=ends[2];
                        }
                        if(ends[19]>=biggest116269){
                          biggest116269=ends[19];
                        }
                        if(ends[20]>=biggest116269){
                          biggest116269=ends[20];
                        }
                        if(ends[21]>=biggest116269){
                          biggest116269=ends[21];
                        }
                        if(biggest116269 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread116270(tdone,ends);
              thread116409(tdone,ends);
              thread116410(tdone,ends);
              thread116411(tdone,ends);
              int biggest116418 = 0;
              if(ends[2]>=biggest116418){
                biggest116418=ends[2];
              }
              if(ends[19]>=biggest116418){
                biggest116418=ends[19];
              }
              if(ends[20]>=biggest116418){
                biggest116418=ends[20];
              }
              if(ends[21]>=biggest116418){
                biggest116418=ends[21];
              }
              if(biggest116418 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest116418 == 0){
                S115987=0;
                active[1]=0;
                ends[1]=0;
                S115987=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    filler1_1 = new Signal();
    filler2_1 = new Signal();
    filler3_1 = new Signal();
    filler4_1 = new Signal();
    done_1 = new Signal();
    filler1_amount_1 = new Signal();
    filler2_amount_1 = new Signal();
    filler3_amount_1 = new Signal();
    filler4_amount_1 = new Signal();
    current_fill_1 = new Signal();
    total_fill_1 = new Signal();
    bottleAtPos2_1 = new Signal();
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
      filler1_1.setpreclear();
      filler2_1.setpreclear();
      filler3_1.setpreclear();
      filler4_1.setpreclear();
      done_1.setpreclear();
      filler1_amount_1.setpreclear();
      filler2_amount_1.setpreclear();
      filler3_amount_1.setpreclear();
      filler4_amount_1.setpreclear();
      current_fill_1.setpreclear();
      total_fill_1.setpreclear();
      bottleAtPos2_1.setpreclear();
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
      filler1_1.setClear();
      filler2_1.setClear();
      filler3_1.setClear();
      filler4_1.setClear();
      done_1.setClear();
      filler1_amount_1.setClear();
      filler2_amount_1.setClear();
      filler3_amount_1.setClear();
      filler4_amount_1.setClear();
      current_fill_1.setClear();
      total_fill_1.setClear();
      bottleAtPos2_1.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
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
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
