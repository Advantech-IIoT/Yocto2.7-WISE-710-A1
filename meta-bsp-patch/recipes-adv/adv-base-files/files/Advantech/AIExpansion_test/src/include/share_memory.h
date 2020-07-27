#ifndef _SHARE_MEMORY_H_
#define _SHARE_MEMORY_H_

#include <stdio.h>
#include <string.h>
#include <errno.h>
#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include <sys/shm.h>
#include <sys/sem.h>

#ifdef __cplusplus
extern "C" {
#endif

#define SHAREMEM_KEY		0x888888

/* API */
int semaphore_init();
int semaphore_uninit(int semid);
int semaphore_wait(int sem_num, int semid);	// 'P'
int semaphore_post(int sem_num, int semid);	// 'V'
int sharemem_init();
int sharemem_uninit(int shmid);
void sharemem_read(int semid, int shmid, char *pdata, int len);
void sharemem_write(int semid, int shmid, char *pdata, int len);

#ifdef __cplusplus
}
#endif
#endif /* _SHARE_MEMORY_H_ */
