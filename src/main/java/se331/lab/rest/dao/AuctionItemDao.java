package se331.lab.rest.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.lab.rest.entity.AuctionItem;

public interface AuctionItemDao {
    Integer getAuctionItemSize();
    Page<AuctionItem> getAuctionItem(Integer pageSize, Integer page);
    AuctionItem getAuctionItem(Long id);

    Page<AuctionItem> getAuctionItem(String name, Pageable page);
}

