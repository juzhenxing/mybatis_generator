package mapper;

import model.StyleChildQuotaHistoryEntity;

public interface StyleChildQuotaHistoryEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StyleChildQuotaHistoryEntity record);

    int insertSelective(StyleChildQuotaHistoryEntity record);

    StyleChildQuotaHistoryEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StyleChildQuotaHistoryEntity record);

    int updateByPrimaryKey(StyleChildQuotaHistoryEntity record);
}