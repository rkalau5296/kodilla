package com.kodilla.testing.forum.statistics;

class CalculateStatistics {

    Statistics statistics;
    private int quantityOfUsers;
    private int quantityOfPosts;
    private int quantityOfComments;
    private int avgQuantityOfPostsPerUser;
    private int avgQuantityOfCommentsPerUser;
    private int avgQuantityOfCommentsPerPost;

    public int getQuantityOfUsers() {
        return quantityOfUsers;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    public int getQuantityOfComments() {
        return quantityOfComments;
    }

    public int getAvgQuantityOfPostsPerUser() {
        return avgQuantityOfPostsPerUser;
    }

    public int getAvgQuantityOfCommentsPerUser() {
        return avgQuantityOfCommentsPerUser;
    }

    public int getAvgQuantityOfCommentsPerPost() {
        return avgQuantityOfCommentsPerPost;
    }


    public void calculateAdvStatistics(Statistics statistics) {
        try {
            quantityOfUsers = statistics.usersNames().size();
            quantityOfPosts = statistics.postsCount();
            quantityOfComments = statistics.commentsCount();
            avgQuantityOfPostsPerUser = statistics.postsCount() / statistics.usersNames().size();
            avgQuantityOfCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
            avgQuantityOfCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
        } catch (Exception e) {
            System.out.println("division by zero exception!");
        }
    }

    public String ShowStatistics() {
        return "quantityOfUsers: " + quantityOfUsers + "\n"
                + "quantityOfPosts: " + quantityOfPosts + "\n"
                + "quantityOfComments " + quantityOfComments + "\n"
                + "avgQuantityOfPostsPerUser " + avgQuantityOfPostsPerUser + "\n"
                + "avgQuantityOfCommentsPerUser " + avgQuantityOfCommentsPerUser + "\n"
                + "avgQuantityOfCommentsPerPost " + avgQuantityOfCommentsPerPost + "\n";
    }
}
