package com.ssafy.muscle_maker.dto.clubs.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ClubLeaderRequest {
    private long leaderId;
    private long memberId;
}
