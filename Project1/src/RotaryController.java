import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class RotaryController extends ClockDomain{
  public RotaryController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal ReadySmoke = new Signal("ReadySmoke", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  public Signal bottleAtPos5E = new Signal("bottleAtPos5E", Signal.OUTPUT);
  public Signal bottleAtPos1E = new Signal("bottleAtPos1E", Signal.OUTPUT);
  public input_Channel convReady_in = new input_Channel();
  public input_Channel fillerReady_in = new input_Channel();
  public input_Channel capperReady_in = new input_Channel();
  public input_Channel lidLoaderReady_in = new input_Channel();
  public input_Channel checkFive_in = new input_Channel();
  public input_Channel checkOne_in = new input_Channel();
  public output_Channel rotated_o = new output_Channel();
  private Signal cvR_1;
  private Signal fR_1;
  private Signal cR_1;
  private Signal lR_1;
  private Signal bottleAtPos5_1;
  private Signal bottleAtPos1_1;
  private long __start_thread_9;//sysj\rotary.sysj line: 138, column: 44
  private long __start_thread_2;//sysj\rotary.sysj line: 92, column: 7
  private int i_thread_2;//sysj\rotary.sysj line: 148, column: 13
  private int S209259 = 1;
  private int S170040 = 1;
  private int S169936 = 1;
  private int S169931 = 1;
  private int S169958 = 1;
  private int S169953 = 1;
  private int S170047 = 1;
  private int S170042 = 1;
  private int S170179 = 1;
  private int S170174 = 1;
  private int S173599 = 1;
  private int S170364 = 1;
  private int S170351 = 1;
  private int S170354 = 1;
  private int S170357 = 1;
  private int S170360 = 1;
  private int S170363 = 1;
  private int S170378 = 1;
  private int S170367 = 1;
  private int S170401 = 1;
  private int S170417 = 1;
  private int S170520 = 1;
  private int S170515 = 1;
  private int S173997 = 1;
  private int S173698 = 1;
  private int S173632 = 1;
  private int S173624 = 1;
  private int S173623 = 1;
  private int S173607 = 1;
  private int S173602 = 1;
  private int S173630 = 1;
  private int S173797 = 1;
  private int S173731 = 1;
  private int S173723 = 1;
  private int S173722 = 1;
  private int S173706 = 1;
  private int S173701 = 1;
  private int S173729 = 1;
  private int S173896 = 1;
  private int S173830 = 1;
  private int S173822 = 1;
  private int S173821 = 1;
  private int S173805 = 1;
  private int S173800 = 1;
  private int S173828 = 1;
  private int S173995 = 1;
  private int S173929 = 1;
  private int S173921 = 1;
  private int S173920 = 1;
  private int S173904 = 1;
  private int S173899 = 1;
  private int S173927 = 1;
  private int S174080 = 1;
  private int S174024 = 1;
  private int S174004 = 1;
  private int S173999 = 1;
  private int S174118 = 1;
  private int S174092 = 1;
  private int S174085 = 1;
  private int S174088 = 1;
  private int S174201 = 1;
  private int S174145 = 1;
  private int S174125 = 1;
  private int S174120 = 1;
  private int S174239 = 1;
  private int S174213 = 1;
  private int S174206 = 1;
  private int S174209 = 1;
  
  private int[] ends = new int[36];
  private int[] tdone = new int[36];
  
  public void thread209847(int [] tdone, int [] ends){
        S174209=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread209846(int [] tdone, int [] ends){
        S174206=1;
    bottleAtPos1E.setPresent();//sysj\rotary.sysj line: 233, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread209844(int [] tdone, int [] ends){
        switch(S174209){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\rotary.sysj line: 237, column: 29
          ends[30]=2;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        break;
      
    }
  }

  public void thread209843(int [] tdone, int [] ends){
        switch(S174206){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        bottleAtPos1E.setPresent();//sysj\rotary.sysj line: 233, column: 23
        currsigs.addElement(bottleAtPos1E);
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
        break;
      
    }
  }

  public void thread209842(int [] tdone, int [] ends){
        switch(S174239){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        switch(S174213){
          case 0 : 
            thread209843(tdone,ends);
            thread209844(tdone,ends);
            int biggest209845 = 0;
            if(ends[29]>=biggest209845){
              biggest209845=ends[29];
            }
            if(ends[30]>=biggest209845){
              biggest209845=ends[30];
            }
            if(biggest209845 == 1){
              active[28]=1;
              ends[28]=1;
              tdone[28]=1;
            }
            if(biggest209845 == 2){
              ends[28]=2;
              ;//sysj\rotary.sysj line: 231, column: 34
              S174213=1;
              active[28]=1;
              ends[28]=1;
              tdone[28]=1;
            }
            //FINXME code
            if(biggest209845 == 0){
              ;//sysj\rotary.sysj line: 239, column: 20
              S174213=1;
              active[28]=1;
              ends[28]=1;
              tdone[28]=1;
            }
            break;
          
          case 1 : 
            S174213=1;
            S174213=0;
            if(bottleAtPos1_1.getprestatus()){//sysj\rotary.sysj line: 231, column: 21
              thread209846(tdone,ends);
              thread209847(tdone,ends);
              int biggest209848 = 0;
              if(ends[29]>=biggest209848){
                biggest209848=ends[29];
              }
              if(ends[30]>=biggest209848){
                biggest209848=ends[30];
              }
              if(biggest209848 == 1){
                active[28]=1;
                ends[28]=1;
                tdone[28]=1;
              }
            }
            else {
              S174213=1;
              active[28]=1;
              ends[28]=1;
              tdone[28]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread209841(int [] tdone, int [] ends){
        switch(S174201){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S174145){
          case 0 : 
            switch(S174125){
              case 0 : 
                if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\rotary.sysj line: 216, column: 7
                  checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
                  S174125=1;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  switch(S174120){
                    case 0 : 
                      if(!checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
                        checkOne_in.setACK(true);//sysj\rotary.sysj line: 216, column: 7
                        S174120=1;
                        if(checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
                          checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
                          ends[27]=2;
                          ;//sysj\rotary.sysj line: 216, column: 7
                          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\rotary.sysj line: 217, column: 10
                            bottleAtPos1_1.setPresent();//sysj\rotary.sysj line: 218, column: 8
                            currsigs.addElement(bottleAtPos1_1);
                            S174145=1;
                            active[27]=1;
                            ends[27]=1;
                            tdone[27]=1;
                          }
                          else {
                            S174145=1;
                            active[27]=1;
                            ends[27]=1;
                            tdone[27]=1;
                          }
                        }
                        else {
                          active[27]=1;
                          ends[27]=1;
                          tdone[27]=1;
                        }
                      }
                      else {
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
                        checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
                        ends[27]=2;
                        ;//sysj\rotary.sysj line: 216, column: 7
                        if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\rotary.sysj line: 217, column: 10
                          bottleAtPos1_1.setPresent();//sysj\rotary.sysj line: 218, column: 8
                          currsigs.addElement(bottleAtPos1_1);
                          S174145=1;
                          active[27]=1;
                          ends[27]=1;
                          tdone[27]=1;
                        }
                        else {
                          S174145=1;
                          active[27]=1;
                          ends[27]=1;
                          tdone[27]=1;
                        }
                      }
                      else {
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S174125=1;
                S174125=0;
                if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\rotary.sysj line: 216, column: 7
                  checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
                  S174125=1;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  S174120=0;
                  if(!checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
                    checkOne_in.setACK(true);//sysj\rotary.sysj line: 216, column: 7
                    S174120=1;
                    if(checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
                      checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
                      ends[27]=2;
                      ;//sysj\rotary.sysj line: 216, column: 7
                      if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\rotary.sysj line: 217, column: 10
                        bottleAtPos1_1.setPresent();//sysj\rotary.sysj line: 218, column: 8
                        currsigs.addElement(bottleAtPos1_1);
                        S174145=1;
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                      else {
                        S174145=1;
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                    }
                    else {
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                  }
                  else {
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S174145=1;
            S174145=0;
            S174125=0;
            if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\rotary.sysj line: 216, column: 7
              checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
              S174125=1;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            else {
              S174120=0;
              if(!checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
                checkOne_in.setACK(true);//sysj\rotary.sysj line: 216, column: 7
                S174120=1;
                if(checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
                  checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
                  ends[27]=2;
                  ;//sysj\rotary.sysj line: 216, column: 7
                  if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\rotary.sysj line: 217, column: 10
                    bottleAtPos1_1.setPresent();//sysj\rotary.sysj line: 218, column: 8
                    currsigs.addElement(bottleAtPos1_1);
                    S174145=1;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    S174145=1;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                }
                else {
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
              }
              else {
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread209839(int [] tdone, int [] ends){
        S174088=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread209838(int [] tdone, int [] ends){
        S174085=1;
    bottleAtPos5E.setPresent();//sysj\rotary.sysj line: 196, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread209836(int [] tdone, int [] ends){
        switch(S174088){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\rotary.sysj line: 200, column: 29
          ends[26]=2;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread209835(int [] tdone, int [] ends){
        switch(S174085){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        bottleAtPos5E.setPresent();//sysj\rotary.sysj line: 196, column: 23
        currsigs.addElement(bottleAtPos5E);
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
        break;
      
    }
  }

  public void thread209834(int [] tdone, int [] ends){
        switch(S174118){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S174092){
          case 0 : 
            thread209835(tdone,ends);
            thread209836(tdone,ends);
            int biggest209837 = 0;
            if(ends[25]>=biggest209837){
              biggest209837=ends[25];
            }
            if(ends[26]>=biggest209837){
              biggest209837=ends[26];
            }
            if(biggest209837 == 1){
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            if(biggest209837 == 2){
              ends[24]=2;
              ;//sysj\rotary.sysj line: 194, column: 34
              S174092=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            //FINXME code
            if(biggest209837 == 0){
              ;//sysj\rotary.sysj line: 202, column: 20
              S174092=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
          case 1 : 
            S174092=1;
            S174092=0;
            if(bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 194, column: 21
              thread209838(tdone,ends);
              thread209839(tdone,ends);
              int biggest209840 = 0;
              if(ends[25]>=biggest209840){
                biggest209840=ends[25];
              }
              if(ends[26]>=biggest209840){
                biggest209840=ends[26];
              }
              if(biggest209840 == 1){
                active[24]=1;
                ends[24]=1;
                tdone[24]=1;
              }
            }
            else {
              S174092=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread209833(int [] tdone, int [] ends){
        switch(S174080){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S174024){
          case 0 : 
            switch(S174004){
              case 0 : 
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\rotary.sysj line: 178, column: 7
                  checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
                  S174004=1;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  switch(S173999){
                    case 0 : 
                      if(!checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
                        checkFive_in.setACK(true);//sysj\rotary.sysj line: 178, column: 7
                        S173999=1;
                        if(checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
                          checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
                          ends[23]=2;
                          ;//sysj\rotary.sysj line: 178, column: 7
                          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\rotary.sysj line: 179, column: 10
                            bottleAtPos5_1.setPresent();//sysj\rotary.sysj line: 180, column: 8
                            currsigs.addElement(bottleAtPos5_1);
                            S174024=1;
                            active[23]=1;
                            ends[23]=1;
                            tdone[23]=1;
                          }
                          else {
                            S174024=1;
                            active[23]=1;
                            ends[23]=1;
                            tdone[23]=1;
                          }
                        }
                        else {
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                      }
                      else {
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
                        checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
                        ends[23]=2;
                        ;//sysj\rotary.sysj line: 178, column: 7
                        if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\rotary.sysj line: 179, column: 10
                          bottleAtPos5_1.setPresent();//sysj\rotary.sysj line: 180, column: 8
                          currsigs.addElement(bottleAtPos5_1);
                          S174024=1;
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                        else {
                          S174024=1;
                          active[23]=1;
                          ends[23]=1;
                          tdone[23]=1;
                        }
                      }
                      else {
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S174004=1;
                S174004=0;
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\rotary.sysj line: 178, column: 7
                  checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
                  S174004=1;
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
                else {
                  S173999=0;
                  if(!checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
                    checkFive_in.setACK(true);//sysj\rotary.sysj line: 178, column: 7
                    S173999=1;
                    if(checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
                      checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
                      ends[23]=2;
                      ;//sysj\rotary.sysj line: 178, column: 7
                      if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\rotary.sysj line: 179, column: 10
                        bottleAtPos5_1.setPresent();//sysj\rotary.sysj line: 180, column: 8
                        currsigs.addElement(bottleAtPos5_1);
                        S174024=1;
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                      else {
                        S174024=1;
                        active[23]=1;
                        ends[23]=1;
                        tdone[23]=1;
                      }
                    }
                    else {
                      active[23]=1;
                      ends[23]=1;
                      tdone[23]=1;
                    }
                  }
                  else {
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S174024=1;
            S174024=0;
            S174004=0;
            if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\rotary.sysj line: 178, column: 7
              checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
              S174004=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            else {
              S173999=0;
              if(!checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
                checkFive_in.setACK(true);//sysj\rotary.sysj line: 178, column: 7
                S173999=1;
                if(checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
                  checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
                  ends[23]=2;
                  ;//sysj\rotary.sysj line: 178, column: 7
                  if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\rotary.sysj line: 179, column: 10
                    bottleAtPos5_1.setPresent();//sysj\rotary.sysj line: 180, column: 8
                    currsigs.addElement(bottleAtPos5_1);
                    S174024=1;
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                  else {
                    S174024=1;
                    active[23]=1;
                    ends[23]=1;
                    tdone[23]=1;
                  }
                }
                else {
                  active[23]=1;
                  ends[23]=1;
                  tdone[23]=1;
                }
              }
              else {
                active[23]=1;
                ends[23]=1;
                tdone[23]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread209830(int [] tdone, int [] ends){
        S173927=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      lR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(lR_1);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S173927=0;
      active[22]=0;
      ends[22]=0;
      tdone[22]=1;
    }
  }

  public void thread209829(int [] tdone, int [] ends){
        S173921=1;
    S173920=0;
    S173904=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173904=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S173899=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173899=1;
        if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[21]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173920=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
      else {
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
  }

  public void thread209827(int [] tdone, int [] ends){
        switch(S173927){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        lR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
        currsigs.addElement(lR_1);
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
        break;
      
    }
  }

  public void thread209826(int [] tdone, int [] ends){
        switch(S173921){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        switch(S173920){
          case 0 : 
            switch(S173904){
              case 0 : 
                if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
                  lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                  S173904=1;
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                else {
                  switch(S173899){
                    case 0 : 
                      if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                        lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
                        S173899=1;
                        if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                          ends[21]=2;
                          ;//sysj\rotary.sysj line: 7, column: 5
                          S173920=1;
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                        else {
                          active[21]=1;
                          ends[21]=1;
                          tdone[21]=1;
                        }
                      }
                      else {
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                        lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                        ends[21]=2;
                        ;//sysj\rotary.sysj line: 7, column: 5
                        S173920=1;
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                      else {
                        active[21]=1;
                        ends[21]=1;
                        tdone[21]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S173904=1;
                S173904=0;
                if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
                  lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                  S173904=1;
                  active[21]=1;
                  ends[21]=1;
                  tdone[21]=1;
                }
                else {
                  S173899=0;
                  if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                    lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
                    S173899=1;
                    if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                      lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                      ends[21]=2;
                      ;//sysj\rotary.sysj line: 7, column: 5
                      S173920=1;
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                    else {
                      active[21]=1;
                      ends[21]=1;
                      tdone[21]=1;
                    }
                  }
                  else {
                    active[21]=1;
                    ends[21]=1;
                    tdone[21]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S173920=1;
            S173920=2;
            active[21]=1;
            ends[21]=1;
            tdone[21]=1;
            break;
          
          case 2 : 
            S173920=2;
            lidLoaderReady_in.setPreempted();//sysj\rotary.sysj line: 7, column: 36
            ends[21]=2;
            tdone[21]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread209825(int [] tdone, int [] ends){
        switch(S173995){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        switch(S173929){
          case 0 : 
            thread209826(tdone,ends);
            thread209827(tdone,ends);
            int biggest209828 = 0;
            if(ends[21]>=biggest209828){
              biggest209828=ends[21];
            }
            if(ends[22]>=biggest209828){
              biggest209828=ends[22];
            }
            if(biggest209828 == 1){
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            if(biggest209828 == 2){
              ends[20]=2;
              ;//sysj\rotary.sysj line: 6, column: 3
              S173929=1;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            //FINXME code
            if(biggest209828 == 0){
              S173929=1;
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
          case 1 : 
            S173929=1;
            S173929=0;
            thread209829(tdone,ends);
            thread209830(tdone,ends);
            int biggest209831 = 0;
            if(ends[21]>=biggest209831){
              biggest209831=ends[21];
            }
            if(ends[22]>=biggest209831){
              biggest209831=ends[22];
            }
            if(biggest209831 == 1){
              active[20]=1;
              ends[20]=1;
              tdone[20]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread209823(int [] tdone, int [] ends){
        S173828=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cR_1);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S173828=0;
      active[19]=0;
      ends[19]=0;
      tdone[19]=1;
    }
  }

  public void thread209822(int [] tdone, int [] ends){
        S173822=1;
    S173821=0;
    S173805=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173805=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S173800=0;
      if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        capperReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173800=1;
        if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[18]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173821=1;
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
      }
      else {
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread209820(int [] tdone, int [] ends){
        switch(S173828){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        cR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
        currsigs.addElement(cR_1);
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
        break;
      
    }
  }

  public void thread209819(int [] tdone, int [] ends){
        switch(S173822){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S173821){
          case 0 : 
            switch(S173805){
              case 0 : 
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
                  capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                  S173805=1;
                  active[18]=1;
                  ends[18]=1;
                  tdone[18]=1;
                }
                else {
                  switch(S173800){
                    case 0 : 
                      if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                        capperReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
                        S173800=1;
                        if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                          capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                          ends[18]=2;
                          ;//sysj\rotary.sysj line: 7, column: 5
                          S173821=1;
                          active[18]=1;
                          ends[18]=1;
                          tdone[18]=1;
                        }
                        else {
                          active[18]=1;
                          ends[18]=1;
                          tdone[18]=1;
                        }
                      }
                      else {
                        active[18]=1;
                        ends[18]=1;
                        tdone[18]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                        capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                        ends[18]=2;
                        ;//sysj\rotary.sysj line: 7, column: 5
                        S173821=1;
                        active[18]=1;
                        ends[18]=1;
                        tdone[18]=1;
                      }
                      else {
                        active[18]=1;
                        ends[18]=1;
                        tdone[18]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S173805=1;
                S173805=0;
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
                  capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                  S173805=1;
                  active[18]=1;
                  ends[18]=1;
                  tdone[18]=1;
                }
                else {
                  S173800=0;
                  if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                    capperReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
                    S173800=1;
                    if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                      capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                      ends[18]=2;
                      ;//sysj\rotary.sysj line: 7, column: 5
                      S173821=1;
                      active[18]=1;
                      ends[18]=1;
                      tdone[18]=1;
                    }
                    else {
                      active[18]=1;
                      ends[18]=1;
                      tdone[18]=1;
                    }
                  }
                  else {
                    active[18]=1;
                    ends[18]=1;
                    tdone[18]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S173821=1;
            S173821=2;
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
            break;
          
          case 2 : 
            S173821=2;
            capperReady_in.setPreempted();//sysj\rotary.sysj line: 7, column: 36
            ends[18]=2;
            tdone[18]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread209818(int [] tdone, int [] ends){
        switch(S173896){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        switch(S173830){
          case 0 : 
            thread209819(tdone,ends);
            thread209820(tdone,ends);
            int biggest209821 = 0;
            if(ends[18]>=biggest209821){
              biggest209821=ends[18];
            }
            if(ends[19]>=biggest209821){
              biggest209821=ends[19];
            }
            if(biggest209821 == 1){
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            if(biggest209821 == 2){
              ends[17]=2;
              ;//sysj\rotary.sysj line: 6, column: 3
              S173830=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            //FINXME code
            if(biggest209821 == 0){
              S173830=1;
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
          case 1 : 
            S173830=1;
            S173830=0;
            thread209822(tdone,ends);
            thread209823(tdone,ends);
            int biggest209824 = 0;
            if(ends[18]>=biggest209824){
              biggest209824=ends[18];
            }
            if(ends[19]>=biggest209824){
              biggest209824=ends[19];
            }
            if(biggest209824 == 1){
              active[17]=1;
              ends[17]=1;
              tdone[17]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread209816(int [] tdone, int [] ends){
        S173729=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      fR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(fR_1);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      S173729=0;
      active[16]=0;
      ends[16]=0;
      tdone[16]=1;
    }
  }

  public void thread209815(int [] tdone, int [] ends){
        S173723=1;
    S173722=0;
    S173706=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173706=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S173701=0;
      if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        fillerReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173701=1;
        if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[15]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173722=1;
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
      else {
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
  }

  public void thread209813(int [] tdone, int [] ends){
        switch(S173729){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        fR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
        currsigs.addElement(fR_1);
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
        break;
      
    }
  }

  public void thread209812(int [] tdone, int [] ends){
        switch(S173723){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S173722){
          case 0 : 
            switch(S173706){
              case 0 : 
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
                  fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                  S173706=1;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  switch(S173701){
                    case 0 : 
                      if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                        fillerReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
                        S173701=1;
                        if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                          fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                          ends[15]=2;
                          ;//sysj\rotary.sysj line: 7, column: 5
                          S173722=1;
                          active[15]=1;
                          ends[15]=1;
                          tdone[15]=1;
                        }
                        else {
                          active[15]=1;
                          ends[15]=1;
                          tdone[15]=1;
                        }
                      }
                      else {
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                        fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                        ends[15]=2;
                        ;//sysj\rotary.sysj line: 7, column: 5
                        S173722=1;
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                      else {
                        active[15]=1;
                        ends[15]=1;
                        tdone[15]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S173706=1;
                S173706=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
                  fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                  S173706=1;
                  active[15]=1;
                  ends[15]=1;
                  tdone[15]=1;
                }
                else {
                  S173701=0;
                  if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                    fillerReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
                    S173701=1;
                    if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                      fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                      ends[15]=2;
                      ;//sysj\rotary.sysj line: 7, column: 5
                      S173722=1;
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                    else {
                      active[15]=1;
                      ends[15]=1;
                      tdone[15]=1;
                    }
                  }
                  else {
                    active[15]=1;
                    ends[15]=1;
                    tdone[15]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S173722=1;
            S173722=2;
            active[15]=1;
            ends[15]=1;
            tdone[15]=1;
            break;
          
          case 2 : 
            S173722=2;
            fillerReady_in.setPreempted();//sysj\rotary.sysj line: 7, column: 36
            ends[15]=2;
            tdone[15]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread209811(int [] tdone, int [] ends){
        switch(S173797){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S173731){
          case 0 : 
            thread209812(tdone,ends);
            thread209813(tdone,ends);
            int biggest209814 = 0;
            if(ends[15]>=biggest209814){
              biggest209814=ends[15];
            }
            if(ends[16]>=biggest209814){
              biggest209814=ends[16];
            }
            if(biggest209814 == 1){
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            if(biggest209814 == 2){
              ends[14]=2;
              ;//sysj\rotary.sysj line: 6, column: 3
              S173731=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            //FINXME code
            if(biggest209814 == 0){
              S173731=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
          case 1 : 
            S173731=1;
            S173731=0;
            thread209815(tdone,ends);
            thread209816(tdone,ends);
            int biggest209817 = 0;
            if(ends[15]>=biggest209817){
              biggest209817=ends[15];
            }
            if(ends[16]>=biggest209817){
              biggest209817=ends[16];
            }
            if(biggest209817 == 1){
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread209809(int [] tdone, int [] ends){
        S173630=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cvR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cvR_1);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S173630=0;
      active[13]=0;
      ends[13]=0;
      tdone[13]=1;
    }
  }

  public void thread209808(int [] tdone, int [] ends){
        S173624=1;
    S173623=0;
    S173607=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173607=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S173602=0;
      if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        convReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173602=1;
        if(convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[12]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173623=1;
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
      }
      else {
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread209806(int [] tdone, int [] ends){
        switch(S173630){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        cvR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
        currsigs.addElement(cvR_1);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread209805(int [] tdone, int [] ends){
        switch(S173624){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S173623){
          case 0 : 
            switch(S173607){
              case 0 : 
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
                  convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                  S173607=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  switch(S173602){
                    case 0 : 
                      if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                        convReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
                        S173602=1;
                        if(convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                          convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                          ends[12]=2;
                          ;//sysj\rotary.sysj line: 7, column: 5
                          S173623=1;
                          active[12]=1;
                          ends[12]=1;
                          tdone[12]=1;
                        }
                        else {
                          active[12]=1;
                          ends[12]=1;
                          tdone[12]=1;
                        }
                      }
                      else {
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                        convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                        ends[12]=2;
                        ;//sysj\rotary.sysj line: 7, column: 5
                        S173623=1;
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      else {
                        active[12]=1;
                        ends[12]=1;
                        tdone[12]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S173607=1;
                S173607=0;
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
                  convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                  S173607=1;
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                }
                else {
                  S173602=0;
                  if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                    convReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
                    S173602=1;
                    if(convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
                      convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
                      ends[12]=2;
                      ;//sysj\rotary.sysj line: 7, column: 5
                      S173623=1;
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                    else {
                      active[12]=1;
                      ends[12]=1;
                      tdone[12]=1;
                    }
                  }
                  else {
                    active[12]=1;
                    ends[12]=1;
                    tdone[12]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S173623=1;
            S173623=2;
            active[12]=1;
            ends[12]=1;
            tdone[12]=1;
            break;
          
          case 2 : 
            S173623=2;
            convReady_in.setPreempted();//sysj\rotary.sysj line: 7, column: 36
            ends[12]=2;
            tdone[12]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread209804(int [] tdone, int [] ends){
        switch(S173698){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S173632){
          case 0 : 
            thread209805(tdone,ends);
            thread209806(tdone,ends);
            int biggest209807 = 0;
            if(ends[12]>=biggest209807){
              biggest209807=ends[12];
            }
            if(ends[13]>=biggest209807){
              biggest209807=ends[13];
            }
            if(biggest209807 == 1){
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            if(biggest209807 == 2){
              ends[11]=2;
              ;//sysj\rotary.sysj line: 6, column: 3
              S173632=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            //FINXME code
            if(biggest209807 == 0){
              S173632=1;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
          case 1 : 
            S173632=1;
            S173632=0;
            thread209808(tdone,ends);
            thread209809(tdone,ends);
            int biggest209810 = 0;
            if(ends[12]>=biggest209810){
              biggest209810=ends[12];
            }
            if(ends[13]>=biggest209810){
              biggest209810=ends[13];
            }
            if(biggest209810 == 1){
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread209803(int [] tdone, int [] ends){
        switch(S173997){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        thread209804(tdone,ends);
        thread209811(tdone,ends);
        thread209818(tdone,ends);
        thread209825(tdone,ends);
        int biggest209832 = 0;
        if(ends[11]>=biggest209832){
          biggest209832=ends[11];
        }
        if(ends[14]>=biggest209832){
          biggest209832=ends[14];
        }
        if(ends[17]>=biggest209832){
          biggest209832=ends[17];
        }
        if(ends[20]>=biggest209832){
          biggest209832=ends[20];
        }
        if(biggest209832 == 1){
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        //FINXME code
        if(biggest209832 == 0){
          S173997=0;
          active[10]=0;
          ends[10]=0;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread209801(int [] tdone, int [] ends){
        S170363=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread209800(int [] tdone, int [] ends){
        S170360=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread209799(int [] tdone, int [] ends){
        S170357=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread209798(int [] tdone, int [] ends){
        S170354=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread209797(int [] tdone, int [] ends){
        S170351=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread209795(int [] tdone, int [] ends){
        S170363=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread209794(int [] tdone, int [] ends){
        S170360=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread209793(int [] tdone, int [] ends){
        S170357=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread209792(int [] tdone, int [] ends){
        S170354=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread209791(int [] tdone, int [] ends){
        S170351=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread209789(int [] tdone, int [] ends){
        S170363=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread209788(int [] tdone, int [] ends){
        S170360=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread209787(int [] tdone, int [] ends){
        S170357=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread209786(int [] tdone, int [] ends){
        S170354=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread209785(int [] tdone, int [] ends){
        S170351=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread209783(int [] tdone, int [] ends){
        S170363=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread209782(int [] tdone, int [] ends){
        S170360=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread209781(int [] tdone, int [] ends){
        S170357=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread209780(int [] tdone, int [] ends){
        S170354=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread209779(int [] tdone, int [] ends){
        S170351=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread209777(int [] tdone, int [] ends){
        switch(S170417){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_9 >= 100){//sysj\rotary.sysj line: 138, column: 44
          ends[9]=3;
          ;//sysj\rotary.sysj line: 138, column: 44
          ends[9]=2;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread209776(int [] tdone, int [] ends){
        switch(S170401){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\rotary.sysj line: 138, column: 14
        currsigs.addElement(rotaryTableTrigger);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread209774(int [] tdone, int [] ends){
        S170417=1;
    __start_thread_9 = com.systemj.Timer.getMs();//sysj\rotary.sysj line: 138, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_9 >= 100){//sysj\rotary.sysj line: 138, column: 44
      ends[9]=3;
      ;//sysj\rotary.sysj line: 138, column: 44
      ends[9]=2;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread209773(int [] tdone, int [] ends){
        S170401=1;
    rotaryTableTrigger.setPresent();//sysj\rotary.sysj line: 138, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread209771(int [] tdone, int [] ends){
        S170417=1;
    __start_thread_9 = com.systemj.Timer.getMs();//sysj\rotary.sysj line: 138, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_9 >= 100){//sysj\rotary.sysj line: 138, column: 44
      ends[9]=3;
      ;//sysj\rotary.sysj line: 138, column: 44
      ends[9]=2;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread209770(int [] tdone, int [] ends){
        S170401=1;
    rotaryTableTrigger.setPresent();//sysj\rotary.sysj line: 138, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread209768(int [] tdone, int [] ends){
        S170417=1;
    __start_thread_9 = com.systemj.Timer.getMs();//sysj\rotary.sysj line: 138, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_9 >= 100){//sysj\rotary.sysj line: 138, column: 44
      ends[9]=3;
      ;//sysj\rotary.sysj line: 138, column: 44
      ends[9]=2;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread209767(int [] tdone, int [] ends){
        S170401=1;
    rotaryTableTrigger.setPresent();//sysj\rotary.sysj line: 138, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread209765(int [] tdone, int [] ends){
        S170417=1;
    __start_thread_9 = com.systemj.Timer.getMs();//sysj\rotary.sysj line: 138, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_9 >= 100){//sysj\rotary.sysj line: 138, column: 44
      ends[9]=3;
      ;//sysj\rotary.sysj line: 138, column: 44
      ends[9]=2;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread209764(int [] tdone, int [] ends){
        S170401=1;
    rotaryTableTrigger.setPresent();//sysj\rotary.sysj line: 138, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread209762(int [] tdone, int [] ends){
        switch(S170363){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(lR_1.getprestatus()){//sysj\rotary.sysj line: 118, column: 17
          System.out.println("*Rotary - LidLoader Ready*");//sysj\rotary.sysj line: 119, column: 11
          S170363=0;
          active[7]=0;
          ends[7]=0;
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

  public void thread209761(int [] tdone, int [] ends){
        switch(S170360){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(cR_1.getprestatus()){//sysj\rotary.sysj line: 112, column: 17
          System.out.println("*Rotary - Capper Ready*");//sysj\rotary.sysj line: 113, column: 11
          S170360=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread209760(int [] tdone, int [] ends){
        switch(S170357){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(cvR_1.getprestatus()){//sysj\rotary.sysj line: 106, column: 17
          System.out.println("*Rotary - Conveyor Ready*");//sysj\rotary.sysj line: 107, column: 11
          S170357=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread209759(int [] tdone, int [] ends){
        switch(S170354){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(fR_1.getprestatus()){//sysj\rotary.sysj line: 101, column: 17
          System.out.println("*Rotary - Filler Ready*");//sysj\rotary.sysj line: 102, column: 11
          S170354=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread209758(int [] tdone, int [] ends){
        switch(S170351){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(!ReadySmoke.getprestatus()){//sysj\rotary.sysj line: 95, column: 16
          System.out.println("*Rotary - No Smoke/Fire*");//sysj\rotary.sysj line: 96, column: 10
          S170351=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        else {
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread209757(int [] tdone, int [] ends){
        switch(S173599){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S170364){
          case 0 : 
            thread209758(tdone,ends);
            thread209759(tdone,ends);
            thread209760(tdone,ends);
            thread209761(tdone,ends);
            thread209762(tdone,ends);
            int biggest209763 = 0;
            if(ends[3]>=biggest209763){
              biggest209763=ends[3];
            }
            if(ends[4]>=biggest209763){
              biggest209763=ends[4];
            }
            if(ends[5]>=biggest209763){
              biggest209763=ends[5];
            }
            if(ends[6]>=biggest209763){
              biggest209763=ends[6];
            }
            if(ends[7]>=biggest209763){
              biggest209763=ends[7];
            }
            if(biggest209763 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest209763 == 0){
              System.out.println("*Rotary - All controllers are ready*");//sysj\rotary.sysj line: 122, column: 10
              S170364=1;
              if(bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 125, column: 18
                S170378=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S170364=2;
                thread209764(tdone,ends);
                thread209765(tdone,ends);
                int biggest209766 = 0;
                if(ends[8]>=biggest209766){
                  biggest209766=ends[8];
                }
                if(ends[9]>=biggest209766){
                  biggest209766=ends[9];
                }
                if(biggest209766 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                if(biggest209766 == 2){
                  ends[2]=2;
                  ;//sysj\rotary.sysj line: 137, column: 12
                  System.out.println("*Rotary - Waiting for Alignment*");//sysj\rotary.sysj line: 141, column: 16
                  S170364=3;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            break;
          
          case 1 : 
            switch(S170378){
              case 0 : 
                if(!bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 127, column: 20
                  S170378=1;
                  S170367=0;
                  if(bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 129, column: 23
                    S170367=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    ends[2]=2;
                    ;//sysj\rotary.sysj line: 126, column: 13
                    S170364=2;
                    thread209767(tdone,ends);
                    thread209768(tdone,ends);
                    int biggest209769 = 0;
                    if(ends[8]>=biggest209769){
                      biggest209769=ends[8];
                    }
                    if(ends[9]>=biggest209769){
                      biggest209769=ends[9];
                    }
                    if(biggest209769 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    if(biggest209769 == 2){
                      ends[2]=2;
                      ;//sysj\rotary.sysj line: 137, column: 12
                      System.out.println("*Rotary - Waiting for Alignment*");//sysj\rotary.sysj line: 141, column: 16
                      S170364=3;
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
                switch(S170367){
                  case 0 : 
                    S170367=0;
                    if(bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 129, column: 23
                      S170367=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      ends[2]=2;
                      ;//sysj\rotary.sysj line: 126, column: 13
                      S170364=2;
                      thread209770(tdone,ends);
                      thread209771(tdone,ends);
                      int biggest209772 = 0;
                      if(ends[8]>=biggest209772){
                        biggest209772=ends[8];
                      }
                      if(ends[9]>=biggest209772){
                        biggest209772=ends[9];
                      }
                      if(biggest209772 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      if(biggest209772 == 2){
                        ends[2]=2;
                        ;//sysj\rotary.sysj line: 137, column: 12
                        System.out.println("*Rotary - Waiting for Alignment*");//sysj\rotary.sysj line: 141, column: 16
                        S170364=3;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    break;
                  
                  case 1 : 
                    S170367=1;
                    S170367=0;
                    if(bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 129, column: 23
                      S170367=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      ends[2]=2;
                      ;//sysj\rotary.sysj line: 126, column: 13
                      S170364=2;
                      thread209773(tdone,ends);
                      thread209774(tdone,ends);
                      int biggest209775 = 0;
                      if(ends[8]>=biggest209775){
                        biggest209775=ends[8];
                      }
                      if(ends[9]>=biggest209775){
                        biggest209775=ends[9];
                      }
                      if(biggest209775 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      if(biggest209775 == 2){
                        ends[2]=2;
                        ;//sysj\rotary.sysj line: 137, column: 12
                        System.out.println("*Rotary - Waiting for Alignment*");//sysj\rotary.sysj line: 141, column: 16
                        S170364=3;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 2 : 
            thread209776(tdone,ends);
            thread209777(tdone,ends);
            int biggest209778 = 0;
            if(ends[8]>=biggest209778){
              biggest209778=ends[8];
            }
            if(ends[9]>=biggest209778){
              biggest209778=ends[9];
            }
            if(biggest209778 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest209778 == 2){
              ends[2]=2;
              ;//sysj\rotary.sysj line: 137, column: 12
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\rotary.sysj line: 141, column: 16
              S170364=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest209778 == 0){
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\rotary.sysj line: 141, column: 16
              S170364=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\rotary.sysj line: 142, column: 22
              System.out.println("*Rotary - Aligned*");//sysj\rotary.sysj line: 143, column: 16
              S170364=4;
              S170520=0;
              if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\rotary.sysj line: 144, column: 13
                rotated_o.setREQ(false);//sysj\rotary.sysj line: 144, column: 13
                S170520=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S170515=0;
                if(rotated_o.isACK()){//sysj\rotary.sysj line: 144, column: 13
                  rotated_o.setVal(Boolean.TRUE);//sysj\rotary.sysj line: 144, column: 13
                  S170515=1;
                  if(!rotated_o.isACK()){//sysj\rotary.sysj line: 144, column: 13
                    rotated_o.setREQ(false);//sysj\rotary.sysj line: 144, column: 13
                    ends[2]=2;
                    ;//sysj\rotary.sysj line: 144, column: 13
                    S170364=5;
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
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 4 : 
            switch(S170520){
              case 0 : 
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\rotary.sysj line: 144, column: 13
                  rotated_o.setREQ(false);//sysj\rotary.sysj line: 144, column: 13
                  S170520=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S170515){
                    case 0 : 
                      if(rotated_o.isACK()){//sysj\rotary.sysj line: 144, column: 13
                        rotated_o.setVal(Boolean.TRUE);//sysj\rotary.sysj line: 144, column: 13
                        S170515=1;
                        if(!rotated_o.isACK()){//sysj\rotary.sysj line: 144, column: 13
                          rotated_o.setREQ(false);//sysj\rotary.sysj line: 144, column: 13
                          ends[2]=2;
                          ;//sysj\rotary.sysj line: 144, column: 13
                          S170364=5;
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
                      if(!rotated_o.isACK()){//sysj\rotary.sysj line: 144, column: 13
                        rotated_o.setREQ(false);//sysj\rotary.sysj line: 144, column: 13
                        ends[2]=2;
                        ;//sysj\rotary.sysj line: 144, column: 13
                        S170364=5;
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
                S170520=1;
                S170520=0;
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\rotary.sysj line: 144, column: 13
                  rotated_o.setREQ(false);//sysj\rotary.sysj line: 144, column: 13
                  S170520=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S170515=0;
                  if(rotated_o.isACK()){//sysj\rotary.sysj line: 144, column: 13
                    rotated_o.setVal(Boolean.TRUE);//sysj\rotary.sysj line: 144, column: 13
                    S170515=1;
                    if(!rotated_o.isACK()){//sysj\rotary.sysj line: 144, column: 13
                      rotated_o.setREQ(false);//sysj\rotary.sysj line: 144, column: 13
                      ends[2]=2;
                      ;//sysj\rotary.sysj line: 144, column: 13
                      S170364=5;
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
          
          case 5 : 
            S170364=5;
            S170364=6;
            __start_thread_2 = com.systemj.Timer.getMs();//sysj\rotary.sysj line: 92, column: 7
            if(com.systemj.Timer.getMs() - __start_thread_2 >= 5){//sysj\rotary.sysj line: 92, column: 7
              ends[2]=2;
              ;//sysj\rotary.sysj line: 92, column: 7
              i_thread_2 = 0;//sysj\rotary.sysj line: 148, column: 13
              S170364=7;
              i_thread_2 = i_thread_2 + 1;//sysj\rotary.sysj line: 151, column: 12
              if(i_thread_2 > 15){//sysj\rotary.sysj line: 152, column: 15
                ends[2]=2;
                ;//sysj\rotary.sysj line: 149, column: 10
                S170364=8;
                __start_thread_2 = com.systemj.Timer.getMs();//sysj\rotary.sysj line: 92, column: 7
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\rotary.sysj line: 92, column: 7
                  ends[2]=2;
                  ;//sysj\rotary.sysj line: 92, column: 7
                  S170364=0;
                  thread209779(tdone,ends);
                  thread209780(tdone,ends);
                  thread209781(tdone,ends);
                  thread209782(tdone,ends);
                  thread209783(tdone,ends);
                  int biggest209784 = 0;
                  if(ends[3]>=biggest209784){
                    biggest209784=ends[3];
                  }
                  if(ends[4]>=biggest209784){
                    biggest209784=ends[4];
                  }
                  if(ends[5]>=biggest209784){
                    biggest209784=ends[5];
                  }
                  if(ends[6]>=biggest209784){
                    biggest209784=ends[6];
                  }
                  if(ends[7]>=biggest209784){
                    biggest209784=ends[7];
                  }
                  if(biggest209784 == 1){
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
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            if(com.systemj.Timer.getMs() - __start_thread_2 >= 5){//sysj\rotary.sysj line: 92, column: 7
              ends[2]=2;
              ;//sysj\rotary.sysj line: 92, column: 7
              i_thread_2 = 0;//sysj\rotary.sysj line: 148, column: 13
              S170364=7;
              i_thread_2 = i_thread_2 + 1;//sysj\rotary.sysj line: 151, column: 12
              if(i_thread_2 > 15){//sysj\rotary.sysj line: 152, column: 15
                ends[2]=2;
                ;//sysj\rotary.sysj line: 149, column: 10
                S170364=8;
                __start_thread_2 = com.systemj.Timer.getMs();//sysj\rotary.sysj line: 92, column: 7
                if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\rotary.sysj line: 92, column: 7
                  ends[2]=2;
                  ;//sysj\rotary.sysj line: 92, column: 7
                  S170364=0;
                  thread209785(tdone,ends);
                  thread209786(tdone,ends);
                  thread209787(tdone,ends);
                  thread209788(tdone,ends);
                  thread209789(tdone,ends);
                  int biggest209790 = 0;
                  if(ends[3]>=biggest209790){
                    biggest209790=ends[3];
                  }
                  if(ends[4]>=biggest209790){
                    biggest209790=ends[4];
                  }
                  if(ends[5]>=biggest209790){
                    biggest209790=ends[5];
                  }
                  if(ends[6]>=biggest209790){
                    biggest209790=ends[6];
                  }
                  if(ends[7]>=biggest209790){
                    biggest209790=ends[7];
                  }
                  if(biggest209790 == 1){
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
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 7 : 
            i_thread_2 = i_thread_2 + 1;//sysj\rotary.sysj line: 151, column: 12
            if(i_thread_2 > 15){//sysj\rotary.sysj line: 152, column: 15
              ends[2]=2;
              ;//sysj\rotary.sysj line: 149, column: 10
              S170364=8;
              __start_thread_2 = com.systemj.Timer.getMs();//sysj\rotary.sysj line: 92, column: 7
              if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\rotary.sysj line: 92, column: 7
                ends[2]=2;
                ;//sysj\rotary.sysj line: 92, column: 7
                S170364=0;
                thread209791(tdone,ends);
                thread209792(tdone,ends);
                thread209793(tdone,ends);
                thread209794(tdone,ends);
                thread209795(tdone,ends);
                int biggest209796 = 0;
                if(ends[3]>=biggest209796){
                  biggest209796=ends[3];
                }
                if(ends[4]>=biggest209796){
                  biggest209796=ends[4];
                }
                if(ends[5]>=biggest209796){
                  biggest209796=ends[5];
                }
                if(ends[6]>=biggest209796){
                  biggest209796=ends[6];
                }
                if(ends[7]>=biggest209796){
                  biggest209796=ends[7];
                }
                if(biggest209796 == 1){
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
          
          case 8 : 
            if(com.systemj.Timer.getMs() - __start_thread_2 >= (3) * 1000){//sysj\rotary.sysj line: 92, column: 7
              ends[2]=2;
              ;//sysj\rotary.sysj line: 92, column: 7
              S170364=0;
              thread209797(tdone,ends);
              thread209798(tdone,ends);
              thread209799(tdone,ends);
              thread209800(tdone,ends);
              thread209801(tdone,ends);
              int biggest209802 = 0;
              if(ends[3]>=biggest209802){
                biggest209802=ends[3];
              }
              if(ends[4]>=biggest209802){
                biggest209802=ends[4];
              }
              if(ends[5]>=biggest209802){
                biggest209802=ends[5];
              }
              if(ends[6]>=biggest209802){
                biggest209802=ends[6];
              }
              if(ends[7]>=biggest209802){
                biggest209802=ends[7];
              }
              if(biggest209802 == 1){
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
        break;
      
    }
  }

  public void thread209754(int [] tdone, int [] ends){
        S174209=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread209753(int [] tdone, int [] ends){
        S174206=1;
    bottleAtPos1E.setPresent();//sysj\rotary.sysj line: 233, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread209752(int [] tdone, int [] ends){
        S174239=1;
    S174213=0;
    if(bottleAtPos1_1.getprestatus()){//sysj\rotary.sysj line: 231, column: 21
      thread209753(tdone,ends);
      thread209754(tdone,ends);
      int biggest209755 = 0;
      if(ends[29]>=biggest209755){
        biggest209755=ends[29];
      }
      if(ends[30]>=biggest209755){
        biggest209755=ends[30];
      }
      if(biggest209755 == 1){
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
      }
    }
    else {
      S174213=1;
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread209751(int [] tdone, int [] ends){
        S174201=1;
    S174145=0;
    S174125=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\rotary.sysj line: 216, column: 7
      checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
      S174125=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S174120=0;
      if(!checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
        checkOne_in.setACK(true);//sysj\rotary.sysj line: 216, column: 7
        S174120=1;
        if(checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
          checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
          ends[27]=2;
          ;//sysj\rotary.sysj line: 216, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\rotary.sysj line: 217, column: 10
            bottleAtPos1_1.setPresent();//sysj\rotary.sysj line: 218, column: 8
            currsigs.addElement(bottleAtPos1_1);
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
          else {
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread209749(int [] tdone, int [] ends){
        S174088=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread209748(int [] tdone, int [] ends){
        S174085=1;
    bottleAtPos5E.setPresent();//sysj\rotary.sysj line: 196, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread209747(int [] tdone, int [] ends){
        S174118=1;
    S174092=0;
    if(bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 194, column: 21
      thread209748(tdone,ends);
      thread209749(tdone,ends);
      int biggest209750 = 0;
      if(ends[25]>=biggest209750){
        biggest209750=ends[25];
      }
      if(ends[26]>=biggest209750){
        biggest209750=ends[26];
      }
      if(biggest209750 == 1){
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
      }
    }
    else {
      S174092=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread209746(int [] tdone, int [] ends){
        S174080=1;
    S174024=0;
    S174004=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\rotary.sysj line: 178, column: 7
      checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
      S174004=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S173999=0;
      if(!checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
        checkFive_in.setACK(true);//sysj\rotary.sysj line: 178, column: 7
        S173999=1;
        if(checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
          checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
          ends[23]=2;
          ;//sysj\rotary.sysj line: 178, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\rotary.sysj line: 179, column: 10
            bottleAtPos5_1.setPresent();//sysj\rotary.sysj line: 180, column: 8
            currsigs.addElement(bottleAtPos5_1);
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
          else {
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread209743(int [] tdone, int [] ends){
        S173927=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      lR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(lR_1);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S173927=0;
      active[22]=0;
      ends[22]=0;
      tdone[22]=1;
    }
  }

  public void thread209742(int [] tdone, int [] ends){
        S173921=1;
    S173920=0;
    S173904=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173904=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S173899=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173899=1;
        if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[21]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173920=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
      else {
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
  }

  public void thread209741(int [] tdone, int [] ends){
        S173995=1;
    S173929=0;
    thread209742(tdone,ends);
    thread209743(tdone,ends);
    int biggest209744 = 0;
    if(ends[21]>=biggest209744){
      biggest209744=ends[21];
    }
    if(ends[22]>=biggest209744){
      biggest209744=ends[22];
    }
    if(biggest209744 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread209739(int [] tdone, int [] ends){
        S173828=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cR_1);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S173828=0;
      active[19]=0;
      ends[19]=0;
      tdone[19]=1;
    }
  }

  public void thread209738(int [] tdone, int [] ends){
        S173822=1;
    S173821=0;
    S173805=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173805=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S173800=0;
      if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        capperReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173800=1;
        if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[18]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173821=1;
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
      }
      else {
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread209737(int [] tdone, int [] ends){
        S173896=1;
    S173830=0;
    thread209738(tdone,ends);
    thread209739(tdone,ends);
    int biggest209740 = 0;
    if(ends[18]>=biggest209740){
      biggest209740=ends[18];
    }
    if(ends[19]>=biggest209740){
      biggest209740=ends[19];
    }
    if(biggest209740 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread209735(int [] tdone, int [] ends){
        S173729=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      fR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(fR_1);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      S173729=0;
      active[16]=0;
      ends[16]=0;
      tdone[16]=1;
    }
  }

  public void thread209734(int [] tdone, int [] ends){
        S173723=1;
    S173722=0;
    S173706=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173706=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S173701=0;
      if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        fillerReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173701=1;
        if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[15]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173722=1;
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
      else {
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
  }

  public void thread209733(int [] tdone, int [] ends){
        S173797=1;
    S173731=0;
    thread209734(tdone,ends);
    thread209735(tdone,ends);
    int biggest209736 = 0;
    if(ends[15]>=biggest209736){
      biggest209736=ends[15];
    }
    if(ends[16]>=biggest209736){
      biggest209736=ends[16];
    }
    if(biggest209736 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread209731(int [] tdone, int [] ends){
        S173630=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cvR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cvR_1);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S173630=0;
      active[13]=0;
      ends[13]=0;
      tdone[13]=1;
    }
  }

  public void thread209730(int [] tdone, int [] ends){
        S173624=1;
    S173623=0;
    S173607=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173607=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S173602=0;
      if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        convReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173602=1;
        if(convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[12]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173623=1;
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
      }
      else {
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread209729(int [] tdone, int [] ends){
        S173698=1;
    S173632=0;
    thread209730(tdone,ends);
    thread209731(tdone,ends);
    int biggest209732 = 0;
    if(ends[12]>=biggest209732){
      biggest209732=ends[12];
    }
    if(ends[13]>=biggest209732){
      biggest209732=ends[13];
    }
    if(biggest209732 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread209728(int [] tdone, int [] ends){
        S173997=1;
    thread209729(tdone,ends);
    thread209733(tdone,ends);
    thread209737(tdone,ends);
    thread209741(tdone,ends);
    int biggest209745 = 0;
    if(ends[11]>=biggest209745){
      biggest209745=ends[11];
    }
    if(ends[14]>=biggest209745){
      biggest209745=ends[14];
    }
    if(ends[17]>=biggest209745){
      biggest209745=ends[17];
    }
    if(ends[20]>=biggest209745){
      biggest209745=ends[20];
    }
    if(biggest209745 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209745 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209745 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209745 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread209726(int [] tdone, int [] ends){
        S170363=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread209725(int [] tdone, int [] ends){
        S170360=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread209724(int [] tdone, int [] ends){
        S170357=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread209723(int [] tdone, int [] ends){
        S170354=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread209722(int [] tdone, int [] ends){
        S170351=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread209721(int [] tdone, int [] ends){
        S173599=1;
    S170364=0;
    thread209722(tdone,ends);
    thread209723(tdone,ends);
    thread209724(tdone,ends);
    thread209725(tdone,ends);
    thread209726(tdone,ends);
    int biggest209727 = 0;
    if(ends[3]>=biggest209727){
      biggest209727=ends[3];
    }
    if(ends[4]>=biggest209727){
      biggest209727=ends[4];
    }
    if(ends[5]>=biggest209727){
      biggest209727=ends[5];
    }
    if(ends[6]>=biggest209727){
      biggest209727=ends[6];
    }
    if(ends[7]>=biggest209727){
      biggest209727=ends[7];
    }
    if(biggest209727 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread209718(int [] tdone, int [] ends){
        S174209=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread209717(int [] tdone, int [] ends){
        S174206=1;
    bottleAtPos1E.setPresent();//sysj\rotary.sysj line: 233, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread209716(int [] tdone, int [] ends){
        S174239=1;
    S174213=0;
    if(bottleAtPos1_1.getprestatus()){//sysj\rotary.sysj line: 231, column: 21
      thread209717(tdone,ends);
      thread209718(tdone,ends);
      int biggest209719 = 0;
      if(ends[29]>=biggest209719){
        biggest209719=ends[29];
      }
      if(ends[30]>=biggest209719){
        biggest209719=ends[30];
      }
      if(biggest209719 == 1){
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
      }
    }
    else {
      S174213=1;
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread209715(int [] tdone, int [] ends){
        S174201=1;
    S174145=0;
    S174125=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\rotary.sysj line: 216, column: 7
      checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
      S174125=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S174120=0;
      if(!checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
        checkOne_in.setACK(true);//sysj\rotary.sysj line: 216, column: 7
        S174120=1;
        if(checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
          checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
          ends[27]=2;
          ;//sysj\rotary.sysj line: 216, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\rotary.sysj line: 217, column: 10
            bottleAtPos1_1.setPresent();//sysj\rotary.sysj line: 218, column: 8
            currsigs.addElement(bottleAtPos1_1);
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
          else {
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread209713(int [] tdone, int [] ends){
        S174088=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread209712(int [] tdone, int [] ends){
        S174085=1;
    bottleAtPos5E.setPresent();//sysj\rotary.sysj line: 196, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread209711(int [] tdone, int [] ends){
        S174118=1;
    S174092=0;
    if(bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 194, column: 21
      thread209712(tdone,ends);
      thread209713(tdone,ends);
      int biggest209714 = 0;
      if(ends[25]>=biggest209714){
        biggest209714=ends[25];
      }
      if(ends[26]>=biggest209714){
        biggest209714=ends[26];
      }
      if(biggest209714 == 1){
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
      }
    }
    else {
      S174092=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread209710(int [] tdone, int [] ends){
        S174080=1;
    S174024=0;
    S174004=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\rotary.sysj line: 178, column: 7
      checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
      S174004=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S173999=0;
      if(!checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
        checkFive_in.setACK(true);//sysj\rotary.sysj line: 178, column: 7
        S173999=1;
        if(checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
          checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
          ends[23]=2;
          ;//sysj\rotary.sysj line: 178, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\rotary.sysj line: 179, column: 10
            bottleAtPos5_1.setPresent();//sysj\rotary.sysj line: 180, column: 8
            currsigs.addElement(bottleAtPos5_1);
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
          else {
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread209707(int [] tdone, int [] ends){
        S173927=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      lR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(lR_1);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S173927=0;
      active[22]=0;
      ends[22]=0;
      tdone[22]=1;
    }
  }

  public void thread209706(int [] tdone, int [] ends){
        S173921=1;
    S173920=0;
    S173904=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173904=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S173899=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173899=1;
        if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[21]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173920=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
      else {
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
  }

  public void thread209705(int [] tdone, int [] ends){
        S173995=1;
    S173929=0;
    thread209706(tdone,ends);
    thread209707(tdone,ends);
    int biggest209708 = 0;
    if(ends[21]>=biggest209708){
      biggest209708=ends[21];
    }
    if(ends[22]>=biggest209708){
      biggest209708=ends[22];
    }
    if(biggest209708 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread209703(int [] tdone, int [] ends){
        S173828=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cR_1);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S173828=0;
      active[19]=0;
      ends[19]=0;
      tdone[19]=1;
    }
  }

  public void thread209702(int [] tdone, int [] ends){
        S173822=1;
    S173821=0;
    S173805=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173805=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S173800=0;
      if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        capperReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173800=1;
        if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[18]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173821=1;
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
      }
      else {
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread209701(int [] tdone, int [] ends){
        S173896=1;
    S173830=0;
    thread209702(tdone,ends);
    thread209703(tdone,ends);
    int biggest209704 = 0;
    if(ends[18]>=biggest209704){
      biggest209704=ends[18];
    }
    if(ends[19]>=biggest209704){
      biggest209704=ends[19];
    }
    if(biggest209704 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread209699(int [] tdone, int [] ends){
        S173729=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      fR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(fR_1);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      S173729=0;
      active[16]=0;
      ends[16]=0;
      tdone[16]=1;
    }
  }

  public void thread209698(int [] tdone, int [] ends){
        S173723=1;
    S173722=0;
    S173706=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173706=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S173701=0;
      if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        fillerReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173701=1;
        if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[15]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173722=1;
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
      else {
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
  }

  public void thread209697(int [] tdone, int [] ends){
        S173797=1;
    S173731=0;
    thread209698(tdone,ends);
    thread209699(tdone,ends);
    int biggest209700 = 0;
    if(ends[15]>=biggest209700){
      biggest209700=ends[15];
    }
    if(ends[16]>=biggest209700){
      biggest209700=ends[16];
    }
    if(biggest209700 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread209695(int [] tdone, int [] ends){
        S173630=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cvR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cvR_1);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S173630=0;
      active[13]=0;
      ends[13]=0;
      tdone[13]=1;
    }
  }

  public void thread209694(int [] tdone, int [] ends){
        S173624=1;
    S173623=0;
    S173607=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173607=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S173602=0;
      if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        convReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173602=1;
        if(convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[12]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173623=1;
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
      }
      else {
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread209693(int [] tdone, int [] ends){
        S173698=1;
    S173632=0;
    thread209694(tdone,ends);
    thread209695(tdone,ends);
    int biggest209696 = 0;
    if(ends[12]>=biggest209696){
      biggest209696=ends[12];
    }
    if(ends[13]>=biggest209696){
      biggest209696=ends[13];
    }
    if(biggest209696 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread209692(int [] tdone, int [] ends){
        S173997=1;
    thread209693(tdone,ends);
    thread209697(tdone,ends);
    thread209701(tdone,ends);
    thread209705(tdone,ends);
    int biggest209709 = 0;
    if(ends[11]>=biggest209709){
      biggest209709=ends[11];
    }
    if(ends[14]>=biggest209709){
      biggest209709=ends[14];
    }
    if(ends[17]>=biggest209709){
      biggest209709=ends[17];
    }
    if(ends[20]>=biggest209709){
      biggest209709=ends[20];
    }
    if(biggest209709 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209709 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209709 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209709 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread209690(int [] tdone, int [] ends){
        S170363=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread209689(int [] tdone, int [] ends){
        S170360=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread209688(int [] tdone, int [] ends){
        S170357=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread209687(int [] tdone, int [] ends){
        S170354=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread209686(int [] tdone, int [] ends){
        S170351=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread209685(int [] tdone, int [] ends){
        S173599=1;
    S170364=0;
    thread209686(tdone,ends);
    thread209687(tdone,ends);
    thread209688(tdone,ends);
    thread209689(tdone,ends);
    thread209690(tdone,ends);
    int biggest209691 = 0;
    if(ends[3]>=biggest209691){
      biggest209691=ends[3];
    }
    if(ends[4]>=biggest209691){
      biggest209691=ends[4];
    }
    if(ends[5]>=biggest209691){
      biggest209691=ends[5];
    }
    if(ends[6]>=biggest209691){
      biggest209691=ends[6];
    }
    if(ends[7]>=biggest209691){
      biggest209691=ends[7];
    }
    if(biggest209691 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread209682(int [] tdone, int [] ends){
        S174209=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread209681(int [] tdone, int [] ends){
        S174206=1;
    bottleAtPos1E.setPresent();//sysj\rotary.sysj line: 233, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread209680(int [] tdone, int [] ends){
        S174239=1;
    S174213=0;
    if(bottleAtPos1_1.getprestatus()){//sysj\rotary.sysj line: 231, column: 21
      thread209681(tdone,ends);
      thread209682(tdone,ends);
      int biggest209683 = 0;
      if(ends[29]>=biggest209683){
        biggest209683=ends[29];
      }
      if(ends[30]>=biggest209683){
        biggest209683=ends[30];
      }
      if(biggest209683 == 1){
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
      }
    }
    else {
      S174213=1;
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread209679(int [] tdone, int [] ends){
        S174201=1;
    S174145=0;
    S174125=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\rotary.sysj line: 216, column: 7
      checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
      S174125=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S174120=0;
      if(!checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
        checkOne_in.setACK(true);//sysj\rotary.sysj line: 216, column: 7
        S174120=1;
        if(checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
          checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
          ends[27]=2;
          ;//sysj\rotary.sysj line: 216, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\rotary.sysj line: 217, column: 10
            bottleAtPos1_1.setPresent();//sysj\rotary.sysj line: 218, column: 8
            currsigs.addElement(bottleAtPos1_1);
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
          else {
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread209677(int [] tdone, int [] ends){
        S174088=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread209676(int [] tdone, int [] ends){
        S174085=1;
    bottleAtPos5E.setPresent();//sysj\rotary.sysj line: 196, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread209675(int [] tdone, int [] ends){
        S174118=1;
    S174092=0;
    if(bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 194, column: 21
      thread209676(tdone,ends);
      thread209677(tdone,ends);
      int biggest209678 = 0;
      if(ends[25]>=biggest209678){
        biggest209678=ends[25];
      }
      if(ends[26]>=biggest209678){
        biggest209678=ends[26];
      }
      if(biggest209678 == 1){
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
      }
    }
    else {
      S174092=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread209674(int [] tdone, int [] ends){
        S174080=1;
    S174024=0;
    S174004=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\rotary.sysj line: 178, column: 7
      checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
      S174004=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S173999=0;
      if(!checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
        checkFive_in.setACK(true);//sysj\rotary.sysj line: 178, column: 7
        S173999=1;
        if(checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
          checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
          ends[23]=2;
          ;//sysj\rotary.sysj line: 178, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\rotary.sysj line: 179, column: 10
            bottleAtPos5_1.setPresent();//sysj\rotary.sysj line: 180, column: 8
            currsigs.addElement(bottleAtPos5_1);
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
          else {
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread209671(int [] tdone, int [] ends){
        S173927=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      lR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(lR_1);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S173927=0;
      active[22]=0;
      ends[22]=0;
      tdone[22]=1;
    }
  }

  public void thread209670(int [] tdone, int [] ends){
        S173921=1;
    S173920=0;
    S173904=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173904=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S173899=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173899=1;
        if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[21]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173920=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
      else {
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
  }

  public void thread209669(int [] tdone, int [] ends){
        S173995=1;
    S173929=0;
    thread209670(tdone,ends);
    thread209671(tdone,ends);
    int biggest209672 = 0;
    if(ends[21]>=biggest209672){
      biggest209672=ends[21];
    }
    if(ends[22]>=biggest209672){
      biggest209672=ends[22];
    }
    if(biggest209672 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread209667(int [] tdone, int [] ends){
        S173828=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cR_1);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S173828=0;
      active[19]=0;
      ends[19]=0;
      tdone[19]=1;
    }
  }

  public void thread209666(int [] tdone, int [] ends){
        S173822=1;
    S173821=0;
    S173805=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173805=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S173800=0;
      if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        capperReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173800=1;
        if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[18]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173821=1;
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
      }
      else {
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread209665(int [] tdone, int [] ends){
        S173896=1;
    S173830=0;
    thread209666(tdone,ends);
    thread209667(tdone,ends);
    int biggest209668 = 0;
    if(ends[18]>=biggest209668){
      biggest209668=ends[18];
    }
    if(ends[19]>=biggest209668){
      biggest209668=ends[19];
    }
    if(biggest209668 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread209663(int [] tdone, int [] ends){
        S173729=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      fR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(fR_1);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      S173729=0;
      active[16]=0;
      ends[16]=0;
      tdone[16]=1;
    }
  }

  public void thread209662(int [] tdone, int [] ends){
        S173723=1;
    S173722=0;
    S173706=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173706=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S173701=0;
      if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        fillerReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173701=1;
        if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[15]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173722=1;
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
      else {
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
  }

  public void thread209661(int [] tdone, int [] ends){
        S173797=1;
    S173731=0;
    thread209662(tdone,ends);
    thread209663(tdone,ends);
    int biggest209664 = 0;
    if(ends[15]>=biggest209664){
      biggest209664=ends[15];
    }
    if(ends[16]>=biggest209664){
      biggest209664=ends[16];
    }
    if(biggest209664 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread209659(int [] tdone, int [] ends){
        S173630=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cvR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cvR_1);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S173630=0;
      active[13]=0;
      ends[13]=0;
      tdone[13]=1;
    }
  }

  public void thread209658(int [] tdone, int [] ends){
        S173624=1;
    S173623=0;
    S173607=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173607=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S173602=0;
      if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        convReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173602=1;
        if(convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[12]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173623=1;
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
      }
      else {
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread209657(int [] tdone, int [] ends){
        S173698=1;
    S173632=0;
    thread209658(tdone,ends);
    thread209659(tdone,ends);
    int biggest209660 = 0;
    if(ends[12]>=biggest209660){
      biggest209660=ends[12];
    }
    if(ends[13]>=biggest209660){
      biggest209660=ends[13];
    }
    if(biggest209660 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread209656(int [] tdone, int [] ends){
        S173997=1;
    thread209657(tdone,ends);
    thread209661(tdone,ends);
    thread209665(tdone,ends);
    thread209669(tdone,ends);
    int biggest209673 = 0;
    if(ends[11]>=biggest209673){
      biggest209673=ends[11];
    }
    if(ends[14]>=biggest209673){
      biggest209673=ends[14];
    }
    if(ends[17]>=biggest209673){
      biggest209673=ends[17];
    }
    if(ends[20]>=biggest209673){
      biggest209673=ends[20];
    }
    if(biggest209673 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209673 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209673 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209673 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread209654(int [] tdone, int [] ends){
        S170363=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread209653(int [] tdone, int [] ends){
        S170360=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread209652(int [] tdone, int [] ends){
        S170357=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread209651(int [] tdone, int [] ends){
        S170354=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread209650(int [] tdone, int [] ends){
        S170351=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread209649(int [] tdone, int [] ends){
        S173599=1;
    S170364=0;
    thread209650(tdone,ends);
    thread209651(tdone,ends);
    thread209652(tdone,ends);
    thread209653(tdone,ends);
    thread209654(tdone,ends);
    int biggest209655 = 0;
    if(ends[3]>=biggest209655){
      biggest209655=ends[3];
    }
    if(ends[4]>=biggest209655){
      biggest209655=ends[4];
    }
    if(ends[5]>=biggest209655){
      biggest209655=ends[5];
    }
    if(ends[6]>=biggest209655){
      biggest209655=ends[6];
    }
    if(ends[7]>=biggest209655){
      biggest209655=ends[7];
    }
    if(biggest209655 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread209646(int [] tdone, int [] ends){
        S174209=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread209645(int [] tdone, int [] ends){
        S174206=1;
    bottleAtPos1E.setPresent();//sysj\rotary.sysj line: 233, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread209644(int [] tdone, int [] ends){
        S174239=1;
    S174213=0;
    if(bottleAtPos1_1.getprestatus()){//sysj\rotary.sysj line: 231, column: 21
      thread209645(tdone,ends);
      thread209646(tdone,ends);
      int biggest209647 = 0;
      if(ends[29]>=biggest209647){
        biggest209647=ends[29];
      }
      if(ends[30]>=biggest209647){
        biggest209647=ends[30];
      }
      if(biggest209647 == 1){
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
      }
    }
    else {
      S174213=1;
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread209643(int [] tdone, int [] ends){
        S174201=1;
    S174145=0;
    S174125=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\rotary.sysj line: 216, column: 7
      checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
      S174125=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S174120=0;
      if(!checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
        checkOne_in.setACK(true);//sysj\rotary.sysj line: 216, column: 7
        S174120=1;
        if(checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
          checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
          ends[27]=2;
          ;//sysj\rotary.sysj line: 216, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\rotary.sysj line: 217, column: 10
            bottleAtPos1_1.setPresent();//sysj\rotary.sysj line: 218, column: 8
            currsigs.addElement(bottleAtPos1_1);
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
          else {
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread209641(int [] tdone, int [] ends){
        S174088=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread209640(int [] tdone, int [] ends){
        S174085=1;
    bottleAtPos5E.setPresent();//sysj\rotary.sysj line: 196, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread209639(int [] tdone, int [] ends){
        S174118=1;
    S174092=0;
    if(bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 194, column: 21
      thread209640(tdone,ends);
      thread209641(tdone,ends);
      int biggest209642 = 0;
      if(ends[25]>=biggest209642){
        biggest209642=ends[25];
      }
      if(ends[26]>=biggest209642){
        biggest209642=ends[26];
      }
      if(biggest209642 == 1){
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
      }
    }
    else {
      S174092=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread209638(int [] tdone, int [] ends){
        S174080=1;
    S174024=0;
    S174004=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\rotary.sysj line: 178, column: 7
      checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
      S174004=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S173999=0;
      if(!checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
        checkFive_in.setACK(true);//sysj\rotary.sysj line: 178, column: 7
        S173999=1;
        if(checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
          checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
          ends[23]=2;
          ;//sysj\rotary.sysj line: 178, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\rotary.sysj line: 179, column: 10
            bottleAtPos5_1.setPresent();//sysj\rotary.sysj line: 180, column: 8
            currsigs.addElement(bottleAtPos5_1);
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
          else {
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread209635(int [] tdone, int [] ends){
        S173927=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      lR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(lR_1);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S173927=0;
      active[22]=0;
      ends[22]=0;
      tdone[22]=1;
    }
  }

  public void thread209634(int [] tdone, int [] ends){
        S173921=1;
    S173920=0;
    S173904=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173904=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S173899=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173899=1;
        if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[21]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173920=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
      else {
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
  }

  public void thread209633(int [] tdone, int [] ends){
        S173995=1;
    S173929=0;
    thread209634(tdone,ends);
    thread209635(tdone,ends);
    int biggest209636 = 0;
    if(ends[21]>=biggest209636){
      biggest209636=ends[21];
    }
    if(ends[22]>=biggest209636){
      biggest209636=ends[22];
    }
    if(biggest209636 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread209631(int [] tdone, int [] ends){
        S173828=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cR_1);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S173828=0;
      active[19]=0;
      ends[19]=0;
      tdone[19]=1;
    }
  }

  public void thread209630(int [] tdone, int [] ends){
        S173822=1;
    S173821=0;
    S173805=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173805=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S173800=0;
      if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        capperReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173800=1;
        if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[18]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173821=1;
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
      }
      else {
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread209629(int [] tdone, int [] ends){
        S173896=1;
    S173830=0;
    thread209630(tdone,ends);
    thread209631(tdone,ends);
    int biggest209632 = 0;
    if(ends[18]>=biggest209632){
      biggest209632=ends[18];
    }
    if(ends[19]>=biggest209632){
      biggest209632=ends[19];
    }
    if(biggest209632 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread209627(int [] tdone, int [] ends){
        S173729=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      fR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(fR_1);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      S173729=0;
      active[16]=0;
      ends[16]=0;
      tdone[16]=1;
    }
  }

  public void thread209626(int [] tdone, int [] ends){
        S173723=1;
    S173722=0;
    S173706=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173706=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S173701=0;
      if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        fillerReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173701=1;
        if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[15]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173722=1;
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
      else {
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
  }

  public void thread209625(int [] tdone, int [] ends){
        S173797=1;
    S173731=0;
    thread209626(tdone,ends);
    thread209627(tdone,ends);
    int biggest209628 = 0;
    if(ends[15]>=biggest209628){
      biggest209628=ends[15];
    }
    if(ends[16]>=biggest209628){
      biggest209628=ends[16];
    }
    if(biggest209628 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread209623(int [] tdone, int [] ends){
        S173630=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cvR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cvR_1);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S173630=0;
      active[13]=0;
      ends[13]=0;
      tdone[13]=1;
    }
  }

  public void thread209622(int [] tdone, int [] ends){
        S173624=1;
    S173623=0;
    S173607=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173607=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S173602=0;
      if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        convReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173602=1;
        if(convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[12]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173623=1;
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
      }
      else {
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread209621(int [] tdone, int [] ends){
        S173698=1;
    S173632=0;
    thread209622(tdone,ends);
    thread209623(tdone,ends);
    int biggest209624 = 0;
    if(ends[12]>=biggest209624){
      biggest209624=ends[12];
    }
    if(ends[13]>=biggest209624){
      biggest209624=ends[13];
    }
    if(biggest209624 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread209620(int [] tdone, int [] ends){
        S173997=1;
    thread209621(tdone,ends);
    thread209625(tdone,ends);
    thread209629(tdone,ends);
    thread209633(tdone,ends);
    int biggest209637 = 0;
    if(ends[11]>=biggest209637){
      biggest209637=ends[11];
    }
    if(ends[14]>=biggest209637){
      biggest209637=ends[14];
    }
    if(ends[17]>=biggest209637){
      biggest209637=ends[17];
    }
    if(ends[20]>=biggest209637){
      biggest209637=ends[20];
    }
    if(biggest209637 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209637 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209637 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209637 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread209618(int [] tdone, int [] ends){
        S170363=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread209617(int [] tdone, int [] ends){
        S170360=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread209616(int [] tdone, int [] ends){
        S170357=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread209615(int [] tdone, int [] ends){
        S170354=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread209614(int [] tdone, int [] ends){
        S170351=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread209613(int [] tdone, int [] ends){
        S173599=1;
    S170364=0;
    thread209614(tdone,ends);
    thread209615(tdone,ends);
    thread209616(tdone,ends);
    thread209617(tdone,ends);
    thread209618(tdone,ends);
    int biggest209619 = 0;
    if(ends[3]>=biggest209619){
      biggest209619=ends[3];
    }
    if(ends[4]>=biggest209619){
      biggest209619=ends[4];
    }
    if(ends[5]>=biggest209619){
      biggest209619=ends[5];
    }
    if(ends[6]>=biggest209619){
      biggest209619=ends[6];
    }
    if(ends[7]>=biggest209619){
      biggest209619=ends[7];
    }
    if(biggest209619 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread209610(int [] tdone, int [] ends){
        S174209=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread209609(int [] tdone, int [] ends){
        S174206=1;
    bottleAtPos1E.setPresent();//sysj\rotary.sysj line: 233, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread209608(int [] tdone, int [] ends){
        S174239=1;
    S174213=0;
    if(bottleAtPos1_1.getprestatus()){//sysj\rotary.sysj line: 231, column: 21
      thread209609(tdone,ends);
      thread209610(tdone,ends);
      int biggest209611 = 0;
      if(ends[29]>=biggest209611){
        biggest209611=ends[29];
      }
      if(ends[30]>=biggest209611){
        biggest209611=ends[30];
      }
      if(biggest209611 == 1){
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
      }
    }
    else {
      S174213=1;
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread209607(int [] tdone, int [] ends){
        S174201=1;
    S174145=0;
    S174125=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\rotary.sysj line: 216, column: 7
      checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
      S174125=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S174120=0;
      if(!checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
        checkOne_in.setACK(true);//sysj\rotary.sysj line: 216, column: 7
        S174120=1;
        if(checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
          checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
          ends[27]=2;
          ;//sysj\rotary.sysj line: 216, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\rotary.sysj line: 217, column: 10
            bottleAtPos1_1.setPresent();//sysj\rotary.sysj line: 218, column: 8
            currsigs.addElement(bottleAtPos1_1);
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
          else {
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread209605(int [] tdone, int [] ends){
        S174088=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread209604(int [] tdone, int [] ends){
        S174085=1;
    bottleAtPos5E.setPresent();//sysj\rotary.sysj line: 196, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread209603(int [] tdone, int [] ends){
        S174118=1;
    S174092=0;
    if(bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 194, column: 21
      thread209604(tdone,ends);
      thread209605(tdone,ends);
      int biggest209606 = 0;
      if(ends[25]>=biggest209606){
        biggest209606=ends[25];
      }
      if(ends[26]>=biggest209606){
        biggest209606=ends[26];
      }
      if(biggest209606 == 1){
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
      }
    }
    else {
      S174092=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread209602(int [] tdone, int [] ends){
        S174080=1;
    S174024=0;
    S174004=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\rotary.sysj line: 178, column: 7
      checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
      S174004=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S173999=0;
      if(!checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
        checkFive_in.setACK(true);//sysj\rotary.sysj line: 178, column: 7
        S173999=1;
        if(checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
          checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
          ends[23]=2;
          ;//sysj\rotary.sysj line: 178, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\rotary.sysj line: 179, column: 10
            bottleAtPos5_1.setPresent();//sysj\rotary.sysj line: 180, column: 8
            currsigs.addElement(bottleAtPos5_1);
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
          else {
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread209599(int [] tdone, int [] ends){
        S173927=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      lR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(lR_1);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S173927=0;
      active[22]=0;
      ends[22]=0;
      tdone[22]=1;
    }
  }

  public void thread209598(int [] tdone, int [] ends){
        S173921=1;
    S173920=0;
    S173904=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173904=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S173899=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173899=1;
        if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[21]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173920=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
      else {
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
  }

  public void thread209597(int [] tdone, int [] ends){
        S173995=1;
    S173929=0;
    thread209598(tdone,ends);
    thread209599(tdone,ends);
    int biggest209600 = 0;
    if(ends[21]>=biggest209600){
      biggest209600=ends[21];
    }
    if(ends[22]>=biggest209600){
      biggest209600=ends[22];
    }
    if(biggest209600 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread209595(int [] tdone, int [] ends){
        S173828=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cR_1);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S173828=0;
      active[19]=0;
      ends[19]=0;
      tdone[19]=1;
    }
  }

  public void thread209594(int [] tdone, int [] ends){
        S173822=1;
    S173821=0;
    S173805=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173805=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S173800=0;
      if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        capperReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173800=1;
        if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[18]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173821=1;
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
      }
      else {
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread209593(int [] tdone, int [] ends){
        S173896=1;
    S173830=0;
    thread209594(tdone,ends);
    thread209595(tdone,ends);
    int biggest209596 = 0;
    if(ends[18]>=biggest209596){
      biggest209596=ends[18];
    }
    if(ends[19]>=biggest209596){
      biggest209596=ends[19];
    }
    if(biggest209596 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread209591(int [] tdone, int [] ends){
        S173729=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      fR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(fR_1);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      S173729=0;
      active[16]=0;
      ends[16]=0;
      tdone[16]=1;
    }
  }

  public void thread209590(int [] tdone, int [] ends){
        S173723=1;
    S173722=0;
    S173706=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173706=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S173701=0;
      if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        fillerReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173701=1;
        if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[15]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173722=1;
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
      else {
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
  }

  public void thread209589(int [] tdone, int [] ends){
        S173797=1;
    S173731=0;
    thread209590(tdone,ends);
    thread209591(tdone,ends);
    int biggest209592 = 0;
    if(ends[15]>=biggest209592){
      biggest209592=ends[15];
    }
    if(ends[16]>=biggest209592){
      biggest209592=ends[16];
    }
    if(biggest209592 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread209587(int [] tdone, int [] ends){
        S173630=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cvR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cvR_1);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S173630=0;
      active[13]=0;
      ends[13]=0;
      tdone[13]=1;
    }
  }

  public void thread209586(int [] tdone, int [] ends){
        S173624=1;
    S173623=0;
    S173607=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173607=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S173602=0;
      if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        convReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173602=1;
        if(convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[12]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173623=1;
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
      }
      else {
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread209585(int [] tdone, int [] ends){
        S173698=1;
    S173632=0;
    thread209586(tdone,ends);
    thread209587(tdone,ends);
    int biggest209588 = 0;
    if(ends[12]>=biggest209588){
      biggest209588=ends[12];
    }
    if(ends[13]>=biggest209588){
      biggest209588=ends[13];
    }
    if(biggest209588 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread209584(int [] tdone, int [] ends){
        S173997=1;
    thread209585(tdone,ends);
    thread209589(tdone,ends);
    thread209593(tdone,ends);
    thread209597(tdone,ends);
    int biggest209601 = 0;
    if(ends[11]>=biggest209601){
      biggest209601=ends[11];
    }
    if(ends[14]>=biggest209601){
      biggest209601=ends[14];
    }
    if(ends[17]>=biggest209601){
      biggest209601=ends[17];
    }
    if(ends[20]>=biggest209601){
      biggest209601=ends[20];
    }
    if(biggest209601 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209601 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209601 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209601 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread209582(int [] tdone, int [] ends){
        S170363=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread209581(int [] tdone, int [] ends){
        S170360=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread209580(int [] tdone, int [] ends){
        S170357=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread209579(int [] tdone, int [] ends){
        S170354=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread209578(int [] tdone, int [] ends){
        S170351=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread209577(int [] tdone, int [] ends){
        S173599=1;
    S170364=0;
    thread209578(tdone,ends);
    thread209579(tdone,ends);
    thread209580(tdone,ends);
    thread209581(tdone,ends);
    thread209582(tdone,ends);
    int biggest209583 = 0;
    if(ends[3]>=biggest209583){
      biggest209583=ends[3];
    }
    if(ends[4]>=biggest209583){
      biggest209583=ends[4];
    }
    if(ends[5]>=biggest209583){
      biggest209583=ends[5];
    }
    if(ends[6]>=biggest209583){
      biggest209583=ends[6];
    }
    if(ends[7]>=biggest209583){
      biggest209583=ends[7];
    }
    if(biggest209583 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread209574(int [] tdone, int [] ends){
        S174209=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread209573(int [] tdone, int [] ends){
        S174206=1;
    bottleAtPos1E.setPresent();//sysj\rotary.sysj line: 233, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread209572(int [] tdone, int [] ends){
        S174239=1;
    S174213=0;
    if(bottleAtPos1_1.getprestatus()){//sysj\rotary.sysj line: 231, column: 21
      thread209573(tdone,ends);
      thread209574(tdone,ends);
      int biggest209575 = 0;
      if(ends[29]>=biggest209575){
        biggest209575=ends[29];
      }
      if(ends[30]>=biggest209575){
        biggest209575=ends[30];
      }
      if(biggest209575 == 1){
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
      }
    }
    else {
      S174213=1;
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread209571(int [] tdone, int [] ends){
        S174201=1;
    S174145=0;
    S174125=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\rotary.sysj line: 216, column: 7
      checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
      S174125=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S174120=0;
      if(!checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
        checkOne_in.setACK(true);//sysj\rotary.sysj line: 216, column: 7
        S174120=1;
        if(checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
          checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
          ends[27]=2;
          ;//sysj\rotary.sysj line: 216, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\rotary.sysj line: 217, column: 10
            bottleAtPos1_1.setPresent();//sysj\rotary.sysj line: 218, column: 8
            currsigs.addElement(bottleAtPos1_1);
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
          else {
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread209569(int [] tdone, int [] ends){
        S174088=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread209568(int [] tdone, int [] ends){
        S174085=1;
    bottleAtPos5E.setPresent();//sysj\rotary.sysj line: 196, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread209567(int [] tdone, int [] ends){
        S174118=1;
    S174092=0;
    if(bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 194, column: 21
      thread209568(tdone,ends);
      thread209569(tdone,ends);
      int biggest209570 = 0;
      if(ends[25]>=biggest209570){
        biggest209570=ends[25];
      }
      if(ends[26]>=biggest209570){
        biggest209570=ends[26];
      }
      if(biggest209570 == 1){
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
      }
    }
    else {
      S174092=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread209566(int [] tdone, int [] ends){
        S174080=1;
    S174024=0;
    S174004=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\rotary.sysj line: 178, column: 7
      checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
      S174004=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S173999=0;
      if(!checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
        checkFive_in.setACK(true);//sysj\rotary.sysj line: 178, column: 7
        S173999=1;
        if(checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
          checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
          ends[23]=2;
          ;//sysj\rotary.sysj line: 178, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\rotary.sysj line: 179, column: 10
            bottleAtPos5_1.setPresent();//sysj\rotary.sysj line: 180, column: 8
            currsigs.addElement(bottleAtPos5_1);
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
          else {
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread209563(int [] tdone, int [] ends){
        S173927=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      lR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(lR_1);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S173927=0;
      active[22]=0;
      ends[22]=0;
      tdone[22]=1;
    }
  }

  public void thread209562(int [] tdone, int [] ends){
        S173921=1;
    S173920=0;
    S173904=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173904=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S173899=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173899=1;
        if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[21]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173920=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
      else {
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
  }

  public void thread209561(int [] tdone, int [] ends){
        S173995=1;
    S173929=0;
    thread209562(tdone,ends);
    thread209563(tdone,ends);
    int biggest209564 = 0;
    if(ends[21]>=biggest209564){
      biggest209564=ends[21];
    }
    if(ends[22]>=biggest209564){
      biggest209564=ends[22];
    }
    if(biggest209564 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread209559(int [] tdone, int [] ends){
        S173828=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cR_1);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S173828=0;
      active[19]=0;
      ends[19]=0;
      tdone[19]=1;
    }
  }

  public void thread209558(int [] tdone, int [] ends){
        S173822=1;
    S173821=0;
    S173805=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173805=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S173800=0;
      if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        capperReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173800=1;
        if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[18]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173821=1;
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
      }
      else {
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread209557(int [] tdone, int [] ends){
        S173896=1;
    S173830=0;
    thread209558(tdone,ends);
    thread209559(tdone,ends);
    int biggest209560 = 0;
    if(ends[18]>=biggest209560){
      biggest209560=ends[18];
    }
    if(ends[19]>=biggest209560){
      biggest209560=ends[19];
    }
    if(biggest209560 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread209555(int [] tdone, int [] ends){
        S173729=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      fR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(fR_1);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      S173729=0;
      active[16]=0;
      ends[16]=0;
      tdone[16]=1;
    }
  }

  public void thread209554(int [] tdone, int [] ends){
        S173723=1;
    S173722=0;
    S173706=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173706=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S173701=0;
      if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        fillerReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173701=1;
        if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[15]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173722=1;
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
      else {
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
  }

  public void thread209553(int [] tdone, int [] ends){
        S173797=1;
    S173731=0;
    thread209554(tdone,ends);
    thread209555(tdone,ends);
    int biggest209556 = 0;
    if(ends[15]>=biggest209556){
      biggest209556=ends[15];
    }
    if(ends[16]>=biggest209556){
      biggest209556=ends[16];
    }
    if(biggest209556 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread209551(int [] tdone, int [] ends){
        S173630=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cvR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cvR_1);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S173630=0;
      active[13]=0;
      ends[13]=0;
      tdone[13]=1;
    }
  }

  public void thread209550(int [] tdone, int [] ends){
        S173624=1;
    S173623=0;
    S173607=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173607=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S173602=0;
      if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        convReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173602=1;
        if(convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[12]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173623=1;
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
      }
      else {
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread209549(int [] tdone, int [] ends){
        S173698=1;
    S173632=0;
    thread209550(tdone,ends);
    thread209551(tdone,ends);
    int biggest209552 = 0;
    if(ends[12]>=biggest209552){
      biggest209552=ends[12];
    }
    if(ends[13]>=biggest209552){
      biggest209552=ends[13];
    }
    if(biggest209552 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread209548(int [] tdone, int [] ends){
        S173997=1;
    thread209549(tdone,ends);
    thread209553(tdone,ends);
    thread209557(tdone,ends);
    thread209561(tdone,ends);
    int biggest209565 = 0;
    if(ends[11]>=biggest209565){
      biggest209565=ends[11];
    }
    if(ends[14]>=biggest209565){
      biggest209565=ends[14];
    }
    if(ends[17]>=biggest209565){
      biggest209565=ends[17];
    }
    if(ends[20]>=biggest209565){
      biggest209565=ends[20];
    }
    if(biggest209565 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209565 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209565 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209565 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread209546(int [] tdone, int [] ends){
        S170363=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread209545(int [] tdone, int [] ends){
        S170360=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread209544(int [] tdone, int [] ends){
        S170357=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread209543(int [] tdone, int [] ends){
        S170354=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread209542(int [] tdone, int [] ends){
        S170351=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread209541(int [] tdone, int [] ends){
        S173599=1;
    S170364=0;
    thread209542(tdone,ends);
    thread209543(tdone,ends);
    thread209544(tdone,ends);
    thread209545(tdone,ends);
    thread209546(tdone,ends);
    int biggest209547 = 0;
    if(ends[3]>=biggest209547){
      biggest209547=ends[3];
    }
    if(ends[4]>=biggest209547){
      biggest209547=ends[4];
    }
    if(ends[5]>=biggest209547){
      biggest209547=ends[5];
    }
    if(ends[6]>=biggest209547){
      biggest209547=ends[6];
    }
    if(ends[7]>=biggest209547){
      biggest209547=ends[7];
    }
    if(biggest209547 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread209538(int [] tdone, int [] ends){
        S174209=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread209537(int [] tdone, int [] ends){
        S174206=1;
    bottleAtPos1E.setPresent();//sysj\rotary.sysj line: 233, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread209536(int [] tdone, int [] ends){
        S174239=1;
    S174213=0;
    if(bottleAtPos1_1.getprestatus()){//sysj\rotary.sysj line: 231, column: 21
      thread209537(tdone,ends);
      thread209538(tdone,ends);
      int biggest209539 = 0;
      if(ends[29]>=biggest209539){
        biggest209539=ends[29];
      }
      if(ends[30]>=biggest209539){
        biggest209539=ends[30];
      }
      if(biggest209539 == 1){
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
      }
    }
    else {
      S174213=1;
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread209535(int [] tdone, int [] ends){
        S174201=1;
    S174145=0;
    S174125=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\rotary.sysj line: 216, column: 7
      checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
      S174125=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S174120=0;
      if(!checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
        checkOne_in.setACK(true);//sysj\rotary.sysj line: 216, column: 7
        S174120=1;
        if(checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
          checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
          ends[27]=2;
          ;//sysj\rotary.sysj line: 216, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\rotary.sysj line: 217, column: 10
            bottleAtPos1_1.setPresent();//sysj\rotary.sysj line: 218, column: 8
            currsigs.addElement(bottleAtPos1_1);
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
          else {
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread209533(int [] tdone, int [] ends){
        S174088=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread209532(int [] tdone, int [] ends){
        S174085=1;
    bottleAtPos5E.setPresent();//sysj\rotary.sysj line: 196, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread209531(int [] tdone, int [] ends){
        S174118=1;
    S174092=0;
    if(bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 194, column: 21
      thread209532(tdone,ends);
      thread209533(tdone,ends);
      int biggest209534 = 0;
      if(ends[25]>=biggest209534){
        biggest209534=ends[25];
      }
      if(ends[26]>=biggest209534){
        biggest209534=ends[26];
      }
      if(biggest209534 == 1){
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
      }
    }
    else {
      S174092=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread209530(int [] tdone, int [] ends){
        S174080=1;
    S174024=0;
    S174004=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\rotary.sysj line: 178, column: 7
      checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
      S174004=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S173999=0;
      if(!checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
        checkFive_in.setACK(true);//sysj\rotary.sysj line: 178, column: 7
        S173999=1;
        if(checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
          checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
          ends[23]=2;
          ;//sysj\rotary.sysj line: 178, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\rotary.sysj line: 179, column: 10
            bottleAtPos5_1.setPresent();//sysj\rotary.sysj line: 180, column: 8
            currsigs.addElement(bottleAtPos5_1);
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
          else {
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread209527(int [] tdone, int [] ends){
        S173927=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      lR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(lR_1);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S173927=0;
      active[22]=0;
      ends[22]=0;
      tdone[22]=1;
    }
  }

  public void thread209526(int [] tdone, int [] ends){
        S173921=1;
    S173920=0;
    S173904=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173904=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S173899=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173899=1;
        if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[21]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173920=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
      else {
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
  }

  public void thread209525(int [] tdone, int [] ends){
        S173995=1;
    S173929=0;
    thread209526(tdone,ends);
    thread209527(tdone,ends);
    int biggest209528 = 0;
    if(ends[21]>=biggest209528){
      biggest209528=ends[21];
    }
    if(ends[22]>=biggest209528){
      biggest209528=ends[22];
    }
    if(biggest209528 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread209523(int [] tdone, int [] ends){
        S173828=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cR_1);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S173828=0;
      active[19]=0;
      ends[19]=0;
      tdone[19]=1;
    }
  }

  public void thread209522(int [] tdone, int [] ends){
        S173822=1;
    S173821=0;
    S173805=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173805=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S173800=0;
      if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        capperReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173800=1;
        if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[18]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173821=1;
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
      }
      else {
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread209521(int [] tdone, int [] ends){
        S173896=1;
    S173830=0;
    thread209522(tdone,ends);
    thread209523(tdone,ends);
    int biggest209524 = 0;
    if(ends[18]>=biggest209524){
      biggest209524=ends[18];
    }
    if(ends[19]>=biggest209524){
      biggest209524=ends[19];
    }
    if(biggest209524 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread209519(int [] tdone, int [] ends){
        S173729=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      fR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(fR_1);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      S173729=0;
      active[16]=0;
      ends[16]=0;
      tdone[16]=1;
    }
  }

  public void thread209518(int [] tdone, int [] ends){
        S173723=1;
    S173722=0;
    S173706=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173706=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S173701=0;
      if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        fillerReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173701=1;
        if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[15]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173722=1;
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
      else {
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
  }

  public void thread209517(int [] tdone, int [] ends){
        S173797=1;
    S173731=0;
    thread209518(tdone,ends);
    thread209519(tdone,ends);
    int biggest209520 = 0;
    if(ends[15]>=biggest209520){
      biggest209520=ends[15];
    }
    if(ends[16]>=biggest209520){
      biggest209520=ends[16];
    }
    if(biggest209520 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread209515(int [] tdone, int [] ends){
        S173630=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cvR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cvR_1);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S173630=0;
      active[13]=0;
      ends[13]=0;
      tdone[13]=1;
    }
  }

  public void thread209514(int [] tdone, int [] ends){
        S173624=1;
    S173623=0;
    S173607=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173607=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S173602=0;
      if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        convReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173602=1;
        if(convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[12]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173623=1;
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
      }
      else {
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread209513(int [] tdone, int [] ends){
        S173698=1;
    S173632=0;
    thread209514(tdone,ends);
    thread209515(tdone,ends);
    int biggest209516 = 0;
    if(ends[12]>=biggest209516){
      biggest209516=ends[12];
    }
    if(ends[13]>=biggest209516){
      biggest209516=ends[13];
    }
    if(biggest209516 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread209512(int [] tdone, int [] ends){
        S173997=1;
    thread209513(tdone,ends);
    thread209517(tdone,ends);
    thread209521(tdone,ends);
    thread209525(tdone,ends);
    int biggest209529 = 0;
    if(ends[11]>=biggest209529){
      biggest209529=ends[11];
    }
    if(ends[14]>=biggest209529){
      biggest209529=ends[14];
    }
    if(ends[17]>=biggest209529){
      biggest209529=ends[17];
    }
    if(ends[20]>=biggest209529){
      biggest209529=ends[20];
    }
    if(biggest209529 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209529 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209529 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209529 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread209510(int [] tdone, int [] ends){
        S170363=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread209509(int [] tdone, int [] ends){
        S170360=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread209508(int [] tdone, int [] ends){
        S170357=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread209507(int [] tdone, int [] ends){
        S170354=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread209506(int [] tdone, int [] ends){
        S170351=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread209505(int [] tdone, int [] ends){
        S173599=1;
    S170364=0;
    thread209506(tdone,ends);
    thread209507(tdone,ends);
    thread209508(tdone,ends);
    thread209509(tdone,ends);
    thread209510(tdone,ends);
    int biggest209511 = 0;
    if(ends[3]>=biggest209511){
      biggest209511=ends[3];
    }
    if(ends[4]>=biggest209511){
      biggest209511=ends[4];
    }
    if(ends[5]>=biggest209511){
      biggest209511=ends[5];
    }
    if(ends[6]>=biggest209511){
      biggest209511=ends[6];
    }
    if(ends[7]>=biggest209511){
      biggest209511=ends[7];
    }
    if(biggest209511 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread209502(int [] tdone, int [] ends){
        S174209=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread209501(int [] tdone, int [] ends){
        S174206=1;
    bottleAtPos1E.setPresent();//sysj\rotary.sysj line: 233, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread209500(int [] tdone, int [] ends){
        S174239=1;
    S174213=0;
    if(bottleAtPos1_1.getprestatus()){//sysj\rotary.sysj line: 231, column: 21
      thread209501(tdone,ends);
      thread209502(tdone,ends);
      int biggest209503 = 0;
      if(ends[29]>=biggest209503){
        biggest209503=ends[29];
      }
      if(ends[30]>=biggest209503){
        biggest209503=ends[30];
      }
      if(biggest209503 == 1){
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
      }
    }
    else {
      S174213=1;
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread209499(int [] tdone, int [] ends){
        S174201=1;
    S174145=0;
    S174125=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\rotary.sysj line: 216, column: 7
      checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
      S174125=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S174120=0;
      if(!checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
        checkOne_in.setACK(true);//sysj\rotary.sysj line: 216, column: 7
        S174120=1;
        if(checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
          checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
          ends[27]=2;
          ;//sysj\rotary.sysj line: 216, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\rotary.sysj line: 217, column: 10
            bottleAtPos1_1.setPresent();//sysj\rotary.sysj line: 218, column: 8
            currsigs.addElement(bottleAtPos1_1);
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
          else {
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread209497(int [] tdone, int [] ends){
        S174088=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread209496(int [] tdone, int [] ends){
        S174085=1;
    bottleAtPos5E.setPresent();//sysj\rotary.sysj line: 196, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread209495(int [] tdone, int [] ends){
        S174118=1;
    S174092=0;
    if(bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 194, column: 21
      thread209496(tdone,ends);
      thread209497(tdone,ends);
      int biggest209498 = 0;
      if(ends[25]>=biggest209498){
        biggest209498=ends[25];
      }
      if(ends[26]>=biggest209498){
        biggest209498=ends[26];
      }
      if(biggest209498 == 1){
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
      }
    }
    else {
      S174092=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread209494(int [] tdone, int [] ends){
        S174080=1;
    S174024=0;
    S174004=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\rotary.sysj line: 178, column: 7
      checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
      S174004=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S173999=0;
      if(!checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
        checkFive_in.setACK(true);//sysj\rotary.sysj line: 178, column: 7
        S173999=1;
        if(checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
          checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
          ends[23]=2;
          ;//sysj\rotary.sysj line: 178, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\rotary.sysj line: 179, column: 10
            bottleAtPos5_1.setPresent();//sysj\rotary.sysj line: 180, column: 8
            currsigs.addElement(bottleAtPos5_1);
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
          else {
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread209491(int [] tdone, int [] ends){
        S173927=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      lR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(lR_1);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S173927=0;
      active[22]=0;
      ends[22]=0;
      tdone[22]=1;
    }
  }

  public void thread209490(int [] tdone, int [] ends){
        S173921=1;
    S173920=0;
    S173904=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173904=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S173899=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173899=1;
        if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[21]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173920=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
      else {
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
  }

  public void thread209489(int [] tdone, int [] ends){
        S173995=1;
    S173929=0;
    thread209490(tdone,ends);
    thread209491(tdone,ends);
    int biggest209492 = 0;
    if(ends[21]>=biggest209492){
      biggest209492=ends[21];
    }
    if(ends[22]>=biggest209492){
      biggest209492=ends[22];
    }
    if(biggest209492 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread209487(int [] tdone, int [] ends){
        S173828=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cR_1);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S173828=0;
      active[19]=0;
      ends[19]=0;
      tdone[19]=1;
    }
  }

  public void thread209486(int [] tdone, int [] ends){
        S173822=1;
    S173821=0;
    S173805=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173805=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S173800=0;
      if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        capperReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173800=1;
        if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[18]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173821=1;
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
      }
      else {
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread209485(int [] tdone, int [] ends){
        S173896=1;
    S173830=0;
    thread209486(tdone,ends);
    thread209487(tdone,ends);
    int biggest209488 = 0;
    if(ends[18]>=biggest209488){
      biggest209488=ends[18];
    }
    if(ends[19]>=biggest209488){
      biggest209488=ends[19];
    }
    if(biggest209488 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread209483(int [] tdone, int [] ends){
        S173729=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      fR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(fR_1);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      S173729=0;
      active[16]=0;
      ends[16]=0;
      tdone[16]=1;
    }
  }

  public void thread209482(int [] tdone, int [] ends){
        S173723=1;
    S173722=0;
    S173706=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173706=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S173701=0;
      if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        fillerReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173701=1;
        if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[15]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173722=1;
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
      else {
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
  }

  public void thread209481(int [] tdone, int [] ends){
        S173797=1;
    S173731=0;
    thread209482(tdone,ends);
    thread209483(tdone,ends);
    int biggest209484 = 0;
    if(ends[15]>=biggest209484){
      biggest209484=ends[15];
    }
    if(ends[16]>=biggest209484){
      biggest209484=ends[16];
    }
    if(biggest209484 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread209479(int [] tdone, int [] ends){
        S173630=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cvR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cvR_1);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S173630=0;
      active[13]=0;
      ends[13]=0;
      tdone[13]=1;
    }
  }

  public void thread209478(int [] tdone, int [] ends){
        S173624=1;
    S173623=0;
    S173607=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173607=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S173602=0;
      if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        convReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173602=1;
        if(convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[12]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173623=1;
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
      }
      else {
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread209477(int [] tdone, int [] ends){
        S173698=1;
    S173632=0;
    thread209478(tdone,ends);
    thread209479(tdone,ends);
    int biggest209480 = 0;
    if(ends[12]>=biggest209480){
      biggest209480=ends[12];
    }
    if(ends[13]>=biggest209480){
      biggest209480=ends[13];
    }
    if(biggest209480 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread209476(int [] tdone, int [] ends){
        S173997=1;
    thread209477(tdone,ends);
    thread209481(tdone,ends);
    thread209485(tdone,ends);
    thread209489(tdone,ends);
    int biggest209493 = 0;
    if(ends[11]>=biggest209493){
      biggest209493=ends[11];
    }
    if(ends[14]>=biggest209493){
      biggest209493=ends[14];
    }
    if(ends[17]>=biggest209493){
      biggest209493=ends[17];
    }
    if(ends[20]>=biggest209493){
      biggest209493=ends[20];
    }
    if(biggest209493 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209493 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209493 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209493 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread209474(int [] tdone, int [] ends){
        S170363=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread209473(int [] tdone, int [] ends){
        S170360=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread209472(int [] tdone, int [] ends){
        S170357=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread209471(int [] tdone, int [] ends){
        S170354=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread209470(int [] tdone, int [] ends){
        S170351=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread209469(int [] tdone, int [] ends){
        S173599=1;
    S170364=0;
    thread209470(tdone,ends);
    thread209471(tdone,ends);
    thread209472(tdone,ends);
    thread209473(tdone,ends);
    thread209474(tdone,ends);
    int biggest209475 = 0;
    if(ends[3]>=biggest209475){
      biggest209475=ends[3];
    }
    if(ends[4]>=biggest209475){
      biggest209475=ends[4];
    }
    if(ends[5]>=biggest209475){
      biggest209475=ends[5];
    }
    if(ends[6]>=biggest209475){
      biggest209475=ends[6];
    }
    if(ends[7]>=biggest209475){
      biggest209475=ends[7];
    }
    if(biggest209475 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread209466(int [] tdone, int [] ends){
        S174209=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread209465(int [] tdone, int [] ends){
        S174206=1;
    bottleAtPos1E.setPresent();//sysj\rotary.sysj line: 233, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread209464(int [] tdone, int [] ends){
        S174239=1;
    S174213=0;
    if(bottleAtPos1_1.getprestatus()){//sysj\rotary.sysj line: 231, column: 21
      thread209465(tdone,ends);
      thread209466(tdone,ends);
      int biggest209467 = 0;
      if(ends[29]>=biggest209467){
        biggest209467=ends[29];
      }
      if(ends[30]>=biggest209467){
        biggest209467=ends[30];
      }
      if(biggest209467 == 1){
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
      }
    }
    else {
      S174213=1;
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread209463(int [] tdone, int [] ends){
        S174201=1;
    S174145=0;
    S174125=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\rotary.sysj line: 216, column: 7
      checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
      S174125=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S174120=0;
      if(!checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
        checkOne_in.setACK(true);//sysj\rotary.sysj line: 216, column: 7
        S174120=1;
        if(checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
          checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
          ends[27]=2;
          ;//sysj\rotary.sysj line: 216, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\rotary.sysj line: 217, column: 10
            bottleAtPos1_1.setPresent();//sysj\rotary.sysj line: 218, column: 8
            currsigs.addElement(bottleAtPos1_1);
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
          else {
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread209461(int [] tdone, int [] ends){
        S174088=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread209460(int [] tdone, int [] ends){
        S174085=1;
    bottleAtPos5E.setPresent();//sysj\rotary.sysj line: 196, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread209459(int [] tdone, int [] ends){
        S174118=1;
    S174092=0;
    if(bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 194, column: 21
      thread209460(tdone,ends);
      thread209461(tdone,ends);
      int biggest209462 = 0;
      if(ends[25]>=biggest209462){
        biggest209462=ends[25];
      }
      if(ends[26]>=biggest209462){
        biggest209462=ends[26];
      }
      if(biggest209462 == 1){
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
      }
    }
    else {
      S174092=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread209458(int [] tdone, int [] ends){
        S174080=1;
    S174024=0;
    S174004=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\rotary.sysj line: 178, column: 7
      checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
      S174004=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S173999=0;
      if(!checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
        checkFive_in.setACK(true);//sysj\rotary.sysj line: 178, column: 7
        S173999=1;
        if(checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
          checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
          ends[23]=2;
          ;//sysj\rotary.sysj line: 178, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\rotary.sysj line: 179, column: 10
            bottleAtPos5_1.setPresent();//sysj\rotary.sysj line: 180, column: 8
            currsigs.addElement(bottleAtPos5_1);
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
          else {
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread209455(int [] tdone, int [] ends){
        S173927=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      lR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(lR_1);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S173927=0;
      active[22]=0;
      ends[22]=0;
      tdone[22]=1;
    }
  }

  public void thread209454(int [] tdone, int [] ends){
        S173921=1;
    S173920=0;
    S173904=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173904=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S173899=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173899=1;
        if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[21]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173920=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
      else {
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
  }

  public void thread209453(int [] tdone, int [] ends){
        S173995=1;
    S173929=0;
    thread209454(tdone,ends);
    thread209455(tdone,ends);
    int biggest209456 = 0;
    if(ends[21]>=biggest209456){
      biggest209456=ends[21];
    }
    if(ends[22]>=biggest209456){
      biggest209456=ends[22];
    }
    if(biggest209456 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread209451(int [] tdone, int [] ends){
        S173828=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cR_1);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S173828=0;
      active[19]=0;
      ends[19]=0;
      tdone[19]=1;
    }
  }

  public void thread209450(int [] tdone, int [] ends){
        S173822=1;
    S173821=0;
    S173805=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173805=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S173800=0;
      if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        capperReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173800=1;
        if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[18]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173821=1;
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
      }
      else {
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread209449(int [] tdone, int [] ends){
        S173896=1;
    S173830=0;
    thread209450(tdone,ends);
    thread209451(tdone,ends);
    int biggest209452 = 0;
    if(ends[18]>=biggest209452){
      biggest209452=ends[18];
    }
    if(ends[19]>=biggest209452){
      biggest209452=ends[19];
    }
    if(biggest209452 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread209447(int [] tdone, int [] ends){
        S173729=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      fR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(fR_1);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      S173729=0;
      active[16]=0;
      ends[16]=0;
      tdone[16]=1;
    }
  }

  public void thread209446(int [] tdone, int [] ends){
        S173723=1;
    S173722=0;
    S173706=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173706=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S173701=0;
      if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        fillerReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173701=1;
        if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[15]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173722=1;
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
      else {
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
  }

  public void thread209445(int [] tdone, int [] ends){
        S173797=1;
    S173731=0;
    thread209446(tdone,ends);
    thread209447(tdone,ends);
    int biggest209448 = 0;
    if(ends[15]>=biggest209448){
      biggest209448=ends[15];
    }
    if(ends[16]>=biggest209448){
      biggest209448=ends[16];
    }
    if(biggest209448 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread209443(int [] tdone, int [] ends){
        S173630=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cvR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cvR_1);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S173630=0;
      active[13]=0;
      ends[13]=0;
      tdone[13]=1;
    }
  }

  public void thread209442(int [] tdone, int [] ends){
        S173624=1;
    S173623=0;
    S173607=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173607=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S173602=0;
      if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        convReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173602=1;
        if(convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[12]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173623=1;
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
      }
      else {
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread209441(int [] tdone, int [] ends){
        S173698=1;
    S173632=0;
    thread209442(tdone,ends);
    thread209443(tdone,ends);
    int biggest209444 = 0;
    if(ends[12]>=biggest209444){
      biggest209444=ends[12];
    }
    if(ends[13]>=biggest209444){
      biggest209444=ends[13];
    }
    if(biggest209444 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread209440(int [] tdone, int [] ends){
        S173997=1;
    thread209441(tdone,ends);
    thread209445(tdone,ends);
    thread209449(tdone,ends);
    thread209453(tdone,ends);
    int biggest209457 = 0;
    if(ends[11]>=biggest209457){
      biggest209457=ends[11];
    }
    if(ends[14]>=biggest209457){
      biggest209457=ends[14];
    }
    if(ends[17]>=biggest209457){
      biggest209457=ends[17];
    }
    if(ends[20]>=biggest209457){
      biggest209457=ends[20];
    }
    if(biggest209457 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209457 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209457 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209457 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread209438(int [] tdone, int [] ends){
        S170363=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread209437(int [] tdone, int [] ends){
        S170360=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread209436(int [] tdone, int [] ends){
        S170357=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread209435(int [] tdone, int [] ends){
        S170354=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread209434(int [] tdone, int [] ends){
        S170351=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread209433(int [] tdone, int [] ends){
        S173599=1;
    S170364=0;
    thread209434(tdone,ends);
    thread209435(tdone,ends);
    thread209436(tdone,ends);
    thread209437(tdone,ends);
    thread209438(tdone,ends);
    int biggest209439 = 0;
    if(ends[3]>=biggest209439){
      biggest209439=ends[3];
    }
    if(ends[4]>=biggest209439){
      biggest209439=ends[4];
    }
    if(ends[5]>=biggest209439){
      biggest209439=ends[5];
    }
    if(ends[6]>=biggest209439){
      biggest209439=ends[6];
    }
    if(ends[7]>=biggest209439){
      biggest209439=ends[7];
    }
    if(biggest209439 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread209430(int [] tdone, int [] ends){
        S174209=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread209429(int [] tdone, int [] ends){
        S174206=1;
    bottleAtPos1E.setPresent();//sysj\rotary.sysj line: 233, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread209428(int [] tdone, int [] ends){
        S174239=1;
    S174213=0;
    if(bottleAtPos1_1.getprestatus()){//sysj\rotary.sysj line: 231, column: 21
      thread209429(tdone,ends);
      thread209430(tdone,ends);
      int biggest209431 = 0;
      if(ends[29]>=biggest209431){
        biggest209431=ends[29];
      }
      if(ends[30]>=biggest209431){
        biggest209431=ends[30];
      }
      if(biggest209431 == 1){
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
      }
    }
    else {
      S174213=1;
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread209427(int [] tdone, int [] ends){
        S174201=1;
    S174145=0;
    S174125=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\rotary.sysj line: 216, column: 7
      checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
      S174125=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S174120=0;
      if(!checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
        checkOne_in.setACK(true);//sysj\rotary.sysj line: 216, column: 7
        S174120=1;
        if(checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
          checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
          ends[27]=2;
          ;//sysj\rotary.sysj line: 216, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\rotary.sysj line: 217, column: 10
            bottleAtPos1_1.setPresent();//sysj\rotary.sysj line: 218, column: 8
            currsigs.addElement(bottleAtPos1_1);
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
          else {
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread209425(int [] tdone, int [] ends){
        S174088=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread209424(int [] tdone, int [] ends){
        S174085=1;
    bottleAtPos5E.setPresent();//sysj\rotary.sysj line: 196, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread209423(int [] tdone, int [] ends){
        S174118=1;
    S174092=0;
    if(bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 194, column: 21
      thread209424(tdone,ends);
      thread209425(tdone,ends);
      int biggest209426 = 0;
      if(ends[25]>=biggest209426){
        biggest209426=ends[25];
      }
      if(ends[26]>=biggest209426){
        biggest209426=ends[26];
      }
      if(biggest209426 == 1){
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
      }
    }
    else {
      S174092=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread209422(int [] tdone, int [] ends){
        S174080=1;
    S174024=0;
    S174004=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\rotary.sysj line: 178, column: 7
      checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
      S174004=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S173999=0;
      if(!checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
        checkFive_in.setACK(true);//sysj\rotary.sysj line: 178, column: 7
        S173999=1;
        if(checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
          checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
          ends[23]=2;
          ;//sysj\rotary.sysj line: 178, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\rotary.sysj line: 179, column: 10
            bottleAtPos5_1.setPresent();//sysj\rotary.sysj line: 180, column: 8
            currsigs.addElement(bottleAtPos5_1);
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
          else {
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread209419(int [] tdone, int [] ends){
        S173927=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      lR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(lR_1);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S173927=0;
      active[22]=0;
      ends[22]=0;
      tdone[22]=1;
    }
  }

  public void thread209418(int [] tdone, int [] ends){
        S173921=1;
    S173920=0;
    S173904=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173904=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S173899=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173899=1;
        if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[21]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173920=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
      else {
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
  }

  public void thread209417(int [] tdone, int [] ends){
        S173995=1;
    S173929=0;
    thread209418(tdone,ends);
    thread209419(tdone,ends);
    int biggest209420 = 0;
    if(ends[21]>=biggest209420){
      biggest209420=ends[21];
    }
    if(ends[22]>=biggest209420){
      biggest209420=ends[22];
    }
    if(biggest209420 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread209415(int [] tdone, int [] ends){
        S173828=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cR_1);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S173828=0;
      active[19]=0;
      ends[19]=0;
      tdone[19]=1;
    }
  }

  public void thread209414(int [] tdone, int [] ends){
        S173822=1;
    S173821=0;
    S173805=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173805=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S173800=0;
      if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        capperReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173800=1;
        if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[18]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173821=1;
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
      }
      else {
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread209413(int [] tdone, int [] ends){
        S173896=1;
    S173830=0;
    thread209414(tdone,ends);
    thread209415(tdone,ends);
    int biggest209416 = 0;
    if(ends[18]>=biggest209416){
      biggest209416=ends[18];
    }
    if(ends[19]>=biggest209416){
      biggest209416=ends[19];
    }
    if(biggest209416 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread209411(int [] tdone, int [] ends){
        S173729=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      fR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(fR_1);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      S173729=0;
      active[16]=0;
      ends[16]=0;
      tdone[16]=1;
    }
  }

  public void thread209410(int [] tdone, int [] ends){
        S173723=1;
    S173722=0;
    S173706=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173706=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S173701=0;
      if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        fillerReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173701=1;
        if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[15]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173722=1;
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
      else {
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
  }

  public void thread209409(int [] tdone, int [] ends){
        S173797=1;
    S173731=0;
    thread209410(tdone,ends);
    thread209411(tdone,ends);
    int biggest209412 = 0;
    if(ends[15]>=biggest209412){
      biggest209412=ends[15];
    }
    if(ends[16]>=biggest209412){
      biggest209412=ends[16];
    }
    if(biggest209412 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread209407(int [] tdone, int [] ends){
        S173630=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cvR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cvR_1);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S173630=0;
      active[13]=0;
      ends[13]=0;
      tdone[13]=1;
    }
  }

  public void thread209406(int [] tdone, int [] ends){
        S173624=1;
    S173623=0;
    S173607=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173607=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S173602=0;
      if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        convReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173602=1;
        if(convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[12]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173623=1;
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
      }
      else {
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread209405(int [] tdone, int [] ends){
        S173698=1;
    S173632=0;
    thread209406(tdone,ends);
    thread209407(tdone,ends);
    int biggest209408 = 0;
    if(ends[12]>=biggest209408){
      biggest209408=ends[12];
    }
    if(ends[13]>=biggest209408){
      biggest209408=ends[13];
    }
    if(biggest209408 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread209404(int [] tdone, int [] ends){
        S173997=1;
    thread209405(tdone,ends);
    thread209409(tdone,ends);
    thread209413(tdone,ends);
    thread209417(tdone,ends);
    int biggest209421 = 0;
    if(ends[11]>=biggest209421){
      biggest209421=ends[11];
    }
    if(ends[14]>=biggest209421){
      biggest209421=ends[14];
    }
    if(ends[17]>=biggest209421){
      biggest209421=ends[17];
    }
    if(ends[20]>=biggest209421){
      biggest209421=ends[20];
    }
    if(biggest209421 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209421 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209421 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209421 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread209402(int [] tdone, int [] ends){
        S170363=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread209401(int [] tdone, int [] ends){
        S170360=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread209400(int [] tdone, int [] ends){
        S170357=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread209399(int [] tdone, int [] ends){
        S170354=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread209398(int [] tdone, int [] ends){
        S170351=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread209397(int [] tdone, int [] ends){
        S173599=1;
    S170364=0;
    thread209398(tdone,ends);
    thread209399(tdone,ends);
    thread209400(tdone,ends);
    thread209401(tdone,ends);
    thread209402(tdone,ends);
    int biggest209403 = 0;
    if(ends[3]>=biggest209403){
      biggest209403=ends[3];
    }
    if(ends[4]>=biggest209403){
      biggest209403=ends[4];
    }
    if(ends[5]>=biggest209403){
      biggest209403=ends[5];
    }
    if(ends[6]>=biggest209403){
      biggest209403=ends[6];
    }
    if(ends[7]>=biggest209403){
      biggest209403=ends[7];
    }
    if(biggest209403 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread209394(int [] tdone, int [] ends){
        S174209=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread209393(int [] tdone, int [] ends){
        S174206=1;
    bottleAtPos1E.setPresent();//sysj\rotary.sysj line: 233, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread209392(int [] tdone, int [] ends){
        S174239=1;
    S174213=0;
    if(bottleAtPos1_1.getprestatus()){//sysj\rotary.sysj line: 231, column: 21
      thread209393(tdone,ends);
      thread209394(tdone,ends);
      int biggest209395 = 0;
      if(ends[29]>=biggest209395){
        biggest209395=ends[29];
      }
      if(ends[30]>=biggest209395){
        biggest209395=ends[30];
      }
      if(biggest209395 == 1){
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
      }
    }
    else {
      S174213=1;
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread209391(int [] tdone, int [] ends){
        S174201=1;
    S174145=0;
    S174125=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\rotary.sysj line: 216, column: 7
      checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
      S174125=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S174120=0;
      if(!checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
        checkOne_in.setACK(true);//sysj\rotary.sysj line: 216, column: 7
        S174120=1;
        if(checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
          checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
          ends[27]=2;
          ;//sysj\rotary.sysj line: 216, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\rotary.sysj line: 217, column: 10
            bottleAtPos1_1.setPresent();//sysj\rotary.sysj line: 218, column: 8
            currsigs.addElement(bottleAtPos1_1);
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
          else {
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread209389(int [] tdone, int [] ends){
        S174088=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread209388(int [] tdone, int [] ends){
        S174085=1;
    bottleAtPos5E.setPresent();//sysj\rotary.sysj line: 196, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread209387(int [] tdone, int [] ends){
        S174118=1;
    S174092=0;
    if(bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 194, column: 21
      thread209388(tdone,ends);
      thread209389(tdone,ends);
      int biggest209390 = 0;
      if(ends[25]>=biggest209390){
        biggest209390=ends[25];
      }
      if(ends[26]>=biggest209390){
        biggest209390=ends[26];
      }
      if(biggest209390 == 1){
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
      }
    }
    else {
      S174092=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread209386(int [] tdone, int [] ends){
        S174080=1;
    S174024=0;
    S174004=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\rotary.sysj line: 178, column: 7
      checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
      S174004=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S173999=0;
      if(!checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
        checkFive_in.setACK(true);//sysj\rotary.sysj line: 178, column: 7
        S173999=1;
        if(checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
          checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
          ends[23]=2;
          ;//sysj\rotary.sysj line: 178, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\rotary.sysj line: 179, column: 10
            bottleAtPos5_1.setPresent();//sysj\rotary.sysj line: 180, column: 8
            currsigs.addElement(bottleAtPos5_1);
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
          else {
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread209383(int [] tdone, int [] ends){
        S173927=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      lR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(lR_1);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S173927=0;
      active[22]=0;
      ends[22]=0;
      tdone[22]=1;
    }
  }

  public void thread209382(int [] tdone, int [] ends){
        S173921=1;
    S173920=0;
    S173904=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173904=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S173899=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173899=1;
        if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[21]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173920=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
      else {
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
  }

  public void thread209381(int [] tdone, int [] ends){
        S173995=1;
    S173929=0;
    thread209382(tdone,ends);
    thread209383(tdone,ends);
    int biggest209384 = 0;
    if(ends[21]>=biggest209384){
      biggest209384=ends[21];
    }
    if(ends[22]>=biggest209384){
      biggest209384=ends[22];
    }
    if(biggest209384 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread209379(int [] tdone, int [] ends){
        S173828=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cR_1);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S173828=0;
      active[19]=0;
      ends[19]=0;
      tdone[19]=1;
    }
  }

  public void thread209378(int [] tdone, int [] ends){
        S173822=1;
    S173821=0;
    S173805=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173805=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S173800=0;
      if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        capperReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173800=1;
        if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[18]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173821=1;
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
      }
      else {
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread209377(int [] tdone, int [] ends){
        S173896=1;
    S173830=0;
    thread209378(tdone,ends);
    thread209379(tdone,ends);
    int biggest209380 = 0;
    if(ends[18]>=biggest209380){
      biggest209380=ends[18];
    }
    if(ends[19]>=biggest209380){
      biggest209380=ends[19];
    }
    if(biggest209380 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread209375(int [] tdone, int [] ends){
        S173729=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      fR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(fR_1);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      S173729=0;
      active[16]=0;
      ends[16]=0;
      tdone[16]=1;
    }
  }

  public void thread209374(int [] tdone, int [] ends){
        S173723=1;
    S173722=0;
    S173706=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173706=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S173701=0;
      if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        fillerReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173701=1;
        if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[15]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173722=1;
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
      else {
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
  }

  public void thread209373(int [] tdone, int [] ends){
        S173797=1;
    S173731=0;
    thread209374(tdone,ends);
    thread209375(tdone,ends);
    int biggest209376 = 0;
    if(ends[15]>=biggest209376){
      biggest209376=ends[15];
    }
    if(ends[16]>=biggest209376){
      biggest209376=ends[16];
    }
    if(biggest209376 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread209371(int [] tdone, int [] ends){
        S173630=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cvR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cvR_1);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S173630=0;
      active[13]=0;
      ends[13]=0;
      tdone[13]=1;
    }
  }

  public void thread209370(int [] tdone, int [] ends){
        S173624=1;
    S173623=0;
    S173607=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173607=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S173602=0;
      if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        convReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173602=1;
        if(convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[12]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173623=1;
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
      }
      else {
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread209369(int [] tdone, int [] ends){
        S173698=1;
    S173632=0;
    thread209370(tdone,ends);
    thread209371(tdone,ends);
    int biggest209372 = 0;
    if(ends[12]>=biggest209372){
      biggest209372=ends[12];
    }
    if(ends[13]>=biggest209372){
      biggest209372=ends[13];
    }
    if(biggest209372 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread209368(int [] tdone, int [] ends){
        S173997=1;
    thread209369(tdone,ends);
    thread209373(tdone,ends);
    thread209377(tdone,ends);
    thread209381(tdone,ends);
    int biggest209385 = 0;
    if(ends[11]>=biggest209385){
      biggest209385=ends[11];
    }
    if(ends[14]>=biggest209385){
      biggest209385=ends[14];
    }
    if(ends[17]>=biggest209385){
      biggest209385=ends[17];
    }
    if(ends[20]>=biggest209385){
      biggest209385=ends[20];
    }
    if(biggest209385 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209385 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209385 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209385 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread209366(int [] tdone, int [] ends){
        S170363=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread209365(int [] tdone, int [] ends){
        S170360=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread209364(int [] tdone, int [] ends){
        S170357=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread209363(int [] tdone, int [] ends){
        S170354=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread209362(int [] tdone, int [] ends){
        S170351=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread209361(int [] tdone, int [] ends){
        S173599=1;
    S170364=0;
    thread209362(tdone,ends);
    thread209363(tdone,ends);
    thread209364(tdone,ends);
    thread209365(tdone,ends);
    thread209366(tdone,ends);
    int biggest209367 = 0;
    if(ends[3]>=biggest209367){
      biggest209367=ends[3];
    }
    if(ends[4]>=biggest209367){
      biggest209367=ends[4];
    }
    if(ends[5]>=biggest209367){
      biggest209367=ends[5];
    }
    if(ends[6]>=biggest209367){
      biggest209367=ends[6];
    }
    if(ends[7]>=biggest209367){
      biggest209367=ends[7];
    }
    if(biggest209367 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread209358(int [] tdone, int [] ends){
        S174209=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread209357(int [] tdone, int [] ends){
        S174206=1;
    bottleAtPos1E.setPresent();//sysj\rotary.sysj line: 233, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread209356(int [] tdone, int [] ends){
        S174239=1;
    S174213=0;
    if(bottleAtPos1_1.getprestatus()){//sysj\rotary.sysj line: 231, column: 21
      thread209357(tdone,ends);
      thread209358(tdone,ends);
      int biggest209359 = 0;
      if(ends[29]>=biggest209359){
        biggest209359=ends[29];
      }
      if(ends[30]>=biggest209359){
        biggest209359=ends[30];
      }
      if(biggest209359 == 1){
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
      }
    }
    else {
      S174213=1;
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread209355(int [] tdone, int [] ends){
        S174201=1;
    S174145=0;
    S174125=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\rotary.sysj line: 216, column: 7
      checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
      S174125=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S174120=0;
      if(!checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
        checkOne_in.setACK(true);//sysj\rotary.sysj line: 216, column: 7
        S174120=1;
        if(checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
          checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
          ends[27]=2;
          ;//sysj\rotary.sysj line: 216, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\rotary.sysj line: 217, column: 10
            bottleAtPos1_1.setPresent();//sysj\rotary.sysj line: 218, column: 8
            currsigs.addElement(bottleAtPos1_1);
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
          else {
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread209353(int [] tdone, int [] ends){
        S174088=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread209352(int [] tdone, int [] ends){
        S174085=1;
    bottleAtPos5E.setPresent();//sysj\rotary.sysj line: 196, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread209351(int [] tdone, int [] ends){
        S174118=1;
    S174092=0;
    if(bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 194, column: 21
      thread209352(tdone,ends);
      thread209353(tdone,ends);
      int biggest209354 = 0;
      if(ends[25]>=biggest209354){
        biggest209354=ends[25];
      }
      if(ends[26]>=biggest209354){
        biggest209354=ends[26];
      }
      if(biggest209354 == 1){
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
      }
    }
    else {
      S174092=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread209350(int [] tdone, int [] ends){
        S174080=1;
    S174024=0;
    S174004=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\rotary.sysj line: 178, column: 7
      checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
      S174004=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S173999=0;
      if(!checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
        checkFive_in.setACK(true);//sysj\rotary.sysj line: 178, column: 7
        S173999=1;
        if(checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
          checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
          ends[23]=2;
          ;//sysj\rotary.sysj line: 178, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\rotary.sysj line: 179, column: 10
            bottleAtPos5_1.setPresent();//sysj\rotary.sysj line: 180, column: 8
            currsigs.addElement(bottleAtPos5_1);
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
          else {
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread209347(int [] tdone, int [] ends){
        S173927=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      lR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(lR_1);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S173927=0;
      active[22]=0;
      ends[22]=0;
      tdone[22]=1;
    }
  }

  public void thread209346(int [] tdone, int [] ends){
        S173921=1;
    S173920=0;
    S173904=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173904=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S173899=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173899=1;
        if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[21]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173920=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
      else {
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
  }

  public void thread209345(int [] tdone, int [] ends){
        S173995=1;
    S173929=0;
    thread209346(tdone,ends);
    thread209347(tdone,ends);
    int biggest209348 = 0;
    if(ends[21]>=biggest209348){
      biggest209348=ends[21];
    }
    if(ends[22]>=biggest209348){
      biggest209348=ends[22];
    }
    if(biggest209348 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread209343(int [] tdone, int [] ends){
        S173828=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cR_1);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S173828=0;
      active[19]=0;
      ends[19]=0;
      tdone[19]=1;
    }
  }

  public void thread209342(int [] tdone, int [] ends){
        S173822=1;
    S173821=0;
    S173805=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173805=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S173800=0;
      if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        capperReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173800=1;
        if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[18]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173821=1;
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
      }
      else {
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread209341(int [] tdone, int [] ends){
        S173896=1;
    S173830=0;
    thread209342(tdone,ends);
    thread209343(tdone,ends);
    int biggest209344 = 0;
    if(ends[18]>=biggest209344){
      biggest209344=ends[18];
    }
    if(ends[19]>=biggest209344){
      biggest209344=ends[19];
    }
    if(biggest209344 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread209339(int [] tdone, int [] ends){
        S173729=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      fR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(fR_1);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      S173729=0;
      active[16]=0;
      ends[16]=0;
      tdone[16]=1;
    }
  }

  public void thread209338(int [] tdone, int [] ends){
        S173723=1;
    S173722=0;
    S173706=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173706=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S173701=0;
      if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        fillerReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173701=1;
        if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[15]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173722=1;
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
      else {
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
  }

  public void thread209337(int [] tdone, int [] ends){
        S173797=1;
    S173731=0;
    thread209338(tdone,ends);
    thread209339(tdone,ends);
    int biggest209340 = 0;
    if(ends[15]>=biggest209340){
      biggest209340=ends[15];
    }
    if(ends[16]>=biggest209340){
      biggest209340=ends[16];
    }
    if(biggest209340 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread209335(int [] tdone, int [] ends){
        S173630=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cvR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cvR_1);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S173630=0;
      active[13]=0;
      ends[13]=0;
      tdone[13]=1;
    }
  }

  public void thread209334(int [] tdone, int [] ends){
        S173624=1;
    S173623=0;
    S173607=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173607=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S173602=0;
      if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        convReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173602=1;
        if(convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[12]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173623=1;
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
      }
      else {
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread209333(int [] tdone, int [] ends){
        S173698=1;
    S173632=0;
    thread209334(tdone,ends);
    thread209335(tdone,ends);
    int biggest209336 = 0;
    if(ends[12]>=biggest209336){
      biggest209336=ends[12];
    }
    if(ends[13]>=biggest209336){
      biggest209336=ends[13];
    }
    if(biggest209336 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread209332(int [] tdone, int [] ends){
        S173997=1;
    thread209333(tdone,ends);
    thread209337(tdone,ends);
    thread209341(tdone,ends);
    thread209345(tdone,ends);
    int biggest209349 = 0;
    if(ends[11]>=biggest209349){
      biggest209349=ends[11];
    }
    if(ends[14]>=biggest209349){
      biggest209349=ends[14];
    }
    if(ends[17]>=biggest209349){
      biggest209349=ends[17];
    }
    if(ends[20]>=biggest209349){
      biggest209349=ends[20];
    }
    if(biggest209349 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209349 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209349 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209349 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread209330(int [] tdone, int [] ends){
        S170363=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread209329(int [] tdone, int [] ends){
        S170360=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread209328(int [] tdone, int [] ends){
        S170357=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread209327(int [] tdone, int [] ends){
        S170354=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread209326(int [] tdone, int [] ends){
        S170351=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread209325(int [] tdone, int [] ends){
        S173599=1;
    S170364=0;
    thread209326(tdone,ends);
    thread209327(tdone,ends);
    thread209328(tdone,ends);
    thread209329(tdone,ends);
    thread209330(tdone,ends);
    int biggest209331 = 0;
    if(ends[3]>=biggest209331){
      biggest209331=ends[3];
    }
    if(ends[4]>=biggest209331){
      biggest209331=ends[4];
    }
    if(ends[5]>=biggest209331){
      biggest209331=ends[5];
    }
    if(ends[6]>=biggest209331){
      biggest209331=ends[6];
    }
    if(ends[7]>=biggest209331){
      biggest209331=ends[7];
    }
    if(biggest209331 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void thread209322(int [] tdone, int [] ends){
        S174209=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread209321(int [] tdone, int [] ends){
        S174206=1;
    bottleAtPos1E.setPresent();//sysj\rotary.sysj line: 233, column: 23
    currsigs.addElement(bottleAtPos1E);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread209320(int [] tdone, int [] ends){
        S174239=1;
    S174213=0;
    if(bottleAtPos1_1.getprestatus()){//sysj\rotary.sysj line: 231, column: 21
      thread209321(tdone,ends);
      thread209322(tdone,ends);
      int biggest209323 = 0;
      if(ends[29]>=biggest209323){
        biggest209323=ends[29];
      }
      if(ends[30]>=biggest209323){
        biggest209323=ends[30];
      }
      if(biggest209323 == 1){
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
      }
    }
    else {
      S174213=1;
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread209319(int [] tdone, int [] ends){
        S174201=1;
    S174145=0;
    S174125=0;
    if(!checkOne_in.isPartnerPresent() || checkOne_in.isPartnerPreempted()){//sysj\rotary.sysj line: 216, column: 7
      checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
      S174125=1;
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      S174120=0;
      if(!checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
        checkOne_in.setACK(true);//sysj\rotary.sysj line: 216, column: 7
        S174120=1;
        if(checkOne_in.isREQ()){//sysj\rotary.sysj line: 216, column: 7
          checkOne_in.setACK(false);//sysj\rotary.sysj line: 216, column: 7
          ends[27]=2;
          ;//sysj\rotary.sysj line: 216, column: 7
          if((Boolean)(checkOne_in.getVal() == null ? null : ((Boolean)checkOne_in.getVal()))){//sysj\rotary.sysj line: 217, column: 10
            bottleAtPos1_1.setPresent();//sysj\rotary.sysj line: 218, column: 8
            currsigs.addElement(bottleAtPos1_1);
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
          else {
            S174145=1;
            active[27]=1;
            ends[27]=1;
            tdone[27]=1;
          }
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
      }
      else {
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
      }
    }
  }

  public void thread209317(int [] tdone, int [] ends){
        S174088=1;
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread209316(int [] tdone, int [] ends){
        S174085=1;
    bottleAtPos5E.setPresent();//sysj\rotary.sysj line: 196, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread209315(int [] tdone, int [] ends){
        S174118=1;
    S174092=0;
    if(bottleAtPos5_1.getprestatus()){//sysj\rotary.sysj line: 194, column: 21
      thread209316(tdone,ends);
      thread209317(tdone,ends);
      int biggest209318 = 0;
      if(ends[25]>=biggest209318){
        biggest209318=ends[25];
      }
      if(ends[26]>=biggest209318){
        biggest209318=ends[26];
      }
      if(biggest209318 == 1){
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
      }
    }
    else {
      S174092=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread209314(int [] tdone, int [] ends){
        S174080=1;
    S174024=0;
    S174004=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\rotary.sysj line: 178, column: 7
      checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
      S174004=1;
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      S173999=0;
      if(!checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
        checkFive_in.setACK(true);//sysj\rotary.sysj line: 178, column: 7
        S173999=1;
        if(checkFive_in.isREQ()){//sysj\rotary.sysj line: 178, column: 7
          checkFive_in.setACK(false);//sysj\rotary.sysj line: 178, column: 7
          ends[23]=2;
          ;//sysj\rotary.sysj line: 178, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\rotary.sysj line: 179, column: 10
            bottleAtPos5_1.setPresent();//sysj\rotary.sysj line: 180, column: 8
            currsigs.addElement(bottleAtPos5_1);
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
          else {
            S174024=1;
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
      }
      else {
        active[23]=1;
        ends[23]=1;
        tdone[23]=1;
      }
    }
  }

  public void thread209311(int [] tdone, int [] ends){
        S173927=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      lR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(lR_1);
      active[22]=1;
      ends[22]=1;
      tdone[22]=1;
    }
    else {
      S173927=0;
      active[22]=0;
      ends[22]=0;
      tdone[22]=1;
    }
  }

  public void thread209310(int [] tdone, int [] ends){
        S173921=1;
    S173920=0;
    S173904=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173904=1;
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      S173899=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173899=1;
        if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[21]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173920=1;
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
      }
      else {
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
      }
    }
  }

  public void thread209309(int [] tdone, int [] ends){
        S173995=1;
    S173929=0;
    thread209310(tdone,ends);
    thread209311(tdone,ends);
    int biggest209312 = 0;
    if(ends[21]>=biggest209312){
      biggest209312=ends[21];
    }
    if(ends[22]>=biggest209312){
      biggest209312=ends[22];
    }
    if(biggest209312 == 1){
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread209307(int [] tdone, int [] ends){
        S173828=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cR_1);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S173828=0;
      active[19]=0;
      ends[19]=0;
      tdone[19]=1;
    }
  }

  public void thread209306(int [] tdone, int [] ends){
        S173822=1;
    S173821=0;
    S173805=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173805=1;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      S173800=0;
      if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        capperReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173800=1;
        if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          capperReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[18]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173821=1;
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
      }
      else {
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
    }
  }

  public void thread209305(int [] tdone, int [] ends){
        S173896=1;
    S173830=0;
    thread209306(tdone,ends);
    thread209307(tdone,ends);
    int biggest209308 = 0;
    if(ends[18]>=biggest209308){
      biggest209308=ends[18];
    }
    if(ends[19]>=biggest209308){
      biggest209308=ends[19];
    }
    if(biggest209308 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread209303(int [] tdone, int [] ends){
        S173729=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      fR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(fR_1);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      S173729=0;
      active[16]=0;
      ends[16]=0;
      tdone[16]=1;
    }
  }

  public void thread209302(int [] tdone, int [] ends){
        S173723=1;
    S173722=0;
    S173706=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173706=1;
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S173701=0;
      if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        fillerReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173701=1;
        if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          fillerReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[15]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173722=1;
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
      }
      else {
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
      }
    }
  }

  public void thread209301(int [] tdone, int [] ends){
        S173797=1;
    S173731=0;
    thread209302(tdone,ends);
    thread209303(tdone,ends);
    int biggest209304 = 0;
    if(ends[15]>=biggest209304){
      biggest209304=ends[15];
    }
    if(ends[16]>=biggest209304){
      biggest209304=ends[16];
    }
    if(biggest209304 == 1){
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread209299(int [] tdone, int [] ends){
        S173630=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\rotary.sysj line: 9, column: 9
      cvR_1.setPresent();//sysj\rotary.sysj line: 9, column: 20
      currsigs.addElement(cvR_1);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      S173630=0;
      active[13]=0;
      ends[13]=0;
      tdone[13]=1;
    }
  }

  public void thread209298(int [] tdone, int [] ends){
        S173624=1;
    S173623=0;
    S173607=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 7, column: 5
      convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
      S173607=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      S173602=0;
      if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
        convReady_in.setACK(true);//sysj\rotary.sysj line: 7, column: 5
        S173602=1;
        if(convReady_in.isREQ()){//sysj\rotary.sysj line: 7, column: 5
          convReady_in.setACK(false);//sysj\rotary.sysj line: 7, column: 5
          ends[12]=2;
          ;//sysj\rotary.sysj line: 7, column: 5
          S173623=1;
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
      }
      else {
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
  }

  public void thread209297(int [] tdone, int [] ends){
        S173698=1;
    S173632=0;
    thread209298(tdone,ends);
    thread209299(tdone,ends);
    int biggest209300 = 0;
    if(ends[12]>=biggest209300){
      biggest209300=ends[12];
    }
    if(ends[13]>=biggest209300){
      biggest209300=ends[13];
    }
    if(biggest209300 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread209296(int [] tdone, int [] ends){
        S173997=1;
    thread209297(tdone,ends);
    thread209301(tdone,ends);
    thread209305(tdone,ends);
    thread209309(tdone,ends);
    int biggest209313 = 0;
    if(ends[11]>=biggest209313){
      biggest209313=ends[11];
    }
    if(ends[14]>=biggest209313){
      biggest209313=ends[14];
    }
    if(ends[17]>=biggest209313){
      biggest209313=ends[17];
    }
    if(ends[20]>=biggest209313){
      biggest209313=ends[20];
    }
    if(biggest209313 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209313 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209313 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    if(biggest209313 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread209294(int [] tdone, int [] ends){
        S170363=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread209293(int [] tdone, int [] ends){
        S170360=1;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread209292(int [] tdone, int [] ends){
        S170357=1;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread209291(int [] tdone, int [] ends){
        S170354=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread209290(int [] tdone, int [] ends){
        S170351=1;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread209289(int [] tdone, int [] ends){
        S173599=1;
    S170364=0;
    thread209290(tdone,ends);
    thread209291(tdone,ends);
    thread209292(tdone,ends);
    thread209293(tdone,ends);
    thread209294(tdone,ends);
    int biggest209295 = 0;
    if(ends[3]>=biggest209295){
      biggest209295=ends[3];
    }
    if(ends[4]>=biggest209295){
      biggest209295=ends[4];
    }
    if(ends[5]>=biggest209295){
      biggest209295=ends[5];
    }
    if(ends[6]>=biggest209295){
      biggest209295=ends[6];
    }
    if(ends[7]>=biggest209295){
      biggest209295=ends[7];
    }
    if(biggest209295 == 1){
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S209259){
        case 0 : 
          S209259=0;
          break RUN;
        
        case 1 : 
          S209259=2;
          S209259=2;
          cvR_1.setClear();//sysj\rotary.sysj line: 86, column: 7
          fR_1.setClear();//sysj\rotary.sysj line: 86, column: 7
          cR_1.setClear();//sysj\rotary.sysj line: 86, column: 7
          lR_1.setClear();//sysj\rotary.sysj line: 86, column: 7
          bottleAtPos5_1.setClear();//sysj\rotary.sysj line: 87, column: 7
          bottleAtPos1_1.setClear();//sysj\rotary.sysj line: 87, column: 7
          S170040=0;
          S169936=0;
          if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 88, column: 7
            convReady_in.setACK(false);//sysj\rotary.sysj line: 88, column: 7
            S169936=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S169931=0;
            if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 88, column: 7
              convReady_in.setACK(true);//sysj\rotary.sysj line: 88, column: 7
              S169931=1;
              if(convReady_in.isREQ()){//sysj\rotary.sysj line: 88, column: 7
                convReady_in.setACK(false);//sysj\rotary.sysj line: 88, column: 7
                ends[1]=2;
                ;//sysj\rotary.sysj line: 88, column: 7
                S170040=1;
                S169958=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 89, column: 7
                  fillerReady_in.setACK(false);//sysj\rotary.sysj line: 89, column: 7
                  S169958=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S169953=0;
                  if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 89, column: 7
                    fillerReady_in.setACK(true);//sysj\rotary.sysj line: 89, column: 7
                    S169953=1;
                    if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 89, column: 7
                      fillerReady_in.setACK(false);//sysj\rotary.sysj line: 89, column: 7
                      ends[1]=2;
                      ;//sysj\rotary.sysj line: 89, column: 7
                      S170040=2;
                      S170047=0;
                      if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 90, column: 7
                        capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                        S170047=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S170042=0;
                        if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                          capperReady_in.setACK(true);//sysj\rotary.sysj line: 90, column: 7
                          S170042=1;
                          if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                            capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                            ends[1]=2;
                            ;//sysj\rotary.sysj line: 90, column: 7
                            S170040=3;
                            S170179=0;
                            if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 91, column: 7
                              lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                              S170179=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S170174=0;
                              if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                                lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 91, column: 7
                                S170174=1;
                                if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                                  lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                                  ends[1]=2;
                                  ;//sysj\rotary.sysj line: 91, column: 7
                                  S170040=4;
                                  thread209289(tdone,ends);
                                  thread209296(tdone,ends);
                                  thread209314(tdone,ends);
                                  thread209315(tdone,ends);
                                  thread209319(tdone,ends);
                                  thread209320(tdone,ends);
                                  int biggest209324 = 0;
                                  if(ends[2]>=biggest209324){
                                    biggest209324=ends[2];
                                  }
                                  if(ends[10]>=biggest209324){
                                    biggest209324=ends[10];
                                  }
                                  if(ends[23]>=biggest209324){
                                    biggest209324=ends[23];
                                  }
                                  if(ends[24]>=biggest209324){
                                    biggest209324=ends[24];
                                  }
                                  if(ends[27]>=biggest209324){
                                    biggest209324=ends[27];
                                  }
                                  if(ends[28]>=biggest209324){
                                    biggest209324=ends[28];
                                  }
                                  if(biggest209324 == 1){
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
          cvR_1.setClear();//sysj\rotary.sysj line: 86, column: 7
          fR_1.setClear();//sysj\rotary.sysj line: 86, column: 7
          cR_1.setClear();//sysj\rotary.sysj line: 86, column: 7
          lR_1.setClear();//sysj\rotary.sysj line: 86, column: 7
          bottleAtPos5_1.setClear();//sysj\rotary.sysj line: 87, column: 7
          bottleAtPos1_1.setClear();//sysj\rotary.sysj line: 87, column: 7
          switch(S170040){
            case 0 : 
              switch(S169936){
                case 0 : 
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 88, column: 7
                    convReady_in.setACK(false);//sysj\rotary.sysj line: 88, column: 7
                    S169936=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S169931){
                      case 0 : 
                        if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 88, column: 7
                          convReady_in.setACK(true);//sysj\rotary.sysj line: 88, column: 7
                          S169931=1;
                          if(convReady_in.isREQ()){//sysj\rotary.sysj line: 88, column: 7
                            convReady_in.setACK(false);//sysj\rotary.sysj line: 88, column: 7
                            ends[1]=2;
                            ;//sysj\rotary.sysj line: 88, column: 7
                            S170040=1;
                            S169958=0;
                            if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 89, column: 7
                              fillerReady_in.setACK(false);//sysj\rotary.sysj line: 89, column: 7
                              S169958=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S169953=0;
                              if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 89, column: 7
                                fillerReady_in.setACK(true);//sysj\rotary.sysj line: 89, column: 7
                                S169953=1;
                                if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 89, column: 7
                                  fillerReady_in.setACK(false);//sysj\rotary.sysj line: 89, column: 7
                                  ends[1]=2;
                                  ;//sysj\rotary.sysj line: 89, column: 7
                                  S170040=2;
                                  S170047=0;
                                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 90, column: 7
                                    capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                                    S170047=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S170042=0;
                                    if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                                      capperReady_in.setACK(true);//sysj\rotary.sysj line: 90, column: 7
                                      S170042=1;
                                      if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                                        capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                                        ends[1]=2;
                                        ;//sysj\rotary.sysj line: 90, column: 7
                                        S170040=3;
                                        S170179=0;
                                        if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 91, column: 7
                                          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                                          S170179=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S170174=0;
                                          if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                                            lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 91, column: 7
                                            S170174=1;
                                            if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                                              lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                                              ends[1]=2;
                                              ;//sysj\rotary.sysj line: 91, column: 7
                                              S170040=4;
                                              thread209325(tdone,ends);
                                              thread209332(tdone,ends);
                                              thread209350(tdone,ends);
                                              thread209351(tdone,ends);
                                              thread209355(tdone,ends);
                                              thread209356(tdone,ends);
                                              int biggest209360 = 0;
                                              if(ends[2]>=biggest209360){
                                                biggest209360=ends[2];
                                              }
                                              if(ends[10]>=biggest209360){
                                                biggest209360=ends[10];
                                              }
                                              if(ends[23]>=biggest209360){
                                                biggest209360=ends[23];
                                              }
                                              if(ends[24]>=biggest209360){
                                                biggest209360=ends[24];
                                              }
                                              if(ends[27]>=biggest209360){
                                                biggest209360=ends[27];
                                              }
                                              if(ends[28]>=biggest209360){
                                                biggest209360=ends[28];
                                              }
                                              if(biggest209360 == 1){
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
                        if(convReady_in.isREQ()){//sysj\rotary.sysj line: 88, column: 7
                          convReady_in.setACK(false);//sysj\rotary.sysj line: 88, column: 7
                          ends[1]=2;
                          ;//sysj\rotary.sysj line: 88, column: 7
                          S170040=1;
                          S169958=0;
                          if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 89, column: 7
                            fillerReady_in.setACK(false);//sysj\rotary.sysj line: 89, column: 7
                            S169958=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S169953=0;
                            if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 89, column: 7
                              fillerReady_in.setACK(true);//sysj\rotary.sysj line: 89, column: 7
                              S169953=1;
                              if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 89, column: 7
                                fillerReady_in.setACK(false);//sysj\rotary.sysj line: 89, column: 7
                                ends[1]=2;
                                ;//sysj\rotary.sysj line: 89, column: 7
                                S170040=2;
                                S170047=0;
                                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 90, column: 7
                                  capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                                  S170047=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S170042=0;
                                  if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                                    capperReady_in.setACK(true);//sysj\rotary.sysj line: 90, column: 7
                                    S170042=1;
                                    if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                                      capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                                      ends[1]=2;
                                      ;//sysj\rotary.sysj line: 90, column: 7
                                      S170040=3;
                                      S170179=0;
                                      if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 91, column: 7
                                        lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                                        S170179=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S170174=0;
                                        if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                                          lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 91, column: 7
                                          S170174=1;
                                          if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                                            lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                                            ends[1]=2;
                                            ;//sysj\rotary.sysj line: 91, column: 7
                                            S170040=4;
                                            thread209361(tdone,ends);
                                            thread209368(tdone,ends);
                                            thread209386(tdone,ends);
                                            thread209387(tdone,ends);
                                            thread209391(tdone,ends);
                                            thread209392(tdone,ends);
                                            int biggest209396 = 0;
                                            if(ends[2]>=biggest209396){
                                              biggest209396=ends[2];
                                            }
                                            if(ends[10]>=biggest209396){
                                              biggest209396=ends[10];
                                            }
                                            if(ends[23]>=biggest209396){
                                              biggest209396=ends[23];
                                            }
                                            if(ends[24]>=biggest209396){
                                              biggest209396=ends[24];
                                            }
                                            if(ends[27]>=biggest209396){
                                              biggest209396=ends[27];
                                            }
                                            if(ends[28]>=biggest209396){
                                              biggest209396=ends[28];
                                            }
                                            if(biggest209396 == 1){
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
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S169936=1;
                  S169936=0;
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 88, column: 7
                    convReady_in.setACK(false);//sysj\rotary.sysj line: 88, column: 7
                    S169936=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S169931=0;
                    if(!convReady_in.isREQ()){//sysj\rotary.sysj line: 88, column: 7
                      convReady_in.setACK(true);//sysj\rotary.sysj line: 88, column: 7
                      S169931=1;
                      if(convReady_in.isREQ()){//sysj\rotary.sysj line: 88, column: 7
                        convReady_in.setACK(false);//sysj\rotary.sysj line: 88, column: 7
                        ends[1]=2;
                        ;//sysj\rotary.sysj line: 88, column: 7
                        S170040=1;
                        S169958=0;
                        if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 89, column: 7
                          fillerReady_in.setACK(false);//sysj\rotary.sysj line: 89, column: 7
                          S169958=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S169953=0;
                          if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 89, column: 7
                            fillerReady_in.setACK(true);//sysj\rotary.sysj line: 89, column: 7
                            S169953=1;
                            if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 89, column: 7
                              fillerReady_in.setACK(false);//sysj\rotary.sysj line: 89, column: 7
                              ends[1]=2;
                              ;//sysj\rotary.sysj line: 89, column: 7
                              S170040=2;
                              S170047=0;
                              if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 90, column: 7
                                capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                                S170047=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S170042=0;
                                if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                                  capperReady_in.setACK(true);//sysj\rotary.sysj line: 90, column: 7
                                  S170042=1;
                                  if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                                    capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                                    ends[1]=2;
                                    ;//sysj\rotary.sysj line: 90, column: 7
                                    S170040=3;
                                    S170179=0;
                                    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 91, column: 7
                                      lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                                      S170179=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S170174=0;
                                      if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                                        lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 91, column: 7
                                        S170174=1;
                                        if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                                          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                                          ends[1]=2;
                                          ;//sysj\rotary.sysj line: 91, column: 7
                                          S170040=4;
                                          thread209397(tdone,ends);
                                          thread209404(tdone,ends);
                                          thread209422(tdone,ends);
                                          thread209423(tdone,ends);
                                          thread209427(tdone,ends);
                                          thread209428(tdone,ends);
                                          int biggest209432 = 0;
                                          if(ends[2]>=biggest209432){
                                            biggest209432=ends[2];
                                          }
                                          if(ends[10]>=biggest209432){
                                            biggest209432=ends[10];
                                          }
                                          if(ends[23]>=biggest209432){
                                            biggest209432=ends[23];
                                          }
                                          if(ends[24]>=biggest209432){
                                            biggest209432=ends[24];
                                          }
                                          if(ends[27]>=biggest209432){
                                            biggest209432=ends[27];
                                          }
                                          if(ends[28]>=biggest209432){
                                            biggest209432=ends[28];
                                          }
                                          if(biggest209432 == 1){
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
              switch(S169958){
                case 0 : 
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 89, column: 7
                    fillerReady_in.setACK(false);//sysj\rotary.sysj line: 89, column: 7
                    S169958=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S169953){
                      case 0 : 
                        if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 89, column: 7
                          fillerReady_in.setACK(true);//sysj\rotary.sysj line: 89, column: 7
                          S169953=1;
                          if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 89, column: 7
                            fillerReady_in.setACK(false);//sysj\rotary.sysj line: 89, column: 7
                            ends[1]=2;
                            ;//sysj\rotary.sysj line: 89, column: 7
                            S170040=2;
                            S170047=0;
                            if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 90, column: 7
                              capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                              S170047=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S170042=0;
                              if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                                capperReady_in.setACK(true);//sysj\rotary.sysj line: 90, column: 7
                                S170042=1;
                                if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                                  capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                                  ends[1]=2;
                                  ;//sysj\rotary.sysj line: 90, column: 7
                                  S170040=3;
                                  S170179=0;
                                  if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 91, column: 7
                                    lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                                    S170179=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S170174=0;
                                    if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                                      lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 91, column: 7
                                      S170174=1;
                                      if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                                        lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                                        ends[1]=2;
                                        ;//sysj\rotary.sysj line: 91, column: 7
                                        S170040=4;
                                        thread209433(tdone,ends);
                                        thread209440(tdone,ends);
                                        thread209458(tdone,ends);
                                        thread209459(tdone,ends);
                                        thread209463(tdone,ends);
                                        thread209464(tdone,ends);
                                        int biggest209468 = 0;
                                        if(ends[2]>=biggest209468){
                                          biggest209468=ends[2];
                                        }
                                        if(ends[10]>=biggest209468){
                                          biggest209468=ends[10];
                                        }
                                        if(ends[23]>=biggest209468){
                                          biggest209468=ends[23];
                                        }
                                        if(ends[24]>=biggest209468){
                                          biggest209468=ends[24];
                                        }
                                        if(ends[27]>=biggest209468){
                                          biggest209468=ends[27];
                                        }
                                        if(ends[28]>=biggest209468){
                                          biggest209468=ends[28];
                                        }
                                        if(biggest209468 == 1){
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
                        if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 89, column: 7
                          fillerReady_in.setACK(false);//sysj\rotary.sysj line: 89, column: 7
                          ends[1]=2;
                          ;//sysj\rotary.sysj line: 89, column: 7
                          S170040=2;
                          S170047=0;
                          if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 90, column: 7
                            capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                            S170047=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S170042=0;
                            if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                              capperReady_in.setACK(true);//sysj\rotary.sysj line: 90, column: 7
                              S170042=1;
                              if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                                capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                                ends[1]=2;
                                ;//sysj\rotary.sysj line: 90, column: 7
                                S170040=3;
                                S170179=0;
                                if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 91, column: 7
                                  lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                                  S170179=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S170174=0;
                                  if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                                    lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 91, column: 7
                                    S170174=1;
                                    if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                                      lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                                      ends[1]=2;
                                      ;//sysj\rotary.sysj line: 91, column: 7
                                      S170040=4;
                                      thread209469(tdone,ends);
                                      thread209476(tdone,ends);
                                      thread209494(tdone,ends);
                                      thread209495(tdone,ends);
                                      thread209499(tdone,ends);
                                      thread209500(tdone,ends);
                                      int biggest209504 = 0;
                                      if(ends[2]>=biggest209504){
                                        biggest209504=ends[2];
                                      }
                                      if(ends[10]>=biggest209504){
                                        biggest209504=ends[10];
                                      }
                                      if(ends[23]>=biggest209504){
                                        biggest209504=ends[23];
                                      }
                                      if(ends[24]>=biggest209504){
                                        biggest209504=ends[24];
                                      }
                                      if(ends[27]>=biggest209504){
                                        biggest209504=ends[27];
                                      }
                                      if(ends[28]>=biggest209504){
                                        biggest209504=ends[28];
                                      }
                                      if(biggest209504 == 1){
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
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S169958=1;
                  S169958=0;
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 89, column: 7
                    fillerReady_in.setACK(false);//sysj\rotary.sysj line: 89, column: 7
                    S169958=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S169953=0;
                    if(!fillerReady_in.isREQ()){//sysj\rotary.sysj line: 89, column: 7
                      fillerReady_in.setACK(true);//sysj\rotary.sysj line: 89, column: 7
                      S169953=1;
                      if(fillerReady_in.isREQ()){//sysj\rotary.sysj line: 89, column: 7
                        fillerReady_in.setACK(false);//sysj\rotary.sysj line: 89, column: 7
                        ends[1]=2;
                        ;//sysj\rotary.sysj line: 89, column: 7
                        S170040=2;
                        S170047=0;
                        if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 90, column: 7
                          capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                          S170047=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S170042=0;
                          if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                            capperReady_in.setACK(true);//sysj\rotary.sysj line: 90, column: 7
                            S170042=1;
                            if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                              capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                              ends[1]=2;
                              ;//sysj\rotary.sysj line: 90, column: 7
                              S170040=3;
                              S170179=0;
                              if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 91, column: 7
                                lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                                S170179=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S170174=0;
                                if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                                  lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 91, column: 7
                                  S170174=1;
                                  if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                                    lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                                    ends[1]=2;
                                    ;//sysj\rotary.sysj line: 91, column: 7
                                    S170040=4;
                                    thread209505(tdone,ends);
                                    thread209512(tdone,ends);
                                    thread209530(tdone,ends);
                                    thread209531(tdone,ends);
                                    thread209535(tdone,ends);
                                    thread209536(tdone,ends);
                                    int biggest209540 = 0;
                                    if(ends[2]>=biggest209540){
                                      biggest209540=ends[2];
                                    }
                                    if(ends[10]>=biggest209540){
                                      biggest209540=ends[10];
                                    }
                                    if(ends[23]>=biggest209540){
                                      biggest209540=ends[23];
                                    }
                                    if(ends[24]>=biggest209540){
                                      biggest209540=ends[24];
                                    }
                                    if(ends[27]>=biggest209540){
                                      biggest209540=ends[27];
                                    }
                                    if(ends[28]>=biggest209540){
                                      biggest209540=ends[28];
                                    }
                                    if(biggest209540 == 1){
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
            
            case 2 : 
              switch(S170047){
                case 0 : 
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 90, column: 7
                    capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                    S170047=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S170042){
                      case 0 : 
                        if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                          capperReady_in.setACK(true);//sysj\rotary.sysj line: 90, column: 7
                          S170042=1;
                          if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                            capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                            ends[1]=2;
                            ;//sysj\rotary.sysj line: 90, column: 7
                            S170040=3;
                            S170179=0;
                            if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 91, column: 7
                              lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                              S170179=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S170174=0;
                              if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                                lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 91, column: 7
                                S170174=1;
                                if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                                  lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                                  ends[1]=2;
                                  ;//sysj\rotary.sysj line: 91, column: 7
                                  S170040=4;
                                  thread209541(tdone,ends);
                                  thread209548(tdone,ends);
                                  thread209566(tdone,ends);
                                  thread209567(tdone,ends);
                                  thread209571(tdone,ends);
                                  thread209572(tdone,ends);
                                  int biggest209576 = 0;
                                  if(ends[2]>=biggest209576){
                                    biggest209576=ends[2];
                                  }
                                  if(ends[10]>=biggest209576){
                                    biggest209576=ends[10];
                                  }
                                  if(ends[23]>=biggest209576){
                                    biggest209576=ends[23];
                                  }
                                  if(ends[24]>=biggest209576){
                                    biggest209576=ends[24];
                                  }
                                  if(ends[27]>=biggest209576){
                                    biggest209576=ends[27];
                                  }
                                  if(ends[28]>=biggest209576){
                                    biggest209576=ends[28];
                                  }
                                  if(biggest209576 == 1){
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
                        if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                          capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                          ends[1]=2;
                          ;//sysj\rotary.sysj line: 90, column: 7
                          S170040=3;
                          S170179=0;
                          if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 91, column: 7
                            lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                            S170179=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S170174=0;
                            if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                              lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 91, column: 7
                              S170174=1;
                              if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                                lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                                ends[1]=2;
                                ;//sysj\rotary.sysj line: 91, column: 7
                                S170040=4;
                                thread209577(tdone,ends);
                                thread209584(tdone,ends);
                                thread209602(tdone,ends);
                                thread209603(tdone,ends);
                                thread209607(tdone,ends);
                                thread209608(tdone,ends);
                                int biggest209612 = 0;
                                if(ends[2]>=biggest209612){
                                  biggest209612=ends[2];
                                }
                                if(ends[10]>=biggest209612){
                                  biggest209612=ends[10];
                                }
                                if(ends[23]>=biggest209612){
                                  biggest209612=ends[23];
                                }
                                if(ends[24]>=biggest209612){
                                  biggest209612=ends[24];
                                }
                                if(ends[27]>=biggest209612){
                                  biggest209612=ends[27];
                                }
                                if(ends[28]>=biggest209612){
                                  biggest209612=ends[28];
                                }
                                if(biggest209612 == 1){
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
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S170047=1;
                  S170047=0;
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 90, column: 7
                    capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                    S170047=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S170042=0;
                    if(!capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                      capperReady_in.setACK(true);//sysj\rotary.sysj line: 90, column: 7
                      S170042=1;
                      if(capperReady_in.isREQ()){//sysj\rotary.sysj line: 90, column: 7
                        capperReady_in.setACK(false);//sysj\rotary.sysj line: 90, column: 7
                        ends[1]=2;
                        ;//sysj\rotary.sysj line: 90, column: 7
                        S170040=3;
                        S170179=0;
                        if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 91, column: 7
                          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                          S170179=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S170174=0;
                          if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                            lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 91, column: 7
                            S170174=1;
                            if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                              lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                              ends[1]=2;
                              ;//sysj\rotary.sysj line: 91, column: 7
                              S170040=4;
                              thread209613(tdone,ends);
                              thread209620(tdone,ends);
                              thread209638(tdone,ends);
                              thread209639(tdone,ends);
                              thread209643(tdone,ends);
                              thread209644(tdone,ends);
                              int biggest209648 = 0;
                              if(ends[2]>=biggest209648){
                                biggest209648=ends[2];
                              }
                              if(ends[10]>=biggest209648){
                                biggest209648=ends[10];
                              }
                              if(ends[23]>=biggest209648){
                                biggest209648=ends[23];
                              }
                              if(ends[24]>=biggest209648){
                                biggest209648=ends[24];
                              }
                              if(ends[27]>=biggest209648){
                                biggest209648=ends[27];
                              }
                              if(ends[28]>=biggest209648){
                                biggest209648=ends[28];
                              }
                              if(biggest209648 == 1){
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
            
            case 3 : 
              switch(S170179){
                case 0 : 
                  if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 91, column: 7
                    lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                    S170179=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S170174){
                      case 0 : 
                        if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                          lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 91, column: 7
                          S170174=1;
                          if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                            lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                            ends[1]=2;
                            ;//sysj\rotary.sysj line: 91, column: 7
                            S170040=4;
                            thread209649(tdone,ends);
                            thread209656(tdone,ends);
                            thread209674(tdone,ends);
                            thread209675(tdone,ends);
                            thread209679(tdone,ends);
                            thread209680(tdone,ends);
                            int biggest209684 = 0;
                            if(ends[2]>=biggest209684){
                              biggest209684=ends[2];
                            }
                            if(ends[10]>=biggest209684){
                              biggest209684=ends[10];
                            }
                            if(ends[23]>=biggest209684){
                              biggest209684=ends[23];
                            }
                            if(ends[24]>=biggest209684){
                              biggest209684=ends[24];
                            }
                            if(ends[27]>=biggest209684){
                              biggest209684=ends[27];
                            }
                            if(ends[28]>=biggest209684){
                              biggest209684=ends[28];
                            }
                            if(biggest209684 == 1){
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
                        if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                          lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                          ends[1]=2;
                          ;//sysj\rotary.sysj line: 91, column: 7
                          S170040=4;
                          thread209685(tdone,ends);
                          thread209692(tdone,ends);
                          thread209710(tdone,ends);
                          thread209711(tdone,ends);
                          thread209715(tdone,ends);
                          thread209716(tdone,ends);
                          int biggest209720 = 0;
                          if(ends[2]>=biggest209720){
                            biggest209720=ends[2];
                          }
                          if(ends[10]>=biggest209720){
                            biggest209720=ends[10];
                          }
                          if(ends[23]>=biggest209720){
                            biggest209720=ends[23];
                          }
                          if(ends[24]>=biggest209720){
                            biggest209720=ends[24];
                          }
                          if(ends[27]>=biggest209720){
                            biggest209720=ends[27];
                          }
                          if(ends[28]>=biggest209720){
                            biggest209720=ends[28];
                          }
                          if(biggest209720 == 1){
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
                  S170179=1;
                  S170179=0;
                  if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\rotary.sysj line: 91, column: 7
                    lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                    S170179=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S170174=0;
                    if(!lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                      lidLoaderReady_in.setACK(true);//sysj\rotary.sysj line: 91, column: 7
                      S170174=1;
                      if(lidLoaderReady_in.isREQ()){//sysj\rotary.sysj line: 91, column: 7
                        lidLoaderReady_in.setACK(false);//sysj\rotary.sysj line: 91, column: 7
                        ends[1]=2;
                        ;//sysj\rotary.sysj line: 91, column: 7
                        S170040=4;
                        thread209721(tdone,ends);
                        thread209728(tdone,ends);
                        thread209746(tdone,ends);
                        thread209747(tdone,ends);
                        thread209751(tdone,ends);
                        thread209752(tdone,ends);
                        int biggest209756 = 0;
                        if(ends[2]>=biggest209756){
                          biggest209756=ends[2];
                        }
                        if(ends[10]>=biggest209756){
                          biggest209756=ends[10];
                        }
                        if(ends[23]>=biggest209756){
                          biggest209756=ends[23];
                        }
                        if(ends[24]>=biggest209756){
                          biggest209756=ends[24];
                        }
                        if(ends[27]>=biggest209756){
                          biggest209756=ends[27];
                        }
                        if(ends[28]>=biggest209756){
                          biggest209756=ends[28];
                        }
                        if(biggest209756 == 1){
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
            
            case 4 : 
              thread209757(tdone,ends);
              thread209803(tdone,ends);
              thread209833(tdone,ends);
              thread209834(tdone,ends);
              thread209841(tdone,ends);
              thread209842(tdone,ends);
              int biggest209849 = 0;
              if(ends[2]>=biggest209849){
                biggest209849=ends[2];
              }
              if(ends[10]>=biggest209849){
                biggest209849=ends[10];
              }
              if(ends[23]>=biggest209849){
                biggest209849=ends[23];
              }
              if(ends[24]>=biggest209849){
                biggest209849=ends[24];
              }
              if(ends[27]>=biggest209849){
                biggest209849=ends[27];
              }
              if(ends[28]>=biggest209849){
                biggest209849=ends[28];
              }
              if(biggest209849 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest209849 == 0){
                S209259=0;
                active[1]=0;
                ends[1]=0;
                S209259=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    cvR_1 = new Signal();
    fR_1 = new Signal();
    cR_1 = new Signal();
    lR_1 = new Signal();
    bottleAtPos5_1 = new Signal();
    bottleAtPos1_1 = new Signal();
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
          convReady_in.gethook();
          fillerReady_in.gethook();
          capperReady_in.gethook();
          lidLoaderReady_in.gethook();
          checkFive_in.gethook();
          checkOne_in.gethook();
          rotated_o.gethook();
          tableAlignedWithSensor.gethook();
          capOnBottleAtPos1.gethook();
          ReadySmoke.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      capOnBottleAtPos1.setpreclear();
      ReadySmoke.setpreclear();
      rotaryTableTrigger.setpreclear();
      bottleAtPos5E.setpreclear();
      bottleAtPos1E.setpreclear();
      cvR_1.setpreclear();
      fR_1.setpreclear();
      cR_1.setpreclear();
      lR_1.setpreclear();
      bottleAtPos5_1.setpreclear();
      bottleAtPos1_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      dummyint = ReadySmoke.getStatus() ? ReadySmoke.setprepresent() : ReadySmoke.setpreclear();
      ReadySmoke.setpreval(ReadySmoke.getValue());
      ReadySmoke.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      bottleAtPos5E.sethook();
      bottleAtPos5E.setClear();
      bottleAtPos1E.sethook();
      bottleAtPos1E.setClear();
      cvR_1.setClear();
      fR_1.setClear();
      cR_1.setClear();
      lR_1.setClear();
      bottleAtPos5_1.setClear();
      bottleAtPos1_1.setClear();
      convReady_in.sethook();
      fillerReady_in.sethook();
      capperReady_in.sethook();
      lidLoaderReady_in.sethook();
      checkFive_in.sethook();
      checkOne_in.sethook();
      rotated_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        convReady_in.gethook();
        fillerReady_in.gethook();
        capperReady_in.gethook();
        lidLoaderReady_in.gethook();
        checkFive_in.gethook();
        checkOne_in.gethook();
        rotated_o.gethook();
        tableAlignedWithSensor.gethook();
        capOnBottleAtPos1.gethook();
        ReadySmoke.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
