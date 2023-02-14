import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {
                /*
                 * gary and mary are time travelers and they take us on an adventure to another
                 * planet named Eden. A place where a bunch of different animals call home.
                 * the main species they interact with are a species of bees called the
                 * Flutterbees
                 */
                Scanner sc = new Scanner(System.in);
                String choice;

                System.out.println(
                                "♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");

                System.out.println("Welcome to your very own Choose Your Own Adventure Game!");
                System.out.println("The rules are pretty simple, just make choices and have fun <3");

                System.out.println(
                                "♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");

                System.out.println(
                                "You wake up in the middle of the night, startled by a noise. After looking around for the source of the noise,"
                                                +
                                                " you see a bright white light coming from the living room.");

                System.out.println(" Do you (1) get up to check for the source of the light? or (2) Go back to sleep?");

                choice = sc.nextLine();
                if (choice.equals("1")) {
                        System.out.println(
                                        "♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");

                        System.out.println(
                                        "With Cayla still asleep next to you, you decide to get up and see where the light is coming from. "
                                                        +
                                                        " You slowly take a peak around the corner and see...Mary and Gary? "
                                                        +
                                                        " You rub your eyes and take a closer look and you see Mary and Gary sitting at a tiny table with candles surrounding them.");

                        System.out.println(" Do you want to (1) stay hidden and eavesdrop? or (2) confront them?");
                        choice = sc.nextLine();

                        if (choice.equals("1")) {
                                System.out.println(
                                                "♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
                                System.out.println(
                                                " You decide to stay hidden and eavesdrop. It's quiet, but you can hear them talking."
                                                                +
                                                                " After silently freaking out, you stop and listen to what they're saying.");

                                System.out.println(
                                                "Gary: I can't believe that those idiots still haven't figured us out yet");
                                System.out.println(
                                                "Mary: I mean can you blame them? They aren't the smartest bunch. They see cute fluffy creatures like us and take us in, I mean we're basically strangers."
                                                                +
                                                                " They both begin to laugh.");
                                System.out.println(
                                                " After hearing this you get offended. You can either (1) confront them and give them a piece of your mind or (2) go back to bed and cry yourself to sleep");
                                choice = sc.nextLine();

                                if (choice.equals("1")) {
                                        System.out.println(
                                                        "♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
                                        System.out.println(
                                                        "You decide to confront them and give them a piece of your mind. After you jump out, Gary reaches for his button until he realizes that you heard everything."
                                                                        +
                                                                        " Realizing that they've been caught they start explaining everything to you. They tell you all about their planet, Felis, and how it was destroyed during a 10 year war with the Dog species."
                                                                        +
                                                                        " Not having anywhere to go, the now displaced Cats and Dogs had to take refuge on Earth and live with Humans and hopefully get adopted and take shelter until everything is figured out on their planet.");
                                } else if (choice.equals("2")) {
                                        System.out.println(
                                                        "You decide to go back to bed and cry yourself to sleep. If only you had confronted them... maybe you would hav gone on a crazy and fun adventure with your amazing gf ;)");
                                }
                                // first conversation
                                System.out.println(
                                                "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                System.out.println(
                                                "(You will now have conversation options, they work the same as making choices but they don't have as much of an impact on the storyline (mostly just for lore)");
                                System.out.println(
                                                "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                while (true) {
                                        System.out.println(
                                                        "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                        System.out.println(
                                                        " Do you want to (1) Ask them about the war, (2) Ask them how long they've been on earth, (3) Ask how long they're staying");
                                        choice = sc.nextLine();

                                        if (choice.equals("1")) {
                                                System.out.println(
                                                                "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                System.out.println(
                                                                "You ask them about the war. They turn and look at each other with an expression you don't recognize."
                                                                                +
                                                                                " Gary opens his mouth and begins to talk: It all started at the annual alien convention (humans obviously aren't invited)."
                                                                                +
                                                                                " Long story short the Cat Representatives were all eaten by the Dog Representatives. That event started a long and brutal battle that ended with both planets being blown up."
                                                                                +
                                                                                " Having nowhere else to go, we all had to set aside our differences and settle in on Earth");

                                                System.out.println(
                                                                "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                                System.out.println(
                                                                "Do you want to (2) Ask them about how long they've been on Earth, (3) Ask how long they're staying on Earth or (4) End the conversation");
                                                String anotherQuestion = sc.nextLine();

                                                if (anotherQuestion.equals("2")) {
                                                        System.out.println(
                                                                        "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println(
                                                                        "You ask them how long they've been on Earth. They exchange looks and kind of giggle a little. "
                                                                                        +
                                                                                        " Mary opens her mouth and begins to talk: Well that's a funny story... We've technically only been on Earth for 8 years. "
                                                                                        +
                                                                                        " On our planet we invented a mind control device that allows us to implant memories. "
                                                                                        +
                                                                                        " After all of the implanting and building a few sculptures, we had all of the material we needed to make everyone believe that we had been here since the beginning of time.");

                                                } else if (anotherQuestion.equals("3")) {
                                                        System.out.println(
                                                                        "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println(
                                                                        " You ask them how long they'll be staying on Earth. They respond by saying that they plan on leaving as soon as they fix up their planet");
                                                } else if (anotherQuestion.equals("4")) {
                                                        break;
                                                }
                                        } else if (choice.equals("2")) {
                                                System.out.println(
                                                                "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                System.out.println(
                                                                "You ask them how long they've been on Earth. They exchange looks and kind of giggle a little. "
                                                                                +
                                                                                " Mary opens her mouth and begins to talk: Well that's a funny story... We've technically only been on Earth for 8 years. "
                                                                                +
                                                                                " On our planet we invented a mind control device that allows us to implant memories. "
                                                                                +
                                                                                " After all of the implanting and building a few sculptures, we had all of the material we needed to make everyone believe that we had been here since the beginning of time.");

                                                System.out.println(
                                                                "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                                System.out.println(
                                                                "Do you want to (1) Ask them about the war, (3) Ask how long they're staying on Earth, (4) End the conversation");
                                                String anotherQuestion = sc.nextLine();

                                                if (anotherQuestion.equals("1")) {
                                                        System.out.println(
                                                                        "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println(
                                                                        "You ask them about the war. They turn and look at each other with an expression you don't recognize."
                                                                                        +
                                                                                        " Gary opens his mouth and begins to talk: It all started at the annual alien convention (humans obviously aren't invited)."
                                                                                        +
                                                                                        " Long story short the Cat Representatives were all eaten by the Dog Representatives. That event started a long and brutal battle that ended with both planets being blown up."
                                                                                        +
                                                                                        " Having nowhere else to go, we all had to set aside our differences and settle in on Earth");

                                                } else if (anotherQuestion.equals("3")) {
                                                        System.out.println(
                                                                        "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println(
                                                                        " You ask them how long they'll be staying on Earth. They respond by saying that they plan on leaving as soon as they fix up their planet");

                                                } else if (anotherQuestion.equals("4")) {
                                                        break;
                                                }
                                        } else if (choice.equals("3")) {
                                                System.out.println(
                                                                "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                System.out.println(
                                                                " You ask them how long they'll be staying on Earth. They respond by saying that they plan on leaving as soon as they fix up their planet");

                                                System.out.println(
                                                                "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                                System.out.println(
                                                                "Do you want to (1) Ask them about the war, (2) Ask them how long they've been on Earth, (4) End the conversation");
                                                String anotherQuestion = sc.nextLine();

                                                if (anotherQuestion.equals("1")) {
                                                        System.out.println(
                                                                        "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println(
                                                                        "You ask them about the war. They turn and look at each other with an expression you don't recognize."
                                                                                        +
                                                                                        " Gary opens his mouth and begins to talk: It all started at the annual alien convention (humans obviously aren't invited)."
                                                                                        +
                                                                                        " Long story short the Cat Representatives were all eaten by the Dog Representatives. That event started a long and brutal battle that ended with both planets being blown up."
                                                                                        +
                                                                                        " Having nowhere else to go, we all had to set aside our differences and settle in on Earth");

                                                } else if (anotherQuestion.equals("2")) {
                                                        System.out.println(
                                                                        "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                                        System.out.println(
                                                                        "You ask them how long they've been on Earth. They exchange looks and kind of giggle a little. "
                                                                                        +
                                                                                        " Mary opens her mouth and begins to talk: Well that's a funny story... We've technically only been on Earth for 8 years. "
                                                                                        +
                                                                                        " On our planet we invented a mind control device that allows us to implant memories. "
                                                                                        +
                                                                                        " After all of the implanting and building a few sculptures, we had all of the material we needed to make everyone believe that we had been here since the beginning of time.");
                                                } else if (anotherQuestion.equals("4")) {
                                                        break;
                                                }
                                        }
                                }
                                System.out.println(
                                                "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                System.out.println(
                                                "(You just completed your first conversation! Congratulations! Enjoy the rest of the story :))");
                                System.out.println(
                                                "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                // first conversation over

                                System.out.println(
                                                "♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
                                System.out.println(
                                                "Gary: Welp that was pretty much everything, what do you think? I bet you weren't expecting any of that huh."
                                                                +
                                                                " Zach: Uh I mean I obviously didn't, I don't think anyone would have expected that. Did you say that cats have only been on Earth for 8 years??? He started to mumble under his breath");

                                System.out.println(
                                                "♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");

                                System.out.println(
                                                "Noticing that Zach was beginning to freak out after hearing the truth, they quickly began to look for ways to remedy the situation.");

                                System.out.println(
                                                "♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");

                                System.out.println(
                                                "Mary: What if we took you and Cayla on a super fun magical valentine's day adventure! We can show you places NASA doesn't even know about!");

                                System.out.println(
                                                "Gary: Oh yeah! It's valentine's day, we can take you to the most romantic planet in the galaxy!"
                                                                +
                                                                " Gary and Mary both give each other the same excited look before looking back at you.");

                                System.out.println(
                                                "Zach: Uh I'm not too sure about that... I mean how will we even get there? and do we need like suits? and when will we be back? WILL we be back??");

                                System.out.println(
                                                "♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");

                                System.out.println(
                                                "After a lot of convincing, Zach finally agreed and went to the room to wake up Cayla."
                                                                +
                                                                "After filling Cayla in on everything, Mary and Gary showed them their ship (which turned out to be in the closet... I always wondered what they were doing in there)");
                        } else if (choice.equals("2")) {
                                System.out.println(
                                                "♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
                                System.out.println(
                                                "You decide to confront them. Unfortunately, Gary was prepared for this and pushed a button that made everything disappear."
                                                                +
                                                                " Since you don't have any proof (like eavesdropping on their conversation wink wink) you can only assume that you imagined seeing anything");
                                System.out.println("GAMEOVER");
                                System.out.println(
                                                "♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
                        }
                } else if (choice.equals("2")) {
                        System.out.println(
                                        "♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
                        System.out.println("You go back to sleep and miss out on all the fun.");
                        System.out.println("GAMEOVER");
                        System.out.println(
                                        "♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
                }

        }
}
