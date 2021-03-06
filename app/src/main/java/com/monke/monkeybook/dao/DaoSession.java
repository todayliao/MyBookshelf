package com.monke.monkeybook.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.monke.monkeybook.bean.BookContentBean;
import com.monke.monkeybook.bean.BookInfoBean;
import com.monke.monkeybook.bean.BookShelfBean;
import com.monke.monkeybook.bean.BookSourceBean;
import com.monke.monkeybook.bean.ChapterListBean;
import com.monke.monkeybook.bean.DownloadChapterBean;
import com.monke.monkeybook.bean.ReplaceRuleBean;
import com.monke.monkeybook.bean.SearchBookBean;
import com.monke.monkeybook.bean.SearchHistoryBean;
import com.monke.monkeybook.bean.BookmarkBean;

import com.monke.monkeybook.dao.BookContentBeanDao;
import com.monke.monkeybook.dao.BookInfoBeanDao;
import com.monke.monkeybook.dao.BookShelfBeanDao;
import com.monke.monkeybook.dao.BookSourceBeanDao;
import com.monke.monkeybook.dao.ChapterListBeanDao;
import com.monke.monkeybook.dao.DownloadChapterBeanDao;
import com.monke.monkeybook.dao.ReplaceRuleBeanDao;
import com.monke.monkeybook.dao.SearchBookBeanDao;
import com.monke.monkeybook.dao.SearchHistoryBeanDao;
import com.monke.monkeybook.dao.BookmarkBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig bookContentBeanDaoConfig;
    private final DaoConfig bookInfoBeanDaoConfig;
    private final DaoConfig bookShelfBeanDaoConfig;
    private final DaoConfig bookSourceBeanDaoConfig;
    private final DaoConfig chapterListBeanDaoConfig;
    private final DaoConfig downloadChapterBeanDaoConfig;
    private final DaoConfig replaceRuleBeanDaoConfig;
    private final DaoConfig searchBookBeanDaoConfig;
    private final DaoConfig searchHistoryBeanDaoConfig;
    private final DaoConfig bookmarkBeanDaoConfig;

    private final BookContentBeanDao bookContentBeanDao;
    private final BookInfoBeanDao bookInfoBeanDao;
    private final BookShelfBeanDao bookShelfBeanDao;
    private final BookSourceBeanDao bookSourceBeanDao;
    private final ChapterListBeanDao chapterListBeanDao;
    private final DownloadChapterBeanDao downloadChapterBeanDao;
    private final ReplaceRuleBeanDao replaceRuleBeanDao;
    private final SearchBookBeanDao searchBookBeanDao;
    private final SearchHistoryBeanDao searchHistoryBeanDao;
    private final BookmarkBeanDao bookmarkBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        bookContentBeanDaoConfig = daoConfigMap.get(BookContentBeanDao.class).clone();
        bookContentBeanDaoConfig.initIdentityScope(type);

        bookInfoBeanDaoConfig = daoConfigMap.get(BookInfoBeanDao.class).clone();
        bookInfoBeanDaoConfig.initIdentityScope(type);

        bookShelfBeanDaoConfig = daoConfigMap.get(BookShelfBeanDao.class).clone();
        bookShelfBeanDaoConfig.initIdentityScope(type);

        bookSourceBeanDaoConfig = daoConfigMap.get(BookSourceBeanDao.class).clone();
        bookSourceBeanDaoConfig.initIdentityScope(type);

        chapterListBeanDaoConfig = daoConfigMap.get(ChapterListBeanDao.class).clone();
        chapterListBeanDaoConfig.initIdentityScope(type);

        downloadChapterBeanDaoConfig = daoConfigMap.get(DownloadChapterBeanDao.class).clone();
        downloadChapterBeanDaoConfig.initIdentityScope(type);

        replaceRuleBeanDaoConfig = daoConfigMap.get(ReplaceRuleBeanDao.class).clone();
        replaceRuleBeanDaoConfig.initIdentityScope(type);

        searchBookBeanDaoConfig = daoConfigMap.get(SearchBookBeanDao.class).clone();
        searchBookBeanDaoConfig.initIdentityScope(type);

        searchHistoryBeanDaoConfig = daoConfigMap.get(SearchHistoryBeanDao.class).clone();
        searchHistoryBeanDaoConfig.initIdentityScope(type);

        bookmarkBeanDaoConfig = daoConfigMap.get(BookmarkBeanDao.class).clone();
        bookmarkBeanDaoConfig.initIdentityScope(type);

        bookContentBeanDao = new BookContentBeanDao(bookContentBeanDaoConfig, this);
        bookInfoBeanDao = new BookInfoBeanDao(bookInfoBeanDaoConfig, this);
        bookShelfBeanDao = new BookShelfBeanDao(bookShelfBeanDaoConfig, this);
        bookSourceBeanDao = new BookSourceBeanDao(bookSourceBeanDaoConfig, this);
        chapterListBeanDao = new ChapterListBeanDao(chapterListBeanDaoConfig, this);
        downloadChapterBeanDao = new DownloadChapterBeanDao(downloadChapterBeanDaoConfig, this);
        replaceRuleBeanDao = new ReplaceRuleBeanDao(replaceRuleBeanDaoConfig, this);
        searchBookBeanDao = new SearchBookBeanDao(searchBookBeanDaoConfig, this);
        searchHistoryBeanDao = new SearchHistoryBeanDao(searchHistoryBeanDaoConfig, this);
        bookmarkBeanDao = new BookmarkBeanDao(bookmarkBeanDaoConfig, this);

        registerDao(BookContentBean.class, bookContentBeanDao);
        registerDao(BookInfoBean.class, bookInfoBeanDao);
        registerDao(BookShelfBean.class, bookShelfBeanDao);
        registerDao(BookSourceBean.class, bookSourceBeanDao);
        registerDao(ChapterListBean.class, chapterListBeanDao);
        registerDao(DownloadChapterBean.class, downloadChapterBeanDao);
        registerDao(ReplaceRuleBean.class, replaceRuleBeanDao);
        registerDao(SearchBookBean.class, searchBookBeanDao);
        registerDao(SearchHistoryBean.class, searchHistoryBeanDao);
        registerDao(BookmarkBean.class, bookmarkBeanDao);
    }
    
    public void clear() {
        bookContentBeanDaoConfig.clearIdentityScope();
        bookInfoBeanDaoConfig.clearIdentityScope();
        bookShelfBeanDaoConfig.clearIdentityScope();
        bookSourceBeanDaoConfig.clearIdentityScope();
        chapterListBeanDaoConfig.clearIdentityScope();
        downloadChapterBeanDaoConfig.clearIdentityScope();
        replaceRuleBeanDaoConfig.clearIdentityScope();
        searchBookBeanDaoConfig.clearIdentityScope();
        searchHistoryBeanDaoConfig.clearIdentityScope();
        bookmarkBeanDaoConfig.clearIdentityScope();
    }

    public BookContentBeanDao getBookContentBeanDao() {
        return bookContentBeanDao;
    }

    public BookInfoBeanDao getBookInfoBeanDao() {
        return bookInfoBeanDao;
    }

    public BookShelfBeanDao getBookShelfBeanDao() {
        return bookShelfBeanDao;
    }

    public BookSourceBeanDao getBookSourceBeanDao() {
        return bookSourceBeanDao;
    }

    public ChapterListBeanDao getChapterListBeanDao() {
        return chapterListBeanDao;
    }

    public DownloadChapterBeanDao getDownloadChapterBeanDao() {
        return downloadChapterBeanDao;
    }

    public ReplaceRuleBeanDao getReplaceRuleBeanDao() {
        return replaceRuleBeanDao;
    }

    public SearchBookBeanDao getSearchBookBeanDao() {
        return searchBookBeanDao;
    }

    public SearchHistoryBeanDao getSearchHistoryBeanDao() {
        return searchHistoryBeanDao;
    }

    public BookmarkBeanDao getBookmarkBeanDao() {
        return bookmarkBeanDao;
    }

}
