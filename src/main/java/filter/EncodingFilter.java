 p a c k a g e   f i l t e r ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
  
 i m p o r t   j a v a x . s e r v l e t . F i l t e r ;  
 i m p o r t   j a v a x . s e r v l e t . F i l t e r C h a i n ;  
 i m p o r t   j a v a x . s e r v l e t . F i l t e r C o n f i g ;  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t R e s p o n s e ;  
 / / i m p o r t   j a v a x . s e r v l e t . a n n o t a t i o n . W e b F i l t e r ;  
 / / i m p o r t   j a v a x . s e r v l e t . a n n o t a t i o n . W e b I n i t P a r a m ;  
  
 / *  
 @ W e b F i l t e r ( f i l t e r N a m e = " E n c o d i n g   F i l t e r " ,   u r l P a t t e r n s = " / * " ,  
 	 i n i t P a r a m s = @ W e b I n i t P a r a m ( n a m e = " e n c o d i n g " ,   v a l u e = " u t f - 8 " ) )  
 * /  
 p u b l i c   c l a s s   E n c o d i n g F i l t e r   i m p l e m e n t s   F i l t e r   {  
 	 p r i v a t e   S t r i n g   e n c o d i n g   =   n u l l ;  
 	  
         @ O v e r r i d e  
         p u b l i c   v o i d   i n i t ( F i l t e r C o n f i g   f i l t e r C o n f i g )   t h r o w s   S e r v l e t E x c e p t i o n   {  
         	 t h i s . e n c o d i n g   =   f i l t e r C o n f i g . g e t I n i t P a r a m e t e r ( " e n c o d i n g " ) ;    
 	 }  
 	  
         @ O v e r r i d e  
         p u b l i c   v o i d   d o F i l t e r ( S e r v l e t R e q u e s t   r e q u e s t ,   S e r v l e t R e s p o n s e   r e s p o n s e ,   F i l t e r C h a i n   c h a i n )  
 	 	 t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n   {  
 	 	 r e q u e s t . s e t C h a r a c t e r E n c o d i n g ( e n c o d i n g ) ;  
         	 r e s p o n s e . s e t C h a r a c t e r E n c o d i n g ( e n c o d i n g ) ;  
 	 	 c h a i n . d o F i l t e r ( r e q u e s t ,   r e s p o n s e ) ;  
 	 }  
  
         @ O v e r r i d e  
         p u b l i c   v o i d   d e s t r o y ( )   {  
 	 	 t h i s . e n c o d i n g   =   n u l l ;  
 	 }  
 }  
