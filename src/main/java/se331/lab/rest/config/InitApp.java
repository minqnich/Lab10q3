package se331.lab.rest.config;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.lab.rest.entity.AuctionItem;
import se331.lab.rest.entity.Bid;
import se331.lab.rest.repository.AuctionItemRepository;
import se331.lab.rest.repository.BidRepository;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    final AuctionItemRepository auctionItemRepository;
    final BidRepository bidRepository;
    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        AuctionItem item1,item2,item3,item4,item5;
        item1 = auctionItemRepository.save(AuctionItem.builder()
                .description("Haru")
                .type("Animal1")
                .build());
        item2 = auctionItemRepository.save(AuctionItem.builder()
                .description("Taro")
                .type("Animal2")
                .build());
        item3 = auctionItemRepository.save(AuctionItem.builder()
                .description("Sara")
                .type("Animal3")
                .build());
        item4 = auctionItemRepository.save(AuctionItem.builder()
                .description("Kaijaow")
                .type("Animal4")
                .build());
        item5 = auctionItemRepository.save(AuctionItem.builder()
                .description("Snow")
                .type("Animal5")
                .build());
        Bid b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
                b1 = bidRepository.save(Bid.builder()
                        .amount(2000)
                        .datetime(LocalDateTime.now())
                        .build());
                b2 = bidRepository.save(Bid.builder()
                        .amount(3000)
                        .datetime(LocalDateTime.now())
                        .build());
                b3 = bidRepository.save(Bid.builder()
                        .amount(4000)
                        .datetime(LocalDateTime.now())
                        .build());
                b4 = bidRepository.save(Bid.builder()
                        .amount(5000)
                        .datetime(LocalDateTime.now())
                        .build());
                b5 = bidRepository.save(Bid.builder()
                        .amount(6000)
                        .datetime(LocalDateTime.now())
                        .build());
                b6 = bidRepository.save(Bid.builder()
                        .amount(7000)
                        .datetime(LocalDateTime.now())
                        .build());
                b7 = bidRepository.save(Bid.builder()
                        .amount(8000)
                        .datetime(LocalDateTime.now())
                        .build());
                b8 = bidRepository.save(Bid.builder()
                        .amount(9000)
                        .datetime(LocalDateTime.now())
                        .build());
                b9 = bidRepository.save(Bid.builder()
                        .amount(10000)
                        .datetime(LocalDateTime.now())
                        .build());
                b10 = bidRepository.save(Bid.builder()
                        .amount(11000)
                        .datetime(LocalDateTime.now())
                        .build());
                b11 = bidRepository.save(Bid.builder()
                        .amount(12000)
                        .datetime(LocalDateTime.now())
                        .build());
                b12 = bidRepository.save(Bid.builder()
                        .amount(13000)
                        .datetime(LocalDateTime.now())
                        .build());
                b13 = bidRepository.save(Bid.builder()
                        .amount(14000)
                        .datetime(LocalDateTime.now())
                        .build());
                b14 = bidRepository.save(Bid.builder()
                        .amount(15000)
                        .datetime(LocalDateTime.now())
                        .build());
                b15 = bidRepository.save(Bid.builder()
                        .amount(16000)
                        .datetime(LocalDateTime.now())
                        .build());

                b1.setItem(item1);
                b2.setItem(item1);
                b3.setItem(item1);
                item1.setSuccessfulbid(b3);

                b4.setItem(item2);
                b5.setItem(item2);
                b6.setItem(item2);
                item2.setSuccessfulbid(b5);

                b7.setItem(item3);
                b8.setItem(item3);
                b9.setItem(item3);
                item3.setSuccessfulbid(b9);

                b10.setItem(item4);
                b11.setItem(item4);
                b12.setItem(item4);
                item4.setSuccessfulbid(b10);

                b13.setItem(item5);
                b14.setItem(item5);
                b15.setItem(item5);
                item5.setSuccessfulbid(b15);
    }
}
