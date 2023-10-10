package se331.lab.rest.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.lab.rest.dao.AuctionItemDao;
import se331.lab.rest.dao.BidDao;
import se331.lab.rest.entity.AuctionItem;
@Service
@RequiredArgsConstructor
public class AuctionItemIServiceImpl implements AuctionItemService{
    final AuctionItemDao auctionItemDao;
    final BidDao bidDao;

    @Override
    public Integer getAuctionItemSize() {
        return auctionItemDao.getAuctionItemSize();
    }

    @Override
    public Page<AuctionItem> getAuctionItem(Integer pageSize, Integer page) {
        return auctionItemDao.getAuctionItem(pageSize, page);
    }
    @Override
    public AuctionItem getAuctionItem(Long id) {
        return auctionItemDao.getAuctionItem(id);
    }


    @Override
    public Page<AuctionItem> getAuctionItem(String title, Pageable pageable) {
        return auctionItemDao.getAuctionItem(title,pageable);

    }
}
