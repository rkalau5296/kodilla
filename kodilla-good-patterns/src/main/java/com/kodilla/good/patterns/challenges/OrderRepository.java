package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean createRental(User user, LocalDateTime from, LocalDateTime to);
}
