package oop.kevin.clients.datasync.repository.mybatis;

import oop.kevin.clients.datasync.entity.Team;

/**
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * 
 * @author Michael·Lee
 */
@MyBatisRepository
public interface TeamMybatisDao {

	Team getWithDetail(Long id);
}
