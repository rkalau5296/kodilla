package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User peter = new Millenials("Peter Johnson");
        User robert = new YGeneration("Robert Jackson");
        User mike = new ZGeneration("Mike Tyson");

        //When
        String peterShouldPost = peter.sharePost();
        System.out.println("Peter should: " + peterShouldPost);
        String robertShouldPost = robert.sharePost();
        System.out.println("Robert should: " + robertShouldPost);
        String mikeShouldPost = mike.sharePost();
        System.out.println("Mike should: " + mikeShouldPost);

        Assert.assertEquals("This is Facebook.", peterShouldPost);
        Assert.assertEquals("This is Snapchat.", robertShouldPost);
        Assert.assertEquals("This is Twitter.", mikeShouldPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User peter = new Millenials("Peter Johnson");

        //When
        String peterShouldPost = peter.sharePost();
        System.out.println("Peter should: " + peterShouldPost);
        peter.setSocialPublisher(new SnapchatPublisher());
        peterShouldPost = peter.sharePost();
        System.out.println("Peter now should: " + peterShouldPost);

        //Then
        Assert.assertEquals("This is Snapchat.", peterShouldPost);
    }
}
