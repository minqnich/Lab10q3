package se331.lab.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import se331.lab.rest.service.BidService;
import se331.lab.rest.util.LabMapper;

@RequiredArgsConstructor
@Controller
public class BidController {
    final BidService bidService;
    @GetMapping("/bid")
    ResponseEntity<?> getBids() {
        return ResponseEntity.ok(LabMapper.INSTANCE.getBidDTO(bidService.getAllBid()));

    }

}

