public class Main {

    static String artist, title;

    public static void setArgs() {
        artist = "Amalee";
        title = "\"English\" Again - (Full Metal Alchemist)";

    }

    public static String[] setSong() {

        String[] text = new String[62];

        text[0] = "I had a purpose then, pursing the path to catalyze our dream";
        text[1] = "But it’s a winding road, where you stumble and sway your way amongst the crowd";

        text[2] = "Don’t get me wrong, I would never go back in time – or play God";
        text[3] = "But is there a way I could earn back that endless sky?";

        text[4] = "I can see it in your eyes";
        text[5] = "Don’t give me that look – ‘cause, you see";
        text[6] = "You’re the last person I need to pity me";

        text[7] = "Cryin’ won’t pave a way to forgiveness";
        text[8] = "Every sin you carve is ever lasting";
        text[9] = "I’m lost in this maze of emotion";
        text[10] = "Who am I waiting for?";

        text[11] = "Now, these once blank pages of my notebook";
        text[12] = "Become a plea to regain fallen virtue";
        text[13] = "All this time, I’ve been trying  to run away from my own reality";

        text[14] = "We’ll live for something as soon as we find it";
        text[15] = "I’ve forgotten, please remind me, as day turns darkness";

        text[16] = "Expired chances - but we gotta make it through again";

        text[17] = "‘cause there’s no where else to run";

        text[18] = "There’s still so much here, a life worth living";
        text[19] = "And with time you’ll drown the feeling out (I’M ON THE WAY)";
        text[20] = "It’s so nostalgic, maybe all the love is worth the pain ";

        text[21] = "It’s not a lack of pride,";
        text[22] = "But I know I’m to blame, so I apologize";
        text[23] = "I don’t know what to say";
        text[24] = "But I wish I could free the worry from your eyes";

        text[25] = "All we’ve been through and all that’s yet to come";
        text[26] = "And all that we have become will remain as we roll the dice";

        text[27] = "Once more, I close my eyes from the sight";
        text[28] = "But it’s all a futile fight, for it’s all etched inside my mind";

        text[29] = "The invite of a white lie,";
        text[30] = "Some can’t resist the call to join in";
        text[31] = "But still, I thought I knew you better than to give into pressure";

        text[32] = "Once fury thorns in your heart,";
        text[33] = "The fire’s quick to consume you";
        text[34] = "And what comes from those ashes – is your reality";

        text[35] = "We’ll live for something as soon as we find it";
        text[36] = "May we come across that future";
        text[37] = "Can you hear me? I’m screaming";

        text[38] = "Expired chances,";
        text[39] = "But we gotta make it through again";
        text[40] = "‘cause there’s no where else to run";

        text[41] = "It’s through your kindness, I’ll always be grateful";
        text[42] = "And I’ll strive to become stronger (I’M ON THE WAY)";
        text[43] = "I’ll carry onward, gaining friend and foe along the way";

        text[44] = "I try to make sense of why";
        text[45] = "We can’t figure how to unlock the next door";
        text[46] = "We bleed on this path we lead";
        text[47] = "But we cannot turn back, cause our story’s begun";
        text[48] = "Open up your eyes - Open up your eyes";

        text[49] = "There’s still so much here, a life worth living";
        text[50] = "And with time I’ll drown the feeling out";
        text[51] = "I need to right all my wrongs";
        text[52] = "And finish all things I’ve left undone";
        text[53] = "We’ve only just begun";


        text[54] = "We’ll live for something as soon as we find it";
        text[55] = "May we come across that future";
        text[56] = "Can you hear me? I’m screaming";

        text[57] = "Expired chances - but we gotta make it through again";
        text[58] = "‘cause there’s no where else to run";

        text[59] = "It’s through your kindness, I’ll always be grateful";
        text[60] = "And I’ll strive to become stronger (I’M ON THE WAY)";
        text[61] = "It’s so nostalgic, maybe all the love is worth the pain";

        return text;
    }

    public static void main(String[] args) {
        setArgs();
        String[] text = setSong();

        System.out.println(title + " By: " + artist);
        System.out.println("");

        for (int x=0;x <= text.length; x++) {
            System.out.println(text[x]);
        }
    }


}
