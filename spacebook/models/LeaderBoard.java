package models;
/**
* @file    LeaderBoard.java
* @brief   Class publishes users graded most socially and talkatively active
* @version 2015-4-22
* @author  
*/

import java.util.ArrayList;
import java.util.Collections;

import utils.UserSocialComparator;
import utils.UserTalkativeComparator;
import views.LeaderBoardView;


public class LeaderBoard
{
  public static void index(ArrayList<User> users)
  {

    Collections.sort(users, new UserSocialComparator());
    LeaderBoardView.index(users);
  }
  
  public static void talkative(ArrayList<User> users)
  {
    //TODO: Complete implementation of method LeaderBoard.talkative
    //Algorithmic code: delete when method complete 
    /*
     * sort users by most talkative, that is by most messages sent
     * render list users in LeaderBoardView 
     */   
  }
  public static void leastTalkative(ArrayList<User> users)
  {
	//TODO: Complete implementation of method LeaderBoard.leastTalkative
    //Algorithmic code: delete when method complete 
    /*
     * sort users by least talkative, that is by least messages sent
     * render list users in LeaderBoardView 
     */   
  }
}
