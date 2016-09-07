/**
  * Made by Dylan Piera 6-8-2016 - Practica Excercise 1. Make your favourite songtext display.
  */

public class Main {

    //create the artist & title variables
    static String artist, title;

    /**
      * Set the Artist & Title of the song.
      */
    public static void setArgs() {
        artist = "Amalee";
        title = "\"English\" Again - (Full Metal Alchemist)";

    }

    /**
      * Make the array called text, which is then filled with the lyrics.
      */
    public static String[] setSong() {

        String[] text = new String[84];

        text[0] = "I had a purpose then, pursing the path to catalyze our dream";
        text[1] = "But it’s a winding road, where you stumble and sway your way amongst the crowd";
        text[2] = "";
        text[3] = "Don’t get me wrong, I would never go back in time – or play God";
        text[4] = "But is there a way I could earn back that endless sky?";
        text[5] = "";
        text[6] = "I can see it in your eyes";
        text[7] = "Don’t give me that look – ‘cause, you see";
        text[8] = "You’re the last person I need to pity me";
        text[9] = "";
        text[10] = "Cryin’ won’t pave a way to forgiveness";
        text[11] = "Every sin you carve is ever lasting";
        text[12] = "I’m lost in this maze of emotion";
        text[13] = "Who am I waiting for?";
        text[14] = "";
        text[15] = "Now, these once blank pages of my notebook";
        text[16] = "Become a plea to regain fallen virtue";
        text[17] = "All this time, I’ve been trying  to run away from my own reality";
        text[18] = "";
        text[19] = "We’ll live for something as soon as we find it";
        text[20] = "I’ve forgotten, please remind me, as day turns darkness";
        text[21] = "";
        text[22] = "Expired chances - but we gotta make it through again";
        text[23] = "";
        text[24] = "‘cause there’s no where else to run";
        text[25] = "";
        text[26] = "There’s still so much here, a life worth living";
        text[27] = "And with time you’ll drown the feeling out (I’M ON THE WAY)";
        text[28] = "It’s so nostalgic, maybe all the love is worth the pain ";
        text[29] = "";
        text[30] = "It’s not a lack of pride,";
        text[31] = "But I know I’m to blame, so I apologize";
        text[32] = "I don’t know what to say";
        text[33] = "But I wish I could free the worry from your eyes";
        text[34] = "";
        text[35] = "All we’ve been through and all that’s yet to come";
        text[36] = "And all that we have become will remain as we roll the dice";
        text[37] = "";
        text[38] = "Once more, I close my eyes from the sight";
        text[39] = "But it’s all a futile fight, for it’s all etched inside my mind";
        text[40] = "";
        text[41] = "The invite of a white lie,";
        text[42] = "Some can’t resist the call to join in";
        text[43] = "But still, I thought I knew you better than to give into pressure";
        text[44] = "";
        text[45] = "Once fury thorns in your heart,";
        text[46] = "The fire’s quick to consume you";
        text[47] = "And what comes from those ashes – is your reality";
        text[48] = "";
        text[49] = "We’ll live for something as soon as we find it";
        text[50] = "May we come across that future";
        text[51] = "Can you hear me? I’m screaming";
        text[52] = "";
        text[53] = "Expired chances,";
        text[54] = "But we gotta make it through again";
        text[55] = "‘cause there’s no where else to run";
        text[56] = "";
        text[57] = "It’s through your kindness, I’ll always be grateful";
        text[58] = "And I’ll strive to become stronger (I’M ON THE WAY)";
        text[59] = "I’ll carry onward, gaining friend and foe along the way";
        text[60] = "";
        text[61] = "I try to make sense of why";
        text[62] = "We can’t figure how to unlock the next door";
        text[63] = "We bleed on this path we lead";
        text[64] = "But we cannot turn back, cause our story’s begun";
        text[65] = "Open up your eyes - Open up your eyes";
        text[66] = "";
        text[67] = "There’s still so much here, a life worth living";
        text[68] = "And with time I’ll drown the feeling out";
        text[69] = "I need to right all my wrongs";
        text[70] = "And finish all things I’ve left undone";
        text[71] = "We’ve only just begun";
        text[72] = "";
        text[73] = "";
        text[74] = "We’ll live for something as soon as we find it";
        text[75] = "May we come across that future";
        text[76] = "Can you hear me? I’m screaming";
        text[77] = "";
        text[78] = "Expired chances - but we gotta make it through again";
        text[79] = "‘cause there’s no where else to run";
        text[80] = "";
        text[81] = "It’s through your kindness, I’ll always be grateful";
        text[82] = "And I’ll strive to become stronger (I’M ON THE WAY)";
        text[83] = "It’s so nostalgic, maybe all the love is worth the pain";

        return text;
    }

    public static void main(String[] args) {
        setArgs();
        String[] text = setSong();

       System.out.println(title + " By: " + artist);
       System.out.println("");

       /*
        * as long as their is lyrics left in the array "text" print out the next line.
        */
        for (int x=0;x < text.length; x++) {
            System.out.println(text[x]);
        }

    }

}
