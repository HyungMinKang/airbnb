package com.example.airbnb.business.core.repository.reservation.querydsl;

import com.example.airbnb.business.web.controller.reservation.dto.ReservationResponse;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.example.airbnb.business.core.domain.member.QMember.member;
import static com.example.airbnb.business.core.domain.reservation.QReservation.reservation;

@Repository
@RequiredArgsConstructor
public class ReservationReadRepository {

    private final JPAQueryFactory queryFactory;

    public Optional<ReservationResponse> findReservationById(Long id) {
        ReservationResponse reservationResponse = queryFactory.select(
                        Projections.fields(ReservationResponse.class,
                                reservation.reservationId, reservation.accommodation.accommodationId,
                                reservation.accommodation.name.as("roomName"), reservation.accommodation.address.homeAddress.as("address"),
                                reservation.time.checkinTime.as("checkIn"), reservation.time.checkoutTime.as("checkOut"),
                                member.memberId.as("hostId"), member.name.as("hostName"),
                                reservation.totalPeople, reservation.totalDay, reservation.totalPrice))
                .from(reservation)
                .leftJoin(reservation.member, member)
                .where(reservation.accommodation.accommodationId.eq(id))
                .fetchOne();

        return Optional.ofNullable(reservationResponse);
    }
}
